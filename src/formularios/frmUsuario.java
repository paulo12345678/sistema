/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import classe.Dados;

/**
 *
 * @author paulo
 */
public class frmUsuario extends javax.swing.JInternalFrame {

    private Dados clsdados;
    private int usuarioAtual=0;
    private boolean cmdnovo= false;
  public void setdados (Dados clsdados){
      this.clsdados =clsdados;
  }
    public frmUsuario() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtcodUsuario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtConfSenha = new javax.swing.JTextField();
        btPerfil = new javax.swing.JLabel();
        btprimeiro = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        cmbPerfil = new javax.swing.JComboBox();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Usuarios");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Cod Usuario:");

        jLabel2.setText("Nome :");

        jLabel3.setText("Sobrenome");

        jLabel4.setText("Senha");

        jLabel5.setText("Conf.Senha: ");

        TxtcodUsuario.setEnabled(false);

        txtNome.setEnabled(false);

        txtSobrenome.setEnabled(false);

        txtSenha.setEnabled(false);

        txtConfSenha.setEnabled(false);

        btPerfil.setText("Perfil");

        btprimeiro.setText("Primeiro");

        btAnterior.setText("Anterior");

        btProximo.setText("Proximo");

        btUltimo.setText("Ultimo");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar perfil", "Administrador", "Usuario" }));
        cmbPerfil.setEnabled(false);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${test}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cmbPerfil, eLProperty, cmbPerfil);
        bindingGroup.addBinding(jComboBoxBinding);

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");

        btCancelar.setEnabled(false);
        btCancelar.setLabel("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConfSenha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtcodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btPerfil)
                                .addGap(18, 18, 18)
                                .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSobrenome)
                                    .addComponent(txtSenha)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNovo)
                                .addGap(18, 18, 18)
                                .addComponent(btSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btEditar)
                                .addGap(10, 10, 10)
                                .addComponent(btCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btprimeiro)
                                .addGap(18, 18, 18)
                                .addComponent(btAnterior)
                                .addGap(18, 18, 18)
                                .addComponent(btProximo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btUltimo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btBuscar)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtcodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPerfil)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btprimeiro)
                    .addComponent(btAnterior)
                    .addComponent(btProximo)
                    .addComponent(btUltimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btSalvar)
                    .addComponent(btEditar)
                    .addComponent(btBuscar)
                    .addComponent(btCancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // codigo para um novo cadastro
        btprimeiro.setEnabled(false);
         btAnterior.setEnabled(false);
          btProximo.setEnabled(false);
           btUltimo.setEnabled(false);
            btNovo.setEnabled(false);
             btSalvar.setEnabled(true);
              btEditar.setEnabled(false);
               btCancelar.setEnabled(true);
                btBuscar.setEnabled(false);
                btPerfil.setEnabled(true);
                
                TxtcodUsuario.setEditable(true);
                txtNome.setEditable(true);
                txtSobrenome.setEditable(true);
                txtSenha.setEditable(true);
                txtConfSenha.setEditable(true);
                
                TxtcodUsuario.setText("");
                txtNome.setText("");
                txtSobrenome.setText("");
                txtSenha.setText("");
                txtConfSenha.setText("");
                cmbPerfil.setSelectedIndex(0);
                cmdnovo =true;
                
                TxtcodUsuario.requestFocusInWindow();
                
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        //codigo para salvar
        btprimeiro.setEnabled(true);
         btAnterior.setEnabled(true);
          btProximo.setEnabled(true);
           btUltimo.setEnabled(true);
            btNovo.setEnabled(true);
             btSalvar.setEnabled(false);
              btEditar.setEnabled(true);
               btCancelar.setEnabled(false);
                btBuscar.setEnabled(true);
                
                TxtcodUsuario.setEditable(false);
                txtNome.setEditable(false);
                txtSobrenome.setEditable(false);
                txtSenha.setEditable(false);
                txtConfSenha.setEditable(false);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        btprimeiro.setEnabled(true);
         btAnterior.setEnabled(true);
          btProximo.setEnabled(true);
           btUltimo.setEnabled(true);
            btNovo.setEnabled(true);
             btSalvar.setEnabled(false);
              btEditar.setEnabled(true);
               btCancelar.setEnabled(false);
                btBuscar.setEnabled(true);
                
                TxtcodUsuario.setEditable(false);
                txtNome.setEditable(false);
                txtSobrenome.setEditable(false);
                txtSenha.setEditable(false);
                txtConfSenha.setEditable(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // codigo de editar
        btprimeiro.setEnabled(false);
         btAnterior.setEnabled(false);
          btProximo.setEnabled(false);
           btUltimo.setEnabled(false);
            btNovo.setEnabled(false);
             btSalvar.setEnabled(true);
              btEditar.setEnabled(false);
               btCancelar.setEnabled(true);
                btBuscar.setEnabled(false);
                
                
                txtNome.setEditable(true);
                txtSobrenome.setEditable(true);
                txtSenha.setEditable(true);
                txtConfSenha.setEditable(true);
                 cmdnovo =false;
                cmbPerfil.setSelectedIndex(0);
                
                txtNome.requestFocusInWindow();
    }//GEN-LAST:event_btEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        TxtcodUsuario.setText(clsdados.getUsuarios()[usuarioAtual].getIdUsuario());
        txtNome.setText(clsdados.getUsuarios()[usuarioAtual].getNome());
        txtSobrenome.setText(clsdados.getUsuarios()[usuarioAtual].getSobrenome());
        txtSenha.setText(clsdados.getUsuarios()[usuarioAtual].getSenha());
        txtConfSenha.setText(clsdados.getUsuarios()[usuarioAtual].getSenha());
        cmbPerfil.setSelectedItem(clsdados.getUsuarios()[usuarioAtual].getPerfil());
        
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtcodUsuario;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btNovo;
    private javax.swing.JLabel btPerfil;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btUltimo;
    private javax.swing.JButton btprimeiro;
    private javax.swing.JComboBox cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtConfSenha;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
