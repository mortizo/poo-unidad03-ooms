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
    
    private Color color1;
    private Color color2;
    private Color color3;

    public PanelPrincipal1(Color color1, Color color2, Color color3) {
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
    }
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);     
        g.setColor(this.color1);
        g.drawLine(0, 0, 600, 600);
        g.setColor(this.color2);
        g.fillOval(0, 0, 300, 300);
        g.setColor(this.color3);
        g.fillRect(300, 300, 200, 250);
    
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Color getColor3() {
        return color3;
    }

    public void setColor3(Color color3) {
        this.color3 = color3;
    }
    
    
    
}
