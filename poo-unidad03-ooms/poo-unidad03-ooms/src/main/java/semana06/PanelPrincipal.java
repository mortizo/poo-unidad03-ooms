/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana06;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author morti
 */
public class PanelPrincipal extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.setColor(Color.YELLOW);
        g.fillRect(100, 100, 300, 100);
        g.setColor(Color.BLUE);
        g.fillRect(100, 200, 300, 50);
        g.setColor(Color.RED);
        g.fillRect(100, 250, 300, 50);
        g.setColor(Color.GRAY);
        g.fillRect(90, 90, 10, 400);
    }
}
