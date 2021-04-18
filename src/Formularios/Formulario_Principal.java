/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author luisd
 */
public class Formulario_Principal extends javax.swing.JFrame {

    public Formulario_Principal() {
        initComponents();
        //Coloca el formulario emergente al centro de la pantalla.
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuIniciar_Censo = new javax.swing.JMenuItem();
        menuAgregar_Zona_Recidencial = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuAgregar_Usuario = new javax.swing.JMenuItem();
        menuEliminar_Usuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jMenu1.setText("Agregar Datos");
        jMenu1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N

        menuIniciar_Censo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menuIniciar_Censo.setText("Iniciar Censo");
        menuIniciar_Censo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIniciar_CensoActionPerformed(evt);
            }
        });
        jMenu1.add(menuIniciar_Censo);

        menuAgregar_Zona_Recidencial.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menuAgregar_Zona_Recidencial.setText("Agregar Zona Recidencial");
        jMenu1.add(menuAgregar_Zona_Recidencial);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mostrar Datos");
        jMenu2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jMenuItem3.setText("Datos en Conjunto");
        jMenu2.add(jMenuItem3);

        jMenuItem6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jMenuItem6.setText("Datos por Zona Recidencial");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Usuarios");
        jMenu3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N

        menuAgregar_Usuario.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menuAgregar_Usuario.setText("Agregar Usuario/Administrador");
        menuAgregar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregar_UsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(menuAgregar_Usuario);

        menuEliminar_Usuario.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menuEliminar_Usuario.setText("Eliiminar Usuario/Administrador");
        jMenu3.add(menuEliminar_Usuario);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton de Menu "Iniciar Censo", nos redirige al formulario "Agregar Datos jefe Hogar" para registrar datos de censo
    private void menuIniciar_CensoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIniciar_CensoActionPerformed
        //Instanciamos el formulario
        Ingresar_Datos_Jefe_Hogar ventana = new Ingresar_Datos_Jefe_Hogar();
        //Hacemos visible el formulario
        ventana.setVisible(true);
        //Cerramos el formulario anterior
        this.dispose();
        
    }//GEN-LAST:event_menuIniciar_CensoActionPerformed
    
    //Boton de Menu "Agregar Usuario", nos redirige al formulario "Nuevo Usuario" para registrar un nuevo Usuario/Administrador
    private void menuAgregar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregar_UsuarioActionPerformed
        //Instanciamos el formulario
        Nuevo_Usuario ventana = new Nuevo_Usuario();
        //Hacemos visible el formulario
        ventana.setVisible(true);
        //Cerramos el formulario anterior
        this.dispose();
    }//GEN-LAST:event_menuAgregar_UsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem menuAgregar_Usuario;
    private javax.swing.JMenuItem menuAgregar_Zona_Recidencial;
    private javax.swing.JMenuItem menuEliminar_Usuario;
    private javax.swing.JMenuItem menuIniciar_Censo;
    // End of variables declaration//GEN-END:variables
}
