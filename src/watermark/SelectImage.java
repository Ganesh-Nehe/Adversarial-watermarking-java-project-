
package watermark;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class SelectImage extends javax.swing.JFrame {

   
    public SelectImage() {
        initComponents();
        this.setLocationRelativeTo(null);
        jComboBox_Opacity.setModel(new DefaultComboBoxModel<>(new Float[]{
            0.1f,0.2f,0.3f,0.4f
        }));
        jComboBox_Color.setModel(new DefaultComboBoxModel<>(new String[]{
            "BLACK","RED","ORANGE","BLUE","GREEN","WHITE","GRAY","BROWN","PINK","VIOLET","YELLOW","CYAN"
        }));
        jComboBox_Size.setModel(new DefaultComboBoxModel<>(new Integer[]{
            10,20,30,40,50,60,70,80,90,100,110,120,130,140,150
        }));
        jComboBox_cntrX.setModel(new DefaultComboBoxModel<>(new Integer[]{
            -500,-450,-400,350,-300,-250,-200,-150,-100,-50,0,50,100,150,200,250,300,350,400,450,500
        }));
        jComboBox_cntrY.setModel(new DefaultComboBoxModel<>(new Integer[]{
            -500,-450,-400,350,-300,-250,-200,-150,-100,-50,0,50,100,150,200,250,300,350,400,450,500,550,600,650,700
        })); 
        jComboBox_Rotation.setModel(new DefaultComboBoxModel<>(new String[]{
            "Straight","Rotate"
        }));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox_Opacity = new javax.swing.JComboBox();
        jComboBox_Size = new javax.swing.JComboBox();
        jComboBox_cntrX = new javax.swing.JComboBox();
        jComboBox_cntrY = new javax.swing.JComboBox();
        jComboBox_Color = new javax.swing.JComboBox();
        jComboBox_Rotation = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setForeground(new java.awt.Color(0, 102, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Image Processing");

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cross (1).png"))); // NOI18N
        jButton5.setToolTipText("Close");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 632, Short.MAX_VALUE)
                .addComponent(jButton5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-folder-20.png"))); // NOI18N
        jButton1.setText("Select Folder");
        jButton1.setActionCommand("....");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, 30));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 590, 30));

        jLabel1.setText("Input Folder");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 20));

        jLabel2.setText("Watermark");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 20));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 590, 30));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 590, 30));

        jLabel3.setText("Output Folder");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 20));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-folder-20.png"))); // NOI18N
        jButton3.setText("Select Folder");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, 30));

        jButton4.setBackground(new java.awt.Color(0, 102, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-ok-20.png"))); // NOI18N
        jButton4.setText("Finish");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 760, 40));

        jComboBox_Opacity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_OpacityItemStateChanged(evt);
            }
        });
        jComboBox_Opacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_OpacityActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_Opacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jPanel1.add(jComboBox_Size, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jPanel1.add(jComboBox_cntrX, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jPanel1.add(jComboBox_cntrY, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jPanel1.add(jComboBox_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 70, -1));

        jPanel1.add(jComboBox_Rotation, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jLabel5.setText("Size : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 20));

        jLabel6.setText("Opacity : ");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, 20));

        jLabel7.setText("Rotation : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, 20));

        jLabel8.setText("X-cor :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        jLabel9.setText("Y-cor : ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jLabel10.setText("Color : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 430));

        setBounds(0, 0, 810, 424);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser("C:\\");
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setDialogTitle("Choose a folder");
        if(chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            File currentfile = chooser.getSelectedFile();
            jTextField1.setText(String.valueOf(currentfile));
        }
        else{
            System.out.println("No selection.... Try again!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
          new Watermark().showFiles(new File(jTextField1.getText()),jTextField2.getText(), jTextField3.getText(), (Float) jComboBox_Opacity.getSelectedItem(), (String) jComboBox_Color.getSelectedItem(), (Integer) jComboBox_Size.getSelectedItem(),(Integer) jComboBox_cntrX.getSelectedItem(),(Integer) jComboBox_cntrY.getSelectedItem(),(String) jComboBox_Rotation.getSelectedItem());
          JOptionPane.showMessageDialog(null, "Please wait....");
          Desktop.getDesktop().open(new File(jTextField3.getText()));  
        } catch (IOException ex) {
            Logger.getLogger(SelectImage.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser chooser = new JFileChooser("C:\\" + "\\");
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setDialogTitle("Choose a folder");
        if(chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            File currentfile = chooser.getSelectedFile();
            jTextField3.setText(String.valueOf(currentfile + "\\"));
        }
        else{
            System.out.println("No selection.... Try again!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox_OpacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_OpacityActionPerformed
       /* try {
          new Watermark().showFiles(new File(jTextField1.getText()),jTextField2.getText(), jTextField3.getText());
         // JOptionPane.showMessageDialog(null, "Please wait....");
          Desktop.getDesktop().open(new File(jTextField3.getText()));  
        } catch (IOException ex) {
            Logger.getLogger(SelectImage.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
    }//GEN-LAST:event_jComboBox_OpacityActionPerformed

    private void jComboBox_OpacityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_OpacityItemStateChanged
        String opacity = jComboBox_Opacity.getSelectedItem().toString();
        jComboBox_Opacity.setSelectedItem(opacity);
    }//GEN-LAST:event_jComboBox_OpacityItemStateChanged
/*  */  
    
    public static void main(String args[]) {
        
        try{
        for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
            if("windows".equals(info.getName())){
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(SelectImage.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(SelectImage.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(SelectImage.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(SelectImage.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectImage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox_Color;
    private javax.swing.JComboBox jComboBox_Opacity;
    private javax.swing.JComboBox jComboBox_Rotation;
    private javax.swing.JComboBox jComboBox_Size;
    private javax.swing.JComboBox jComboBox_cntrX;
    private javax.swing.JComboBox jComboBox_cntrY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
