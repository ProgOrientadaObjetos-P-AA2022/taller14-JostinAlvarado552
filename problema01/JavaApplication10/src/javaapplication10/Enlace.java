/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarTrabajador(Trabajador t) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO Trabajadores (Nombre,"
                    + "Cedula, Correo, Sueldo, Mes) "
                    + "values (%s,%s,%s,%.2f,%s)",
                    t.obtenerNombre(),
                    t.obtenerCedula(),
                    t.obtenerCorreo(),
                    t.obtenerSueldo(),
                    t.obtenerMes());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Trabajador> obtenerDataTrabajador() {
        ArrayList<Trabajador> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Trabajadores;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Trabajador t = new Trabajador();
                t.establecerNombre(rs.getString("Nombre"));
                t.establecerCedula(rs.getString("Cedula"));
                t.establecerCorreo(rs.getString("Correo"));
                t.establecerSueldo(rs.getDouble("Sueldo"));
                t.establecerMes(rs.getString("Mes"));
                lista.add(t);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajador");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}
