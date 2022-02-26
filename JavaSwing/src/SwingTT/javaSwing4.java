/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingTT;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class javaSwing4 extends JFrame implements ActionListener {

    JButton okButton, exitButton, cancelButton;

    public void JFrameDemo() {
        createAndShow();
    }

    public void createAndShow() {
        okButton = new JButton("OK");
        exitButton = new JButton("Exit");
        cancelButton = new JButton("Cancel");

        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(okButton);
        okButton.setActionCommand("ok");
        okButton.addActionListener((ActionListener) this);
        okButton.setMnemonic(KeyEvent.VK_O);
        okButton.setToolTipText("Pham Duc Manh");

        this.add(exitButton);
        exitButton.setActionCommand("exit");
        exitButton.addActionListener((ActionListener) this);
        exitButton.setMnemonic(KeyEvent.VK_E);
        exitButton.setToolTipText("Nut nay de thoat");

        this.add(cancelButton);
        cancelButton.setActionCommand("cancel");
        cancelButton.addActionListener((ActionListener) this);
        cancelButton.setMnemonic(KeyEvent.VK_C);

        this.setLayout(new FlowLayout());

        setVisible(true);
    }

    public static void main(String[] args) {
        javaSwing4 M = new javaSwing4();
        M.JFrameDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if ("ok".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(rootPane, "Da click ok");
        }
        if ("exit".equals(e.getActionCommand())) {
            System.exit(0);
        }
        if ("cancel".equals(e.getActionCommand())) {
            JOptionPane.showConfirmDialog(rootPane, "Ban co muon huy hay khong?");
        }
    }
}
