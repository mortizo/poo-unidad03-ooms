/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p61.unidad03_04.servicio;

import java.util.List;
import p61.unidad03_04.modelo.Ciudad;

/**
 *
 * @author Mauricio Ortiz
 */
public interface CiudadService {
    
    public void crear(Ciudad ciudad);
    public List<Ciudad> listar();
    
    
}
