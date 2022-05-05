/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad03.ooms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana0301b extends JFrame {

    private final JPanel panelPrincipal = new JPanel();
    private List<JLabel> jLabelList = new ArrayList<>();
    
    public Ventana0301b(String title) {
        this.setTitle(title);
        this.setSize(new Dimension(800,600));
        this.setLocation(new Point(100,100));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setLayout(new FlowLayout());
        this.setContentPane(this.panelPrincipal);
    }
    
    private void iniciarComponentes(){
        this.panelPrincipal.setBackground(Color.CYAN);
        this.panelPrincipal.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Panel Principal"));
        
        this.jLabelList.add(0,new JLabel("Mauricio Ortiz"));
        this.jLabelList.get(0).setBackground(Color.ORANGE);
        this.jLabelList.get(0).setOpaque(true);
        
        this.jLabelList.add(1,new JLabel());
        var imagen = new ImageIcon("C:\\Netbeans\\poo-unidad03-ooms"
                + "\\poo-unidad03-ooms\\src\\main\\java\\ups\\edu\\ec\\poo\\"
                + "unidad03\\ooms\\imagen1.png");
        this.jLabelList.get(1).setIcon(imagen);
        this.jLabelList.get(1).setBackground(Color.BLUE);
        this.jLabelList.get(1).setOpaque(true);
        
        this.jLabelList.add(2,new JLabel());
        this.jLabelList.get(2).setText("Universidad Politécnica Salesiana");
        this.jLabelList.get(2).setBackground(Color.GREEN);
        this.jLabelList.get(2).setOpaque(true);
                
        this.panelPrincipal.add(this.jLabelList.get(0));        
        this.panelPrincipal.add(this.jLabelList.get(1));
        this.panelPrincipal.add(this.jLabelList.get(2));
        
        System.out.println(this.panelPrincipal.getLayout().toString());
    }
}






