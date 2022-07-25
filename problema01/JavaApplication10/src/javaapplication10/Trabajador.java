/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author DET PC
 */
public class Trabajador {

    private String nombre;
    private String cedula;
    private String correo;
    private double sueldo;
    private String mes;

    public Trabajador() {

    }

    public Trabajador(String n, String c, String co, double s, String m) {
        nombre = n;
        cedula = c;
        correo = co;
        sueldo = s;
        mes = m;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerCorreo(String co) {
        correo = co;
    }

    public void establecerMes(String m) {
        mes = m;
    }

    public void establecerSueldo(double s) {
        sueldo = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public String obtenerMes() {
        return mes;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
}
