/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.repaso;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Ejercicios extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicios
     */
    public Ejercicios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Taller Repaso"));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ejercicios del 1 al 9.");

        jButton1.setText("Ejercicio 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ejercicio 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ejercicio 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ejercicio 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Ejercicio 5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Ejercicio 6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Ejercicio 7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Ejercicio 8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Ejercicio 9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(77, 77, 77)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               int num1, num2, suma, resta, residuo;

        Scanner escanercito = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");

        num1 = escanercito.nextInt();
        System.out.println("Digite el segundo numero: ");

        num2 = escanercito.nextInt();

        resta = num1 - num2;
        suma = num1 + num2;
        residuo = num1 % num2;

        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El residuo de los numeros es:" + residuo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                int num;
        Scanner animal1 = new Scanner(System.in);
        System.out.println("\n 1. humano\n 2. algas\n 3. bacteria\n 4. hongo\n 5. planta\n");
             
        System.out.println("Digite el tipo de ser vivio: ");
        num = animal1.nextInt();
        
      if(num==1){
       System.out.println("pertenece al reino animal ");
      }else if(num==2){
           System.out.println("pertenece al reino protista ");
      }else if(num==3){
          System.out.println("pertenece al reino monera ");
      }else if(num==4){
          System.out.println("pertenece al reino fungi ");
      }else if(num==5){
          System.out.println("pertenece al reino vegetal ");
      }else{
          System.out.println("lo opcion elegida es incorrecta ");
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero del 1 al 7: "));
        
        switch(num){
            case 1:
                JOptionPane.showMessageDialog(null,"La nota en esa posicion es: DO");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"La nota en esa posicion es: Re");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"La nota en esa posicion es: MI");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"La nota en esa posicion es: FA");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"La nota en esa posicion es: SOL");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"La nota en esa posicion es: LA");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"La nota en esa posicion es: SI");
                break;
            default:
                JOptionPane.showMessageDialog(null,"La posicion elejida es incorrecta");
                break;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int num1;
        num1=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        if(num1%2==0){
            JOptionPane.showMessageDialog(null, num1+" Es un numero par ");
        }else{
            JOptionPane.showMessageDialog(null, num1+" Es un numero impar ");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                int num,i;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        for(i=0;i<=num;i=i+3){
            if(i>num){
                break;
            }     
            JOptionPane.showMessageDialog(null, i);
        
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int num,i;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        for(i=0;i<=num;i++){
            if(i>num){
                break;
            }     
            JOptionPane.showMessageDialog(null,i);
        
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int a,num1,num2,num3;
        a=1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        if(a==num1){
                    JOptionPane.showMessageDialog(null,"Acceso permitido");
                    System.exit(0);
                }else
                    JOptionPane.showMessageDialog(null,"Acceso denegado");
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog("intentos restantes 2\n Digite un numero:"));
        if(a==num2){
                    JOptionPane.showMessageDialog(null,"Acceso permitido");
                    System.exit(0);
                }else
                    JOptionPane.showMessageDialog(null,"Acceso denegado");
        
        num3 = Integer.parseInt(JOptionPane.showInputDialog("intentos restantes 1\n Digite un numero:"));
                if(a==num3){
                    JOptionPane.showMessageDialog(null,"Acceso permitido");
                    System.exit(0);
                }else
                    JOptionPane.showMessageDialog(null,"Clave bloqueada");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
int num,lado,area;
          
         num=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de cuadrados que le quiere hallar el area: "));
          
         int n[]=new int[num];
         for(int i=0;i<num;i++){
          
          lado=Integer.parseInt(JOptionPane.showInputDialog("Cuadrado N??"+(i+1)+"\nDigite algun lado del cuadrado: "));
          
          area=lado*lado;
          n[i]=area;
           JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+area);
           
    }//GEN-LAST:event_jButton9ActionPerformed
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     int num, fibo1, fibo2,i;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        
        do{
            
        }while(num<=1);
            JOptionPane.showMessageDialog(null,"Los " + num + " primeros numeros de la serie de fibonacci son: ");                

            fibo1=0;
            fibo2=1;
            JOptionPane.showMessageDialog(null, fibo1+ " ");
        for(i=1;i<=num;i++){
            JOptionPane.showMessageDialog(null, fibo2+ " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
    }//GEN-LAST:event_jButton7ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
