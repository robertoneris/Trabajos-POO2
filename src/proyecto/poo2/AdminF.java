/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo2;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class AdminF extends javax.swing.JFrame {
    boolean esprofe;
    public static LinkedList contenedorProf = new LinkedList();
    public static LinkedList contenedorEnca = new LinkedList();
    /**
     * Creates new form AdminF
     */
    public AdminF() {
        initComponents();
        this.setLocationRelativeTo(null);
        int contador = 0;
 
        cargar();
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
        rutUsuario = new javax.swing.JTextField();
        nombreUsuario = new javax.swing.JTextField();
        claveUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        esprofesor = new javax.swing.JRadioButton();
        esencargado = new javax.swing.JRadioButton();
        mostrartabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rutUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutUsuarioActionPerformed(evt);
            }
        });

        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });

        claveUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Ingrese nuevo usuario");

        Crear.setText("Enviar");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        jLabel2.setText("Rut:");

        jLabel3.setText("Nombre de Usuario:");

        jLabel4.setText("Clave:");

        jButton1.setText("Cerrar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(esprofesor);
        esprofesor.setSelected(true);
        esprofesor.setText("Profesor");
        esprofesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esprofesorActionPerformed(evt);
            }
        });

        buttonGroup1.add(esencargado);
        esencargado.setText("Encargado");
        esencargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esencargadoActionPerformed(evt);
            }
        });

        mostrartabla.setText("Mostrar Tabla");
        mostrartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrartablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(esprofesor)))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(esencargado))
                                    .addComponent(rutUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(nombreUsuario)
                                    .addComponent(claveUsuario)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(mostrartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claveUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esprofesor)
                    .addComponent(esencargado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crear)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addComponent(mostrartabla)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutUsuarioActionPerformed

    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioActionPerformed

    private void claveUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveUsuarioActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        //Submit los datos
        String nombre = rutUsuario.getText();
        String rut = nombreUsuario.getText();
        String clave = claveUsuario.getText();
        
       
        
        if(nombre.isEmpty() || rut.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos");
            
        } else {
            CrearUsuario(rut,nombre,clave);
            guardar();
            JOptionPane.showMessageDialog(null, "Se han enviado todos los datos");
            rutUsuario.setText(null);
            nombreUsuario.setText(null);
            claveUsuario.setText(null);
        }
    }//GEN-LAST:event_CrearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
         new Sistema().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void esprofesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esprofesorActionPerformed
        // TODO add your handling code here:
        esprofe = true;
      
    }//GEN-LAST:event_esprofesorActionPerformed

    private void esencargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esencargadoActionPerformed
        // TODO add your handling code here:
        esprofe = false;
    }//GEN-LAST:event_esencargadoActionPerformed

    private void mostrartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrartablaActionPerformed
        Datos mostrar = new Datos();
        mostrar.setVisible(true);
    }//GEN-LAST:event_mostrartablaActionPerformed

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
            java.util.logging.Logger.getLogger(AdminF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField claveUsuario;
    private javax.swing.JRadioButton esencargado;
    private javax.swing.JRadioButton esprofesor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton mostrartabla;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JTextField rutUsuario;
    // End of variables declaration//GEN-END:variables
public void CrearUsuario(String Rut,String Usuario, String Clave){
    if(esprofe = true){
      Profesor NuevoProf = new Profesor();
      NuevoProf.setRut(Rut);
      NuevoProf.setNombre(Usuario);
      NuevoProf.setClave(Clave);
      contenedorProf.add(NuevoProf);
    }
    if(esprofe = false){
      Encargado NuevoEnca = new Encargado();
      NuevoEnca.setRut(Rut);
      NuevoEnca.setNombre(Usuario);
      NuevoEnca.setClave(Clave);
      contenedorEnca.add(NuevoEnca);    
    }
}
public void guardar(){
      Usuario u;
        
        for(int i = 0; i < AdminF.contenedorProf.size(); i++) {
        u = (Usuario)AdminF.contenedorProf.get(i);
        String c1 = u.getRut();
        String c2 = u.getNombre();
        String c3 = u.getClave();
        String CadenaDatos = "";
        CadenaDatos = c1+","+c2 +","+c3;
        //guardaod de datos
        FileWriter fichero;
        PrintWriter pw; 
        try{
            fichero = new FileWriter("UserProf.txt",false);
            pw = new PrintWriter(fichero);
            pw.print(CadenaDatos);


        }
        catch(Exception e){
             JOptionPane.showConfirmDialog(null, "Error al Guardar Archivos", 
            "Aviso",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);
        }
        }

}
public void cargar(){
    
}
}
