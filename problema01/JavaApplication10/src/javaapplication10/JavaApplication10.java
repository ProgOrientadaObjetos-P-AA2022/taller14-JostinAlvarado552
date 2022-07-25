/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author DET PC
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        
        while (bandera) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la cedula del trabajador");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese el correo del trabajador");
            String correo = entrada.nextLine();
            System.out.println("Ingrese el sueldo del trabajador");
            double sueldo = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el mes del sueldo");
            String mes = entrada.nextLine();
            
            Trabajador t = new Trabajador(nombre, cedula, correo, sueldo, mes);
            t.establecerNombre(nombre);
            t.establecerCedula(cedula);
            t.establecerCorreo(correo);
            t.establecerSueldo(sueldo);
            t.establecerMes(mes);
            Enlace c = new Enlace();
            c.insertarTrabajador(t);
            
            System.out.println("""
                               Ingrese:
                               [1] para continuar ingresando datos
                               [2] para finalizar el programa.
                               """);
            int opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 1) {
                bandera = true;
            } else {
                System.out.println("Ingreso de calificaciones finalizado.");
                bandera = false;
            }
            
        }
        
    }
    
}
