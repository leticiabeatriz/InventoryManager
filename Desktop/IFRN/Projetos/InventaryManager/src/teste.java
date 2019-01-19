
import br.edu.ifrn.persistencia.FornecedorDAO;
import br.edu.ifrn.persistencia.ProdutoDAO;
import br.edu.ifrn.persistencia.TelefoneFornecedorDAO;

public class teste {
    
    public static void main(String[] args){
        
        System.out.println(new FornecedorDAO().nomeParseCnpj("SSM Logística"));
    
    }
    
}
