package com.lg.grades;

import com.mysql.jdbc.Connection;
import java.sql.*;

public class Conn {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/lg_classes";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection conectado() {

        Connection conectividad = null;
        try {
            conectividad = (Connection) DriverManager.getConnection(DB_URL, USER, PASSWORD);
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
