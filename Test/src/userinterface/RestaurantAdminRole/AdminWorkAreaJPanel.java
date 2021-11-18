

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
    
    EcoSystem system;
    UserAccount account;
    JPanel userProcessContainer;
    
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        this.account=account;
        
   
        //valueLabel.setText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("My Work Area - Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        userJButton.setBackground(new java.awt.Color(255, 255, 153));
        userJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userJButton.setForeground(new java.awt.Color(0, 102, 102));
        userJButton.setText("Manage Restaurant Info");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 210, 60));

        manageEmployeeJButton.setBackground(new java.awt.Color(255, 255, 153));
        manageEmployeeJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(0, 102, 102));
        manageEmployeeJButton.setText("Manage Menu");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 210, 50));

        manageOrganizationJButton.setBackground(new java.awt.Color(255, 255, 153));
        manageOrganizationJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(0, 102, 102));
        manageOrganizationJButton.setText("Manage Orders");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 210, 50));

        enterpriseLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, 30));

        valueLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(0, 102, 102));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        ManageInfo manageInfo=new ManageInfo(userProcessContainer,account,system);
        userProcessContainer.add("Manage Info",manageInfo);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);       
        
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        ManageMenu manageMenu=new ManageMenu(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageMenu);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageOrders manageOrder=new ManageOrders(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageOrder);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
