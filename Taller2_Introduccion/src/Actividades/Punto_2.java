/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Punto_2 {
    
    public static void main (String[] arg){
        
        Scanner Num = new Scanner(System.in);
        
        System.out.print("Digite Num1: ");
        int Num1 = Num.nextInt();
        System.out.print("Digite Num2: ");
        int Num2 = Num.nextInt();
        
        System.out.printf("Suma = %d%n",(Num1 + Num2));
        System.out.printf("Producto = %d%n",(Num1 * Num2));
        System.out.printf("Diferencia = %d%n",(Num1 - Num2));

    }
    
}
