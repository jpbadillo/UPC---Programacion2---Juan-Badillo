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
public class Punto_4 {
    
    public static void main (String[] arg){
        
        Scanner Rad = new Scanner(System.in);
        
        System.out.print("Digite el Radio: ");
        int Radio = Rad.nextInt();
        
        System.out.printf("Longitud = %.2f%n",(2 * Math.PI * Radio));
        System.out.printf("Area = %.2f%n",(Math.PI * Math.pow(Radio,2)));
    } 
}
