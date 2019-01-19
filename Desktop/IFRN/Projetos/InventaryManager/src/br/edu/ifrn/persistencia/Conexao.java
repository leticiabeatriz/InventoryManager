package br.edu.ifrn.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {
    
    private String banco = "inventorymanager";
    private String host = "127.0.0.1";
    private String driver = "com.mysql.jdbc.Driver";
    private String strConn = "jdbc:mysql://"+host+":3306/"+banco;
    private String user = "root";
    private String senha = "";
    
    public Connection conexao;
    public Statement estado;
    
    public void conectar(){
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(strConn, user, senha);
            estado = conexao.createStatement();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar o driver");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar");
        }  
    }
    
    public void fecharConexao(){
        try{
            estado.close();
            conexao.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao encerrar conexão");
        }
    }
    
}
