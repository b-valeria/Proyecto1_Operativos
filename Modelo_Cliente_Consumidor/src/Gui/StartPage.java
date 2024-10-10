/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartPage extends JFrame {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registerbtn = new javax.swing.JButton();
        startbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerbtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        registerbtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        registerbtn.setText("Register");
        jPanel1.add(registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 127, 271, 67));

        startbtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        startbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        startbtn.setText("START");
        jPanel1.add(startbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 270, 271, 73));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background 1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registerbtn;
    private javax.swing.JButton startbtn;
    // End of variables declaration//GEN-END:variables
    
    private JPanel jPanel1;
    private JButton registerbtn;
    private JButton startbtn;

    public StartPage() {
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        registerbtn = new JButton("Registrar");
        startbtn = new JButton("Escoger Compañía");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerbtn.addActionListener((ActionEvent e) -> {
            RegisterMenu registerMenu = new RegisterMenu();
            registerMenu.mostrar();
        });
        jPanel1.add(registerbtn);
        
        startbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EscogerCompany escogerCompany = new EscogerCompany();
                escogerCompany.mostrar();
            }
        });
        jPanel1.add(startbtn);

        getContentPane().add(jPanel1);
        pack();
    }

    public void mostrar() {
        setVisible(true);
    }
}



  

