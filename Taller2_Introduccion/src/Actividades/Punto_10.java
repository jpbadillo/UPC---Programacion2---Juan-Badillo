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
public class Punto_10 {
    
    public static void main (String[] arg){
        
        Scanner Peso = new Scanner(System.in);
        
        System.out.print("Digite el Peso en Kg: ");
        float Ps = Peso.nextFloat();
        
        System.out.printf("En Gramos = %.0f%n",(Ps * 1000)); 
        System.out.printf("En Libras = %.2f%n",(Ps * 2.205));
        System.out.printf("En Toneladad = %.3f%n",(Ps / 1000));
    }
   
}
