/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javasenac;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author mello
 */
public class Car extends javax.swing.JFrame {
   private int velocidade = 0;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Car.class.getName());

    /**
     * Creates new form Car
     */
    public Car() {
        initComponents();
        
        abastecer.setEnabled(false);
        ligar.setEnabled(false);
        acelerar.setEnabled(false);
        freiar.setEnabled(false);
        desligar.setEnabled(false);
        
        abastecer.setText("Carro sem gasolina");
        ligar.setText("Carro desligado");
        acelerar.setText(velocidade+" km/h");
        freiar.setText(velocidade+" km/h");
        desligar.setText("Carro desligado");
        
        result.setEnabled(false);
        atualizarResult();
        
    }
    public void atualizarResult(){
        result.setText("Gasolina: "+abastecer.getText()+ "\n"+ "Carro: " +ligar.getText()+"\n"+"Velocidade: "+acelerar.getText()+"\n"+"Velocidade: "+freiar.getText()+ "\n"+"Carro: "+desligar.getText());
    }
    
    public void resetarResult(){
        abastecer.setText("Carro sem gasolina");
        ligar.setText("Carro desligado");
        acelerar.setText(velocidade+" km/h");
        freiar.setText(velocidade+" km/h");
        desligar.setText("Carro desligado");
        
        result.setText("Gasolina: "+abastecer.getText()+ "\n"+ "Carro: " +ligar.getText()+"\n"+"Velocidade: "+acelerar.getText()+"\n"+"Velocidade: "+freiar.getText()+ "\n"+"Carro: "+desligar.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAbastecer = new javax.swing.JButton();
        btnLigar = new javax.swing.JButton();
        btnAcelerar = new javax.swing.JButton();
        btnFreiar = new javax.swing.JButton();
        btnDesligar = new javax.swing.JButton();
        abastecer = new javax.swing.JTextField();
        ligar = new javax.swing.JTextField();
        acelerar = new javax.swing.JTextField();
        freiar = new javax.swing.JTextField();
        desligar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAbastecer.setText("Abastecer");
        btnAbastecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbastecerMouseClicked(evt);
            }
        });

        btnLigar.setText("Ligar Carro");
        btnLigar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLigarMouseClicked(evt);
            }
        });

        btnAcelerar.setText("Acelerador");
        btnAcelerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcelerarMouseClicked(evt);
            }
        });

        btnFreiar.setText("Freiar");
        btnFreiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFreiarMouseClicked(evt);
            }
        });

        btnDesligar.setText("Desligar");
        btnDesligar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesligarMouseClicked(evt);
            }
        });

        abastecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abastecerMouseClicked(evt);
            }
        });

        result.setColumns(20);
        result.setRows(5);
        jScrollPane1.setViewportView(result);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAbastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(abastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFreiar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDesligar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLigar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAcelerar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ligar)
                            .addComponent(freiar)
                            .addComponent(acelerar)
                            .addComponent(desligar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbastecer)
                    .addComponent(abastecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ligar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLigar))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acelerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAcelerar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFreiar)
                    .addComponent(freiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesligar)
                    .addComponent(desligar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(424, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbastecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbastecerMouseClicked
          btnAbastecer.getText();
       abastecer.setText("Carro abastecido");
       

       atualizarResult();
    }//GEN-LAST:event_btnAbastecerMouseClicked

    private void abastecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abastecerMouseClicked
      
    }//GEN-LAST:event_abastecerMouseClicked

    private void btnLigarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLigarMouseClicked
        if (abastecer.getText().equals("Carro sem gasolina")) {
            JOptionPane.showMessageDialog(null, "Abasteça primeiro");
        }else{
        btnLigar.getText();
        ligar.setText("Carro ligado");   
        desligar.setText("Carro ligado");
        }
        atualizarResult();
        
    }//GEN-LAST:event_btnLigarMouseClicked

    private void btnAcelerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMouseClicked
        if(velocidade>=0 && ligar.getText().equals("Carro ligado")){
            velocidade = velocidade +10;
            acelerar.setText(velocidade+" km/h");
            freiar.setText(velocidade+" km/h");
            if(velocidade >150){
                velocidade = velocidade -10;
                acelerar.setText(velocidade+" km/h");
                freiar.setText(velocidade+" km/h");
                JOptionPane.showMessageDialog(null, "Velocidade Maxima Atingida");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Carro desligado ligue primeiro");
        }
        atualizarResult();
    }//GEN-LAST:event_btnAcelerarMouseClicked

    private void btnFreiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFreiarMouseClicked
        if(velocidade>0){
            velocidade = velocidade -10;
            freiar.setText(velocidade+" km/h");
            acelerar.setText(velocidade+" km/h");
        }else{
            JOptionPane.showMessageDialog(null, "Carro parado");
        }
        atualizarResult();
    }//GEN-LAST:event_btnFreiarMouseClicked

    private void btnDesligarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesligarMouseClicked
        
        if(ligar.getText().equals("Carro ligado")){
            if(velocidade >0){
                JOptionPane.showMessageDialog(null, "Diminua velocidade até para o Carro");
            }else{
                JOptionPane.showMessageDialog(null, "Deligando carro até a proxíma");
            resetarResult();
            }  
        }else{
            JOptionPane.showMessageDialog(null, "Carro já desligado");
        }
    }//GEN-LAST:event_btnDesligarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Car().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abastecer;
    private javax.swing.JTextField acelerar;
    private javax.swing.JButton btnAbastecer;
    private javax.swing.JButton btnAcelerar;
    private javax.swing.JButton btnDesligar;
    private javax.swing.JButton btnFreiar;
    private javax.swing.JButton btnLigar;
    private javax.swing.JTextField desligar;
    private javax.swing.JTextField freiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ligar;
    private javax.swing.JTextArea result;
    // End of variables declaration//GEN-END:variables
}
