/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo2;

import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class ingresoUsuario extends javax.swing.JFrame {
   Profesor profe = new Profesor();
   Encargado encar = new Encargado();
   String auser;
   String apass;
   boolean TipoUsuario;
   int contador = 0;
    /**
     * Creates new form ingresoAdmin
     */
    public ingresoUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        HabilitarIngreso();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        APass = new javax.swing.JTextField();
        IniciarSesion = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        AUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Encargado = new javax.swing.JRadioButton();
        profesor = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Iniciar secion como administrador");

        APass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                APassKeyReleased(evt);
            }
        });

        IniciarSesion.setText("iniciar sesion");
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });

        Cancelar.setText("cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        AUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUserActionPerformed(evt);
            }
        });
        AUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AUserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AUserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AUserKeyTyped(evt);
            }
        });

        jLabel2.setText("nombre de usuario");

        jLabel3.setText("constraseña");

        buttonGroup1.add(Encargado);
        Encargado.setSelected(true);
        Encargado.setText("Encargado");
        Encargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncargadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(profesor);
        profesor.setText("Profesor");
        profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(profesor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Encargado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IniciarSesion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(AUser, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(APass, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(AUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encargado)
                    .addComponent(profesor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IniciarSesion)
                    .addComponent(Cancelar))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUserActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_AUserActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        dispose();
        new Sistema().setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        // TODO add your handling code here:
        
        String User = AUser.getText();
        String Pass = APass.getText();
        if(TipoUsuario == true){
            apass = profe.clave;
            auser = profe.Nombre;
            if(auser.equals(User) && apass.equals(Pass) ){
              dispose();
              new ProfesorF().setVisible(true);
          
          }
            else{
                revisarContador();
        }
        }
        if(TipoUsuario == false){
            apass = encar.clave;
            auser = encar.nombre;
            if(auser.equals(User) && apass.equals(Pass) ){
               dispose();
               new EncargadoF().setVisible(true);
           }
            else{
            revisarContador();
        }
        }
       
        
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void AUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AUserKeyTyped
        // TODO add your handling code here:
      
    }//GEN-LAST:event_AUserKeyTyped

    private void AUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AUserKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AUserKeyPressed

    private void AUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AUserKeyReleased
        // TODO add your handling code here:
        HabilitarIngreso();
    }//GEN-LAST:event_AUserKeyReleased

    private void APassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_APassKeyReleased
        // TODO add your handling code here:
        HabilitarIngreso();
    }//GEN-LAST:event_APassKeyReleased

    private void profesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesorActionPerformed
        // TODO add your handling code here:
        TipoUsuario = true;
    }//GEN-LAST:event_profesorActionPerformed

    private void EncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncargadoActionPerformed
        // TODO add your handling code here:
        TipoUsuario = false;
    }//GEN-LAST:event_EncargadoActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ingresoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APass;
    private javax.swing.JTextField AUser;
    private javax.swing.JButton Cancelar;
    private javax.swing.JRadioButton Encargado;
    private javax.swing.JButton IniciarSesion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton profesor;
    // End of variables declaration//GEN-END:variables
public void HabilitarIngreso(){
    if(AUser.getText().isEmpty() || APass.getText().isEmpty() ){
     IniciarSesion.setEnabled(false);
    }
    else{
        IniciarSesion.setEnabled(true);
    }
}
public void revisarContador(){
    if(contador < 3){
      JOptionPane.showConfirmDialog(null, "usuario o contraseña incorrectos", 
            "Aviso",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);  
      contador = contador+1;
    }
    if(contador == 3){
        JOptionPane.showConfirmDialog(null, "demasiadr errores, cerrando programa", 
            "Aviso",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);
        dispose();
        new Sistema().setVisible(true);
        Sistema.SolicitarRegistro.setEnabled(true);
        
    }
}
}

