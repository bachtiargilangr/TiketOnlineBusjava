/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kenceng
 */
public class pogramhargatiket extends javax.swing.JFrame {

    /**
     * Creates new form pogramhargatiket
     */
    public pogramhargatiket() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        KodeBus = new javax.swing.JLabel();
        NamaBus = new javax.swing.JLabel();
        Jurusan = new javax.swing.JLabel();
        HargaTiket = new javax.swing.JLabel();
        Jumlah = new javax.swing.JLabel();
        BiayaTipeBus = new javax.swing.JLabel();
        TotalBayar = new javax.swing.JLabel();
        Bayar = new javax.swing.JLabel();
        KembalianSisa = new javax.swing.JLabel();
        cBoxKodeBus = new javax.swing.JComboBox<>();
        TxtNamaBus = new javax.swing.JTextField();
        TxtJurusan = new javax.swing.JTextField();
        TxtHargaTiket = new javax.swing.JTextField();
        TxtJumlah = new javax.swing.JTextField();
        jVIP = new javax.swing.JRadioButton();
        jEkonomi = new javax.swing.JRadioButton();
        TxtTambahanHarga = new javax.swing.JTextField();
        TxtTotalBayar = new javax.swing.JTextField();
        TxtBayar = new javax.swing.JTextField();
        TxtSisa = new javax.swing.JTextField();
        jBhitung = new javax.swing.JButton();
        jBbayar = new javax.swing.JButton();
        jBReset = new javax.swing.JButton();
        jBKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        KodeBus.setText("Kode Bus");

        NamaBus.setText(" Nama Bus");

        Jurusan.setText("Jurusan");

        HargaTiket.setText("Harga Tiket");

        Jumlah.setText("Jumlah Tiket");

        BiayaTipeBus.setText("Biaya Tipe Bus");

        TotalBayar.setText("Total Bayar");

        Bayar.setText("Bayar");

        KembalianSisa.setText("Kembali/Sisa");

        cBoxKodeBus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBoxKodeBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxKodeBusActionPerformed(evt);
            }
        });

        buttonGroup1.add(jVIP);
        jVIP.setText("Vip");
        jVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVIPActionPerformed(evt);
            }
        });

        buttonGroup1.add(jEkonomi);
        jEkonomi.setText("Ekonomi");
        jEkonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEkonomiActionPerformed(evt);
            }
        });

        jBhitung.setText("Hitung");
        jBhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBhitungActionPerformed(evt);
            }
        });

        jBbayar.setText("Bayar");
        jBbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbayarActionPerformed(evt);
            }
        });

        jBReset.setText("Reset");
        jBReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResetActionPerformed(evt);
            }
        });

        jBKeluar.setText("Keluar");
        jBKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKeluarActionPerformed(evt);
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
                            .addComponent(Jumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(KembalianSisa, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(KodeBus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NamaBus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jurusan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HargaTiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BiayaTipeBus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TotalBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cBoxKodeBus, 0, 122, Short.MAX_VALUE)
                            .addComponent(TxtNamaBus)
                            .addComponent(TxtJurusan)
                            .addComponent(TxtHargaTiket)
                            .addComponent(TxtJumlah)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jVIP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEkonomi))
                            .addComponent(TxtTambahanHarga)
                            .addComponent(TxtTotalBayar)
                            .addComponent(TxtBayar)
                            .addComponent(TxtSisa))
                        .addGap(18, 18, 18)
                        .addComponent(jBhitung))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jBbayar)
                        .addGap(29, 29, 29)
                        .addComponent(jBReset)
                        .addGap(26, 26, 26)
                        .addComponent(jBKeluar)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KodeBus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxKodeBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaBus)
                    .addComponent(TxtNamaBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jurusan)
                    .addComponent(TxtJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HargaTiket)
                    .addComponent(TxtHargaTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jumlah)
                    .addComponent(TxtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jVIP)
                    .addComponent(jEkonomi))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BiayaTipeBus)
                    .addComponent(TxtTambahanHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalBayar)
                    .addComponent(TxtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBhitung))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bayar)
                    .addComponent(TxtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KembalianSisa)
                    .addComponent(TxtSisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBbayar)
                    .addComponent(jBReset)
                    .addComponent(jBKeluar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBoxKodeBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxKodeBusActionPerformed
        // TODO add your handling code here:
         if
        (cBoxKodeBus.getSelectedItem()=="Pilih");
               TxtNamaBus.setText("");
               TxtJurusan.setText("");
               TxtHargaTiket.setText("");
     
            if
            (cBoxKodeBus.getSelectedItem()=="B21"){
               TxtNamaBus.setText("Bulan Sabit");
               TxtJurusan.setText("Bandung");
               TxtHargaTiket.setText("203000");}
            else
            if (cBoxKodeBus.getSelectedItem()=="B22"){
               TxtNamaBus.setText("Bulan Purnama");
               TxtJurusan.setText("Garut");
               TxtHargaTiket.setText("255000");}
            else
             if 
            (cBoxKodeBus.getSelectedItem()=="B23"){
               TxtNamaBus.setText("Bulan Bintang");
               TxtJurusan.setText("Kuningan");
               TxtHargaTiket.setText("332000");}
             else
             if 
            (cBoxKodeBus.getSelectedItem()=="B24"){
               TxtNamaBus.setText("Cahaya Bulan");
               TxtJurusan.setText("Cirebon");
               TxtHargaTiket.setText("350500");}
             else
             if 
            (cBoxKodeBus.getSelectedItem()=="B25"){
               TxtNamaBus.setText("Gerhana Bulan");
               TxtJurusan.setText("MeiKarta");
               TxtHargaTiket.setText("100000");}
       
    }//GEN-LAST:event_cBoxKodeBusActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
         cBoxKodeBus.addItem("Pilih");
        cBoxKodeBus.addItem("B21");
        cBoxKodeBus.addItem("B22");
        cBoxKodeBus.addItem("B23");
        cBoxKodeBus.addItem("B24");
        cBoxKodeBus.addItem("B25");
    }//GEN-LAST:event_formWindowActivated

    private void jVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVIPActionPerformed
        // TODO add your handling code here:
          if(jVIP.isSelected()){
        TxtTambahanHarga.setText("55000");
        
        }
    }//GEN-LAST:event_jVIPActionPerformed

    private void jEkonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEkonomiActionPerformed
        // TODO add your handling code here:
        if(jVIP.isSelected()){
        TxtTambahanHarga.setText("100000");
        
        }
    }//GEN-LAST:event_jEkonomiActionPerformed

    private void jBhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBhitungActionPerformed
        // TODO add your handling code here:
        if (cBoxKodeBus.getSelectedItem()=="B21"){
            int A=Integer.parseInt(TxtHargaTiket.getText());
            int B=Integer.parseInt(TxtJumlah.getText());
            int C=Integer.parseInt(TxtTambahanHarga.getText());
            int D=A*B+C;
            TxtTotalBayar.setText(""+D);}
        else
        if (cBoxKodeBus.getSelectedItem()=="B22"){
            int A=Integer.parseInt(TxtHargaTiket.getText());
            int B=Integer.parseInt(TxtJumlah.getText());
            int C=Integer.parseInt(TxtTambahanHarga.getText());
            int D=A*B+C;
            TxtTotalBayar.setText(""+D);}
        else
        if (cBoxKodeBus.getSelectedItem()=="B23"){
            int A=Integer.parseInt(TxtHargaTiket.getText());
            int B=Integer.parseInt(TxtJumlah.getText());
            int C=Integer.parseInt(TxtTambahanHarga.getText());
            int D=A*B+C;
            TxtTotalBayar.setText(""+D);}
        else
        if (cBoxKodeBus.getSelectedItem()=="B24"){
            int A=Integer.parseInt(TxtHargaTiket.getText());
            int B=Integer.parseInt(TxtJumlah.getText());
            int C=Integer.parseInt(TxtTambahanHarga.getText());
            int D=A*B+C;
            TxtTotalBayar.setText(""+D);}
        else
        if (cBoxKodeBus.getSelectedItem()=="B25"){
            int A=Integer.parseInt(TxtHargaTiket.getText());
            int B=Integer.parseInt(TxtJumlah.getText());
            int C=Integer.parseInt(TxtTambahanHarga.getText());
            int D=A*B+C;
            TxtTotalBayar.setText(""+D);}
    }//GEN-LAST:event_jBhitungActionPerformed

    private void jBbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbayarActionPerformed
        // TODO add your handling code here:
        int TotalBayar=Integer.parseInt(TxtTotalBayar.getText());
        int Bayarr=Integer.parseInt(TxtBayar.getText());
        int Hasil=Bayarr-TotalBayar;
        TxtSisa.setText(""+Hasil);
    }//GEN-LAST:event_jBbayarActionPerformed

    private void jBResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResetActionPerformed
        // TODO add your handling code here:
        cBoxKodeBus.setSelectedItem("Pilih");
       TxtNamaBus.setText("");
       TxtJurusan.setText("");
       TxtHargaTiket.setText("");
       TxtJumlah.setText("");
       TxtTotalBayar.setText("");
       TxtBayar.setText("");
       TxtSisa.setText("");
       TxtTambahanHarga.setText("");
       jVIP.setSelected(false);
       jEkonomi.setSelected(false);
    }//GEN-LAST:event_jBResetActionPerformed

    private void jBKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(pogramhargatiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pogramhargatiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pogramhargatiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pogramhargatiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pogramhargatiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bayar;
    private javax.swing.JLabel BiayaTipeBus;
    private javax.swing.JLabel HargaTiket;
    private javax.swing.JLabel Jumlah;
    private javax.swing.JLabel Jurusan;
    private javax.swing.JLabel KembalianSisa;
    private javax.swing.JLabel KodeBus;
    private javax.swing.JLabel NamaBus;
    private javax.swing.JLabel TotalBayar;
    private javax.swing.JTextField TxtBayar;
    private javax.swing.JTextField TxtHargaTiket;
    private javax.swing.JTextField TxtJumlah;
    private javax.swing.JTextField TxtJurusan;
    private javax.swing.JTextField TxtNamaBus;
    private javax.swing.JTextField TxtSisa;
    private javax.swing.JTextField TxtTambahanHarga;
    private javax.swing.JTextField TxtTotalBayar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cBoxKodeBus;
    private javax.swing.JButton jBKeluar;
    private javax.swing.JButton jBReset;
    private javax.swing.JButton jBbayar;
    private javax.swing.JButton jBhitung;
    private javax.swing.JRadioButton jEkonomi;
    private javax.swing.JRadioButton jVIP;
    // End of variables declaration//GEN-END:variables
}
