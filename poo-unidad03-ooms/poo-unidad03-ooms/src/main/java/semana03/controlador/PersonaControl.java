/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana03.controlador;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import semana03.modelo.Persona;
import semana03.servicio.PersonaServicio;

/**
 *
 * @author morti
 */
public class PersonaControl {
    
    private final PersonaServicio personaServicio = new PersonaServicio();
    
    public Persona crear(int codigo, String nombre, String apellido,int year, 
            int mes, int dia) {
        LocalDate fechaNacimiento = LocalDate.of(year, mes, dia);
        var persona = new Persona(codigo,nombre,apellido,fechaNacimiento);
        this.personaServicio.crear(persona);
        return persona;
    }

    public List<Persona> listar() {
        return this.personaServicio.listar();
    }

    public Persona getByCodigo(int i) {
        if(i>0)
            return this.personaServicio.getByCodigo(i);
        else
            return this.personaServicio.getByCodigo(0);
    }
    
}
