
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class UpdateEmployee extends javax.swing.JFrame {

    /**
     * Creates new form UpdateEmployee
     */
    public UpdateEmployee() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Update Employee");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel3.setText("name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel4.setText("fathername");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 180, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 180, -1));

        jButton2.setText("update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        jButton3.setText("update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        jLabel5.setText("phone number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 180, -1));

        jButton4.setText("update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 220, -1));

        jLabel6.setText("Empcode");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 590, 230));

        jButton5.setText("clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel2.setText("Post");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, -1));

        jButton1.setText("update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            String DOB=jTextField2.getText();
            int accno=Integer.parseInt(jTextField5.getText());
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","mysql");
            Statement stmt=con.createStatement();
            String query="update employee set name='"+DOB+"' where empcode='"+accno+"';";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"updated successfully");
            stmt.close();
            con.close();

        }      catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            String DOB=jTextField3.getText();
            int accno=Integer.parseInt(jTextField5.getText());
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","mysql");
            Statement stmt=con.createStatement();
            String query="update employee set fname='"+DOB+"' where empcode="+accno+"';";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"updated successfully");
            stmt.close();
            con.close();

        }      catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {

            String DOB=jTextField4.getText();
            int accno=Integer.parseInt(jTextField5.getText());
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","mysql");
            Statement stmt=con.createStatement();
            String query="update customer_single set phone='"+DOB+"' where empcode='"+accno+"';";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"updated successfully");
            stmt.close();
            con.close();

        }      catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {

            String DOB=jTextField1.getText();
            int accno=Integer.parseInt(jTextField5.getText());
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","mysql");
            Statement stmt=con.createStatement();
            String query="update customer_single set post='"+DOB+"' where empcode='"+accno+"';";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"updated successfully");
            stmt.close();
            con.close();

        }      catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployee().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
