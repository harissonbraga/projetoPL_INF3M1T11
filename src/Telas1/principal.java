/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas1;

/**
 *
 * @author 181710062sasa
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        IMArquivo = new javax.swing.JMenu();
        IMCadastrarItens = new javax.swing.JMenuItem();
        IMSair = new javax.swing.JMenuItem();
        IMControleeGestaodeEstoque = new javax.swing.JMenu();
        IMEstoque = new javax.swing.JMenuItem();
        IMReposicao = new javax.swing.JMenuItem();
        IMItenscomDefeitoCadastrados = new javax.swing.JMenuItem();
        IMHistorico = new javax.swing.JMenu();
        IMPlanejamentodeEncomendas = new javax.swing.JMenuItem();
        IMHistoricoItens = new javax.swing.JMenuItem();
        IMAjuda = new javax.swing.JMenu();
        IMSobreaAplicacao = new javax.swing.JMenuItem();
        IMContatos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de Estoque - Clínica Oftamológica");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1114, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        IMArquivo.setText("Arquivo");
        IMArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMArquivoActionPerformed(evt);
            }
        });

        IMCadastrarItens.setText("Cadastrar Itens ");
        IMCadastrarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMCadastrarItensActionPerformed(evt);
            }
        });
        IMArquivo.add(IMCadastrarItens);

        IMSair.setText("Sair");
        IMArquivo.add(IMSair);

        jMenuBar1.add(IMArquivo);

        IMControleeGestaodeEstoque.setText("Controle e Gestão de Estoque");

        IMEstoque.setText("Estoque");
        IMEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMEstoqueActionPerformed(evt);
            }
        });
        IMControleeGestaodeEstoque.add(IMEstoque);

        IMReposicao.setText("Reposição");
        IMReposicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMReposicaoActionPerformed(evt);
            }
        });
        IMControleeGestaodeEstoque.add(IMReposicao);

        IMItenscomDefeitoCadastrados.setText("Itens com Defeito(s) Cadastrado(s)");
        IMItenscomDefeitoCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMItenscomDefeitoCadastradosActionPerformed(evt);
            }
        });
        IMControleeGestaodeEstoque.add(IMItenscomDefeitoCadastrados);

        jMenuBar1.add(IMControleeGestaodeEstoque);

        IMHistorico.setText("Histórico");

        IMPlanejamentodeEncomendas.setText("Planejamento de Encomendas");
        IMPlanejamentodeEncomendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPlanejamentodeEncomendasActionPerformed(evt);
            }
        });
        IMHistorico.add(IMPlanejamentodeEncomendas);

        IMHistoricoItens.setText("Histórico Itens, Reposição e Defeito");
        IMHistoricoItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMHistoricoItensActionPerformed(evt);
            }
        });
        IMHistorico.add(IMHistoricoItens);

        jMenuBar1.add(IMHistorico);

        IMAjuda.setText("Ajuda");

        IMSobreaAplicacao.setText("Sobre a Aplicação!");
        IMSobreaAplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMSobreaAplicacaoActionPerformed(evt);
            }
        });
        IMAjuda.add(IMSobreaAplicacao);

        IMContatos.setText("Contatos");
        IMContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMContatosActionPerformed(evt);
            }
        });
        IMAjuda.add(IMContatos);

        jMenuBar1.add(IMAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jDesktopPane2)
        );

        setBounds(0, 0, 1140, 563);
    }// </editor-fold>//GEN-END:initComponents

    private void IMReposicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMReposicaoActionPerformed
        telaReposicao obj = new telaReposicao();
        jDesktopPane2.add( obj );
        obj.setVisible( true );
    }//GEN-LAST:event_IMReposicaoActionPerformed

    private void IMCadastrarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMCadastrarItensActionPerformed
       TelaCadastrarItens obj = new TelaCadastrarItens();
        jDesktopPane2.add( obj );
        obj.setVisible( true );
    }//GEN-LAST:event_IMCadastrarItensActionPerformed

    private void IMArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMArquivoActionPerformed

    private void IMEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMEstoqueActionPerformed
        TelaEstoque obj = new TelaEstoque();
        jDesktopPane2.add( obj );
        obj.setVisible( true );
    }//GEN-LAST:event_IMEstoqueActionPerformed

    private void IMItenscomDefeitoCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMItenscomDefeitoCadastradosActionPerformed
        TelaItenscomDefeito obj = new TelaItenscomDefeito();
        jDesktopPane2.add( obj );
        obj.setVisible( true );
    }//GEN-LAST:event_IMItenscomDefeitoCadastradosActionPerformed

    private void IMPlanejamentodeEncomendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPlanejamentodeEncomendasActionPerformed
        TelaPlanejamentoEncomendas obj = new TelaPlanejamentoEncomendas();
        jDesktopPane2.add( obj );
        obj.setVisible( true );
    }//GEN-LAST:event_IMPlanejamentodeEncomendasActionPerformed

    private void IMHistoricoItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMHistoricoItensActionPerformed
        TelaHistorico obj = new TelaHistorico();
        jDesktopPane2.add( obj );
        obj.setVisible( true );
    }//GEN-LAST:event_IMHistoricoItensActionPerformed

    private void IMSobreaAplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMSobreaAplicacaoActionPerformed
        TelaSobreAplicacao obj = new TelaSobreAplicacao();
        jDesktopPane2.add( obj );
        obj.setVisible( true );
    }//GEN-LAST:event_IMSobreaAplicacaoActionPerformed

    private void IMContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMContatosActionPerformed
        TelaContatos obj = new TelaContatos();
        jDesktopPane2.add( obj );
        obj.setVisible( true );
    }//GEN-LAST:event_IMContatosActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu IMAjuda;
    private javax.swing.JMenu IMArquivo;
    private javax.swing.JMenuItem IMCadastrarItens;
    private javax.swing.JMenuItem IMContatos;
    private javax.swing.JMenu IMControleeGestaodeEstoque;
    private javax.swing.JMenuItem IMEstoque;
    private javax.swing.JMenu IMHistorico;
    private javax.swing.JMenuItem IMHistoricoItens;
    private javax.swing.JMenuItem IMItenscomDefeitoCadastrados;
    private javax.swing.JMenuItem IMPlanejamentodeEncomendas;
    private javax.swing.JMenuItem IMReposicao;
    private javax.swing.JMenuItem IMSair;
    private javax.swing.JMenuItem IMSobreaAplicacao;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
