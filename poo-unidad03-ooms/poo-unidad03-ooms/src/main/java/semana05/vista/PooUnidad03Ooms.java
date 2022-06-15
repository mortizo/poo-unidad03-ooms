/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package semana05.vista;

import semana05.vista.*;
import semana05.vista.capitan.CreateCapitan;
import semana05.vista.barco.CreateBarco;

import semana05.vista.barco.DeleteBarco;
import semana05.vista.barco.UpdateBarco;


/**
 *
 * @author morti
 */
public class PooUnidad03Ooms {

    public static void main(String[] args) {
        
        var v1 = new CreateBarco();
        var v2 = new CreateCapitan();
        var v3 = new DeleteBarco();
        var v4 = new UpdateBarco();
        
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
        v4.setVisible(true);
        

    }
}
