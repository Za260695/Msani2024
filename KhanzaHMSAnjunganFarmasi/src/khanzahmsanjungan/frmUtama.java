/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * frmUtama.java
 *
 * Created on 04 Des 13, 11:19:32
 */
package khanzahmsanjungan;

import fungsi.sekuel;
import fungsi.validasi;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class frmUtama extends javax.swing.JFrame {

    private final sekuel Sequel = new sekuel();
    private final validasi Valid = new validasi();
    private String validasiregistrasi = Sequel.cariIsi("select set_validasi_registrasi.wajib_closing_kasir from set_validasi_registrasi");

    /**
     * Creates new form frmUtama
     */
    public frmUtama() {
        initComponents();
        setIconImage(new ImageIcon(super.getClass().getResource("/picture/addressbook-edit24.png")).getImage());
        this.setSize(screen.width, screen.height);
    }
    private final Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new component.Panel();
        jLabel1 = new component.Label();
        jLabel2 = new component.Label();
        jPanel3 = new component.Panel();
        jLabel3 = new component.Label();
        panel1 = new usu.widget.glass.PanelGlass();
        jLabel6 = new component.Label();
        TNoRw = new component.TextBox();
        btnCari = new component.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("::[ SIMRS KhanzaHMS, Sub Menu Anjungan Registrasi Mandiri Pasien ]::");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(130, 50, 130));
        jPanel1.setBorder(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 55));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setForeground(new java.awt.Color(254, 184, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/folder.png"))); // NOI18N
        jLabel1.setText("Anjungan Antrian Farmasi");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIconTextGap(10);
        jLabel1.setPreferredSize(new java.awt.Dimension(650, 135));
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setPreferredSize(new java.awt.Dimension(20, 10));
        jPanel1.add(jLabel2, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(130, 50, 130));
        jPanel3.setBorder(null);
        jPanel3.setPreferredSize(new java.awt.Dimension(560, 30));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setForeground(new java.awt.Color(254, 184, 254));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dikembangkan Oleh Khanza.Soft Media, Email : khanza_media@yahoo.com, Skype : khanza.media, HP : 08562675039");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jPanel3.add(jLabel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/picture/wallpaper.jpg"))); // NOI18N
        panel1.setBackgroundImageType(usu.widget.constan.BackgroundConstan.BACKGROUND_IMAGE_LEFT_BOTTOM);
        panel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 1, 1, 1));
        panel1.setOpaque(true);
        panel1.setOpaqueImage(false);
        panel1.setPreferredSize(new java.awt.Dimension(200, 200));
        panel1.setRound(false);

        jLabel6.setForeground(new java.awt.Color(130, 80, 130));
        jLabel6.setText("Scan Qr Code/ Ketik No Rawat di  Bukti Register ");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIconTextGap(10);
        jLabel6.setPreferredSize(new java.awt.Dimension(400, 45));

        TNoRw.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        TNoRw.setPreferredSize(new java.awt.Dimension(350, 45));
        TNoRw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNoRwActionPerformed(evt);
            }
        });
        TNoRw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TNoRwKeyPressed(evt);
            }
        });

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/accept.png"))); // NOI18N
        btnCari.setMnemonic('O');
        btnCari.setToolTipText("Alt+O");
        btnCari.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCari.setIconTextGap(0);
        btnCari.setMargin(new java.awt.Insets(0, 3, 0, 0));
        btnCari.setPreferredSize(new java.awt.Dimension(45, 45));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        btnCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCariKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(TNoRw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TNoRw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TNoRwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNoRwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNoRwActionPerformed

    private void TNoRwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TNoRwKeyPressed
        
    }//GEN-LAST:event_TNoRwKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TNoRw.setText("");
    }//GEN-LAST:event_formWindowActivated

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        if (TNoRw.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "<html><div align='center'><font size='5' face='Tahoma' color='#825082'>Silahkan Scan Dulu Bukti Register Anda </font></div></html>");
        } else {
            //if(Sequel.cariInteger("select count(resep_obat.no_rawat) from resep_obat where resep_obat.no_rawat='"+TNoRw.getText().trim()+"' and resep_obat.tgl_peresepan=CURRENT_DATE()")>0){
            if (Sequel.cariInteger("select count(resep_obat.no_rawat) from resep_obat where resep_obat.no_rawat=?",TNoRw.getText()) > 0) {
                DlgCetakAntrianFarmasi pilih = new DlgCetakAntrianFarmasi(this, true);
                pilih.setSize(this.getWidth() - 20, this.getHeight() - 70);
                pilih.setLocationRelativeTo(this);
                pilih.setPasien(TNoRw.getText());
                pilih.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Maaf, resep tidak ditemukan, silahkan konfirmasi ke poli bersangkutan.. !!");
            }
        }

    }//GEN-LAST:event_btnCariActionPerformed

    private void btnCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCariKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCariActionPerformed(null);
        }
    }//GEN-LAST:event_btnCariKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new frmUtama().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.TextBox TNoRw;
    private component.Button btnCari;
    private component.Label jLabel1;
    private component.Label jLabel2;
    private component.Label jLabel3;
    private component.Label jLabel6;
    private component.Panel jPanel1;
    private component.Panel jPanel3;
    private usu.widget.glass.PanelGlass panel1;
    // End of variables declaration//GEN-END:variables
}
