/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.exceptions;

/**
 *
 * @author danm
 */
public class ControllerException extends RuntimeException {

    public ControllerException(String message) {
        super(message);
    }

    public enum Message {

        FALTA_CAMPO_REQUERIDO("Falta un campo obligatorio"),
        REGISTRO_REPETIDO("El registro no se pudo crear porque ya existe"),
        REGISTRO_NO_ELIMINADO("No se pudo eliminar el registro"),
        REGISTRO_NO_EDITADO("No se pudo editar el registro"),
        REGISTRO_NO_ENCONTRADO("No se encontró registros para el id provisto");

        private String errorMessage;

        private Message(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }

    }

}
