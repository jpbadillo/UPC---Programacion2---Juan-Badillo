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
public class Punto_6 {
    
    public static void main (String[] arg){
        
        Scanner IMC = new Scanner(System.in);
        
        System.out.print("Digite el peso: ");
        float Peso = IMC.nextFloat();
        System.out.print("Digite Altura: ");
        float Altura = IMC.nextFloat();
        
        System.out.printf(" El IMC es = %.2f%n",(Peso/Math.pow(Altura,2)));
    }
    
}
