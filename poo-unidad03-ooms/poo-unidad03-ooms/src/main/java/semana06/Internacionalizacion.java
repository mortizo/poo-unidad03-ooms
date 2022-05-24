/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.PropertyResourceBundle;
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
