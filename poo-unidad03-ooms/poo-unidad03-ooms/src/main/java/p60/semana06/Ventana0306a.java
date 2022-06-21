/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana06;

import java.awt.Color;
import p60.semana06.PanelPrincipal1;
import java.awt.HeadlessException;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author morti
 */
public class Ventana0306a extends JFrame{

    //private PanelPrincipal panelPrincipal;
    private PanelPrincipal1 panelPrincipal;
    private JComboBox comboColor1;
    private JComboBox comboColor2;
    private JComboBox comboColor3;
    
    public Ventana0306a(String title) throws HeadlessException {
        super(title);
        this.setSize(600, 600);
        this.comboColor1 = new JComboBox();
        this.comboColor1.addItem("Rojo");
        this.comboColor1.addItem("Azul");
        this.comboColor1.addItem("Verde");
        
      //  this.panelPrincipal = new PanelPrincipal();
      
        this.panelPrincipal = new PanelPrincipal1(Color.PINK,Color.CYAN,Color.GREEN);        
        this.setContentPane(this.panelPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
}
