package br.com.guiireal.clinica.controller;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * DATA ACESS OBJECT DENTISTA
 * 
 * @author Guilherme
 */
public final class DentistaDAO {
    
    private Connection conexao;
    
    public DentistaDAO() {
        try {
            this.conexao = new ConexaoBD().getConnection();
        } catch (SQLException erroSQL) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar se comunicar com o banco de dados !",
                                          "Erro", JOptionPane.ERROR_MESSAGE);
            this.desconecta();
            throw new RuntimeException(erroSQL);
        }
    }
    
    public void desconecta() {
        try {
            this.conexao.close();
        } catch (SQLException erroSQL) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar fechar o banco de dados !",
                                          "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
}
