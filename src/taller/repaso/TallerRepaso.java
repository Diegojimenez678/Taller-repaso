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
public class TallerRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
    }

    public static void ejercicio1() {

        int num1, num2, suma, resta, residuo;

        Scanner escanercito = new Scanner(System.in);
        System.out.println("digite el primer numero");

        num1 = escanercito.nextInt();
        System.out.println("Digite el segundo numero");

        num2 = escanercito.nextInt();

        resta = num1 - num2;
        suma = num1 + num2;
        residuo = num1 % num2;

        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El residuo de los numeros es: " + residuo);

    }

    public static void ejercicio2() {
        int num;
        Scanner animal1 = new Scanner(System.in);
        System.out.println("1. humano\n 2. algas\n 3. bacteria\n 4. hongo\n 5. planta\n");
             
        System.out.println("digite el tipo de ser vivio: ");
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
    
    }
    public static void ejercicio3() {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite un numero del 1 al 7: "));
        
        switch(num){
            case 1:
                JOptionPane.showMessageDialog(null,"la nota en esa posicion es DO");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"la nota en esa posicion es Re");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"la nota en esa posicion es MI");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"la nota en esa posicion es FA");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"la nota en esa posicion es SOL");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"la nota en esa posicion es LA");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"la nota en esa posicion es SI");
                break;
            default:
                JOptionPane.showMessageDialog(null,"la posicion elejida es incorrecta");
                break;
        }
        
        
    }
    
    public static void ejercicio4() {
        int num,i;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        for(i=0;i<=num;i++){
            if(i>num){
                break;
            }     
            JOptionPane.showMessageDialog(null,i);
        
        }
    }
    
    public static void ejercicio5() {
                int num,i;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        for(i=0;i<=num;i=i+3){
            if(i>num){
                break;
            }     
            JOptionPane.showMessageDialog(null,i);
        
        }
        
        
    }
    public static void ejercicio6() {
        int num1;
        num1=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        if(num1%2==0){
            JOptionPane.showMessageDialog(null, num1+" Es un numero par ");
        }else{
            JOptionPane.showMessageDialog(null, num1+" Es un numero impar ");
        }
        
        
    }
    public static void ejercicio7() {
        int num, fibo1, fibo2,i;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        
        do{
            
        }while(num<=1);
            JOptionPane.showMessageDialog(null,"Los" + num + " primeros de la serie de fibonacci son: ");                

            fibo1=0;
            fibo2=1;
            JOptionPane.showMessageDialog(null, fibo1+ " ");
        for(i=1;i<=num;i++){
            JOptionPane.showMessageDialog(null, fibo2+ " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        
      
        
    }
    public static void ejercicio8() {
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
        
    }
    public static void ejercicio9() {
        int num,lado,area;
          
         num=Integer.parseInt(JOptionPane.showInputDialog("Digite numero de cuadrados que le quiere hallar el area: "));
          
         int n[]=new int[num];
         for(int i=0;i<num;i++){
          
          lado=Integer.parseInt(JOptionPane.showInputDialog("Cuadrado N°"+(i+1)+"\nDigite algun lado del cuadrado: "));
          
          area=lado*lado;
          n[i]=area;
           JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+area);
           
        
         }
        
         }
    public static void ejercicio10() {
        double num1, num2, hipo;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("DIgite el valor del cateto 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("DIgite el valor del cateto 2: "));
        
        hipo = Math.pow(num1,2)+Math.pow(num2, 2);
        hipo = Math.sqrt(hipo); 
        JOptionPane.showMessageDialog(null,"La hipotenusa del triangulo es: "+ hipo);
    }
    
    
}
