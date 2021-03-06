/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p60.semana04.servicio;

import java.util.List;
import p60.semana04.modelo.Barco;
import p60.semana04.modelo.Capitan;

/**
 *
 * @author morti
 */
public interface IBarcoServicio {
    
    public Barco crear(Barco barco);
    public Barco modificar(int codigoBarco, Barco barcoNuevo);
    public Barco eliminar(int codigoBarco);
    public Barco buscarPorCodigo(int codigoBarco);
    public int buscarPosicion(Barco barco);
    public List<Barco> listar(); 
    
}
