

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount account;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
      
        lblRestName.setText(account.getUsername());
      
        //valueLabel.setText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnManageRestroInfo = new javax.swing.JButton();
        btnManageMenu = new javax.swing.JButton();
        btnManageOrder = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        lblRestName = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnManageRestroInfo.setBackground(new java.awt.Color(0, 0, 0));
        btnManageRestroInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRestroInfo.setText("Manage Restaurant Info");
        btnManageRestroInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestroInfoActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageRestroInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 260, -1));

        btnManageMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnManageMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnManageMenu.setText("Manage menu");
        btnManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 260, -1));

        btnManageOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnManageOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrder.setText("Manage Orders");
        btnManageOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrderActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 260, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        jPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        lblRestName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRestName.setText("<value>");
        jPanel1.add(lblRestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageRestroInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestroInfoActionPerformed
        // TODO add your handling code here:
        ManageRestroInfo manageRestroJPanel = new ManageRestroInfo(userProcessContainer, account, ecosystem);
        userProcessContainer.add("ManageRestroInfo", manageRestroJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRestroInfoActionPerformed

    private void btnManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenuActionPerformed
        ManageMenu managemenuJPanel = new ManageMenu(userProcessContainer, account, ecosystem);
        userProcessContainer.add("ManageMenu", managemenuJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageMenuActionPerformed

    private void btnManageOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrderActionPerformed
        ManageOrders manageorderJPanel = new ManageOrders(userProcessContainer, account, ecosystem);
        userProcessContainer.add("ManageOrders", manageorderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrderActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageMenu;
    private javax.swing.JButton btnManageOrder;
    private javax.swing.JButton btnManageRestroInfo;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRestName;
    // End of variables declaration//GEN-END:variables
    
}
