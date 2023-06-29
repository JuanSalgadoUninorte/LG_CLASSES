package com.lg.grades;

import com.mysql.jdbc.Connection;
import java.sql.*;

public class Conn {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/nombre_base_datos";
    private static final String USER = "usuario";
    private static final String PASSWORD = "contraseña";

    public static Connection conectado() {

        Connection conectividad = null;
        try {
            conectividad = (Connection) DriverManager.getConnection(DB_URL, USER, PASSWORD);
            if (conectividad != null) {
                System.out.println("Conexión exitosa a la base de datos MySQL");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conectividad;
    }

    public static ResultSet getTable(String Consulta) {
        Connection conectividad = conectado();
        Statement st;
        ResultSet datos = null;
        try {
            st = conectividad.createStatement();
            datos = st.executeQuery(Consulta);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return datos;
    }

}
