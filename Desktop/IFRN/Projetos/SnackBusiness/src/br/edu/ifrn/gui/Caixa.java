package br.edu.ifrn.gui;

import br.edu.ifrn.negocio.Produto;
import br.edu.ifrn.persistencia.ProdutoDAO;
import java.awt.Color;
import java.awt.Insets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Caixa extends javax.swing.JFrame {

    DefaultTableModel modeloProduto;
    int selectedRow;
    int mouseX;
    int mouseY;
    String idProduto;
    boolean venda = false;
    String cod = null;
    double valorVenda;
    int selected;

    

    public Caixa() {

        initComponents();
        modeloProduto = (DefaultTableModel) tableProdutosVenda.getModel();
        this.setExtendedState(6);
        tableProdutosVenda.setBorder(null);
        scrollTableProdutosVenda.setBorder(null);
        tableProdutosVenda.setFillsViewportHeight(true);
        tableProdutosVendasLabel.setOpaque(true);
        tableProdutosVendasLabel.setBackground(Color.decode("#F0F0F0"));
        JTableHeader tableProdutosVendaHeader = tableProdutosVenda.getTableHeader();
        tableProdutosVendaHeader.setFont(new java.awt.Font("Roboto Light", 0, 13));
        
        produtoField.setBorder(BorderFactory.createCompoundBorder(produtoField.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        quantidadeField.setMargin(new Insets(10, 10, 10, 10));
        
        quantidadeField.setText("0");
        totalLabel.setText("0");
        valorUniField.setText("0");
        subTotalField.setText("0");
        
        produtoField.setEditable(false);
        quantidadeField.setEditable(false);
        totalLabel.setText("TOTAL: R$ 00.00");
        valorUniField.setEditable(false);
        subTotalField.setEditable(false);
        btnFinalizarVenda.setVisible(false);
        btnRemoverProduto.setVisible(false);
        tableProdutosVendasLabel.setForeground(Color.decode("#333333"));
        
        selectClienteComboBox.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        finalizarVenda = new javax.swing.JDialog();
        wrapFinalizarVenda = new javax.swing.JPanel();
        finalizarVendaIcon = new javax.swing.JLabel();
        finalizarVendaHeader = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valorRecebidoLabel = new javax.swing.JLabel();
        valorRecebidoField = new javax.swing.JTextField();
        trocoField = new javax.swing.JTextField();
        trocoLabel = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        contaCheckBox = new javax.swing.JCheckBox();
        contaCheckBoxLabel = new javax.swing.JLabel();
        selectClienteComboBox = new javax.swing.JComboBox<>();
        bntCancelarFinalizacao = new javax.swing.JButton();
        wrap = new javax.swing.JPanel();
        sideMenu = new javax.swing.JPanel();
        sideMenuLogo = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnContas = new javax.swing.JButton();
        wrapTableProdutosVenda = new javax.swing.JPanel();
        scrollTableProdutosVenda = new javax.swing.JScrollPane();
        tableProdutosVenda = new javax.swing.JTable();
        tableProdutosVendasLabel = new javax.swing.JLabel();
        headerCaixa = new javax.swing.JLabel();
        produtoField = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnIconizar = new javax.swing.JButton();
        produtoLabel = new javax.swing.JLabel();
        quantidadeLabel = new javax.swing.JLabel();
        quantidadeField = new javax.swing.JTextField();
        btnBooleanVenda = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        valorUniLabel = new javax.swing.JLabel();
        valorUniField = new javax.swing.JTextField();
        subTotalLabel = new javax.swing.JLabel();
        subTotalField = new javax.swing.JTextField();
        btnRemoverProduto = new javax.swing.JButton();
        btnFinalizarVenda = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();

        finalizarVenda.setMaximumSize(new java.awt.Dimension(357, 365));
        finalizarVenda.setMinimumSize(new java.awt.Dimension(357, 365));
        finalizarVenda.setModal(true);
        finalizarVenda.setUndecorated(true);
        finalizarVenda.setPreferredSize(new java.awt.Dimension(357, 365));
        finalizarVenda.setResizable(false);

        wrapFinalizarVenda.setBackground(new java.awt.Color(255, 255, 255));
        wrapFinalizarVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 80, 153)));
        wrapFinalizarVenda.setMaximumSize(new java.awt.Dimension(357, 365));
        wrapFinalizarVenda.setMinimumSize(new java.awt.Dimension(357, 365));
        wrapFinalizarVenda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                wrapFinalizarVendaMouseDragged(evt);
            }
        });
        wrapFinalizarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wrapFinalizarVendaMousePressed(evt);
            }
        });

        finalizarVendaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/iconFinalizarVenda.png"))); // NOI18N

        finalizarVendaHeader.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        finalizarVendaHeader.setForeground(new java.awt.Color(37, 36, 34));
        finalizarVendaHeader.setText("Finalizar venda");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("VALOR TOTAL: R$ 00.00");

        valorRecebidoLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        valorRecebidoLabel.setForeground(new java.awt.Color(51, 51, 51));
        valorRecebidoLabel.setText("Valor recebido:");

        valorRecebidoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorRecebidoFieldKeyPressed(evt);
            }
        });

        trocoLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        trocoLabel.setForeground(new java.awt.Color(51, 51, 51));
        trocoLabel.setText("Troco:");

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        contaCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        contaCheckBox.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        contaCheckBox.setForeground(new java.awt.Color(51, 51, 51));
        contaCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        contaCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                contaCheckBoxStateChanged(evt);
            }
        });

        contaCheckBoxLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        contaCheckBoxLabel.setForeground(new java.awt.Color(51, 51, 51));
        contaCheckBoxLabel.setText("Alocar a uma conta");
        contaCheckBoxLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                contaCheckBoxLabelPropertyChange(evt);
            }
        });

        selectClienteComboBox.setMaximumRowCount(6);
        selectClienteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar cliente" }));
        selectClienteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectClienteComboBoxActionPerformed(evt);
            }
        });

        bntCancelarFinalizacao.setText("Cancelar");
        bntCancelarFinalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarFinalizacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wrapFinalizarVendaLayout = new javax.swing.GroupLayout(wrapFinalizarVenda);
        wrapFinalizarVenda.setLayout(wrapFinalizarVendaLayout);
        wrapFinalizarVendaLayout.setHorizontalGroup(
            wrapFinalizarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapFinalizarVendaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(wrapFinalizarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(wrapFinalizarVendaLayout.createSequentialGroup()
                        .addComponent(contaCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contaCheckBoxLabel))
                    .addComponent(jLabel2)
                    .addGroup(wrapFinalizarVendaLayout.createSequentialGroup()
                        .addComponent(finalizarVendaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalizarVendaHeader))
                    .addGroup(wrapFinalizarVendaLayout.createSequentialGroup()
                        .addGroup(wrapFinalizarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorRecebidoLabel)
                            .addComponent(valorRecebidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(wrapFinalizarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trocoLabel)
                            .addComponent(trocoField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectClienteComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntCancelarFinalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        wrapFinalizarVendaLayout.setVerticalGroup(
            wrapFinalizarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapFinalizarVendaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(wrapFinalizarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(wrapFinalizarVendaLayout.createSequentialGroup()
                        .addComponent(trocoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trocoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(wrapFinalizarVendaLayout.createSequentialGroup()
                        .addGroup(wrapFinalizarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(finalizarVendaHeader)
                            .addComponent(finalizarVendaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(valorRecebidoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorRecebidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(wrapFinalizarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contaCheckBox)
                    .addComponent(contaCheckBoxLabel))
                .addGap(20, 20, 20)
                .addComponent(selectClienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntCancelarFinalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout finalizarVendaLayout = new javax.swing.GroupLayout(finalizarVenda.getContentPane());
        finalizarVenda.getContentPane().setLayout(finalizarVendaLayout);
        finalizarVendaLayout.setHorizontalGroup(
            finalizarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrapFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        finalizarVendaLayout.setVerticalGroup(
            finalizarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrapFinalizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        wrapTableProdutosVenda.setBackground(new java.awt.Color(255, 255, 255));
        wrapTableProdutosVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        scrollTableProdutosVenda.setBackground(new java.awt.Color(255, 255, 255));

        tableProdutosVenda.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tableProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quantidate", "Preço unitário", "Preço total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProdutosVenda.setGridColor(new java.awt.Color(204, 204, 204));
        tableProdutosVenda.setRowHeight(25);
        tableProdutosVenda.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tableProdutosVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutosVendaMouseClicked(evt);
            }
        });
        scrollTableProdutosVenda.setViewportView(tableProdutosVenda);
        if (tableProdutosVenda.getColumnModel().getColumnCount() > 0) {
            tableProdutosVenda.getColumnModel().getColumn(0).setMinWidth(100);
            tableProdutosVenda.getColumnModel().getColumn(0).setPreferredWidth(100);
            tableProdutosVenda.getColumnModel().getColumn(0).setMaxWidth(100);
            tableProdutosVenda.getColumnModel().getColumn(1).setResizable(false);
            tableProdutosVenda.getColumnModel().getColumn(2).setMinWidth(100);
            tableProdutosVenda.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableProdutosVenda.getColumnModel().getColumn(2).setMaxWidth(100);
            tableProdutosVenda.getColumnModel().getColumn(3).setMinWidth(100);
            tableProdutosVenda.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableProdutosVenda.getColumnModel().getColumn(3).setMaxWidth(100);
            tableProdutosVenda.getColumnModel().getColumn(4).setMinWidth(100);
            tableProdutosVenda.getColumnModel().getColumn(4).setPreferredWidth(100);
            tableProdutosVenda.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        tableProdutosVendasLabel.setBackground(new java.awt.Color(255, 255, 255));
        tableProdutosVendasLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tableProdutosVendasLabel.setForeground(new java.awt.Color(255, 255, 255));
        tableProdutosVendasLabel.setText("  Carrinho de compras");

        javax.swing.GroupLayout wrapTableProdutosVendaLayout = new javax.swing.GroupLayout(wrapTableProdutosVenda);
        wrapTableProdutosVenda.setLayout(wrapTableProdutosVendaLayout);
        wrapTableProdutosVendaLayout.setHorizontalGroup(
            wrapTableProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableProdutosVendasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollTableProdutosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        wrapTableProdutosVendaLayout.setVerticalGroup(
            wrapTableProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapTableProdutosVendaLayout.createSequentialGroup()
                .addComponent(tableProdutosVendasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollTableProdutosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        headerCaixa.setFont(new java.awt.Font("Roboto Medium", 0, 28)); // NOI18N
        headerCaixa.setText("Caixa");

        produtoField.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        produtoField.setForeground(new java.awt.Color(51, 51, 51));
        produtoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        produtoField.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        produtoField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                produtoFieldCaretUpdate(evt);
            }
        });
        produtoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                produtoFieldFocusGained(evt);
            }
        });
        produtoField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtoFieldMouseClicked(evt);
            }
        });
        produtoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoFieldActionPerformed(evt);
            }
        });
        produtoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                produtoFieldKeyPressed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/fechar.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnIconizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/imgs/iconizar.png"))); // NOI18N
        btnIconizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconizarActionPerformed(evt);
            }
        });

        produtoLabel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        produtoLabel.setForeground(new java.awt.Color(51, 51, 51));
        produtoLabel.setText("Produto (F1):");

        quantidadeLabel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        quantidadeLabel.setForeground(new java.awt.Color(51, 51, 51));
        quantidadeLabel.setText("Quantidade:");

        quantidadeField.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        quantidadeField.setForeground(new java.awt.Color(51, 51, 51));
        quantidadeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        quantidadeField.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        quantidadeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantidadeFieldFocusGained(evt);
            }
        });
        quantidadeField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quantidadeFieldMouseClicked(evt);
            }
        });
        quantidadeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantidadeFieldKeyPressed(evt);
            }
        });

        btnBooleanVenda.setText("Nova venda");
        btnBooleanVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooleanVendaActionPerformed(evt);
            }
        });

        separador.setForeground(new java.awt.Color(204, 204, 204));

        valorUniLabel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        valorUniLabel.setForeground(new java.awt.Color(51, 51, 51));
        valorUniLabel.setText("Valor unitário:");

        valorUniField.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        valorUniField.setForeground(new java.awt.Color(51, 51, 51));
        valorUniField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        valorUniField.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        valorUniField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valorUniFieldMouseClicked(evt);
            }
        });

        subTotalLabel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        subTotalLabel.setForeground(new java.awt.Color(51, 51, 51));
        subTotalLabel.setText("Sub-total:");

        subTotalField.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        subTotalField.setForeground(new java.awt.Color(51, 51, 51));
        subTotalField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        subTotalField.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        subTotalField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subTotalFieldMouseClicked(evt);
            }
        });

        btnRemoverProduto.setText("Remover Produto");
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });

        btnFinalizarVenda.setText("Finalizar venda");
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });

        totalLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(51, 51, 51));
        totalLabel.setText("TOTAL: R$ 00.00");

        javax.swing.GroupLayout wrapLayout = new javax.swing.GroupLayout(wrap);
        wrap.setLayout(wrapLayout);
        wrapLayout.setHorizontalGroup(
            wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapLayout.createSequentialGroup()
                .addComponent(sideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wrapLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIconizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(wrapLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(wrapLayout.createSequentialGroup()
                                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapLayout.createSequentialGroup()
                                .addComponent(headerCaixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBooleanVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(separador)
                            .addGroup(wrapLayout.createSequentialGroup()
                                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(produtoLabel)
                                    .addComponent(produtoField))
                                .addGap(18, 18, 18)
                                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantidadeLabel)
                                    .addComponent(quantidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(wrapTableProdutosVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(wrapLayout.createSequentialGroup()
                                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorUniLabel)
                                    .addComponent(valorUniField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(wrapLayout.createSequentialGroup()
                                        .addComponent(subTotalLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(wrapLayout.createSequentialGroup()
                                        .addComponent(subTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRemoverProduto)))))
                        .addGap(26, 26, 26))))
        );
        wrapLayout.setVerticalGroup(
            wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(wrapLayout.createSequentialGroup()
                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIconizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBooleanVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headerCaixa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(wrapLayout.createSequentialGroup()
                        .addComponent(produtoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produtoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(wrapLayout.createSequentialGroup()
                        .addComponent(quantidadeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorUniLabel)
                    .addComponent(subTotalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorUniField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(wrapTableProdutosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(wrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
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

    private void tableProdutosVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosVendaMouseClicked
        if (evt.getClickCount() <= 2) {
            selected = tableProdutosVenda.getSelectedRow();
            btnRemoverProduto.setVisible(true);
        }
    }//GEN-LAST:event_tableProdutosVendaMouseClicked

    private void wrapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wrapMouseClicked

    }//GEN-LAST:event_wrapMouseClicked

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        //Dashboard dashboard = new Dashboard();
        //dashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        //Caixa caixa = new Caixa();
        //caixa.setVisible(true);
        this.setVisible(false);
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

    private void btnIconizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btnIconizarActionPerformed

    private void produtoFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtoFieldMouseClicked
        produtoField.setText("");

    }//GEN-LAST:event_produtoFieldMouseClicked

    private void produtoFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_produtoFieldCaretUpdate
        
    }//GEN-LAST:event_produtoFieldCaretUpdate

    private void produtoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtoFieldActionPerformed

    private void quantidadeFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantidadeFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeFieldMouseClicked

    private void valorUniFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorUniFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_valorUniFieldMouseClicked

    private void subTotalFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subTotalFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalFieldMouseClicked

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "Você realmente deseja remover este produto?", "AVISO", dialogButton);
        if (resultado == JOptionPane.YES_OPTION) {
            modeloProduto.removeRow(selected);
            btnRemoverProduto.setVisible(false);
            totalLabel.setText("TOTAL: R$ " + setValorVenda());
        }
        
            
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    private void btnBooleanVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooleanVendaActionPerformed
        if (venda == false) {
            venda = true;
            produtoField.setEditable(true);
            quantidadeField.setEditable(true);
            totalLabel.setText("TOTAL: R$ 00.00");
            valorUniField.setEditable(true);
            subTotalField.setEditable(true);
            btnFinalizarVenda.setVisible(true);
            tableProdutosVendasLabel.setForeground(Color.decode("#ffffff"));
            tableProdutosVendasLabel.setBackground(Color.decode("#005099"));
            btnBooleanVenda.setText("Cancelar venda");
            produtoField.requestFocus();
        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int resultado = JOptionPane.showConfirmDialog(this, "Você realmente deseja cancelar esta conta? Todos os dados serão perdidos", "AVISO", dialogButton);
            if (resultado == JOptionPane.YES_OPTION) {
                venda = false;
                produtoField.setEditable(false);
                produtoField.setText(null);
                quantidadeField.setEditable(false);
                quantidadeField.setText("0");
                totalLabel.setText("TOTAL: R$ 00.00");
                valorUniField.setEditable(false);
                valorUniField.setText("0");
                subTotalField.setEditable(false);
                subTotalField.setText("0");
                btnFinalizarVenda.setVisible(false);
                btnRemoverProduto.setVisible(false);
                tableProdutosVendasLabel.setForeground(Color.decode("#333333"));
                tableProdutosVendasLabel.setBackground(Color.decode("#F0F0F0"));
                modeloProduto.setNumRows(0);
                btnBooleanVenda.setText("Nova venda");
            }else if (dialogButton == JOptionPane.NO_OPTION) {
                
            }
        }
    }//GEN-LAST:event_btnBooleanVendaActionPerformed

    private void produtoFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtoFieldKeyPressed
        if (evt.getKeyCode() == 10) {
            ProdutoDAO produto = new ProdutoDAO();
            this.cod = produtoField.getText();
            if(produto.verificarProduto(produtoField.getText()) == false){
                Produto p = produto.getProduto(cod);
                produtoField.setText(p.getNome());
                quantidadeField.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
            }
        }
    }//GEN-LAST:event_produtoFieldKeyPressed

    private void quantidadeFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeFieldKeyPressed
        if (evt.getKeyCode() == 10 && !produtoField.getText().isEmpty()) {
            
            ProdutoDAO produto = new ProdutoDAO();
            Produto p = produto.getProduto(cod);
            
            int quantidade = Integer.parseInt(quantidadeField.getText());
            double valorUni = p.getPrecoVenda();
            double subTotal = valorUni*quantidade;
            
            valorUniField.setText(Double.toString(valorUni));
            subTotalField.setText(Double.toString(subTotal));
            
            produtoField.requestFocus();
            modeloProduto.addRow(new Object[]{p.getCodigo(), produtoField.getText(), quantidade, valorUni, subTotal});
            
            totalLabel.setText("TOTAL: R$ " + setValorVenda());
            
        }
    }//GEN-LAST:event_quantidadeFieldKeyPressed

    private void quantidadeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantidadeFieldFocusGained
        quantidadeField.selectAll();
    }//GEN-LAST:event_quantidadeFieldFocusGained

    private void produtoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_produtoFieldFocusGained
        produtoField.selectAll();
    }//GEN-LAST:event_produtoFieldFocusGained

    private void selectClienteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectClienteComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectClienteComboBoxActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
        Date date = new Date();  
        String codigo = formatter.format(date).toString();
        double valorPago = Double.parseDouble(setValorVenda());
        double valorRecebido = Double.parseDouble(valorRecebidoField.getText());
        try {
            date = formatter.parse(codigo);
        } catch (ParseException ex) {
            
        }
        
        
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void wrapFinalizarVendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wrapFinalizarVendaMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_wrapFinalizarVendaMousePressed

    private void wrapFinalizarVendaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wrapFinalizarVendaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        finalizarVenda.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_wrapFinalizarVendaMouseDragged

    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
        if (modeloProduto.getRowCount() > 0){
            jLabel2.setText(totalLabel.getText());
            valorRecebidoField.setText(setValorVenda());
            trocoField.setText("0");
            finalizarVenda.setVisible(true);
            finalizarVenda.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnFinalizarVendaActionPerformed

    private void bntCancelarFinalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarFinalizacaoActionPerformed
        finalizarVenda.dispose();
    }//GEN-LAST:event_bntCancelarFinalizacaoActionPerformed

    private void contaCheckBoxLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_contaCheckBoxLabelPropertyChange
        
    }//GEN-LAST:event_contaCheckBoxLabelPropertyChange

    private void contaCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_contaCheckBoxStateChanged
        if (contaCheckBox.isSelected() == true) {
            selectClienteComboBox.setEnabled(true);
        } else {
            selectClienteComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_contaCheckBoxStateChanged

    private void valorRecebidoFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorRecebidoFieldKeyPressed
        if (evt.getKeyCode() == 10) {
            double valorVenda = Double.parseDouble(setValorVenda());
            double valorRecebido = Double.parseDouble(valorRecebidoField.getText());
            trocoField.setText(Double.toString(valorVenda - valorRecebido));
        }
    }//GEN-LAST:event_valorRecebidoFieldKeyPressed
    
    public String setValorVenda(){
        valorVenda = 0;
        for (int i = 0; i < modeloProduto.getRowCount(); i++) {
            valorVenda += Double.parseDouble(modeloProduto.getValueAt(i, 3).toString());
        }
        return Double.toString(valorVenda);
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
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelarFinalizacao;
    private javax.swing.JButton btnBooleanVenda;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnContas;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnIconizar;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JButton btnVendas;
    private javax.swing.JCheckBox contaCheckBox;
    private javax.swing.JLabel contaCheckBoxLabel;
    private javax.swing.JDialog finalizarVenda;
    private javax.swing.JLabel finalizarVendaHeader;
    private javax.swing.JLabel finalizarVendaIcon;
    private javax.swing.JLabel headerCaixa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField produtoField;
    private javax.swing.JLabel produtoLabel;
    private javax.swing.JTextField quantidadeField;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JScrollPane scrollTableProdutosVenda;
    private javax.swing.JComboBox<String> selectClienteComboBox;
    private javax.swing.JSeparator separador;
    private javax.swing.JPanel sideMenu;
    private javax.swing.JLabel sideMenuLogo;
    private javax.swing.JTextField subTotalField;
    private javax.swing.JLabel subTotalLabel;
    private javax.swing.JTable tableProdutosVenda;
    private javax.swing.JLabel tableProdutosVendasLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField trocoField;
    private javax.swing.JLabel trocoLabel;
    private javax.swing.JTextField valorRecebidoField;
    private javax.swing.JLabel valorRecebidoLabel;
    private javax.swing.JTextField valorUniField;
    private javax.swing.JLabel valorUniLabel;
    private javax.swing.JPanel wrap;
    private javax.swing.JPanel wrapFinalizarVenda;
    private javax.swing.JPanel wrapTableProdutosVenda;
    // End of variables declaration//GEN-END:variables
}
