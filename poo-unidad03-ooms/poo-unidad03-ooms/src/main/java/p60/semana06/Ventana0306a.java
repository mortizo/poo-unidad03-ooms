/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana06;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author morti
 */
public class Ventana0306a extends JFrame{

    private PanelPrincipal panelPrincipal;
    
    public Ventana0306a(String title) throws HeadlessException {
        super(title);
        this.setSize(600, 600);
        this.panelPrincipal = new PanelPrincipal();
        this.setContentPane(this.panelPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
}
