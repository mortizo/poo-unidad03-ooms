/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad03.ooms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame {

    private JPanel panelPrincipal;
    
    public Ventana(String title) {
        super(title);
        this.setSize(new Dimension(800,600));
        this.setLocation(new Point(30,30));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.add(this.panelPrincipal);
    }
    private void iniciarComponentes(){
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setBackground(Color.CYAN);
        this.panelPrincipal.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Panel Principal"));
    }
}






