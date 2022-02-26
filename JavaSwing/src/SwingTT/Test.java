/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingTT;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class Test extends JFrame{
    
    public void M(){
        createAndShow();
    }
    
    public void createAndShow(){
        JButton jbutton = new JButton("Hello");
        this.setTitle("Hello");
        this.setSize(600,400);
        this.add(jbutton);
        this.setLayout(new FlowLayout());
//        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
   
    public static void main(String[] args) {
        Test t = new Test();
        t.M();
    
    }
}
