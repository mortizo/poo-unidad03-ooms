/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;

import java.util.Locale;
import java.util.ResourceBundle;



/**
 *
 * @author morti
 */
public class Internacionalizacion {
    
    
    public static void main(String [] args){       
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mensajes", Locale.getDefault());
        System.out.println(resourceBundle.getString("SALUDO"));
        resourceBundle = ResourceBundle.getBundle("mensajes", new Locale("en","US"));
        System.out.println(resourceBundle.getString("SALUDO"));
        resourceBundle = ResourceBundle.getBundle("mensajes", new Locale("fr","FR"));
        System.out.println(resourceBundle.getString("SALUDO"));
        
    }
}
