/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;

/**
 *
 * @author danielm
 */
public interface AbstractInterfaceName<T> {
    
    default List<T> findByName(String name, int first, int pageSize){
        
        
    return null;
    }
        
    
    
}
