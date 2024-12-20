/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasiinventarisbarang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AplikasiInventarisBarang extends javax.swing.JFrame {
public class DatabaseConnection {
    public static Connection connect() {
        try {
            String url = "jdbc:sqlite:inventaris.db";
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
    public AplikasiInventarisBarang() {
        initComponents();
        tampilkanData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldJumlah = new javax.swing.JTextField();
        Lokasi = new javax.swing.JLabel();
        jTextFieldLokasi = new javax.swing.JTextField();
        jButtonTambah = new javax.swing.JButton();
        jButtonUbah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jScrollPaneTabel = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 11, 0, 91);
        jPanel1.add(jLabel2, gridBagConstraints);

        jTextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(17, 0, 15, 8);
        jPanel1.add(jTextFieldNama, gridBagConstraints);

        jLabel3.setText("Jumlah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 91);
        jPanel1.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 8);
        jPanel1.add(jTextFieldJumlah, gridBagConstraints);

        Lokasi.setText("Lokasi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 91);
        jPanel1.add(Lokasi, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 8);
        jPanel1.add(jTextFieldLokasi, gridBagConstraints);

        jButtonTambah.setText("Tambah");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 116);
        jPanel1.add(jButtonTambah, gridBagConstraints);

        jButtonUbah.setText("Ubah");
        jButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 1);
        jPanel1.add(jButtonUbah, gridBagConstraints);

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(15, 65, 15, 38);
        jPanel1.add(jButtonHapus, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 22, 0);
        jPanel2.add(jPanel1, gridBagConstraints);

        jScrollPaneTabel.setPreferredSize(new java.awt.Dimension(452, 300));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Jumlah", "Lokasi"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPaneTabel.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleDescription("");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel2.add(jScrollPaneTabel, gridBagConstraints);

        jButton2.setText("Ekspor .CSV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Import .CSV");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APLIKASI INVENTARIS BARANG");
        jLabel1.setToolTipText("");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 28, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void tambahData(String nama, int jumlah, String lokasi) {
    String sql = "INSERT INTO barang(nama_barang, jumlah, lokasi) VALUES(?, ?, ?)";
    try (Connection conn = DatabaseConnection.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, nama);
        pstmt.setInt(2, jumlah);
        pstmt.setString(3, lokasi);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
private void tampilkanData() {
    String sql = "SELECT * FROM barang";
    try (Connection conn = DatabaseConnection.connect();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
         
        // Ambil model dari JTable
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        // Hapus semua baris sebelumnya
        model.setRowCount(0);
        
        // Tambahkan baris baru
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("nama_barang"),
                rs.getInt("jumlah"),
                rs.getString("lokasi")
            });
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private void ubahData(int id, String nama, int jumlah, String lokasi) {
    String sql = "UPDATE barang SET nama_barang = ?, jumlah = ?, lokasi = ? WHERE id = ?";
    try (Connection conn = DatabaseConnection.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, nama);
        pstmt.setInt(2, jumlah);
        pstmt.setString(3, lokasi);
        pstmt.setInt(4, id);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private void hapusData(int id) {
    String sql = "DELETE FROM barang WHERE id = ?";
    try (Connection conn = DatabaseConnection.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private void eksporDataKeCSV() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    try (FileWriter writer = new FileWriter("data_inventaris.csv")) {
        // Tulis header
        for (int i = 0; i < model.getColumnCount(); i++) {
            writer.append(model.getColumnName(i));
            if (i < model.getColumnCount() - 1) writer.append(",");
        }
        writer.append("\n");

        // Tulis data
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                writer.append(model.getValueAt(i, j).toString());
                if (j < model.getColumnCount() - 1) writer.append(",");
            }
            writer.append("\n");
        }
        JOptionPane.showMessageDialog(this, "Data berhasil diekspor ke CSV!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengekspor data.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void imporDataDariCSV() {
    try (BufferedReader reader = new BufferedReader(new FileReader("data_inventaris.csv"))) {
        String line;
        reader.readLine(); // Membaca header dan melewatinya
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 4) {
                String nama = data[1];
                int jumlah = Integer.parseInt(data[2]);
                String lokasi = data[3];
                
                // Tambahkan data ke database
                tambahData(nama, jumlah, lokasi);
            }
        }
        // Perbarui tabel setelah data diimpor
        tampilkanData();
        JOptionPane.showMessageDialog(this, "Data berhasil diimpor dari CSV!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengimpor data.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
     // Ambil nilai dari JTextField
    String nama = jTextFieldNama.getText();
    int jumlah;
    try {
        jumlah = Integer.parseInt(jTextFieldJumlah.getText()); // Konversi ke integer
    } catch (NumberFormatException e) {
        // Jika input tidak valid, tampilkan pesan dan hentikan proses
        JOptionPane.showMessageDialog(this, "Jumlah harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String lokasi = jTextFieldLokasi.getText();

    // Tambahkan data ke database
    tambahData(nama, jumlah, lokasi);

    // Perbarui tabel setelah data ditambahkan
    tampilkanData();

    // Kosongkan input setelah menambahkan data
    jTextFieldNama.setText("");
    jTextFieldJumlah.setText("");
    jTextFieldLokasi.setText("");
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jTextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaActionPerformed

    private void jButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahActionPerformed
   // Periksa apakah ada baris yang dipilih
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin diubah!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Ambil ID dari kolom pertama JTable (sebagai String)
    String idString = jTable1.getValueAt(selectedRow, 0).toString();

    // Konversi ID ke Integer
    int id;
    try {
        id = Integer.parseInt(idString);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Ambil data dari JTextField untuk diubah
    String nama = jTextFieldNama.getText();
    int jumlah;
    try {
        jumlah = Integer.parseInt(jTextFieldJumlah.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Jumlah harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String lokasi = jTextFieldLokasi.getText();

    // Panggil fungsi ubahData
    ubahData(id, nama, jumlah, lokasi);

    // Perbarui tabel setelah data diubah
    tampilkanData();

    // Kosongkan input setelah perubahan
    jTextFieldNama.setText("");
    jTextFieldJumlah.setText("");
    jTextFieldLokasi.setText("");
    }//GEN-LAST:event_jButtonUbahActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
    // Periksa apakah ada baris yang dipilih
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Ambil ID dari baris yang dipilih di JTable
    int id = (int) jTable1.getValueAt(selectedRow, 0); // Kolom 0 berisi ID

    // Konfirmasi sebelum menghapus
    int confirm = JOptionPane.showConfirmDialog(this, 
        "Apakah Anda yakin ingin menghapus data dengan ID " + id + "?", 
        "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        // Panggil fungsi hapusData
        hapusData(id);

          // Kosongkan input setelah perubahan
    jTextFieldNama.setText("");
    jTextFieldJumlah.setText("");
    jTextFieldLokasi.setText("");
        // Perbarui tabel setelah data dihapus
        tampilkanData();
    }
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int selectedRow = jTable1.getSelectedRow(); // Dapatkan indeks baris yang dipilih
        if (selectedRow != -1) {
            // Ambil data dari JTable berdasarkan indeks baris dan kolom
            String nama = jTable1.getValueAt(selectedRow, 1).toString(); // Kolom 1: Nama Barang
            String jumlah = jTable1.getValueAt(selectedRow, 2).toString(); // Kolom 2: Jumlah
            String lokasi = jTable1.getValueAt(selectedRow, 3).toString(); // Kolom 3: Lokasi

            // Set nilai JTextField
            jTextFieldNama.setText(nama);
            jTextFieldJumlah.setText(jumlah);
            jTextFieldLokasi.setText(lokasi);
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    imporDataDariCSV();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    eksporDataKeCSV();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiInventarisBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lokasi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JButton jButtonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPaneTabel;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldJumlah;
    private javax.swing.JTextField jTextFieldLokasi;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables
}
