/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_04.controlador;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import p61.unidad03_04.servicio.ViajeServiceImpl;
import p61.unidad03_04.modelo.Viaje;
import p61.unidad03_04.servicio.CiudadServiceImpl;

/**
 *
 * @author Mauricio Ortiz
 */
public class ViajeControl {
    
    private ViajeServiceImpl viajeServiceImpl  = new ViajeServiceImpl();
    private CiudadServiceImpl ciudadServiceImpl  = new CiudadServiceImpl();
    
    
    public void crear(String [] data){
        var codigo=Integer.valueOf(data[0]);
        var origen=this.ciudadServiceImpl.buscarPorCodigo(Integer.valueOf(data[1]));
        var destino=this.ciudadServiceImpl.buscarPorCodigo(Integer.valueOf(data[2]));
        var year=Integer.valueOf(data[3]);
        var mes=Integer.valueOf(data[4]);
        var dia=Integer.valueOf(data[5]);
        var viaje= new Viaje(codigo,origen,destino,LocalDate.of(year, mes, dia));
        this.viajeServiceImpl.crear(viaje);
    }
    
    public List<Viaje> listar(){
        return this.viajeServiceImpl.listar();
    }
    
}
