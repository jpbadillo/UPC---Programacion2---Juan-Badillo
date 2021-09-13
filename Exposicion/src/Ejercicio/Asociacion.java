/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author JUAN
 */
public class Asociacion {
    public static void main (String[] arg){
        
        Persona persona1 = new Persona();
        persona1.NomCompleto = "Juan Pablo Badillo Hernandez";
        persona1.Cedula = 1193200981;
       
        Vehiculo carro = new Vehiculo();
        carro.Marca = "Ferrari";
        carro.Placa = "CZR-263";
        carro.Color = "Rojo";
        
        persona1.Automovil = carro;
        
        persona1.mostrar();
        
    }
    
}
