/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana06;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author UPS
 */
public class PanelPrincipal1 extends JPanel{

    @Override
    public void paint(Graphics g) {
        super.paint(g);     
        g.setColor(Color.RED);
        g.drawLine(0, 0, 600, 600);
        g.setColor(Color.GREEN);
        g.fillOval(0, 0, 300, 300);
        g.setColor(Color.ORANGE);
        g.fillRect(300, 300, 200, 250);
    
    }
    
    
    
}
