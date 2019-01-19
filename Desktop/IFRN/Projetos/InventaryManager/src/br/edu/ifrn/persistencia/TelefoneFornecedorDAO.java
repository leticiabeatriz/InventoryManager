package br.edu.ifrn.persistencia;

import br.edu.ifrn.negocio.Telefone;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelefoneFornecedorDAO extends Conexao {

    public void cadastrarTelefoneFornecedor(String telefone, String cnpj) {
        String sql = "INSERT INTO telefoneFornecedor(telefone, cnpjFornecedor) VALUES (?,?)";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, telefone);
            estado1.setString(2, cnpj);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "Telefone cadastrado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar telefone");
        } finally {
            fecharConexao();
        }
    }

    public void deletarTodosTelefonesFornecedor(String cnpj) {
        String sql = "DELETE FROM telefoneFornecedor WHERE cnpjFornecedor = ?";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, cnpj);
            estado1.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar telefone");
        } finally {
            fecharConexao();
        }
    }

    public void deletarTelefoneFornecedor(String cnpj, String telefone) {
        String sql = "DELETE FROM telefoneFornecedor WHERE cnpjFornecedor = ? AND telefone = ?";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, cnpj);
            estado1.setString(2, telefone);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "Telefone excluído");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir telefone telefone");
        } finally {
            fecharConexao();
        }
    }

    public String selectTelefonesJuntos(String cnpj) {
        String telefones = "";
        String sql = "SELECT telefone FROM telefoneFornecedor WHERE cnpjFornecedor = '" + cnpj + "'";
        ResultSet resultado = null;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while (resultado.next()) {
                telefones += resultado.getString("telefone") + ", ";
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelefoneFornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        if (this.getTelefoneCount(cnpj) >= 1) {
            telefones = telefones.substring(0, telefones.length() - 1);
            telefones = telefones.substring(0, telefones.length() - 1);
        }
        return telefones;
    }

    public ArrayList<Telefone> selecionarTelefones(String cnpj) {
        ArrayList<Telefone> lista = new ArrayList<>();
        String sql = "SELECT telefone FROM telefonefornecedor LEFT JOIN fornecedores ON telefonefornecedor.cnpjFornecedor = fornecedores.cnpj WHERE cnpj = '" + cnpj + "';";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while (resultado.next()) {
                Telefone telefone = new Telefone();
                telefone.setTelefone(resultado.getString("telefone"));
                lista.add(telefone);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar telefones");
        } finally {

        }
        return lista;
    }

    public int getTelefoneCount(String cnpj) {
        int count = 0;
        String sql = "SELECT COUNT(telefone) AS telefoneCount FROM telefonefornecedor WHERE cnpjFornecedor = '" + cnpj + "'";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while (resultado.next()) {
                count = resultado.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelefoneFornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        return count;
    }

    public boolean verificarTelefone(String telefone) {
        boolean verificador = false;
        String sql = "SELECT COUNT(telefone) AS telefoneCount FROM telefonefornecedor WHERE telefone = '" + telefone + "'";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while (resultado.next()) {
                if (resultado.getInt("telefoneCount") == 0) {
                    verificador = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelefoneFornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        return verificador;
    }

}
