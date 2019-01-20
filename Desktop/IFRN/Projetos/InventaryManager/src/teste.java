
import br.edu.ifrn.negocio.ProdutoFornecedor;
import br.edu.ifrn.persistencia.FornecedorDAO;
import br.edu.ifrn.persistencia.ProdutoDAO;
import br.edu.ifrn.persistencia.ProdutoFornecedorDAO;
import br.edu.ifrn.persistencia.TelefoneFornecedorDAO;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String codigo = "1";
        
        while (codigo != "0") {
            codigo = teclado.next();
            System.out.println(new ProdutoDAO().verificarCodigo(codigo));
        } 
        
    }

}
