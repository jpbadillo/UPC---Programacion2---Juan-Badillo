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
public class Persona {
    
    public int Cedula;
    public String NomCompleto;
    public Vehiculo Automovil;
    

    
    public void mostrar(){
        
        System.out.println("Mi Nombre es " + NomCompleto + ""
                + ", Tengo un Carro de Marca " + Automovil.Marca + ""
                + ", la Placa es " + Automovil.Placa 
                + " Y el Color es " + Automovil.Color);
      
        System.out.println("Mi Cedula es " + Cedula + "");
    }
    
}
