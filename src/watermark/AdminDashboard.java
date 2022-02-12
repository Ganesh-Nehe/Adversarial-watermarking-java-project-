/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watermark;

//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Component;
import java.sql.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.cell.CheckBoxTableCell;
import javax.swing.Action;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton_ViewUsers = new javax.swing.JButton();
        jButton_ApprovedUsers = new javax.swing.JButton();
        jButton_NonApprovedUsers = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Records = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Panel");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cross (1).png"))); // NOI18N
        jButton1.setToolTipText("Close");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 153));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minus.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(251, 251, 251)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText(" Welcome, Admin");

        jButton_ViewUsers.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_ViewUsers.setText("View Users");
        jButton_ViewUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_ViewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ViewUsersActionPerformed(evt);
            }
        });

        jButton_ApprovedUsers.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_ApprovedUsers.setText("Approved User");
        jButton_ApprovedUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_ApprovedUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ApprovedUsersActionPerformed(evt);
            }
        });

        jButton_NonApprovedUsers.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_NonApprovedUsers.setText("UnApproved Users");
        jButton_NonApprovedUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_NonApprovedUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NonApprovedUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_ViewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_ApprovedUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton_NonApprovedUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_ViewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_ApprovedUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_NonApprovedUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 253, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("   Welcome, Admin");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 130, 450));

        jTable_Records.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Username", "Password", "Birth Date", "Address", "Approval"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Records.setRowHeight(30);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable_Records, org.jdesktop.beansbinding.ELProperty.create("${cellSelectionEnabled}"), jTable_Records, org.jdesktop.beansbinding.BeanProperty.create("cellSelectionEnabled"));
        bindingGroup.addBinding(binding);

        jTable_Records.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_RecordsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Records);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 680, 450));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ViewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ViewUsersActionPerformed
        ((DefaultTableModel)jTable_Records.getModel()).setNumRows(0);
        DefaultTableModel model = (DefaultTableModel)jTable_Records.getModel();
//        if (jTable_Records.getSelectedRow() != -1) {
//            model.removeRow(jTable_Records.getSelectedRow());
//        }
        try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","123456");
            
        Statement stmt = con.createStatement();
        //PreparedStatement ps;
        
        
        String query = "select * from the_users";
        //rs = st.executeQuery("select * from the_users") ;
        ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String fname = rs.getString("u_fname");
                String lname = rs.getString("u_lname");
                String uname = rs.getString("u_uname");
                String pass = rs.getString("u_pass");
                String bdate = rs.getString("u_date");
                String address = rs.getString("u_address");
                Boolean approval = rs.getBoolean("approval");
                
                model.addRow(new Object[]{fname,lname,uname,pass,bdate,address,approval});
                
                
               JCheckBox checkbox = new JCheckBox();
        checkbox.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
       try {     
        //DefaultTableModel model = (DefaultTableModel)jTable_Records.getModel(); 
        //model.setValueAt(table, WIDTH, WIDTH);
        Boolean approval = checkbox.isSelected();
        System.out.println(approval);
        //Vector v = new Vector();
        if(checkbox.isSelected()== true){
           // v.add(true);
            PreparedStatement ps;
            System.out.println(approval);
            String query = "update the_users set approval = true where u_fname=?";  
            
            
            ps = DBConnection.getConnection().prepareStatement(query);
            
            ps.setBoolean(7, approval);
            ps.execute();
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Updated Successfully...!");
            }
        }
        else{
            
        }    
        } catch (SQLException ex) {
           // Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
      }
      });
               
                
//                if(true){}
//                String query1 = "update the_users set approval=true";
//                
//                PreparedStatement ps = DBConnection.getConnection().prepareStatement(query1);
//                ps.setBoolean(7, true);
//                
//                if(approval.equals(true)){
//                    SelectImage image = new SelectImage();
//                    image.setVisible(true);
//                }//                if(true){}
//                String query1 = "update the_users set approval=true";
//                
//                PreparedStatement ps = DBConnection.getConnection().prepareStatement(query1);
//                ps.setBoolean(7, true);
//                
//                if(approval.equals(true)){
//                    SelectImage image = new SelectImage();
//                    image.setVisible(true);
//                }
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_ViewUsersActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton_ApprovedUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ApprovedUsersActionPerformed
        ((DefaultTableModel)jTable_Records.getModel()).setNumRows(0);
        DefaultTableModel model = (DefaultTableModel)jTable_Records.getModel();
//        if (jTable_Records.getSelectedRow() != -1) {
//            model.removeRow(jTable_Records.getSelectedRow());
//        }
        try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","123456");
            
        Statement stmt = con.createStatement();
        
        String query = "select * from the_users where approval='true'";
        
        ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String fname = rs.getString("u_fname"); 
                String lname = rs.getString("u_lname");
                String uname = rs.getString("u_uname");
                String pass = rs.getString("u_pass");
                String bdate = rs.getString("u_date");
                String address = rs.getString("u_address");
                Boolean approval = rs.getBoolean("approval");
                
                model.addRow(new Object[]{fname,lname,uname,pass,bdate,address,approval});
                
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_ApprovedUsersActionPerformed

    private void jButton_NonApprovedUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NonApprovedUsersActionPerformed
//            jTable_Records.setModel(new DefaultTableModel());
            ((DefaultTableModel)jTable_Records.getModel()).setNumRows(0); 
            DefaultTableModel model = (DefaultTableModel)jTable_Records.getModel();
//            if (jTable_Records.getSelectedRow() != -1) {
//                model.removeRow(jTable_Records.getSelectedRow());
//            }
            try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","123456");
            
        Statement stmt = con.createStatement();
        
        String query = "select * from the_users where approval='false'";
        
        ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String fname = rs.getString("u_fname"); 
                String lname = rs.getString("u_lname");
                String uname = rs.getString("u_uname");
                String pass = rs.getString("u_pass");
                String bdate = rs.getString("u_date");
                String address = rs.getString("u_address");
                Boolean approval = rs.getBoolean("approval");
                
                model.addRow(new Object[]{fname,lname,uname,pass,bdate,address,approval});
               
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_NonApprovedUsersActionPerformed


    
    
    private void jTable_RecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_RecordsMouseClicked
        String fname = jTable_Records.getValueAt(jTable_Records.getSelectedRow(), 0).toString();
        String approval = jTable_Records.getValueAt(jTable_Records.getSelectedRow(), 6).toString();
       //if(approval=="true"){
           try {
               PreparedStatement ps;
               System.out.println(approval);
               String query = "update the_users set approval = ? where u_fname = ?";
               ps = DBConnection.getConnection().prepareStatement(query);
               ps.setString(1, approval);
               ps.setString(2, fname);

               
               ps.executeUpdate();
               ps.close();

           } catch (SQLException ex) {
               Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
           }
       //} 
           if(approval=="true"){
                JOptionPane.showMessageDialog(this, "Approved...!", "Approval", JOptionPane.INFORMATION_MESSAGE);
            }
           else{
               JOptionPane.showMessageDialog(this, "Disapproved...!", "Approval", JOptionPane.INFORMATION_MESSAGE);
           }
       
    }//GEN-LAST:event_jTable_RecordsMouseClicked

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton_ApprovedUsers;
    private javax.swing.JButton jButton_NonApprovedUsers;
    private javax.swing.JButton jButton_ViewUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Records;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}