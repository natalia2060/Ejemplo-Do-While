/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personas;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Personas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String continuar;
         
         do{
             persona personas = new persona();
             
             personas.setNombre();
             personas.setEdad();
             
             System.out.println("\n");
             System.out.println("=== DATOS DE LA PERSONA ===");
             System.out.println("Nombre: "+personas.getNombre());
             System.out.println("Edad: "+personas.getEdad());
             
             System.out.println("\nDesea ingresar otra persona? ");
             continuar = input.nextLine();
        }while(continuar.equalsIgnoreCase("si"));
                 
         System.out.println("\n=== PROGRAMA TERMINADO ===");
    }
}
    
