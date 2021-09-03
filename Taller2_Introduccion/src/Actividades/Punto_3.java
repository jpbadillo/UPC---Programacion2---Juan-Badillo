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
public class Punto_3 {
    public static void main (String[] arg){
        
        Scanner Num = new Scanner(System.in);
        
        System.out.print("Digite Num1: ");
        float Num1 = Num.nextFloat();
        System.out.print("Digite Num2: ");
        float Num2 = Num.nextFloat();
        System.out.print("Digite Num3: ");
        float Num3 = Num.nextFloat();
        
        System.out.printf("Suma = %.2f%n",(Num1 + Num2 + Num3));
        System.out.printf("Promedio = %.2f%n",(Num1 + Num2 + Num3)/3);
        System.out.printf("Producto = %.2f%n",(Num1 * Num2 * Num3));
        System.out.printf("Cociente = %.2f%n",(Num1 / Num2 / Num3));
        System.out.printf("Modulo = %.2f%n",(Num1 % Num2 % Num3));
    }

}
