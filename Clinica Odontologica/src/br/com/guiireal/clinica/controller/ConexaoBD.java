package br.com.guiireal.clinica.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * CONEXÕES DO BANCO DE DADOS
 *
 * @author Guilherme
 */
public class ConexaoBD {
    
    private final String host = "jdbc:mysql://localhost/clinica_dentista";
    private final String usuario = "root";
    private final String senha = "aptkx15";
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(host, usuario, senha);
    }
   
}
