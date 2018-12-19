package br.edu.ifrn.gui;


import br.edu.ifrn.negocio.Produto;
import br.edu.ifrn.persistencia.ProdutoDAO;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

public class Produtos extends javax.swing.JFrame {

    DefaultTableModel modeloProduto;
    int selectedRow;
    int mouseX;
    int mouseY;
    String idProduto;
    
    private void selecionarProduto(){
        ProdutoDAO banco = new ProdutoDAO();
        modeloProduto.setNumRows(0);
        for(Produto p: banco.selecionarProduto()){
            modeloProduto.addRow(new Object[]{"  " + p.getCodigo(), "  " + p.getNome(), "  " + p.getPrecoCompra(), "  " + p.getPrecoVenda()});
        }
    }
    
    private void selecionarProdutoComRest(){
        ProdutoDAO banco = new ProdutoDAO();
        modeloProduto.setNumRows(0);
        for(Produto p: banco.selecionarProduto(pesquisaProutos.getText())){
            modeloProduto.addRow(new Object[]{"  " + p.getCodigo(), "  " + p.getNome(), "  " + p.getPrecoCompra(), "  " + p.getPrecoVenda()});
        }
    }
    
    public Produtos() {
        
        initComponents();
        newCodigoField.setEditable(false);
        btnExcluir.setVisible(false);
        modeloProduto = (DefaultTableModel) tableProdutos.getModel();
        this.setExtendedState(6);
        tableProdutos.setBorder(null);
        scrollTableProdutos.setBorder(null);
        tableProdutos.setFillsViewportHeight(true);
        tableProdutosLabel.setOpaque(true);
        tableProdutosLabel.setBackground(Color.decode("#005099"));
        instructions.setText("<html><body>- Clique duas vezes em um produto para alterá-lo; <br>- Selecione uma produto e clique no botão <b>EXCLUIR</b> para apagar um prodtuto; <br>- Clique no botão <b>INSERIR</b> para cadastrar um produto.</body></html>");
        JTableHeader tableProdutosHeader = tableProdutos.getTableHeader();
        tableProdutosHeader.setFont(new java.awt.Font("Roboto Light", 0, 13));
        sort();
        selecionarProduto();
        pesquisaProutos.setBorder(BorderFactory.createCompoundBorder(pesquisaProutos.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarProduto = new javax.swing.JDialog();
        wrapCadastarProduto = new javax.swing.JPanel();
        cadastrarProdutoIcon = new javax.swing.JLabel();
        cadastrarProdutosHeader = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        codigoField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        precoCompraLabel = new javax.swing.JLabel();
        precoCompraField = new javax.swing.JTextField();
        precoVendaLabel = new javax.swing.JLabel();
        precoVendaField = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();
        atualizarProduto = new javax.swing.JDialog();
        wrapAtualizarProduto = new javax.swing.JPanel();
        atualizarProdutoIcon = new javax.swing.JLabel();
        atualizarProdutosHeader = new javax.swing.JLabel();
        newCodigoLabel = new javax.swing.JLabel();
        newCodigoField = new javax.swing.JTextField();
        newNomeLabel = new javax.swing.JLabel();
        newNomeField = new javax.swing.JTextField();
        newPrecoCompraLabel = new javax.swing.JLabel();
        newPrecoCompraField = new javax.swing.JTextField();
        newPrecoVendaLabel = new javax.swing.JLabel();
        newPrecoVendaField = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btnCancelarUpdate = new javax.swing.JButton();
        wrap = new javax.swing.JPanel();
        sideMenu = new javax.swing.JPanel();
        sideMenuLogo = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnContas = new javax.swing.JButton();
        wrapTableProdutos = new javax.swing.JPanel();
        scrollTableProdutos = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        tableProdutosLabel = new javax.swing.JLabel();
        headerProdutos = new javax.swing.JLabel();
        draggleBar = new javax.swing.JLabel();
        instructions = new javax.swing.JLabel();
        pesquisaProutos = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnIconizar = new javax.swing.JButton();

        cadastrarProduto.setLocationByPlatform(true);
        cadastrarProduto.setMaximumSize(new java.awt.Dimension(314, 449));
        cadastrarProduto.setMinimumSize(new java.awt.Dimension(314, 449));
        cadastrarProduto.setModal(true);
        cadastrarProduto.setPreferredSize(new java.awt.Dimension(314, 449));
        cadastrarProduto.setResizable(false);

        wrapCadastarProduto.setBackground(new java.awt.Color(255, 255, 255));
        wrapCadastarProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 80, 153)));
        wrapCadastarProduto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                wrapCadastarProdutoMouseDragged(evt);
            }
        });
        wrapCadastarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wrapCadastarProdutoMousePressed(evt);
            }
        });

        cadastrarProdutoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/iconCadastrarProduto.png"))); // NOI18N
        cadastrarProdutoIcon.setText("jLabel2");

        cadastrarProdutosHeader.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        cadastrarProdutosHeader.setForeground(new java.awt.Color(37, 36, 34));
        cadastrarProdutosHeader.setText("Cadastrar produto");

        codigoLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        codigoLabel.setForeground(new java.awt.Color(37, 36, 34));
        codigoLabel.setText("Código:");

        codigoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoFieldKeyPressed(evt);
            }
        });

        nomeLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(37, 36, 34));
        nomeLabel.setText("Nome:");

        nomeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeFieldKeyPressed(evt);
            }
        });

        precoCompraLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        precoCompraLabel.setForeground(new java.awt.Color(37, 36, 34));
        precoCompraLabel.setText("Preço de compra:");

        precoCompraField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precoCompraFieldKeyPressed(evt);
            }
        });

        precoVendaLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        precoVendaLabel.setForeground(new java.awt.Color(37, 36, 34));
        precoVendaLabel.setText("Preço de revenda:");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnCadastrar.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnCancelarCadastro.png"))); // NOI18N
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wrapCadastarProdutoLayout = new javax.swing.GroupLayout(wrapCadastarProduto);
        wrapCadastarProduto.setLayout(wrapCadastarProdutoLayout);
        wrapCadastarProdutoLayout.setHorizontalGroup(
            wrapCadastarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapCadastarProdutoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(wrapCadastarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precoVendaField)
                    .addComponent(precoCompraField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapCadastarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(precoCompraLabel)
                        .addGroup(wrapCadastarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(wrapCadastarProdutoLayout.createSequentialGroup()
                                .addComponent(cadastrarProdutoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadastrarProdutosHeader))
                            .addComponent(nomeLabel)
                            .addComponent(codigoLabel)
                            .addComponent(btnCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoField)
                            .addComponent(nomeField))
                        .addComponent(precoVendaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        wrapCadastarProdutoLayout.setVerticalGroup(
            wrapCadastarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapCadastarProdutoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(wrapCadastarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarProdutoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarProdutosHeader))
                .addGap(20, 20, 20)
                .addComponent(codigoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(precoCompraLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoCompraField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(precoVendaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoVendaField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cadastrarProdutoLayout = new javax.swing.GroupLayout(cadastrarProduto.getContentPane());
        cadastrarProduto.getContentPane().setLayout(cadastrarProdutoLayout);
        cadastrarProdutoLayout.setHorizontalGroup(
            cadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrapCadastarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        cadastrarProdutoLayout.setVerticalGroup(
            cadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarProdutoLayout.createSequentialGroup()
                .addComponent(wrapCadastarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        atualizarProduto.setMinimumSize(new java.awt.Dimension(316, 449));
        atualizarProduto.setModal(true);
        atualizarProduto.setResizable(false);

        wrapAtualizarProduto.setBackground(new java.awt.Color(255, 255, 255));
        wrapAtualizarProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 80, 153)));
        wrapAtualizarProduto.setMaximumSize(new java.awt.Dimension(316, 449));
        wrapAtualizarProduto.setMinimumSize(new java.awt.Dimension(316, 449));
        wrapAtualizarProduto.setPreferredSize(new java.awt.Dimension(316, 449));
        wrapAtualizarProduto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                wrapAtualizarProdutoMouseDragged(evt);
            }
        });
        wrapAtualizarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wrapAtualizarProdutoMousePressed(evt);
            }
        });

        atualizarProdutoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/iconCadastrarProduto.png"))); // NOI18N
        atualizarProdutoIcon.setText("jLabel2");

        atualizarProdutosHeader.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        atualizarProdutosHeader.setForeground(new java.awt.Color(37, 36, 34));
        atualizarProdutosHeader.setText("Atualizar produto");

        newCodigoLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        newCodigoLabel.setForeground(new java.awt.Color(37, 36, 34));
        newCodigoLabel.setText("Código:");

        newCodigoField.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N

        newNomeLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        newNomeLabel.setForeground(new java.awt.Color(37, 36, 34));
        newNomeLabel.setText("Nome:");

        newNomeField.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N

        newPrecoCompraLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        newPrecoCompraLabel.setForeground(new java.awt.Color(37, 36, 34));
        newPrecoCompraLabel.setText("Preço de compra:");

        newPrecoCompraField.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N

        newPrecoVendaLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        newPrecoVendaLabel.setForeground(new java.awt.Color(37, 36, 34));
        newPrecoVendaLabel.setText("Preço de venda:");

        newPrecoVendaField.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnAtualizar.png"))); // NOI18N
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnCancelarUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnCancelarCadastro.png"))); // NOI18N
        btnCancelarUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wrapAtualizarProdutoLayout = new javax.swing.GroupLayout(wrapAtualizarProduto);
        wrapAtualizarProduto.setLayout(wrapAtualizarProdutoLayout);
        wrapAtualizarProdutoLayout.setHorizontalGroup(
            wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapAtualizarProdutoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(wrapAtualizarProdutoLayout.createSequentialGroup()
                        .addComponent(atualizarProdutoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizarProdutosHeader))
                    .addComponent(newNomeLabel)
                    .addComponent(newCodigoLabel)
                    .addComponent(newNomeField)
                    .addComponent(btnCancelarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCodigoField)
                    .addComponent(newPrecoCompraField)
                    .addComponent(newPrecoVendaField)
                    .addComponent(newPrecoVendaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPrecoCompraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        wrapAtualizarProdutoLayout.setVerticalGroup(
            wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapAtualizarProdutoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarProdutoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarProdutosHeader))
                .addGap(20, 20, 20)
                .addComponent(newCodigoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newCodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(newNomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(newPrecoCompraLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPrecoCompraField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(newPrecoVendaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPrecoVendaField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCancelarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout atualizarProdutoLayout = new javax.swing.GroupLayout(atualizarProduto.getContentPane());
        atualizarProduto.getContentPane().setLayout(atualizarProdutoLayout);
        atualizarProdutoLayout.setHorizontalGroup(
            atualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrapAtualizarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        atualizarProdutoLayout.setVerticalGroup(
            atualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrapAtualizarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        wrap.setBackground(new java.awt.Color(255, 255, 255));
        wrap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(8, 156, 89)));
        wrap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wrapMouseClicked(evt);
            }
        });

        sideMenu.setBackground(new java.awt.Color(0, 80, 153));

        sideMenuLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/sideMenuLogo.png"))); // NOI18N

        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnDashboard.png"))); // NOI18N
        btnDashboard.setMaximumSize(new java.awt.Dimension(300, 40));
        btnDashboard.setMinimumSize(new java.awt.Dimension(300, 40));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnCaixa.png"))); // NOI18N
        btnCaixa.setMaximumSize(new java.awt.Dimension(300, 40));
        btnCaixa.setMinimumSize(new java.awt.Dimension(300, 40));
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });

        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnProdutos.png"))); // NOI18N
        btnProdutos.setMaximumSize(new java.awt.Dimension(300, 40));
        btnProdutos.setMinimumSize(new java.awt.Dimension(300, 40));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnClientes.png"))); // NOI18N
        btnClientes.setMaximumSize(new java.awt.Dimension(300, 40));
        btnClientes.setMinimumSize(new java.awt.Dimension(300, 40));
        btnClientes.setPreferredSize(new java.awt.Dimension(300, 49));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnVendas.png"))); // NOI18N
        btnVendas.setMaximumSize(new java.awt.Dimension(300, 40));
        btnVendas.setMinimumSize(new java.awt.Dimension(300, 40));
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnContas.png"))); // NOI18N
        btnContas.setMaximumSize(new java.awt.Dimension(300, 40));
        btnContas.setMinimumSize(new java.awt.Dimension(300, 40));
        btnContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideMenuLayout = new javax.swing.GroupLayout(sideMenu);
        sideMenu.setLayout(sideMenuLayout);
        sideMenuLayout.setHorizontalGroup(
            sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnContas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(sideMenuLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(sideMenuLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sideMenuLayout.setVerticalGroup(
            sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenuLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(sideMenuLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnContas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        wrapTableProdutos.setBackground(new java.awt.Color(255, 255, 255));
        wrapTableProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        scrollTableProdutos.setBackground(new java.awt.Color(255, 255, 255));

        tableProdutos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Código", "Nome", "Preço de compra", "Preço de venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProdutos.setGridColor(new java.awt.Color(255, 255, 255));
        tableProdutos.setRowHeight(25);
        tableProdutos.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutosMouseClicked(evt);
            }
        });
        scrollTableProdutos.setViewportView(tableProdutos);
        if (tableProdutos.getColumnModel().getColumnCount() > 0) {
            tableProdutos.getColumnModel().getColumn(0).setResizable(false);
            tableProdutos.getColumnModel().getColumn(1).setResizable(false);
            tableProdutos.getColumnModel().getColumn(2).setResizable(false);
            tableProdutos.getColumnModel().getColumn(3).setResizable(false);
        }

        tableProdutosLabel.setBackground(new java.awt.Color(255, 255, 255));
        tableProdutosLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tableProdutosLabel.setForeground(new java.awt.Color(255, 255, 255));
        tableProdutosLabel.setText("  Produtos cadastrados");

        javax.swing.GroupLayout wrapTableProdutosLayout = new javax.swing.GroupLayout(wrapTableProdutos);
        wrapTableProdutos.setLayout(wrapTableProdutosLayout);
        wrapTableProdutosLayout.setHorizontalGroup(
            wrapTableProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableProdutosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollTableProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        wrapTableProdutosLayout.setVerticalGroup(
            wrapTableProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapTableProdutosLayout.createSequentialGroup()
                .addComponent(tableProdutosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollTableProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        headerProdutos.setFont(new java.awt.Font("Roboto Medium", 0, 28)); // NOI18N
        headerProdutos.setText("Produtos");

        draggleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                draggleBarMouseDragged(evt);
            }
        });
        draggleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                draggleBarMousePressed(evt);
            }
        });

        instructions.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        instructions.setForeground(new java.awt.Color(51, 51, 51));
        instructions.setText("- Lorem");

        pesquisaProutos.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        pesquisaProutos.setForeground(new java.awt.Color(51, 51, 51));
        pesquisaProutos.setText("Pesquisar");
        pesquisaProutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pesquisaProutos.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        pesquisaProutos.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                pesquisaProutosCaretUpdate(evt);
            }
        });
        pesquisaProutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisaProutosMouseClicked(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnExcluir.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnInserir.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnInserir.png"))); // NOI18N
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/fechar.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/minimizar.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnIconizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/iconizar.png"))); // NOI18N
        btnIconizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wrapLayout = new javax.swing.GroupLayout(wrap);
        wrap.setLayout(wrapLayout);
        wrapLayout.setHorizontalGroup(
            wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapLayout.createSequentialGroup()
                .addComponent(sideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wrapLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(wrapLayout.createSequentialGroup()
                                .addComponent(instructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(wrapLayout.createSequentialGroup()
                                .addComponent(headerProdutos)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapLayout.createSequentialGroup()
                                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(wrapLayout.createSequentialGroup()
                                        .addComponent(pesquisaProutos, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(wrapTableProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25))))
                    .addGroup(wrapLayout.createSequentialGroup()
                        .addComponent(draggleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIconizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        wrapLayout.setVerticalGroup(
            wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(wrapLayout.createSequentialGroup()
                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(draggleBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIconizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(headerProdutos)
                .addGap(27, 27, 27)
                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(wrapLayout.createSequentialGroup()
                        .addComponent(instructions, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(wrapLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(pesquisaProutos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(wrapTableProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

//        Clientes clientes = new Clientes();
  //      clientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void pesquisaProutosCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_pesquisaProutosCaretUpdate
        selecionarProdutoComRest();
    }//GEN-LAST:event_pesquisaProutosCaretUpdate

    private void pesquisaProutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisaProutosMouseClicked
        pesquisaProutos.setText("");
        btnExcluir.setVisible(false);
    }//GEN-LAST:event_pesquisaProutosMouseClicked

    private void tableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosMouseClicked
        if (modeloProduto.getRowCount() != 0) {
            btnExcluir.setVisible(true);
            selectedRow = tableProdutos.getSelectedRow();
            Object selected = tableProdutos.getValueAt(selectedRow, 0);
            String codigo = selected.toString();
            codigo = codigo.trim();

            if (evt.getClickCount()>= 2){
                ProdutoDAO produto = new ProdutoDAO();
                Produto p = produto.getProduto(codigo);
                newCodigoField.setText(p.getCodigo());
                newNomeField.setText(p.getNome());
                newPrecoCompraField.setText(Double.toString(p.getPrecoCompra()));
                newPrecoVendaField.setText(Double.toString(p.getPrecoVenda()));
                atualizarProduto.setUndecorated(true);
                atualizarProduto.setResizable(false);
                atualizarProduto.setLocationRelativeTo(null);
                atualizarProduto.setVisible(true); 
            }
        }
    }//GEN-LAST:event_tableProdutosMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Object selected = tableProdutos.getValueAt(selectedRow, 0);
        String codigo  = selected.toString();
        idProduto = codigo.trim();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog (null, "Você realmente deseja deletar este produto?","AVISO", dialogButton);
        if(resultado == JOptionPane.YES_OPTION){
            ProdutoDAO produto = new ProdutoDAO();
            produto.deletarProduto(idProduto);
            selecionarProduto();
        }else{
            
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        cadastrarProduto.setUndecorated(true);
        cadastrarProduto.setResizable(false);
        cadastrarProduto.setLocationRelativeTo(null);
        cadastrarProduto.setVisible(true);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void wrapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wrapMouseClicked
        btnExcluir.setVisible(false);
    }//GEN-LAST:event_wrapMouseClicked

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        cadastrarProduto.dispose();
        selecionarProduto();
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String codigo = codigoField.getText();
        String nome = nomeField.getText();
        double precoCompra = Double.parseDouble(precoCompraField.getText());
        double precoVenda = Double.parseDouble(precoVendaField.getText());
        ProdutoDAO produto = new ProdutoDAO();
        if (produto.verificarProduto(codigo) == true && (!codigo.isEmpty()) || !nome.isEmpty() || !precoCompraField.getText().isEmpty() || !precoVendaField.getText().isEmpty()) {
            produto.cadastrarProduto(codigo, nome, precoCompra, precoVenda);
            codigoField.setText(null);
            nomeField.setText(null);
            precoCompraField.setText(null);
            precoVendaField.setText(null);
            selecionarProduto(); 
        } else if (produto.verificarProduto(codigo) == false){
            JOptionPane.showMessageDialog(null, "Código de barras já cadastrado");
            codigoField.setText(null);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void wrapCadastarProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wrapCadastarProdutoMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_wrapCadastarProdutoMousePressed

    private void wrapCadastarProdutoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wrapCadastarProdutoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        cadastrarProduto.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_wrapCadastarProdutoMouseDragged

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        String codigo = newCodigoField.getText();
        String nome = newNomeField.getText();
        double precoCompra = Double.parseDouble(newPrecoCompraField.getText());
        double precoVenda = Double.parseDouble(newPrecoVendaField.getText());
        ProdutoDAO produto = new ProdutoDAO();
        Object selected = tableProdutos.getValueAt(selectedRow, 0);
        String cod = selected.toString();
        cod = cod.trim();
        produto.updateProduto(cod, nome, precoCompra, precoVenda);
        selecionarProduto();
        atualizarProduto.dispose();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnCancelarUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUpdateActionPerformed
        atualizarProduto.dispose();
        selecionarProduto();
    }//GEN-LAST:event_btnCancelarUpdateActionPerformed

    private void wrapAtualizarProdutoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wrapAtualizarProdutoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        cadastrarProduto.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_wrapAtualizarProdutoMouseDragged

    private void wrapAtualizarProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wrapAtualizarProdutoMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_wrapAtualizarProdutoMousePressed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        //Dashboard dashboard = new Dashboard();
        //dashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        Caixa caixa = new Caixa();
        caixa.setVisible(true);
        
    }//GEN-LAST:event_btnCaixaActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        //Produtos produtos = new Produtos();
        //produtos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        //Vendas vendas = new Vendas();
        //vendas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContasActionPerformed
        //Contas contas = new Contas();
        //contas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContasActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        if (this.getExtendedState() == 6){
            this.setExtendedState(0);
            this.setLocationRelativeTo(null);
            btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/maximizar.png")));
        } else if (this.getExtendedState() == 0){
            this.setExtendedState(6);
            btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/minimizar.png")));
        }
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnIconizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btnIconizarActionPerformed

    private void draggleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggleBarMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_draggleBarMousePressed

    private void draggleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draggleBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX - 300, y - mouseY);
    }//GEN-LAST:event_draggleBarMouseDragged

    private void codigoFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoFieldKeyPressed
        if (evt.getKeyCode() == 10) {
            nomeField.requestFocus();
        }
    }//GEN-LAST:event_codigoFieldKeyPressed

    private void nomeFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeFieldKeyPressed
        if (evt.getKeyCode() == 10) {
            precoCompraField.requestFocus();
        }
    }//GEN-LAST:event_nomeFieldKeyPressed

    private void precoCompraFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoCompraFieldKeyPressed
        if (evt.getKeyCode() == 10) {
            precoVendaField.requestFocus();
        }
    }//GEN-LAST:event_precoCompraFieldKeyPressed

    private void sort(){
        TableRowSorter <DefaultTableModel> sorter = new TableRowSorter <DefaultTableModel>(modeloProduto);
        tableProdutos.setRowSorter(sorter);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog atualizarProduto;
    private javax.swing.JLabel atualizarProdutoIcon;
    private javax.swing.JLabel atualizarProdutosHeader;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnCancelarUpdate;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnContas;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIconizar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnVendas;
    private javax.swing.JDialog cadastrarProduto;
    private javax.swing.JLabel cadastrarProdutoIcon;
    private javax.swing.JLabel cadastrarProdutosHeader;
    private javax.swing.JTextField codigoField;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel draggleBar;
    private javax.swing.JLabel headerProdutos;
    private javax.swing.JLabel instructions;
    private javax.swing.JTextField newCodigoField;
    private javax.swing.JLabel newCodigoLabel;
    private javax.swing.JTextField newNomeField;
    private javax.swing.JLabel newNomeLabel;
    private javax.swing.JTextField newPrecoCompraField;
    private javax.swing.JLabel newPrecoCompraLabel;
    private javax.swing.JTextField newPrecoVendaField;
    private javax.swing.JLabel newPrecoVendaLabel;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField pesquisaProutos;
    private javax.swing.JTextField precoCompraField;
    private javax.swing.JLabel precoCompraLabel;
    private javax.swing.JTextField precoVendaField;
    private javax.swing.JLabel precoVendaLabel;
    private javax.swing.JScrollPane scrollTableProdutos;
    private javax.swing.JPanel sideMenu;
    private javax.swing.JLabel sideMenuLogo;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JLabel tableProdutosLabel;
    private javax.swing.JPanel wrap;
    private javax.swing.JPanel wrapAtualizarProduto;
    private javax.swing.JPanel wrapCadastarProduto;
    private javax.swing.JPanel wrapTableProdutos;
    // End of variables declaration//GEN-END:variables
}
