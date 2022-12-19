/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_06.vista;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author morti
 */
public class VentanaPaint extends JFrame{

    private PanelPaint panelPaint;
    
    public VentanaPaint(){
        this.setSize(1000, 600);
        this.setLocation(100, 100);
        this.setTitle("Paint 1.0");
        this.panelPaint = new PanelPaint();
        this.panelPaint.setBackground(Color.white);
        this.setContentPane(this.panelPaint);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new VentanaPaint();
    }
    
}
