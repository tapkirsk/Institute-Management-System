/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */import java.sql.*;
 import javax.swing.*;
public class Student_update extends javax.swing.JFrame {

    /**
     * Creates new form Student_update
     */
    public Student_update() {
        initComponents();
        fillCombo();
 fillCombo1();
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sq = new javax.swing.JTextField();
        smno = new javax.swing.JTextField();
        scourse = new javax.swing.JComboBox<>();
        sadmission = new datechooser.beans.DateChooserCombo();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        saddress = new javax.swing.JTextArea();
        sgender = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jc1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        sdob = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Qualification");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 550, 83, -1));

        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 439, -1, -1));

        jLabel8.setText("Admission date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 408, -1, -1));

        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 513, -1, -1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 624, 90, 36));

        jLabel9.setText("Student Id");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 376, -1, -1));

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 425, -1, -1));
        getContentPane().add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 422, 272, -1));

        sid.setEditable(false);
        getContentPane().add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 373, 272, -1));

        jLabel2.setText("DOB");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 471, 41, -1));
        getContentPane().add(sq, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 547, 272, -1));
        getContentPane().add(smno, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 311, 271, -1));

        scourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select course" }));
        getContentPane().add(scourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 360, 271, -1));
        getContentPane().add(sadmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 402, 271, -1));

        jLabel7.setText("Course Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 363, -1, -1));

        jLabel6.setText("Mobileno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 314, -1, -1));

        saddress.setColumns(20);
        saddress.setRows(5);
        jScrollPane1.setViewportView(saddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 439, 271, -1));
        getContentPane().add(sgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 510, 272, -1));

        jLabel10.setText("Select Student");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 317, -1, -1));

        jc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Student" }));
        jc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc1ActionPerformed(evt);
            }
        });
        getContentPane().add(jc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 311, 272, -1));

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 624, 87, 36));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 390, 250));
        getContentPane().add(sdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 470, 272, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentbackground.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fillCombo1()
    {
         try
        {
            scourse.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute","root","1761");
            Statement stmt;
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from course");
            while(rs.next())
            {
                scourse.addItem(rs.getString(2));
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
    }  
    }
     public void fillCombo()
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute","root","1761");
            Statement stmt;
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next())
            {
                jc1.addItem(rs.getString(2));
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
    }  
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute","root","1761");
            PreparedStatement stmt1;
            stmt1=conn.prepareStatement("update student set studid=?, name=?,bdate=?,adate=?,address=?,mobile=?,gender=?,course=?,qualification=? where student.name='"+jc1.getSelectedItem()+"'");
            stmt1.setInt(1,(Integer.parseInt(sid.getText())));
            stmt1.setString(2,sname.getText());
            stmt1.setString(3,sdob.getText());
            stmt1.setString(4,sadmission.getText());
            stmt1.setString(5,saddress.getText());
            stmt1.setString(6,(smno.getText()));
            stmt1.setString(7,sgender.getText());
            
            stmt1.setString(8,scourse.getSelectedItem().toString());
            stmt1.setString(9,sq.getText());
            stmt1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");
            stmt1.close();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc1ActionPerformed
       
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute","root","1761");
            Statement stmt1;
            stmt1=conn.createStatement();
            ResultSet rs;
            rs=stmt1.executeQuery("select * from student  where student.name='"+jc1.getSelectedItem()+"'");
            if(rs.next())
            {
                sid.setText(String.valueOf(rs.getInt(1)));
                sname.setText(rs.getString(2));
                sdob.setText(String.valueOf(rs.getInt(3)));
                sadmission.setText(String.valueOf(rs.getInt(4)));
                saddress.setText(rs.getString(5));
                smno.setText(String.valueOf(rs.getInt(6)));
                sgender.setText(rs.getString(7));
                //fillCombo1();
                scourse.addItem(rs.getString(8));
                 // fillCombo1();
                sq.setText(rs.getString(9));
            
            }
            stmt1.close();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
    } 
    }//GEN-LAST:event_jc1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();
home h=new home();
h.setSize(h.getSize());
h.show();        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JTextArea saddress;
    private datechooser.beans.DateChooserCombo sadmission;
    private javax.swing.JComboBox<String> scourse;
    private javax.swing.JTextField sdob;
    private javax.swing.JTextField sgender;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField smno;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sq;
    // End of variables declaration//GEN-END:variables
}
