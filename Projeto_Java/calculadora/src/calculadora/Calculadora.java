/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Nerdzk
 */
public class Calculadora {

    static double multiplicar(double A,double B){
        
        double mult;
        mult = A * B;
        
        return mult;
    }
    static double dividir(double A,double B){
        double div;
        div = A / B;
        
        return div;
    }
    static double somar(double A , double B){
        double soma;
        soma = A + B;
        
        return soma;
    }
    static double subtrair(double A, double B){
        double sub;
        sub = A - B;
        
        return sub;
    }
    
    public static void main(String[] args) {
        
        double A,B;
        int x,i;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ola!!!");
        System.out.println("Entre com dois numeros: ");
        
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        
        
        System.out.println("Entre com a Operação desejada: ");
        System.out.println("Multiplicar ->1");
        System.out.println("dividir ->2");
        System.out.println("somar ->3");
        System.out.println("subtrair ->4");
        
        x = teclado.nextInt();
        
        switch(x){
        
            case 1:{
                multiplicar(A,B);
                i = (int)multiplicar(A,B);
                System.out.println((int)A +" x " +(int)B+ "= "+i);
                break;
            }    
            case 2:{
                dividir(A,B);
                
                System.out.printf("%.0f / %.0f = %.0f\n", A, B, dividir(A,B));
                break;
            }
                
            case 3:{
                somar(A,B);
                i = (int)somar(A,B);
                System.out.println((int)A +" + " +(int)B+"= "+i);
                break;
                
            }    
            case 4:{
                subtrair(A,B);
                i = (int)subtrair(A,B);
                System.out.println((int)A +" - " +(int)B+"= "+i);
                break;
                
            }    
            default: 
                    System.out.println("Valor não Válido!!!!");
                
        
        }
       
        
        
        
    }
    
    
    
}
