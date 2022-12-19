/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_06.vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Maurcio Ortiz
 */
public class PanelPaint extends JPanel{

    @Override
    public void paint(Graphics g) {
        g.drawOval(280,20,40,40);
        g.drawLine(200, 100, 400, 110);
        g.setColor(Color.red);
        g.drawLine(300, 60, 300, 300);
        
        
    }
    
    
    
    
}
