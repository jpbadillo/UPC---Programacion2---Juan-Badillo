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
public class Punto_7 {
    
    public static void main (String[] arg){
        
        Scanner UTD = new Scanner(System.in);
        
        System.out.print("Digite el precio de compra: ");
        int Compra = UTD.nextInt();
        System.out.print("Digite el precio de venta: ");
        int Venta = UTD.nextInt();
        
        System.out.printf("El %% de utilidad es: = %d%n",(Venta - Compra));
        
    }
}
