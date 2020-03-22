package Apresentacao;

import Modelo.Controle;
import Modelo.Itens;
import Modelo.PontosSustentabilidade;

public class frmJogoPrincipal extends javax.swing.JDialog
{


    public frmJogoPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }
    
    
    //int NumeroDoItem == int do Item equivalente, de 1 a 10
    //colocar NumeroDoItem == 0 para esvaziar a àrea de texto
    private void Descricao(int NumeroDoItem)
    {
        Controle controle = new Controle();
        txaDescricao.setText(controle.DescricaoItem(NumeroDoItem));
    }
    
    
    //Método que inicia o carregamento da barra
    //Colocar a barra equivalente como parâmetro
    private void Realizar(javax.swing.JProgressBar BarraDoItem, Integer NumeroDoItem, javax.swing.JLabel LabelDosPontos)
    {
        Controle controle = new Controle(BarraDoItem,NumeroDoItem,LabelDosPontos);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblPontos = new javax.swing.JLabel();
        lblQuantidadePontos = new javax.swing.JLabel();
        Itens itens = new Itens();
        lblItem1 = new javax.swing.JLabel();
        lblPessoasItem1 = new javax.swing.JLabel();
        lblQuantidadeItem1 = new javax.swing.JLabel();
        pgbItem1 = new javax.swing.JProgressBar();
        btnCompra1Item1 = new javax.swing.JButton();
        btnCompra10Item1 = new javax.swing.JButton();
        lblItem2 = new javax.swing.JLabel();
        lblPessoasItem2 = new javax.swing.JLabel();
        lblQuantidadeItem2 = new javax.swing.JLabel();
        pgbItem2 = new javax.swing.JProgressBar();
        btnCompra1Item2 = new javax.swing.JButton();
        btnCompra10Item2 = new javax.swing.JButton();
        lblItem3 = new javax.swing.JLabel();
        lblPessoasItem3 = new javax.swing.JLabel();
        lblQuantidadeItem3 = new javax.swing.JLabel();
        pgbItem3 = new javax.swing.JProgressBar();
        btnCompra1Item3 = new javax.swing.JButton();
        btnCompra10Item3 = new javax.swing.JButton();
        lblItem4 = new javax.swing.JLabel();
        lblPessoasItem4 = new javax.swing.JLabel();
        lblQuantidadeItem4 = new javax.swing.JLabel();
        pgbItem4 = new javax.swing.JProgressBar();
        btnCompra1Item4 = new javax.swing.JButton();
        btnCompra10Item4 = new javax.swing.JButton();
        lblItem5 = new javax.swing.JLabel();
        lblPessoasItem5 = new javax.swing.JLabel();
        lblQuantidadeItem5 = new javax.swing.JLabel();
        pgbItem5 = new javax.swing.JProgressBar();
        btnCompra1Item5 = new javax.swing.JButton();
        btnCompra10Item5 = new javax.swing.JButton();
        lblItem6 = new javax.swing.JLabel();
        lblPessoasItem6 = new javax.swing.JLabel();
        lblQuantidadeItem6 = new javax.swing.JLabel();
        pgbItem6 = new javax.swing.JProgressBar();
        btnCompra1Item6 = new javax.swing.JButton();
        btnCompra10Item6 = new javax.swing.JButton();
        lblItem7 = new javax.swing.JLabel();
        lblPessoasItem7 = new javax.swing.JLabel();
        lblQuantidadeItem7 = new javax.swing.JLabel();
        pgbItem7 = new javax.swing.JProgressBar();
        btnCompra1Item7 = new javax.swing.JButton();
        btnCompra10Item7 = new javax.swing.JButton();
        lblItem8 = new javax.swing.JLabel();
        lblPessoasItem8 = new javax.swing.JLabel();
        lblQuantidadeItem8 = new javax.swing.JLabel();
        pgbItem8 = new javax.swing.JProgressBar();
        btnCompra1Item8 = new javax.swing.JButton();
        btnCompra10Item8 = new javax.swing.JButton();
        lblItem9 = new javax.swing.JLabel();
        lblPessoasItem9 = new javax.swing.JLabel();
        lblQuantidadeItem9 = new javax.swing.JLabel();
        pgbItem9 = new javax.swing.JProgressBar();
        btnCompra1Item9 = new javax.swing.JButton();
        btnCompra10Item9 = new javax.swing.JButton();
        lblItem10 = new javax.swing.JLabel();
        lblPessoasItem10 = new javax.swing.JLabel();
        lblQuantidadeItem10 = new javax.swing.JLabel();
        pgbItem10 = new javax.swing.JProgressBar();
        btnCompra1Item10 = new javax.swing.JButton();
        btnCompra10Item10 = new javax.swing.JButton();
        txaDescricao = new javax.swing.JTextArea();
        btnMelhorias = new javax.swing.JButton();
        btnConquistas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ClickerSustentável");
        setResizable(false);

        lblPontos.setText("Pontos de Sustentabilidade:");
        lblPontos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblQuantidadePontos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PontosSustentabilidade pontos = new PontosSustentabilidade();
        lblQuantidadePontos.setText(pontos.pontosstring);

        lblItem1.setText(itens.nomeItem1);

        lblPessoasItem1.setText("Pessoas:");

        lblQuantidadeItem1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidadeItem1.setText(itens.quantidadeItem1.toString());

        pgbItem1.setToolTipText("Realizar");
        pgbItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgbItem1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pgbItem1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pgbItem1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pgbItem1MouseExited(evt);
            }
        });

        btnCompra1Item1.setText("+1");

        btnCompra10Item1.setText("+10");

        lblItem2.setText(itens.nomeItem2);

        lblPessoasItem2.setText("Pessoas:");

        lblQuantidadeItem2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidadeItem2.setText(itens.quantidadeItem2.toString());

        pgbItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgbItem2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pgbItem2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pgbItem2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pgbItem2MouseExited(evt);
            }
        });

        btnCompra1Item2.setText("+1");

        btnCompra10Item2.setText("+10");

        lblItem3.setText(itens.nomeItem3);

        lblPessoasItem3.setText("Pessoas:");

        lblQuantidadeItem3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidadeItem3.setText("0");

        pgbItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgbItem3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pgbItem3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pgbItem3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pgbItem3MouseExited(evt);
            }
        });

        btnCompra1Item3.setText("+1");

        btnCompra10Item3.setText("+10");

        lblItem4.setText(itens.nomeItem4);

        lblPessoasItem4.setText("Pessoas:");

        lblQuantidadeItem4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidadeItem4.setText("0");

        pgbItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgbItem4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pgbItem4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pgbItem4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pgbItem4MouseExited(evt);
            }
        });

        btnCompra1Item4.setText("+1");

        btnCompra10Item4.setText("+10");

        lblItem5.setText(itens.nomeItem5);

        lblPessoasItem5.setText("Pessoas:");

        lblQuantidadeItem5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidadeItem5.setText("0");

        pgbItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgbItem5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pgbItem5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pgbItem5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pgbItem5MouseExited(evt);
            }
        });

        btnCompra1Item5.setText("+1");

        btnCompra10Item5.setText("+10");

        lblItem6.setText("Separar lixo em casa");

        lblPessoasItem6.setText("Pessoas:");

        lblQuantidadeItem6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidadeItem6.setText("0");

        pgbItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgbItem6.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pgbItem6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pgbItem6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pgbItem6MouseExited(evt);
            }
        });

        btnCompra1Item6.setText("+1");

        btnCompra10Item6.setText("+10");

        lblItem7.setText("Separar lixo em casa");

        lblPessoasItem7.setText("Pessoas:");

        lblQuantidadeItem7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidadeItem7.setText("0");

        pgbItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgbItem7.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pgbItem7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pgbItem7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pgbItem7MouseExited(evt);
            }
        });

        btnCompra1Item7.setText("+1");

        btnCompra10Item7.setText("+10");

        lblItem8.setText("Separar lixo em casa");

        lblPessoasItem8.setText("Pessoas:");

        lblQuantidadeItem8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidadeItem8.setText("0");

        pgbItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgbItem8.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pgbItem8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pgbItem8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pgbItem8MouseExited(evt);
            }
        });

        btnCompra1Item8.setText("+1");

        btnCompra10Item8.setText("+10");

        lblItem9.setText("Separar lixo em casa");

        lblPessoasItem9.setText("Pessoas:");

        lblQuantidadeItem9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidadeItem9.setText("0");

        pgbItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgbItem9.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pgbItem9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pgbItem9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pgbItem9MouseExited(evt);
            }
        });

        btnCompra1Item9.setText("+1");

        btnCompra10Item9.setText("+10");

        lblItem10.setText("Separar lixo em casa");

        lblPessoasItem10.setText("Pessoas:");

        lblQuantidadeItem10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidadeItem10.setText("0");

        pgbItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgbItem10.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pgbItem10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pgbItem10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pgbItem10MouseExited(evt);
            }
        });

        btnCompra1Item10.setText("+1");

        btnCompra10Item10.setText("+10");

        txaDescricao.setEditable(false);
        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);

        btnMelhorias.setText("Melhorias");

        btnConquistas.setText("Conquistas");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pgbItem1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCompra1Item1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(lblPessoasItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadeItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompra10Item1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pgbItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCompra1Item2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(lblPessoasItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadeItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompra10Item2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblItem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pgbItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCompra1Item3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(lblPessoasItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadeItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompra10Item3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblItem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pgbItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCompra1Item4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(lblPessoasItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadeItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompra10Item4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblItem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pgbItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCompra1Item5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(lblPessoasItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadeItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompra10Item5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblItem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pgbItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCompra1Item6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(lblPessoasItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadeItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompra10Item6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblItem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pgbItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCompra1Item7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(lblPessoasItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadeItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompra10Item7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblItem8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pgbItem8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCompra1Item8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(lblPessoasItem8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadeItem8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompra10Item8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblItem9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pgbItem9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCompra1Item9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(lblPessoasItem9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadeItem9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompra10Item9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblItem10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pgbItem10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCompra1Item10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(lblPessoasItem10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadeItem10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompra10Item10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txaDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnConquistas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMelhorias))
                            .addComponent(lblQuantidadePontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItem1)
                            .addComponent(lblPessoasItem1)
                            .addComponent(lblQuantidadeItem1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCompra1Item1)
                                .addComponent(btnCompra10Item1))
                            .addComponent(pgbItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItem2)
                            .addComponent(lblPessoasItem2)
                            .addComponent(lblQuantidadeItem2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCompra1Item2)
                                .addComponent(btnCompra10Item2))
                            .addComponent(pgbItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItem3)
                            .addComponent(lblPessoasItem3)
                            .addComponent(lblQuantidadeItem3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCompra1Item3)
                                .addComponent(btnCompra10Item3))
                            .addComponent(pgbItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItem4)
                            .addComponent(lblPessoasItem4)
                            .addComponent(lblQuantidadeItem4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCompra1Item4)
                                .addComponent(btnCompra10Item4))
                            .addComponent(pgbItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItem5)
                            .addComponent(lblPessoasItem5)
                            .addComponent(lblQuantidadeItem5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCompra1Item5)
                                .addComponent(btnCompra10Item5))
                            .addComponent(pgbItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItem6)
                            .addComponent(lblPessoasItem6)
                            .addComponent(lblQuantidadeItem6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCompra1Item6)
                                .addComponent(btnCompra10Item6))
                            .addComponent(pgbItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItem7)
                            .addComponent(lblPessoasItem7)
                            .addComponent(lblQuantidadeItem7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCompra1Item7)
                                .addComponent(btnCompra10Item7))
                            .addComponent(pgbItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItem8)
                            .addComponent(lblPessoasItem8)
                            .addComponent(lblQuantidadeItem8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCompra1Item8)
                                .addComponent(btnCompra10Item8))
                            .addComponent(pgbItem8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItem9)
                            .addComponent(lblPessoasItem9)
                            .addComponent(lblQuantidadeItem9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCompra1Item9)
                                .addComponent(btnCompra10Item9))
                            .addComponent(pgbItem9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItem10)
                            .addComponent(lblPessoasItem10)
                            .addComponent(lblQuantidadeItem10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCompra1Item10)
                                .addComponent(btnCompra10Item10))
                            .addComponent(pgbItem10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPontos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQuantidadePontos)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMelhorias)
                            .addComponent(btnConquistas)))
                    .addComponent(txaDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addContainerGap())
        );

        pgbItem1.getAccessibleContext().setAccessibleName("");
        pgbItem1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    
    //Eventos de Mouse para mostrar a descrição
    
    private void pgbItem1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem1MouseEntered
    {//GEN-HEADEREND:event_pgbItem1MouseEntered
        Descricao(1);
    }//GEN-LAST:event_pgbItem1MouseEntered

    private void pgbItem1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem1MouseExited
    {//GEN-HEADEREND:event_pgbItem1MouseExited
        Descricao(0);
    }//GEN-LAST:event_pgbItem1MouseExited

    private void pgbItem2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem2MouseEntered
    {//GEN-HEADEREND:event_pgbItem2MouseEntered
        Descricao(2);
    }//GEN-LAST:event_pgbItem2MouseEntered

    private void pgbItem2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem2MouseExited
    {//GEN-HEADEREND:event_pgbItem2MouseExited
        Descricao(0);
    }//GEN-LAST:event_pgbItem2MouseExited

    private void pgbItem3MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem3MouseEntered
    {//GEN-HEADEREND:event_pgbItem3MouseEntered
        Descricao(3);
    }//GEN-LAST:event_pgbItem3MouseEntered

    private void pgbItem3MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem3MouseExited
    {//GEN-HEADEREND:event_pgbItem3MouseExited
        Descricao(0);
    }//GEN-LAST:event_pgbItem3MouseExited

    private void pgbItem4MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem4MouseEntered
    {//GEN-HEADEREND:event_pgbItem4MouseEntered
        Descricao(4);
    }//GEN-LAST:event_pgbItem4MouseEntered

    private void pgbItem4MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem4MouseExited
    {//GEN-HEADEREND:event_pgbItem4MouseExited
        Descricao(0);
    }//GEN-LAST:event_pgbItem4MouseExited

    private void pgbItem5MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem5MouseEntered
    {//GEN-HEADEREND:event_pgbItem5MouseEntered
        Descricao(5);
    }//GEN-LAST:event_pgbItem5MouseEntered

    private void pgbItem5MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem5MouseExited
    {//GEN-HEADEREND:event_pgbItem5MouseExited
        Descricao(0);
    }//GEN-LAST:event_pgbItem5MouseExited

    private void pgbItem6MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem6MouseEntered
    {//GEN-HEADEREND:event_pgbItem6MouseEntered
        Descricao(6);
    }//GEN-LAST:event_pgbItem6MouseEntered

    private void pgbItem6MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem6MouseExited
    {//GEN-HEADEREND:event_pgbItem6MouseExited
        Descricao(0);
    }//GEN-LAST:event_pgbItem6MouseExited

    private void pgbItem7MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem7MouseEntered
    {//GEN-HEADEREND:event_pgbItem7MouseEntered
        Descricao(7);
    }//GEN-LAST:event_pgbItem7MouseEntered

    private void pgbItem7MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem7MouseExited
    {//GEN-HEADEREND:event_pgbItem7MouseExited
        Descricao(0);
    }//GEN-LAST:event_pgbItem7MouseExited

    private void pgbItem8MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem8MouseEntered
    {//GEN-HEADEREND:event_pgbItem8MouseEntered
        Descricao(8);
    }//GEN-LAST:event_pgbItem8MouseEntered

    private void pgbItem8MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem8MouseExited
    {//GEN-HEADEREND:event_pgbItem8MouseExited
        Descricao(0);
    }//GEN-LAST:event_pgbItem8MouseExited

    private void pgbItem9MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem9MouseEntered
    {//GEN-HEADEREND:event_pgbItem9MouseEntered
        Descricao(9);
    }//GEN-LAST:event_pgbItem9MouseEntered

    private void pgbItem9MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem9MouseExited
    {//GEN-HEADEREND:event_pgbItem9MouseExited
        Descricao(0);
    }//GEN-LAST:event_pgbItem9MouseExited

    private void pgbItem10MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem10MouseEntered
    {//GEN-HEADEREND:event_pgbItem10MouseEntered
        Descricao(10);
    }//GEN-LAST:event_pgbItem10MouseEntered

    private void pgbItem10MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem10MouseExited
    {//GEN-HEADEREND:event_pgbItem10MouseExited
        Descricao(0);
    }//GEN-LAST:event_pgbItem10MouseExited

    
    
    
    //Eventos de Mouse para realizar ação
    
    private void pgbItem1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem1MouseClicked
    {//GEN-HEADEREND:event_pgbItem1MouseClicked
        Realizar(pgbItem1,1,lblQuantidadePontos);
    }//GEN-LAST:event_pgbItem1MouseClicked

    private void pgbItem2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem2MouseClicked
    {//GEN-HEADEREND:event_pgbItem2MouseClicked
        Realizar(pgbItem2,2,lblQuantidadePontos);
    }//GEN-LAST:event_pgbItem2MouseClicked

    private void pgbItem3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem3MouseClicked
    {//GEN-HEADEREND:event_pgbItem3MouseClicked
        Realizar(pgbItem3,3,lblQuantidadePontos);
    }//GEN-LAST:event_pgbItem3MouseClicked

    private void pgbItem4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem4MouseClicked
    {//GEN-HEADEREND:event_pgbItem4MouseClicked
        Realizar(pgbItem4,4,lblQuantidadePontos);
    }//GEN-LAST:event_pgbItem4MouseClicked

    private void pgbItem5MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem5MouseClicked
    {//GEN-HEADEREND:event_pgbItem5MouseClicked
        Realizar(pgbItem5,5,lblQuantidadePontos);
    }//GEN-LAST:event_pgbItem5MouseClicked

    private void pgbItem6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem6MouseClicked
    {//GEN-HEADEREND:event_pgbItem6MouseClicked
        Realizar(pgbItem6,6,lblQuantidadePontos);
    }//GEN-LAST:event_pgbItem6MouseClicked

    private void pgbItem7MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem7MouseClicked
    {//GEN-HEADEREND:event_pgbItem7MouseClicked
        Realizar(pgbItem7,7,lblQuantidadePontos);
    }//GEN-LAST:event_pgbItem7MouseClicked

    private void pgbItem8MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem8MouseClicked
    {//GEN-HEADEREND:event_pgbItem8MouseClicked
        Realizar(pgbItem8,8,lblQuantidadePontos);
    }//GEN-LAST:event_pgbItem8MouseClicked

    private void pgbItem9MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem9MouseClicked
    {//GEN-HEADEREND:event_pgbItem9MouseClicked
        Realizar(pgbItem9,9,lblQuantidadePontos);
    }//GEN-LAST:event_pgbItem9MouseClicked

    private void pgbItem10MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pgbItem10MouseClicked
    {//GEN-HEADEREND:event_pgbItem10MouseClicked
        Realizar(pgbItem10,10,lblQuantidadePontos);
    }//GEN-LAST:event_pgbItem10MouseClicked
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmJogoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmJogoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmJogoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmJogoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmJogoPrincipal dialog = new frmJogoPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompra10Item1;
    private javax.swing.JButton btnCompra10Item10;
    private javax.swing.JButton btnCompra10Item2;
    private javax.swing.JButton btnCompra10Item3;
    private javax.swing.JButton btnCompra10Item4;
    private javax.swing.JButton btnCompra10Item5;
    private javax.swing.JButton btnCompra10Item6;
    private javax.swing.JButton btnCompra10Item7;
    private javax.swing.JButton btnCompra10Item8;
    private javax.swing.JButton btnCompra10Item9;
    private javax.swing.JButton btnCompra1Item1;
    private javax.swing.JButton btnCompra1Item10;
    private javax.swing.JButton btnCompra1Item2;
    private javax.swing.JButton btnCompra1Item3;
    private javax.swing.JButton btnCompra1Item4;
    private javax.swing.JButton btnCompra1Item5;
    private javax.swing.JButton btnCompra1Item6;
    private javax.swing.JButton btnCompra1Item7;
    private javax.swing.JButton btnCompra1Item8;
    private javax.swing.JButton btnCompra1Item9;
    private javax.swing.JButton btnConquistas;
    private javax.swing.JButton btnMelhorias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblItem1;
    private javax.swing.JLabel lblItem10;
    private javax.swing.JLabel lblItem2;
    private javax.swing.JLabel lblItem3;
    private javax.swing.JLabel lblItem4;
    private javax.swing.JLabel lblItem5;
    private javax.swing.JLabel lblItem6;
    private javax.swing.JLabel lblItem7;
    private javax.swing.JLabel lblItem8;
    private javax.swing.JLabel lblItem9;
    private javax.swing.JLabel lblPessoasItem1;
    private javax.swing.JLabel lblPessoasItem10;
    private javax.swing.JLabel lblPessoasItem2;
    private javax.swing.JLabel lblPessoasItem3;
    private javax.swing.JLabel lblPessoasItem4;
    private javax.swing.JLabel lblPessoasItem5;
    private javax.swing.JLabel lblPessoasItem6;
    private javax.swing.JLabel lblPessoasItem7;
    private javax.swing.JLabel lblPessoasItem8;
    private javax.swing.JLabel lblPessoasItem9;
    private javax.swing.JLabel lblPontos;
    private javax.swing.JLabel lblQuantidadeItem1;
    private javax.swing.JLabel lblQuantidadeItem10;
    private javax.swing.JLabel lblQuantidadeItem2;
    private javax.swing.JLabel lblQuantidadeItem3;
    private javax.swing.JLabel lblQuantidadeItem4;
    private javax.swing.JLabel lblQuantidadeItem5;
    private javax.swing.JLabel lblQuantidadeItem6;
    private javax.swing.JLabel lblQuantidadeItem7;
    private javax.swing.JLabel lblQuantidadeItem8;
    private javax.swing.JLabel lblQuantidadeItem9;
    private javax.swing.JLabel lblQuantidadePontos;
    private static javax.swing.JProgressBar pgbItem1;
    private javax.swing.JProgressBar pgbItem10;
    private javax.swing.JProgressBar pgbItem2;
    private javax.swing.JProgressBar pgbItem3;
    private javax.swing.JProgressBar pgbItem4;
    private javax.swing.JProgressBar pgbItem5;
    private javax.swing.JProgressBar pgbItem6;
    private javax.swing.JProgressBar pgbItem7;
    private javax.swing.JProgressBar pgbItem8;
    private javax.swing.JProgressBar pgbItem9;
    private javax.swing.JTextArea txaDescricao;
    // End of variables declaration//GEN-END:variables
  

}

