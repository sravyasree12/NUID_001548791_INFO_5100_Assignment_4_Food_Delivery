/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Menu.Menu;
import Business.Menu.MenuDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sravya
 */
public class ManageMenu extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private MenuDirectory menuDirectory;
    private Restaurant restaurant;
    
    public ManageMenu(
            JPanel userProcessContainer, 
            UserAccount account, 
            EcoSystem ecoSystem, 
            RestaurantDirectory restaurantDirectory, 
            MenuDirectory menuDirectory) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.menuDirectory = ecoSystem.getMenuDirectory();
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblMenu2.getModel();
        dtm.setRowCount(0);
        for(Menu menu : menuDirectory.getMenuList()){
            if(menu.getRestaurantName().equals(account.getEmployee().getName())) {
                Object [] row = new Object[2];
                row[0] = menu;
                row[1] = menu.getPrice();
                dtm.addRow(row);
            }
        }
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
        tblMenu2 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();
        txtPrice2 = new javax.swing.JTextField();
        txtItemName2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMenu2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblMenu2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dish Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenu2.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblMenu2.setSelectionForeground(new java.awt.Color(102, 102, 255));
        jScrollPane1.setViewportView(tblMenu2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 470, 150));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\sravy\\OneDrive\\Pictures\\A4 pics\\back.png")); // NOI18N
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, 40));

        btnAdd2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAdd2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sravy\\OneDrive\\Pictures\\A4 pics\\icons8-add-64.png")); // NOI18N
        btnAdd2.setText("Add ");
        btnAdd2.setContentAreaFilled(false);
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });
        add(btnAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 100, -1));

        txtPrice2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPrice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice2ActionPerformed(evt);
            }
        });
        add(txtPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 141, -1));

        txtItemName2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtItemName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemName2ActionPerformed(evt);
            }
        });
        add(txtItemName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 141, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Price (in $)");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Dish Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Restaurant Menu");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sravy\\OneDrive\\Pictures\\A4 pics\\neudash-icon.png")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 160, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:
        if(txtItemName2.getText().isEmpty() || txtPrice2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Text Fields cannot be empty");
            return;
        }

        String dishName = txtItemName2.getText();
        double price;
        try {
            price = Double.parseDouble(txtPrice2.getText());

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Price must be of float or integer type");
            return;
        }

        String restaurant = account.getEmployee().getName();

        menuDirectory.addDish(dishName, price, restaurant);
        populateTable();
        JOptionPane.showMessageDialog(this, "Dish and price details added!", "Message", JOptionPane.OK_OPTION);
        txtItemName2.setText("");
        txtPrice2.setText("");

    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void txtPrice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice2ActionPerformed

    private void txtItemName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemName2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMenu2;
    private javax.swing.JTextField txtItemName2;
    private javax.swing.JTextField txtPrice2;
    // End of variables declaration//GEN-END:variables
}
