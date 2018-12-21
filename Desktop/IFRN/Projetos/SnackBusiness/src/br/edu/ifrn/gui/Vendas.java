package br.edu.ifrn.gui;


import br.edu.ifrn.negocio.Produto;
import br.edu.ifrn.negocio.Venda;
import br.edu.ifrn.persistencia.ProdutoDAO;
import br.edu.ifrn.persistencia.VendaDAO;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

public class Vendas extends javax.swing.JFrame {

    DefaultTableModel modeloVenda;
    DefaultTableModel modeloVendaProdutos;
    int selectedRow;
    int mouseX;
    int mouseY;
    String idProduto;
    
    private void selecionarVenda(){
        VendaDAO banco = new VendaDAO();
        modeloVenda.setNumRows(0);
        for(Venda v: banco.selecionarVendas()){
            modeloVenda.addRow(new Object[]{"  " + v.getCodigo(), "  " + v.getData(), "  " + v.getValorTotal()});
        }
    }
    
    public Vendas() {
        
        initComponents();
        
        modeloVenda = (DefaultTableModel) tableVendas.getModel();
        modeloVendaProdutos = (DefaultTableModel) tableVendaProdutos.getModel();
        this.setExtendedState(6);
        tableVendas.setBorder(null);
        tableVendaProdutos.setBorder(null);
        scrollTableVendas.setBorder(null);
        scrollTableVendas1.setBorder(null);
        tableVendas.setFillsViewportHeight(true);
        tableVendaProdutos.setFillsViewportHeight(true);
        tableVendasLabel.setOpaque(true);
        tableVendasLabel.setBackground(Color.decode("#005099"));
        tableVendaProdutosLabel.setOpaque(true);
        tableVendaProdutosLabel.setBackground(Color.decode("#005099"));
        JTableHeader tableProdutosHeader = tableVendas.getTableHeader();
        JTableHeader tableVendaProdutosHeader = tableVendaProdutos.getTableHeader();
        tableProdutosHeader.setFont(new java.awt.Font("Roboto Light", 0, 13));
        tableVendaProdutosHeader.setFont(new java.awt.Font("Roboto Light", 0, 13));
        selecionarVenda();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalharVenda = new javax.swing.JDialog();
        wrapAtualizarProduto = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JButton();
        detalharVendaIcon = new javax.swing.JLabel();
        detalharVendaHeader = new javax.swing.JLabel();
        vendaPrecoTotal = new javax.swing.JLabel();
        wrapTableVendaProdutos = new javax.swing.JPanel();
        scrollTableVendas1 = new javax.swing.JScrollPane();
        tableVendaProdutos = new javax.swing.JTable();
        tableVendaProdutosLabel = new javax.swing.JLabel();
        vendaData = new javax.swing.JLabel();
        wrap = new javax.swing.JPanel();
        sideMenu = new javax.swing.JPanel();
        sideMenuLogo = new javax.swing.JLabel();
        btnCaixa = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        wrapTableVendas = new javax.swing.JPanel();
        scrollTableVendas = new javax.swing.JScrollPane();
        tableVendas = new javax.swing.JTable();
        tableVendasLabel = new javax.swing.JLabel();
        headerVendas = new javax.swing.JLabel();
        draggleBar = new javax.swing.JLabel();
        instructions = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnIconizar = new javax.swing.JButton();

        detalharVenda.setMinimumSize(new java.awt.Dimension(600, 449));
        detalharVenda.setModal(true);
        detalharVenda.setResizable(false);

        wrapAtualizarProduto.setBackground(new java.awt.Color(255, 255, 255));
        wrapAtualizarProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 80, 153)));
        wrapAtualizarProduto.setMaximumSize(new java.awt.Dimension(600, 449));
        wrapAtualizarProduto.setMinimumSize(new java.awt.Dimension(600, 449));
        wrapAtualizarProduto.setName(""); // NOI18N
        wrapAtualizarProduto.setPreferredSize(new java.awt.Dimension(600, 449));
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

        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/fechar.png"))); // NOI18N
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        detalharVendaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/iconFinalizarVenda.png"))); // NOI18N
        detalharVendaIcon.setText("jLabel2");

        detalharVendaHeader.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        detalharVendaHeader.setForeground(new java.awt.Color(37, 36, 34));
        detalharVendaHeader.setText("Detalhar venda");

        vendaPrecoTotal.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        vendaPrecoTotal.setForeground(new java.awt.Color(37, 36, 34));
        vendaPrecoTotal.setText("VALOR TOTAL : R$ 00.00");

        wrapTableVendaProdutos.setBackground(new java.awt.Color(255, 255, 255));
        wrapTableVendaProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        scrollTableVendas1.setBackground(new java.awt.Color(255, 255, 255));

        tableVendaProdutos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tableVendaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Código", "Nome", "Preço unitário", "Quantidade", "Preço total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVendaProdutos.setGridColor(new java.awt.Color(255, 255, 255));
        tableVendaProdutos.setRowHeight(25);
        tableVendaProdutos.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tableVendaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVendaProdutosMouseClicked(evt);
            }
        });
        scrollTableVendas1.setViewportView(tableVendaProdutos);
        if (tableVendaProdutos.getColumnModel().getColumnCount() > 0) {
            tableVendaProdutos.getColumnModel().getColumn(1).setResizable(false);
            tableVendaProdutos.getColumnModel().getColumn(2).setResizable(false);
        }

        tableVendaProdutosLabel.setBackground(new java.awt.Color(255, 255, 255));
        tableVendaProdutosLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tableVendaProdutosLabel.setForeground(new java.awt.Color(255, 255, 255));
        tableVendaProdutosLabel.setText("   Produtos");

        javax.swing.GroupLayout wrapTableVendaProdutosLayout = new javax.swing.GroupLayout(wrapTableVendaProdutos);
        wrapTableVendaProdutos.setLayout(wrapTableVendaProdutosLayout);
        wrapTableVendaProdutosLayout.setHorizontalGroup(
            wrapTableVendaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableVendaProdutosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollTableVendas1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        wrapTableVendaProdutosLayout.setVerticalGroup(
            wrapTableVendaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapTableVendaProdutosLayout.createSequentialGroup()
                .addComponent(tableVendaProdutosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollTableVendas1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
        );

        vendaData.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        vendaData.setForeground(new java.awt.Color(37, 36, 34));
        vendaData.setText("DATA: 00/00/0000");

        javax.swing.GroupLayout wrapAtualizarProdutoLayout = new javax.swing.GroupLayout(wrapAtualizarProduto);
        wrapAtualizarProduto.setLayout(wrapAtualizarProdutoLayout);
        wrapAtualizarProdutoLayout.setHorizontalGroup(
            wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapAtualizarProdutoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wrapAtualizarProdutoLayout.createSequentialGroup()
                        .addComponent(vendaPrecoTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                        .addComponent(vendaData)
                        .addGap(20, 20, 20))
                    .addGroup(wrapAtualizarProdutoLayout.createSequentialGroup()
                        .addComponent(detalharVendaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detalharVendaHeader)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapAtualizarProdutoLayout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(wrapTableVendaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)))
        );
        wrapAtualizarProdutoLayout.setVerticalGroup(
            wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapAtualizarProdutoLayout.createSequentialGroup()
                .addGroup(wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wrapAtualizarProdutoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(detalharVendaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(detalharVendaHeader)))
                    .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendaPrecoTotal)
                    .addComponent(vendaData))
                .addContainerGap(360, Short.MAX_VALUE))
            .addGroup(wrapAtualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapAtualizarProdutoLayout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(wrapTableVendaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout detalharVendaLayout = new javax.swing.GroupLayout(detalharVenda.getContentPane());
        detalharVenda.getContentPane().setLayout(detalharVendaLayout);
        detalharVendaLayout.setHorizontalGroup(
            detalharVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrapAtualizarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        detalharVendaLayout.setVerticalGroup(
            detalharVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrapAtualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/btnVendas.png"))); // NOI18N
        btnVendas.setMaximumSize(new java.awt.Dimension(300, 40));
        btnVendas.setMinimumSize(new java.awt.Dimension(300, 40));
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideMenuLayout = new javax.swing.GroupLayout(sideMenu);
        sideMenu.setLayout(sideMenuLayout);
        sideMenuLayout.setHorizontalGroup(
            sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(sideMenuLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(sideMenuLogo)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        sideMenuLayout.setVerticalGroup(
            sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenuLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(sideMenuLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        wrapTableVendas.setBackground(new java.awt.Color(255, 255, 255));
        wrapTableVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        scrollTableVendas.setBackground(new java.awt.Color(255, 255, 255));

        tableVendas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Código", "Data", "Valor total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVendas.setGridColor(new java.awt.Color(255, 255, 255));
        tableVendas.setRowHeight(25);
        tableVendas.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tableVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVendasMouseClicked(evt);
            }
        });
        scrollTableVendas.setViewportView(tableVendas);
        if (tableVendas.getColumnModel().getColumnCount() > 0) {
            tableVendas.getColumnModel().getColumn(1).setResizable(false);
            tableVendas.getColumnModel().getColumn(2).setResizable(false);
        }

        tableVendasLabel.setBackground(new java.awt.Color(255, 255, 255));
        tableVendasLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tableVendasLabel.setForeground(new java.awt.Color(255, 255, 255));
        tableVendasLabel.setText("   Vendas realizadas");

        javax.swing.GroupLayout wrapTableVendasLayout = new javax.swing.GroupLayout(wrapTableVendas);
        wrapTableVendas.setLayout(wrapTableVendasLayout);
        wrapTableVendasLayout.setHorizontalGroup(
            wrapTableVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableVendasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollTableVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        wrapTableVendasLayout.setVerticalGroup(
            wrapTableVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapTableVendasLayout.createSequentialGroup()
                .addComponent(tableVendasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollTableVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        headerVendas.setFont(new java.awt.Font("Roboto Medium", 0, 28)); // NOI18N
        headerVendas.setText("Vendas");

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
        instructions.setText("Clique duas vezes em uma venda para detalhá-la");

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
                                .addComponent(headerVendas)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapLayout.createSequentialGroup()
                                .addComponent(wrapTableVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(headerVendas)
                .addGap(27, 27, 27)
                .addComponent(instructions, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wrapTableVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void tableVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVendasMouseClicked
        if (modeloVenda.getRowCount() != 0) {
            selectedRow = tableVendas.getSelectedRow();
            String codigo = (String)tableVendas.getValueAt(selectedRow, 0);
            codigo = codigo.trim();
            
            if (evt.getClickCount()>= 2){
                VendaDAO venda = new VendaDAO();
                modeloVendaProdutos.setNumRows(0);
                for (Produto p: venda.selecionarProdutosVenda(codigo)){
                    
                    modeloVendaProdutos.addRow(new Object[]{p.getCodigo(), p.getNome(), p.getPrecoVenda(), p.getQtdProduto(), p.getPrecoVenda()*p.getQtdProduto()});
                }
                vendaPrecoTotal.setText((String)tableVendas.getValueAt(selectedRow, 2));
                vendaData.setText((String)tableVendas.getValueAt(selectedRow, 1));
                detalharVenda.setUndecorated(true);
                detalharVenda.setResizable(false);
                detalharVenda.setLocationRelativeTo(wrapTableVendas);
                detalharVenda.setVisible(true); 
            }
        }
    }//GEN-LAST:event_tableVendasMouseClicked

    private void wrapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wrapMouseClicked
    }//GEN-LAST:event_wrapMouseClicked

    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        new Caixa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCaixaActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        new Produtos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed

    }//GEN-LAST:event_btnVendasActionPerformed

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

    private void wrapAtualizarProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wrapAtualizarProdutoMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_wrapAtualizarProdutoMousePressed

    private void wrapAtualizarProdutoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wrapAtualizarProdutoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        detalharVenda.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_wrapAtualizarProdutoMouseDragged

    private void tableVendaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVendaProdutosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableVendaProdutosMouseClicked

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        detalharVenda.dispose();
    }//GEN-LAST:event_btnExit1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnIconizar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnVendas;
    private javax.swing.JDialog detalharVenda;
    private javax.swing.JLabel detalharVendaHeader;
    private javax.swing.JLabel detalharVendaIcon;
    private javax.swing.JLabel draggleBar;
    private javax.swing.JLabel headerVendas;
    private javax.swing.JLabel instructions;
    private javax.swing.JScrollPane scrollTableVendas;
    private javax.swing.JScrollPane scrollTableVendas1;
    private javax.swing.JPanel sideMenu;
    private javax.swing.JLabel sideMenuLogo;
    private javax.swing.JTable tableVendaProdutos;
    private javax.swing.JLabel tableVendaProdutosLabel;
    private javax.swing.JTable tableVendas;
    private javax.swing.JLabel tableVendasLabel;
    private javax.swing.JLabel vendaData;
    private javax.swing.JLabel vendaPrecoTotal;
    private javax.swing.JPanel wrap;
    private javax.swing.JPanel wrapAtualizarProduto;
    private javax.swing.JPanel wrapTableVendaProdutos;
    private javax.swing.JPanel wrapTableVendas;
    // End of variables declaration//GEN-END:variables
}
