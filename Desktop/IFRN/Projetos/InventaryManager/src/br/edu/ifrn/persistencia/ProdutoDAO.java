package br.edu.ifrn.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO extends Conexao {

    public void cadastrarProduto(String codigo, String nome) {
        String sql = "INSERT INTO produtos(codigo, nome) VALUES (?,?)";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, codigo);
            estado1.setString(2, nome);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "Produto cadastrado");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
    }

    public boolean verificarCodigo(String codigo) {
        boolean verificador = false;
        String sql = "SELECT COUNT(codigo) AS contador FROM produtos WHERE codigo = '" + codigo + "'";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while (resultado.next()) {
                if (resultado.getInt("contador") == 0) {
                    verificador = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        return verificador;
    }

}
