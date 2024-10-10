/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegisterMenu extends JFrame {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        idTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("REGISTRO DE USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 17, 146, -1));

        jLabel2.setText("Ingrese Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 79, 127, -1));

        jLabel3.setText("Ingrese ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 127, 100, -1));
        jPanel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 79, 209, -1));
        jPanel1.add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 127, 209, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background 2.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

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
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreTxt;
    // End of variables declaration//GEN-END:variables

    public void mostrar() {
        JFrame frame = new JFrame("Registro");
        frame.setSize(601, 601);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jPanel1 = new JPanel();
        frame.add(jPanel1);
        placeComponents(jPanel1);
        
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        jLabel1 = new JLabel("Nombre:");
        jLabel1.setBounds(10, 20, 80, 25);
        panel.add(jLabel1);

        nombreTxt = new JTextField(20);
        nombreTxt.setBounds(100, 20, 165, 25);
        panel.add(nombreTxt);

        jLabel2 = new JLabel("ID:");
        jLabel2.setBounds(10, 50, 80, 25);
        panel.add(jLabel2);

        idTxt = new JTextField(20);
        idTxt.setBounds(100, 50, 165, 25);
        panel.add(idTxt);

        JButton registerButton = new JButton("Registrar");
        registerButton.setBounds(10, 80, 150, 25);
        panel.add(registerButton);

        registerButton.addActionListener((ActionEvent e) -> {
            registrarUsuario();
        });
    }

private void registrarUsuario() {
    String nombre = nombreTxt.getText();
    String id = idTxt.getText();
    
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("registro.txt", true))) {
        writer.write("Nombre: " + nombre + ", ID: " + id);
        writer.newLine();
        JOptionPane.showMessageDialog(null, "Registro exitoso");
        // Aquí puedes abrir la siguiente ventana (EscogerCompany)
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
    }
}
}

