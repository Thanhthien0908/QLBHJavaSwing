
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thanh
 */
public class ExcuteData extends javax.swing.JFrame {
    
    String headers[] = {"IDHang","NameHang","Quality","Price","Typeof"};
    DefaultTableModel model = new DefaultTableModel(null, headers);
    /**
     * Creates new form ExcuteData
     */
    public ExcuteData() {
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

        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMa = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTen = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtQua = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPri = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtType = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");
        setLocation(new java.awt.Point(400, 100));

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("QUẢN LÝ BÁN HÀNG");

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel2.setText("Mã Hàng");

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel3.setText("Tên Hàng");

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel4.setText("Số Lượng");

        jLabel5.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel5.setText("Giá");

        jLabel6.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel6.setText("Loại Hàng");

        jScrollPane1.setViewportView(txtMa);

        jScrollPane2.setViewportView(txtTen);

        jScrollPane3.setViewportView(txtQua);

        jScrollPane4.setViewportView(txtPri);

        jScrollPane5.setViewportView(txtType);

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IDHang", "NameHang", "Quality", "Price", "Typeof"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBooksMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblBooks);

        jButton1.setText("Lấy dữ liệu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Xóa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Tìm Kiếm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(1, 1, 1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void LoadData(){
        
        Connection con;
        PreparedStatement ps;
        String s = "jdbc:sqlserver://localhost;databaseName=QLBH";
        try {
            con = DriverManager.getConnection(s,"sa","123");
            
            ps = con.prepareStatement("select * from HANG");
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("IDHang"));
                v.add(rs.getString("NameHang"));
                v.add(rs.getString("Quality"));
                v.add(rs.getString("Price"));
                v.add(rs.getString("Typeof"));
                model.addRow(v);
            }
            tblBooks.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //hien thi : v
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoadData();
    }//GEN-LAST:event_jButton1ActionPerformed
    // Them : v
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection con;
        PreparedStatement ps;
        String s = "jdbc:sqlserver://localhost;databaseName=QLBH";
        try {
            con = DriverManager.getConnection(s,"sa","123");
            
            ps = con.prepareStatement("insert into HANG values(?,?,?,?,?)");
            ps.setString(1,txtMa.getText().toString());
            ps.setString(2,txtTen.getText().toString());
            ps.setString(3,txtQua.getText().toString());
            ps.setString(4,txtPri.getText().toString());
            ps.setString(5,txtType.getText().toString());
            
            int rs = ps.executeUpdate();
            if(rs<0){
                JOptionPane.showMessageDialog(this, "Lỗi!","Error",2);
                
                }else{
                JOptionPane.showMessageDialog(this, "Thêm Tài Khoản Thành Công!","Thông báo",1);
                
            }
            model = new DefaultTableModel(null, headers);
            LoadData();
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //Tim Kiem : v
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Connection con;
        PreparedStatement ps;
        String s = "jdbc:sqlserver://localhost;databaseName=QLBH";
        
        try {
            con = DriverManager.getConnection(s,"sa","123");
            
            ps = con.prepareStatement("select * from HANG where IDHang like ?");
            ps.setString(1,"%" + txtMa.getText() + "%");
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                model = new DefaultTableModel(null, headers);
                Vector v = new Vector();
                v.add(rs.getString("IDHang"));
                v.add(rs.getString("NameHang"));
                v.add(rs.getString("Quality"));
                v.add(rs.getString("Price"));
                v.add(rs.getString("Typeof"));
                model.addRow(v);
            }
            
            tblBooks.setModel(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed


    //Xoa : v
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int row = tblBooks.getSelectedRow();
        if(row<0){JOptionPane.showMessageDialog(this, "Chua Chon");}
        else{model.removeRow(row);}
        
        

        Connection con;
        PreparedStatement ps;
        String s = "jdbc:sqlserver://localhost;databaseName=QLBH";
        try {
            con = DriverManager.getConnection(s,"sa","123");
            ps = con.prepareStatement("delete from HANG where IDHang=?");
            ps.setString(1,txtMa.getText().toString());
            
            int rs = ps.executeUpdate();
            if(rs<0){
                JOptionPane.showMessageDialog(this, "Lỗi!","Error",2);
                
                }else{
                JOptionPane.showMessageDialog(this, "Xóa Thành Công!","Thông báo",1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBooksMouseClicked
        // TODO add your handling code here:
        int row = tblBooks.getSelectedRow();
        if(row<0) return;
        txtMa.setText(tblBooks.getValueAt(row, 0).toString());
        txtTen.setText(tblBooks.getValueAt(row, 1).toString());
        txtQua.setText(tblBooks.getValueAt(row, 2).toString());
        txtPri.setText(tblBooks.getValueAt(row, 3).toString());
        txtType.setText(tblBooks.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tblBooksMouseClicked
    // Sua: v giống Thêm
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Connection con;
        PreparedStatement ps;
        String s = "jdbc:sqlserver://localhost;databaseName=QLBH";
        try {
            con = DriverManager.getConnection(s,"sa","123");
            
            ps = con.prepareStatement("update HANG set NameHang=? , Quality=? , Price=? , Typeof=? where IDHang=?");
            
            ps.setString(1,txtTen.getText().toString());
            ps.setString(2,txtQua.getText().toString());
            ps.setString(3,txtPri.getText().toString());
            ps.setString(4,txtType.getText().toString());
            ps.setString(5,txtMa.getText().toString());
            int rs = ps.executeUpdate();
            if(rs<0){
                JOptionPane.showMessageDialog(this, "Lỗi!","Error",2);
                
                }else{
                JOptionPane.showMessageDialog(this, "Sửa Tài Khoản Thành Công!","Thông báo",1);
                
            }
            model = new DefaultTableModel(null, headers);
            LoadData();
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ExcuteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcuteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcuteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcuteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcuteData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTextPane txtMa;
    private javax.swing.JTextPane txtPri;
    private javax.swing.JTextPane txtQua;
    private javax.swing.JTextPane txtTen;
    private javax.swing.JTextPane txtType;
    // End of variables declaration//GEN-END:variables
}
