/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.sql.Date;
import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajo;

/**
 *
 * @author irvin
 */
@Local
public interface OrdenTrabajoFacadeLocal extends AbstractInterface<OrdenTrabajo>{

public List<OrdenTrabajo> getAll(int first,int pagesize);
public int countFinalizadas();
public List<OrdenTrabajo> getByFiltro(int first,int pagesize,String filtro);
public List<OrdenTrabajo> getByDate(Date date);
public List<OrdenTrabajo> getByUser(String name);
public List<OrdenTrabajo> getByCorrelativo(String correlativo);
public List<OrdenTrabajo> obtenerOrdenesNoTerminadas(int first, int pagesize);
}
