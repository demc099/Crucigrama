/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Control.Control;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumnModel;

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
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        Verticales = new javax.swing.JLabel();
        Horizontales = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
            .addGap(0, 929, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
        Solucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolucionActionPerformed(evt);
            }
        });
        Crusigrama.add(Solucion);

        jMenuBar1.add(Crusigrama);

        Ayuda1.setText("Ayuda");

        Ayuda2.setText("Ayuda");
        Ayuda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ayuda2ActionPerformed(evt);
            }
        });
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
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(Verticales, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Horizontales, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 121, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalActionPerformed
       
    }//GEN-LAST:event_NormalActionPerformed

    private void AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaActionPerformed
  JOptionPane.showMessageDialog(null, "Integrantes:"
                + "\n" +"Maria Montero Campos"+ "\n" +"Maria Gonzales Alvarado"+ "\n" +"Daniel Mora Cordero");
                
    }//GEN-LAST:event_AcercaActionPerformed

    private void RevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevisarActionPerformed

    }//GEN-LAST:event_RevisarActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        /*JTable jTable1;  
        int numRows;
        int numColumns;
    
       //String xml;
       //xml=abrirArchivo();
       //control.leerXML(xml);
        
          numRows=  10 ;//control.getFilas();
          numColumns= 10;// control.getColumnas(); 
          jTable1= new JTable(numRows,numColumns);
         //
          jTable1.setBounds(65,65,1150,1150);
          //jTable1.getBounds();
           panelPrincipal.add(jTable1);
           
       panelPrincipal.repaint();
   */
         char [][] matriz;
         matriz=control.devolverMatriz();
        
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) { 
            if((matriz[i][j]) =='0'){
                JTextField btn1 = new JTextField(" ");
                btn1.setBounds(j*30,i* 30, 32, 32);
                btn1.setBackground(Color.black);
                panelPrincipal.add(btn1);
            }
            else if(matriz[i][j]!='0'){
                JTextField btn1 = new JTextField(" ");
                btn1.setBounds(j*30,i* 30, 32, 32);
                panelPrincipal.add(btn1);
            }
               
    }
  }
        panelPrincipal.repaint();
    
 }
    
    
        
       
// new VistaPrincipal().show();
        //control.MostrarVistaFile();
      //  archivoXml.show();
        //String xml;
        //xml=abrirArchivo();
        //control.leerXML(xml);
        
        
        
        
        
                  /*btn1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                       
                    }
                     }); 
                
                //        panelPrincipal.add(btn1);
                }
            }
        }
        panelPrincipal.repaint();
         
    }//GEN-LAST:event_CargarActionPerformed
   
}
    */
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       System.exit(-1);
    }//GEN-LAST:event_SalirActionPerformed

    private void SolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolucionActionPerformed
    
    }//GEN-LAST:event_SolucionActionPerformed

    private void Ayuda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ayuda2ActionPerformed
       
    }//GEN-LAST:event_Ayuda2ActionPerformed

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
    
    
    private String abrirArchivo() {
           String aux="";   
           String texto="";
    try
           {
   /**llamamos el metodo que permite cargar la ventana*/
   JFileChooser file=new JFileChooser();
   file.showOpenDialog(this);
   /**abrimos el archivo seleccionado*/
       File abre=file.getSelectedFile();
 
   /**recorremos el archivo, lo leemos para plasmarlo
   *en el area de texto*/
   if(abre!=null){     
      FileReader archivos=new FileReader(abre);
     // BufferedReader lee=new BufferedReader(archivos);
     // while((aux=lee.readLine())!=null){
     //   texto+= aux;
     // }
         //lee.close();
         
    }  
   texto=abre.getPath();
   return texto;
   }
   catch(IOException ex)
   {
     JOptionPane.showMessageDialog(null,ex+"" +
           "\nNo se ha encontrado el archivo",
                 "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
    }
    return texto;
 }
    
    
    
    
    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
   //  private Control control;
    

}
