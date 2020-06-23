//viwe

import java.awt.HeadlessException;
import java.lang.Integer.*;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Penilaian extends javax.swing.JFrame {
    
    private Control ctrl;
            
    // mengosongkan textbox
    public void kosongkan_data(){
        txtjmlmhs.setText("");
        txtstambuk.setText("");
        txtnama.setText("");
        txthadir.setText("");
        txttugas.setText("");
        txtproyek.setText("");
        txtuts.setText("");
        txtuas.setText("");
        txtakhir.setText("");
        txtgrade.setText("");
    }
    
    public void setTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Stambuk");
        model.addColumn("Nama");
        model.addColumn("Nilai Kehadiran");
        model.addColumn("Nilai Tugas");
        model.addColumn("Nilai Proyek");
        model.addColumn("Nilai UTS");
        model.addColumn("Nilai UAS");
        model.addColumn("Nilai Akhir");
        model.addColumn("Grade");
        
        try {
            
            String sql="SELECT *FROM nilaimahasiswa";
            Connection conn =(Connection)Koneksii.getConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while(res.next()){
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)});                            
            }
            nilaimahasiswa.setModel(model);
        }
        catch (SQLException e) {
              System.out.print("Error : " +e.getMessage());
        }
    }
    
    public Penilaian() {
        initComponents();
        ctrl = new Control(this);//menghubungkan dengan file controller
        kosongkan_data();
        setTable();
    }
    
    public JTextField getStambuk(){
        return txtstambuk;
    }
    
    public JTextField getNama(){
        return txtnama;
    }
    
    public JTextField getHadir(){
        return txthadir;
    }
    
    public JTextField getTugas(){
        return txttugas;
    }
    
    public JTextField getProyek(){
        return txtproyek;
    }
    
    public JTextField getUts(){
        return txtuts;
    }
    
    public JTextField getUas(){
        return txtuas;
    }
    
    public JTextField getAkhir(){
        return txtakhir;
    }
    
    public JTextField getGrade(){
        return txtgrade;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtstambuk = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtjmlmhs = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txthadir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttugas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtproyek = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtuts = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtuas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtakhir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtgrade = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        nilaimahasiswa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        edit = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jTextField3.setText("jTextField3");

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setText("Stambuk");

        jLabel4.setText("Nama");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        jLabel6.setText("*Masukan data");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtstambuk, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtstambuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Jumlah Mahasiswa");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        jLabel13.setText("*Masukan Nilai");

        jLabel7.setText("Nilai Kehadiran");

        jLabel8.setText("Nilai Tugas/Kuis");

        jLabel9.setText("Nilai Proyek");

        jLabel10.setText("Nilai UTS");

        jLabel11.setText("Nilai  UAS");

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("NILAI MAHASISWA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(376, 376, 376))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("HITUNG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Nilai Akhir");

        jLabel5.setText("Grade");

        simpan.setBackground(new java.awt.Color(0, 0, 0));
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        nilaimahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Stambuk", "Nama", "Nilai Kehadiran", "Nilai Tugas", "Nilai Proyek", "Nilai UTS", "Nilai UAS", "Nilai Akhir", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        nilaimahasiswa.setGridColor(new java.awt.Color(0, 153, 153));
        nilaimahasiswa.setSelectionBackground(new java.awt.Color(0, 204, 204));
        nilaimahasiswa.setSelectionForeground(new java.awt.Color(0, 0, 0));
        nilaimahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nilaimahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(nilaimahasiswa);
        if (nilaimahasiswa.getColumnModel().getColumnCount() > 0) {
            nilaimahasiswa.getColumnModel().getColumn(0).setHeaderValue("Stambuk");
            nilaimahasiswa.getColumnModel().getColumn(1).setHeaderValue("Nama");
            nilaimahasiswa.getColumnModel().getColumn(2).setHeaderValue("Nilai Kehadiran");
            nilaimahasiswa.getColumnModel().getColumn(3).setHeaderValue("Nilai Tugas");
            nilaimahasiswa.getColumnModel().getColumn(4).setHeaderValue("Nilai Proyek");
            nilaimahasiswa.getColumnModel().getColumn(5).setHeaderValue("Nilai UTS");
            nilaimahasiswa.getColumnModel().getColumn(6).setHeaderValue("Nilai UAS");
            nilaimahasiswa.getColumnModel().getColumn(7).setHeaderValue("Nilai Akhir");
            nilaimahasiswa.getColumnModel().getColumn(8).setHeaderValue("Grade");
        }

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        hapus.setBackground(new java.awt.Color(0, 0, 0));
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(0, 0, 0));
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(0, 0, 0));
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus)
                    .addComponent(keluar)
                    .addComponent(edit))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtakhir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 688, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtjmlmhs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txthadir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttugas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtproyek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtuts, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtuas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtjmlmhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txthadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txttugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtproyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtuts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel12)
                    .addComponent(txtakhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(simpan)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double hadir, tugas, proyek, uts, uas, akhir,  nilai;
            String grade, hasil;
            hadir = Double.parseDouble(txthadir.getText());
            tugas = Double.parseDouble(txttugas.getText());
            proyek = Double.parseDouble(txtproyek.getText());
            uts = Double.parseDouble(txtuts.getText());
            uas = Double.parseDouble(txtuas.getText());
            nilai=(hadir*0.15)+(tugas*0.2)+(proyek*0.2)+(uts*0.2)+(uas*0.25);
            
             if(nilai > 85.00){
                txtgrade.setText("A");
            }else if( (nilai <= 85.0) && (nilai >= 81.0)){
                txtgrade.setText("A-");
            }else if( (nilai <= 80.0) && (nilai >= 76.0)){
                txtgrade.setText("B+");
            }else if(((nilai <= 75.0) && nilai >= 71.0)){
                txtgrade.setText("B");
            }else if((nilai <= 70.0) && (nilai >= 66.0)){
                txtgrade.setText("B-");
            }else if((nilai <= 65.0) && (nilai >= 61.0)){
                txtgrade.setText("C+");
            }else if((nilai <= 60.0) && (nilai >= 51.0)){
                txtgrade.setText("C");
            }else if((nilai <= 50.0) && (nilai >= 45.0)){
                txtgrade.setText("D");
            }else if(nilai <55.0){
                txtgrade.setText("E");
            }
             
            hasil=String.valueOf(nilai);
            txtakhir.setText(hasil);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
         try{ 
            String sql = "INSERT into nilaimahasiswa values('"+txtstambuk.getText()+"', "
                       + "'"+txtnama.getText()+"', '"+txthadir.getText()+"', "
                       + "'"+txttugas.getText()+"', '"+txtproyek.getText()+"', "
                       + "'"+txtuts.getText()+"', '"+txtuas.getText()+"', "
                       + "'"+txtakhir.getText()+"', '"+txtgrade.getText()+"')";
            java.sql.Connection conn =(Connection)Koneksii.getConnection();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
                JOptionPane.showMessageDialog(null, "Simpan Data...");
                setTable();
                kosongkan_data();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void nilaimahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nilaimahasiswaMouseClicked
        // TODO add your handling code here:
         int baris = nilaimahasiswa.rowAtPoint(evt.getPoint());
        String stambuk = nilaimahasiswa.getValueAt(baris, 0).toString();
        txtstambuk.setText(stambuk);
        String nama = nilaimahasiswa.getValueAt(baris, 1).toString();
        txtnama.setText(nama);
        String hadir = nilaimahasiswa.getValueAt(baris, 2).toString();
        txthadir.setText(hadir);
        String tugas = nilaimahasiswa.getValueAt(baris, 3).toString();
        txttugas.setText(tugas);
        String proyek = nilaimahasiswa.getValueAt(baris,4).toString();
        txtproyek.setText(proyek);
        String uts = nilaimahasiswa.getValueAt(baris, 5).toString();
        txtuts.setText(uts);
        String uas = nilaimahasiswa.getValueAt(baris, 6).toString();
        txtuas.setText(uas);
        String akhir = nilaimahasiswa.getValueAt(baris, 7).toString();
        txtakhir.setText(akhir);
        String grade = nilaimahasiswa.getValueAt(baris, 8).toString();
        txtgrade.setText(grade);
    }//GEN-LAST:event_nilaimahasiswaMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "UPDATE nilaimahasiswa set nama = '"+txtnama.getText()+"', hadir = '"+txthadir.getText()+"', tugas = '"+txttugas.getText()+"', proyek = '"+txtproyek.getText()+"', uts = '"+txtuts.getText()+"', uas = '"+txtuas.getText()+"', akhir = '"+txtakhir.getText()+"', grade = '"+txtgrade.getText()+"' where stambuk = '"+txtstambuk.getText()+"'";
            java.sql.Connection conn = (Connection)Koneksii.getConnection();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
             pstm.execute();
             JOptionPane.showMessageDialog(null, "Edit Data..");
         }catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(this, e.getMessage());
         }
        setTable();
        kosongkan_data();
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE from nilaimahasiswa where stambuk = '"+txtstambuk.getText()+"'";
            java.sql.Connection conn=(Connection)Koneksii.getConnection();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Hapus data..");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        setTable();
        kosongkan_data();
    }//GEN-LAST:event_hapusActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penilaian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton keluar;
    private javax.swing.JTable nilaimahasiswa;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField txtakhir;
    private javax.swing.JTextField txtgrade;
    private javax.swing.JTextField txthadir;
    private javax.swing.JTextField txtjmlmhs;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtproyek;
    private javax.swing.JTextField txtstambuk;
    private javax.swing.JTextField txttugas;
    private javax.swing.JTextField txtuas;
    private javax.swing.JTextField txtuts;
    // End of variables declaration//GEN-END:variables
}
