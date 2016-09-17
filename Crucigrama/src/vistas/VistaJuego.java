/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Control.Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Zeneida
 */
public class VistaJuego extends javax.swing.JFrame {

    /**
     * Creates new form VistaJuego
     */
    public VistaJuego(Control c) {
        initComponents();
        control=c;
        archivoXml= new VistaPrincipal(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        Verticales = new javax.swing.JLabel();
        Horizontales = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Cargar = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        Modo = new javax.swing.JMenu();
        Normal = new javax.swing.JMenuItem();
        Asistido = new javax.swing.JMenuItem();
        Crusigrama = new javax.swing.JMenu();
        Revisar = new javax.swing.JMenuItem();
        Solucion = new javax.swing.JMenuItem();
        Ayuda1 = new javax.swing.JMenu();
        Ayuda2 = new javax.swing.JMenuItem();
        Acerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        Archivo.setText("Archivo");

        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        Archivo.add(Cargar);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Archivo.add(Salir);

        jMenuBar1.add(Archivo);

        Modo.setText("Modo");

        Normal.setText("Normal");
        Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormalActionPerformed(evt);
            }
        });
        Modo.add(Normal);

        Asistido.setText("Asistido");
        Modo.add(Asistido);

        jMenuBar1.add(Modo);

        Crusigrama.setText("Crucigrama");

        Revisar.setText("Revisar");
        Revisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevisarActionPerformed(evt);
            }
        });
        Crusigrama.add(Revisar);

        Solucion.setText("Solución");
        Crusigrama.add(Solucion);

        jMenuBar1.add(Crusigrama);

        Ayuda1.setText("Ayuda");

        Ayuda2.setText("Ayuda");
        Ayuda1.add(Ayuda2);

        Acerca.setText("Acerca");
        Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaActionPerformed(evt);
            }
        });
        Ayuda1.add(Acerca);

        jMenuBar1.add(Ayuda1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Verticales, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Horizontales, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(Verticales, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Horizontales, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NormalActionPerformed

    private void AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcercaActionPerformed

    private void RevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevisarActionPerformed
       // control.verificar();  
        // TODO add your handling code here:
    }//GEN-LAST:event_RevisarActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
      // new VistaPrincipal().show();
        control.MostrarVistaFile();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                 if((control.devolverMatriz())[i][j]==' '){
                JTextField btn1 = new JTextField(" ");
                btn1.setBounds(j*30,i* 30, 32, 32);
                  /*btn1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                       
                    }
                     }); 
                */
                        panelPrincipal.add(btn1);
                }
            }
        }
        panelPrincipal.repaint();
         
    }//GEN-LAST:event_CargarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       System.exit(-1);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
                 //new VistaJuego(control).setVisible(true);
              
                // control.MostrarVistaJuego();
            }
        });
    }
  VistaPrincipal archivoXml; 
  Control control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Acerca;
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenuItem Asistido;
    private javax.swing.JMenu Ayuda1;
    private javax.swing.JMenuItem Ayuda2;
    private javax.swing.JMenuItem Cargar;
    private javax.swing.JMenu Crusigrama;
    private javax.swing.JLabel Horizontales;
    private javax.swing.JMenu Modo;
    private javax.swing.JMenuItem Normal;
    private javax.swing.JMenuItem Revisar;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem Solucion;
    private javax.swing.JLabel Verticales;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
   //  private Control control;
}
