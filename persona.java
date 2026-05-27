/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personas;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class persona {
    Scanner input = new Scanner(System.in);
    private String nombre;
    private int edad;
    
    public void setNombre(){
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
    }
    public void setEdad(){
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
}
