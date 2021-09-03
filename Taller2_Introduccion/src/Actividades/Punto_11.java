package Actividades;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN
 */
public class Punto_11 {
    
    public static void main (String[] arg){
        
        Scanner Numero = new Scanner(System.in);
        
        System.out.print("Digite un Numero entre 0 a 1000: ");
        int Num = Numero.nextInt();
        
        int Unidades, Decenas, Centenas;
        
        Unidades = Num % 10;
        Num = Num / 10;
        Decenas = Num % 10;
        Num = Num / 10;
        Centenas = Num % 10;

        System.out.println("Unidades: "+ Unidades); 
        System.out.println("Decenas: "+ Decenas);
        System.out.println("Centenas: "+ Centenas);
    }
    
}
