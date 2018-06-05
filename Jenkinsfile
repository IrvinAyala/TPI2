node {
    
  stage('github'){
      git "https://github.com/Zaldivar97/TPI2"
  }
  
    try{
        stage('pruebas'){
            sh 'mvn surefire-report:report'
        }
        stage('SonarQube analysis') {
            withSonarQubeEnv('sonarqubetpi') {
                // requires SonarQube Scanner for Maven 3.2+
                sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.4.0.905:sonar'
            }
        }
        stage("Quality Gate"){
            timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
                def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
                if (qg.status != 'OK') {
                    error "Pipeline aborted due to quality gate failure: ${qg.status}"
                }
            }
        }
        stage('compilacion'){
            sh 'mvn clean install'
        }
    }catch (exc) {
            mail to: 'daniel.97.molin@gmail.com',
             subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Error en: ${env.BUILD_URL}"
            throw exc
    }finally{
        junit 'MantenimientoMiddleWare-web/target/surefire-reports/*.xml'
        junit 'MantenimientoMiddleWare-ejb/target/surefire-reports/*.xml'
    }
    
    
        stage('deployment'){
            dir('MantenimientoMiddleWare-web'){
                sh 'cp target/MantenimientoMiddleWare-web-1.0-SNAPSHOT.war src/docker/payara'
            }
            dir('MantenimientoMiddleWare-web/src/docker/payara'){
                docker.withRegistry('http://192.168.8.117:5000') {
                    docker.withServer('tcp://192.168.8.119:2376'){
                        def payara = docker.build("payara:swarm")
                        payara.push()
                    }
                }
            }
        }
    
    
    
  
}
