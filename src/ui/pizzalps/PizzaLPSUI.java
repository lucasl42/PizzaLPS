package ui.pizzalps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaLPSUI extends javax.swing.JFrame {
    
    public Massa massa = new Massa();
    public Cobertura cobertura = new Cobertura();
    public int tempoForno;
    public int nroPedacos;
    public Boolean molho;
    

    public PizzaLPSUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxTamanho = new javax.swing.JComboBox<>();
        jLabelTamanho = new javax.swing.JLabel();
        jLabelRecheioBorda = new javax.swing.JLabel();
        jComboBoxRecheioBorda = new javax.swing.JComboBox<>();
        jLabelSabor = new javax.swing.JLabel();
        jComboBoxSabor = new javax.swing.JComboBox<>();
        jButtonPronto = new javax.swing.JButton();
        jCheckBoxMolho = new javax.swing.JCheckBox();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Montar Pizza");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizza"));

        jComboBoxTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brotinho", "Média", "Família" }));
        jComboBoxTamanho.setToolTipText("");
        jComboBoxTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTamanhoActionPerformed(evt);
            }
        });

        jLabelTamanho.setText("Tamanho:");

        jLabelRecheioBorda.setText("Recheio da Borda:");

        jComboBoxRecheioBorda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Recheio", "Catupiry", "Cheddar" }));

        jLabelSabor.setText("Sabor:");

        jComboBoxSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frango com Catupiry", "Calabresa", "Mussarela", "Marguerita" }));

        jButtonPronto.setText("Pronto");
        jButtonPronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProntoActionPerformed(evt);
            }
        });

        jCheckBoxMolho.setText("Molho de tomate");
        jCheckBoxMolho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMolhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPronto)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRecheioBorda)
                            .addComponent(jLabelTamanho)
                            .addComponent(jLabelSabor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRecheioBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCheckBoxMolho))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTamanho))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRecheioBorda)
                    .addComponent(jComboBoxRecheioBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSabor)
                    .addComponent(jComboBoxSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxMolho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonPronto)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTamanhoActionPerformed

    private void jButtonProntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProntoActionPerformed
        PizzaLPSUI pizzaLPS = new PizzaLPSUI();
        
        if(jComboBoxTamanho.getSelectedItem().equals("Brotinho")){
            pizzaLPS.massa.setTamanho("Brotinho");
        } else if(jComboBoxTamanho.getSelectedItem().equals("Média")){
            pizzaLPS.massa.setTamanho("Média");
        } else if(jComboBoxTamanho.getSelectedItem().equals("Família")){
            pizzaLPS.massa.setTamanho("Família");
        }
        
        if(jComboBoxRecheioBorda.getSelectedItem().equals("Sem Recheio")){
            pizzaLPS.massa.borda.setRecheio("Sem Recheio");
        } else if(jComboBoxRecheioBorda.getSelectedItem().equals("Catupiry")){
            pizzaLPS.massa.borda.setRecheio("Catupiry");
        } else if(jComboBoxRecheioBorda.getSelectedItem().equals("Cheddar")){
            pizzaLPS.massa.borda.setRecheio("Cheddar");
        }
        
        if(jComboBoxSabor.getSelectedItem().equals("Frango com Catupiry")){
            pizzaLPS.cobertura.setSabor("Frango com Catupiry");
        } else if(jComboBoxSabor.getSelectedItem().equals("Calabresa")){
            pizzaLPS.cobertura.setSabor("Calabresa");
        } else if(jComboBoxSabor.getSelectedItem().equals("Mussarela")){
            pizzaLPS.cobertura.setSabor("Mussarela");
        } else if(jComboBoxSabor.getSelectedItem().equals("Marguerita")){
            pizzaLPS.cobertura.setSabor("Marguerita");
        }
        
        if(pizzaLPS.massa.getTamanho().equals("Brotinho")){
            pizzaLPS.nroPedacos = 4;
            pizzaLPS.tempoForno = 15;
        } else if(pizzaLPS.massa.getTamanho().equals("Média")){
            pizzaLPS.nroPedacos = 8;
            pizzaLPS.tempoForno = 35;
        } else if(pizzaLPS.massa.getTamanho().equals("Família")){
            pizzaLPS.nroPedacos = 16;
            pizzaLPS.tempoForno = 45;
        }
        
        if(jCheckBoxMolho.isSelected()){
            pizzaLPS.molho = true;
        } else pizzaLPS.molho = false;
        
        Dashboard d = new Dashboard(pizzaLPS);
        d.setVisible(true);
    }//GEN-LAST:event_jButtonProntoActionPerformed

    private void jCheckBoxMolhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMolhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMolhoActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PizzaLPSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaLPSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaLPSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaLPSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaLPSUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPronto;
    private javax.swing.JCheckBox jCheckBoxMolho;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxRecheioBorda;
    private javax.swing.JComboBox<String> jComboBoxSabor;
    private javax.swing.JComboBox<String> jComboBoxTamanho;
    private javax.swing.JLabel jLabelRecheioBorda;
    private javax.swing.JLabel jLabelSabor;
    private javax.swing.JLabel jLabelTamanho;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
