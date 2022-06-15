/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana04.controlador;

import java.util.List;
import semana04.modelo.Barco;
import semana04.modelo.Capitan;
import semana04.servicio.BarcoServicio;
import semana04.servicio.CapitanServicio;

/**
 *
 * @author morti
 */
public class BarcoControl {
    
    private final BarcoServicio barcoServicio = new BarcoServicio();
    private final CapitanServicio capitanServicio = new CapitanServicio();
    
    public Barco crear(String [] args){
        Capitan capitan = this.capitanServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Barco barco = new Barco(Integer.valueOf(args[0]),args[1],args[2],args[3],capitan);
        this.barcoServicio.crear(barco);
        return barco;
    }
    
    public List<Barco> listar(){
        return this.barcoServicio.listar();
    }
    
}
