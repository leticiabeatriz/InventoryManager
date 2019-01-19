package br.edu.ifrn.persistencia;

import br.edu.ifrn.negocio.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FornecedorDAO extends Conexao{
    
    public void cadastrarFornecedor(String cnpj, String nome, String email, String telefone, String telefoneOpcional){
        String sql = "INSERT INTO fornecedores(cnpj, nome, email) VALUES (?,?,?)";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, cnpj);
            estado1.setString(2, nome);
            estado1.setString(3, email);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "Produto cadastrado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto");
        } finally{
            fecharConexao();
        }
        if (telefoneOpcional.isEmpty()) {
            new TelefoneFornecedorDAO().cadastrarTelefoneFornecedor(telefone, cnpj);
        }else{
            new TelefoneFornecedorDAO().cadastrarTelefoneFornecedor(telefone, cnpj);
            new TelefoneFornecedorDAO().cadastrarTelefoneFornecedor(telefoneOpcional, cnpj);
        }
    }
    
    public void deletarFornecedor(String cnpj) {
        String sql = "DELETE FROM fornecedores WHERE cnpj = ?";
        PreparedStatement estado1;
        try {
            new TelefoneFornecedorDAO().deletarTodosTelefonesFornecedor(cnpj);
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, cnpj);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "Fonecedor deletado");
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        
    }
    
    public ArrayList<Fornecedor> selecionarFornecedores(){
        ArrayList<Fornecedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM fornecedores";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while(resultado.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setNome(resultado.getString("nome"));
                fornecedor.setCnpj(resultado.getString("cnpj"));
                fornecedor.setEmail(resultado.getString("email"));
                lista.add(fornecedor);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar produtos");
        } finally {
            fecharConexao();
        }
        return lista;
    }
    
    public ArrayList<Fornecedor> selecionarFornecedores(String rest){
        ArrayList<Fornecedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM fornecedores WHERE nome LIKE '%"+rest+"%' OR cnpj LIKE '%"+rest+"%' ORDER BY nome;";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while(resultado.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setNome(resultado.getString("nome"));
                fornecedor.setCnpj(resultado.getString("cnpj"));
                fornecedor.setEmail(resultado.getString("email"));
                lista.add(fornecedor);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar fornecedores");
        } finally {
            fecharConexao();
        }
        return lista;
    }
      
    public Fornecedor toFornecedor(String cnpj){
        Fornecedor f = new Fornecedor();
        String sql = "SELECT * FROM fornecedores WHERE cnpj = '"+cnpj+"'";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while(resultado.next()){
                f.setNome(resultado.getString("nome"));
                f.setEmail(resultado.getString("email"));
                f.setCnpj(resultado.getString("cnpj"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar fonecedor");
        } finally {
            fecharConexao();
        }
        return f;
    }
    
    public void updateFornecedor(String nome, String email, String cnpj){
        String sql = "UPDATE fornecedores SET nome = ?, email = ? WHERE cnpj = ?";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, nome);
            estado1.setString(2, email);
            estado1.setString(3, cnpj);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "Os dados foram alterados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        } finally {
            fecharConexao();
        }
    }
    
    public String nomeParseCnpj(String nome){
        String cnpj = "";
        String sql = "SELECT cnpj FROM fornecedores WHERE nome = '"+nome+"'";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while(resultado.next()){
                cnpj = resultado.getString("cnpj");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        return cnpj;
    }
    
}
