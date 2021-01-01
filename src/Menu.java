
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
 * @author jatin
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        hp();
        
    }
    
    
    public void hp() {
        
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms", "root", "");
                PreparedStatement ps = con.prepareStatement("SELECT * FROM menu");
                ResultSet rs = ps.executeQuery();
                while(rs.next())   {
                    String dishId = rs.getString("dish_id");
                    String nam = rs.getString("dish");
                    String pr = rs.getString("price");
                    String cat = rs.getString("category");
                    //int sal = rs.getInt("sal");
                    
                    model.addRow(new Object[] {dishId, cat, nam, pr});
                }
                        
            } catch (SQLException ex) {
                Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                //jTextField4.setText("");
                jTextField3.setText("");
                jTextField2.setText("");
                jComboBox1.setSelectedIndex(0);
        
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jTable1.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item ID", "Item Category", "Item Name", "Rate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jLabel2.setText("Menu");

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BABA KA DHABA");

        jTextField1.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Rate :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Item Name :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Item Category :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Starters", "Seafood", "Mains", "Specials", "Rice", "Bread", "Desserts" }));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setText("Insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Starters", "Seafood", "Mains", "Specials", "Rice", "Bread", "Desserts" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, 0, 300, Short.MAX_VALUE)
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Options().setVisible(true);
        this.dispose();//to close the current jframe
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name =  jTextField1.getText();
        
        hp();
        
        
        DefaultTableModel model = (DefaultTableModel)
        jTable1.getModel();
        int rows=model.getRowCount();
        if (rows>0) {
            for (int i=0; i<rows; i++)
            model.removeRow(0);  // To remove all rows from
        }
        
        
            
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms", "root", "");
                PreparedStatement ps = con.prepareStatement("SELECT * FROM menu WHERE dish LIKE ?");
                ps.setString(1, "%" + name + "%");
                ResultSet rs = ps.executeQuery();
                
                while(rs.next())   {
                    String dishId = rs.getString("dish_id");
                    String nam = rs.getString("dish");
                    String cat = rs.getString("category");
                    String pr = rs.getString("price");
                    model.addRow(new Object[] {dishId, cat, nam, pr});
                }
            } catch (SQLException ex) {
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not initialized : ");
            System.out.println(ex);
        }
        
        String filter = (String)jComboBox2.getSelectedItem();
        
        int n = jTable1.getRowCount();
        
        if(filter.equals("All"))   {
            return;
        }
        for(int i = 0; i < n; i++)  {
            if(!jTable1.getValueAt(i, 1).toString().equals(filter)) {
                model.removeRow(i);
                n--;
                i--;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() >= 0) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms", "root", "");
                    PreparedStatement ps = con.prepareStatement("UPDATE menu SET dish = ?, price = ?, category = ? WHERE dish_id = ?");
                    
                    String dishID = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                    String nam = jTextField3.getText();
                    if(nam.isEmpty())   {
                        JOptionPane.showMessageDialog(this, "Please enter Name");
                        return;
                    }
                    String price = jTextField2.getText();
                    if(price.isEmpty())   {
                        JOptionPane.showMessageDialog(this, "Please enter Price");
                        return;
                    }
                    String cate = (String)jComboBox1.getSelectedItem();
                    if(cate.equals("-Select-")) {
                        JOptionPane.showMessageDialog(this, "Please select a category");
                        return;
                    }
                    /*String cate = new String();
                    int cat = jComboBox1.getSelectedIndex();
                    switch(cat) {
                        case 0: 
                            JOptionPane.showMessageDialog(this, "Please select a category");
                            break;
            
                        case 1:
                            cate = "Starters";
                            break;
            
                        case 2:
                            cate = "Seafood";
                            break;
            
                        case 3:
                            cate = "Mains";
                            break;
            
                        case 4:
                            cate = "Specials";
                            break;
            
                        case 5:
                            cate = "Rice";
                            break;
            
                        case 6:
                            cate = "Bread";
                            break;
                
                        case 7:
                            cate = "Desserts";
                            break;
                    }*/
                    
                    //if(!price.isEmpty() && !nam.isEmpty())  {
                    ps.setString(1, nam);
                    ps.setString(2, price);
                    ps.setString(3, cate);
                    ps.setString(4, dishID);
                    
                    ps.execute();
                    hp();
                    //}
                } catch (SQLException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else    {
            JOptionPane.showMessageDialog(this, "Please select an Item to be updated");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //String itemId = jTextField4.getText();
        /*int cat = jComboBox1.getSelectedIndex();
        String cate = new String();
        if(itemId.isEmpty())    {
            JOptionPane.showMessageDialog(this,"Please enter an Item ID");
            return;
        }
        switch(cat) {
            case 0: 
                JOptionPane.showMessageDialog(this, "Please select a category");
                return;
            
            case 1:
                cate = "Starters";
                break;
            
            case 2:
                cate = "Seafood";
                break;
            
            case 3:
                cate = "Mains";
                break;
            
            case 4:
                cate = "Specials";
                break;
            
            case 5:
                cate = "Rice";
                break;
            
            case 6:
                cate = "Bread";
                break;
                
            case 7:
                cate = "Desserts";
                break;
            
                
        }*/
        String cate = (String)jComboBox1.getSelectedItem();
        String name = jTextField3.getText();
        
        if(cate.equals("-Select-")) {
            JOptionPane.showMessageDialog(this,"Please select category");
            return;
        }
        if(name.isEmpty())    {
            JOptionPane.showMessageDialog(this,"Please enter a name");
            return;
        }
        String price = jTextField2.getText();
        if(price.isEmpty())    {
            JOptionPane.showMessageDialog(this,"Please enter Price");
            return;
        }
        
        
        
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms", "root", "");
                /*PreparedStatement ps1 = con.prepareStatement("SELECT dish_id FROM menu WHERE dish_id = ?");
                ps1.setString(1, itemId);
                ResultSet rs = ps1.executeQuery();
                */
                //if(!rs.next())  {
                PreparedStatement ps = con.prepareStatement("INSERT INTO menu (dish, price, category) VALUES(?, ?, ?)");
                ps.setString(3, cate);
                ps.setString(1, name);
                ps.setString(2, price);
                ps.execute();
                
                JOptionPane.showMessageDialog(this, "Record Inserted successfully");
                hp();
                /*}
                
                else    {
                    JOptionPane.showMessageDialog(this, "Item ID already exists");
                
                }*/
                
                
            } catch (SQLException ex) {
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not initialized : ");
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int r = jTable1.getSelectedRow();
        if(r >= 0)   {
            //jTextField4.setText(jTable1.getValueAt(r,0).toString());
            jTextField3.setText(jTable1.getValueAt(r,2).toString());
            jTextField2.setText(jTable1.getValueAt(r,3).toString());
            
            switch(jTable1.getValueAt(r, 1).toString()) {
                case "Starters" :
                    jComboBox1.setSelectedIndex(1);
                    break;
                
                case "Seafood" :
                    jComboBox1.setSelectedIndex(2);
                    break;
                
                case "Mains" :
                    jComboBox1.setSelectedIndex(3);
                    break;
                
                case "Specials" :
                    jComboBox1.setSelectedIndex(4);
                    break;
                
                case "Rice" :
                    jComboBox1.setSelectedIndex(5);
                    break;
                
                case "Bread" :
                    jComboBox1.setSelectedIndex(6);
                    break;
                    
                case "Desserts" :
                    jComboBox1.setSelectedIndex(7);
                    break;
                
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int s = jTable1.getSelectedRow();
        if(s != -1) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms", "root", "");
                PreparedStatement ps = con.prepareStatement("DELETE FROM menu WHERE dish_id = ?");
                String k = jTable1.getValueAt(s, 0).toString();
                ps.setString(1, k);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Selected row deleted successfully");
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        hp();
        }
        else    {
               JOptionPane.showMessageDialog(this, "Please select a row");
        }
            
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
