/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import javax.swing.table.DefaultTableModel;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;
/**
 *
 * @author vinithiteshharsora
 */

public class viewAbnormalCases extends javax.swing.JPanel {

    /**
     * Creates new form viewAbnormalCases
     */
    PatientDirectory abnormalDirectory;
    EncounterHistory abnormalEncounters;
    PersonDirectory personDirectory;
    public viewAbnormalCases(PatientDirectory abnormalCases, EncounterHistory encounterHistory, PersonDirectory personDirectory) {
        initComponents();
        this.abnormalDirectory = abnormalCases;
        this.abnormalEncounters = encounterHistory;
        this.personDirectory = personDirectory;
        lblTotal.setText(String.valueOf(this.personDirectory.getPersonList().size()));
        populateTable();
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
        tblAbnormalCases = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboBoxSearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCases = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jABC = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        tblAbnormalCases.setBackground(new java.awt.Color(255, 204, 255));
        tblAbnormalCases.setForeground(new java.awt.Color(255, 0, 51));
        tblAbnormalCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PatientID", "First Name", "Last Name", "Age", "Community", "City", "House"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAbnormalCases);

        jLabel1.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("Community:");

        comboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","MALDEN", "HUNTINGTON" }));
        comboBoxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 153, 102));
        btnSearch.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(153, 153, 0));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 0));
        jLabel2.setText("TOTAL POPULATION");

        lblCases.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N

        lblTotal.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(153, 153, 0));

        jABC.setFont(new java.awt.Font("Didot", 3, 24)); // NOI18N
        jABC.setForeground(new java.awt.Color(153, 153, 0));
        jABC.setText("Abnormal Case Views");
        jABC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCases)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(249, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jABC, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jABC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(lblCases, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, lblCases, lblTotal});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchItem = comboBoxSearch.getSelectedItem().toString();
        PatientDirectory abPatientDirectory = new PatientDirectory();
        for(Patient abPatient : abnormalDirectory.getPatientList()){
        if(abPatient.getPatientcommunity()!= null && abPatient.getPatientcommunity().contains(searchItem)){
            abPatientDirectory.addNewPatient(abPatient);
        }
        populateSearchTable(abPatientDirectory);        
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void comboBoxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboBoxSearch;
    private javax.swing.JLabel jABC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCases;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblAbnormalCases;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       DefaultTableModel model = (DefaultTableModel) tblAbnormalCases.getModel();
        model.setRowCount(0);
        for (Patient patient: abnormalDirectory.getPatientList()){
        Object[] row = new Object[7];
        row[0] = patient;
        row[1] = patient.getPatientfirstname();
        row[2] = patient.getPatientlastname();
        row[3] = patient.getPatientage();
        row[4] = patient.getPatientcommunity();
        row[5] = patient.getPatientcity();
        row[6] = patient.getPatienthouse();
        model.addRow(row);
    }
}

    private void populateSearchTable(PatientDirectory abPatientDirectory) {
        DefaultTableModel model = (DefaultTableModel) tblAbnormalCases.getModel();
        model.setRowCount(0);
        for (Patient patient: abPatientDirectory.getPatientList()){
        Object[] row = new Object[7];
        row[0] = patient;
        row[1] = patient.getPatientfirstname();
        row[2] = patient.getPatientlastname();
        row[3] = patient.getPatientage();
        row[4] = patient.getPatientcommunity();
        row[5] = patient.getPatientcity();
        row[6] = patient.getPatienthouse();
        model.addRow(row);
        
        }
    }
        
}
