/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaDistribuidora {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NroFuentes = new javax.swing.JTextField();
        NroRAM = new javax.swing.JTextField();
        NroCPU = new javax.swing.JTextField();
        NroPlacaBase = new javax.swing.JTextField();
        NroTarjetaGrafica = new javax.swing.JTextField();
        NroEnsambladores = new javax.swing.JTextField();
        NroPM = new javax.swing.JTextField();
        NroDirector = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Distribución de los empleados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 27, 515, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Productores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 61, 88, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Placa Base: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 103, 141, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("CPU:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 137, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("RAM:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 169, 37, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Fuentes de alimentación:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 209, 179, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tarjetas Gráficas:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 249, 112, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Ensambladores:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 356, 152, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Project Manager");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 394, 125, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Director");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 434, 142, -1));
        getContentPane().add(NroFuentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 209, 71, -1));
        getContentPane().add(NroRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 169, 71, -1));
        getContentPane().add(NroCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 135, 71, -1));
        getContentPane().add(NroPlacaBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 101, 71, -1));
        getContentPane().add(NroTarjetaGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 249, 71, -1));
        getContentPane().add(NroEnsambladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 354, 71, -1));
        getContentPane().add(NroPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 394, 71, -1));
        getContentPane().add(NroDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 434, 71, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Otros Trabajadores");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 302, 141, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Días de la simulación:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 61, 151, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 61, 71, -1));

        jButton1.setText("Simular");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 434, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background 2.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NroCPU;
    private javax.swing.JTextField NroDirector;
    private javax.swing.JTextField NroEnsambladores;
    private javax.swing.JTextField NroFuentes;
    private javax.swing.JTextField NroPM;
    private javax.swing.JTextField NroPlacaBase;
    private javax.swing.JTextField NroRAM;
    private javax.swing.JTextField NroTarjetaGrafica;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    
    public void mostrar() {
        JFrame frame = new JFrame("Distribuidora");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        NroPlacaBase = new JTextField(20);
        NroPlacaBase.setBounds(150, 20, 165, 25);
        panel.add(NroPlacaBase);

        NroCPU = new JTextField(20);
        NroCPU.setBounds(150, 50, 165, 25);
        panel.add(NroCPU);

        NroRAM = new JTextField(20);
        NroRAM.setBounds(150, 80, 165, 25);
        panel.add(NroRAM);

        NroFuentes = new JTextField(20);
        NroFuentes.setBounds(150, 110, 165, 25);
        panel.add(NroFuentes);

        NroTarjetaGrafica = new JTextField(20);
        NroTarjetaGrafica.setBounds(150, 140, 165, 25);
        panel.add(NroTarjetaGrafica);

        NroEnsambladores = new JTextField(20);
        NroEnsambladores.setBounds(150, 170, 165, 25);
        panel.add(NroEnsambladores);

        JButton submitButton = new JButton("Enviar");
        submitButton.setBounds(10, 210, 150, 25);
        panel.add(submitButton);

        submitButton.addActionListener((ActionEvent e) -> {
            validarYEnviar();
        });
    }

    private void validarYEnviar() {
        // Validar que cada campo tenga al menos 1 y que la suma sea 15
        int total = Integer.parseInt(NroPlacaBase.getText()) + Integer.parseInt(NroCPU.getText()) +
                    Integer.parseInt(NroRAM.getText()) + Integer.parseInt(NroFuentes.getText()) +
                    Integer.parseInt(NroTarjetaGrafica.getText()) + Integer.parseInt(NroEnsambladores.getText());

        if (total == 15) {
            // Aquí puedes iniciar la simulación
        } else {
            JOptionPane.showMessageDialog(null, "El total de trabajadores debe ser 15.");
        }
    }
}

