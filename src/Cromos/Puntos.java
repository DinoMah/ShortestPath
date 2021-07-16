/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cromos;

import grafoslista.ListaAdyacencia;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.applet.AudioClip;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rick
 */
public class Puntos extends javax.swing.JFrame {
    //Variable que almacena los puntos
     ArrayList <Point> Lista;
     AudioClip sonido;
    ListaAdyacencia l1;
     MouseListener lis;
    Graphics l ;
    int aux=0; //a
    int aux2=0;//b
    int peso;
    String aux3;
    String aux4;
    int lux;
    
    /**
     * Creates new form Puntos
     */
    public Puntos() {
        initComponents();
        Lista = new ArrayList<Point>();
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/recursos/DarxieLand.wav"));
        sonido.loop();
        //quitar esto luego
        sonido.stop();
       l1 = new ListaAdyacencia();
        l = this.getGraphics();
 
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        camine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("MAPA UAA"); // NOI18N
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setText("Proyecto Final");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("El Camino Más Corto");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mapa_uaa_full4.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Funciones");

        camine.setText("Camino Extra");
        camine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                camineMouseClicked(evt);
            }
        });
        camine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(camine))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(camine))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
      dibujar(evt);
     
        
    }//GEN-LAST:event_formMousePressed

    private void camineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_camineMouseClicked
         //try{
             lineas(evt);
         //}
         //catch( Exception e ){
           //  System.out.print
         //}
    }//GEN-LAST:event_camineMouseClicked

    private void camineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camineActionPerformed

    public void lineas(java.awt.event.MouseEvent evt){
        
       Font fuente = new Font("Monospace",Font.ITALIC, 10);
       String auxi,auxe,auxf;
       int n1,n2,n3;
       int x1,y1;
       int peso = 0;
       auxi =  JOptionPane.showInputDialog("Numero del origen a unir");
       
       n1 = Integer.parseInt(auxi);
       
       auxe =  JOptionPane.showInputDialog("Numero destino a unir");
       
       n2 = Integer.parseInt(auxe);
       
       
       
        //falta agregar lo que se le manda al agregararista
        //Aqui poner lo del peso
         //Peso
           auxf = JOptionPane.showInputDialog("Dame un peso:");
             
             peso = Integer.parseInt(auxf);
             this.peso = peso;
             l1.setPeso(peso);
             
             
            //Escribir el peso 
            
         l.setFont(fuente); 
        l.setColor(Color.black); //Empieza en rojo para que cuando se haga verde se vea que ya se marco
        
        //Fin
        l.fillRect(Lista.get(Lista.size()-n1).x, Lista.get(Lista.size()-n1).y, 5, 5);
        
         
        //Inicio
        
        l.drawLine(Lista.get(Lista.size()-n1).x, Lista.get(Lista.size()-n1).y,
                Lista.get(Lista.size()-n2).x, Lista.get(Lista.size()-n2).y);
        //Saca el peso que se mostrara en el grafico
        n3=lux;
        n3=n3-2;
      l.drawString("Peso "+n3+": "+auxf, Lista.get(Lista.size()-n1).x, Lista.get(Lista.size()-n2).y);
         
        //Aqui va el peso
        //Hay que modificar agregar arista pero que maneje numeros no string e.e
       // l1.agregarArista(auxi, auxe, peso);
        
    }//fin lineas
    
    
    public void dibujar(java.awt.event.MouseEvent evt){
        Scanner in = new Scanner(System.in);
         Font fuente = new Font("Monospace",Font.ITALIC, 10);
         String aux,aux2,auxn,auxn2,auxn3;
         String auxp = "si";
         String nv;
         int n=0;
         
        if(Lista.isEmpty()){
           
        l.setColor(Color.BLUE);
        l.fillOval(evt.getX(), evt.getY(), 8, 8);
        l.drawOval(evt.getX(), evt.getY(), 8, 8);
         //Guardar los puntos.
        Lista.add(new Point(evt.getX(),evt.getY()));
          lux++;
         nv =  JOptionPane.showInputDialog("Dame el nombre del punto "+lux);
            try {
                //Guarda la variable en el objeto listaadyacente
                l1.agregarVertice(nv);
                n = lux;
                l.setFont(fuente);
                l.drawString(nv+":"+lux, evt.getX(), evt.getY());
                lux++;
                
            } catch (Exception ex) {
                Logger.getLogger(Puntos.class.getName()).log(Level.SEVERE, null, ex);
            }   
            //Apartir de aqui va en el else 1
       
           
      
       }//fin if empty
       else{
           if(Lista.size()<18){
        l.setColor(Color.BLUE);
        l.fillOval(evt.getX(), evt.getY(), 8, 8);
        l.drawOval(evt.getX(), evt.getY(), 8, 8);
         //Guardar los puntos.
        Lista.add(new Point(evt.getX(),evt.getY()));
        
        nv =  JOptionPane.showInputDialog("Dame el nombre del punto "+lux);
            try {
                //Guarda la variable en el objeto listaadyacente
                l1.agregarVertice(nv);
                l.setFont(fuente);
                l.drawString(nv, evt.getX(), evt.getY());
                
                n = lux;
                l.setFont(fuente);
                l.drawString(nv+":"+lux, evt.getX(), evt.getY());
                lux++;
                
            } catch (Exception ex) {
                Logger.getLogger(Puntos.class.getName()).log(Level.SEVERE, null, ex);
            }   
            //Apartir de aqui va en el else 1
      
        aux2 =  JOptionPane.showInputDialog("¿Quieres Un camino? si u no");
        
         if(aux2.equals(auxp)){
             
            try {
                //Falta agregarle el camino
                lineas(evt);
            } catch (Exception ex) {
                Logger.getLogger(Puntos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         }
        
           }// fin if dentro del else 1
               
       }//fin else 1
       
        
        
        
    }//fin dibujar
    
    
    
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
            java.util.logging.Logger.getLogger(Puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puntos().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton camine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
