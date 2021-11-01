/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author vinithiteshharsora
 */

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.VitalSign;


public class viewPatientDirectory extends javax.swing.JPanel {

    /**
     * Creates new form viewPatientDirectory
     */
    PatientDirectory patientDirectory;
    EncounterHistory encounterHistory;
    EncounterHistory abnormalEncounters;
    PatientDirectory abnormalPatients;
    public viewPatientDirectory(PatientDirectory patientDirectory, EncounterHistory encounterHistory,PatientDirectory abnormalPatients, EncounterHistory abnormalEncounters) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        this.abnormalEncounters = abnormalEncounters;
        this.abnormalPatients = abnormalPatients;
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
        tblPatientDirectory = new javax.swing.JTable();
        lblBloodPressure = new javax.swing.JLabel();
        lblRespiratoryRate = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        txtRespiratoryRate = new javax.swing.JTextField();
        lblPatientID = new javax.swing.JLabel();
        lblTxtPatID = new javax.swing.JLabel();
        btnSaveDetails = new javax.swing.JButton();
        btnAddVitals = new javax.swing.JButton();
        btnViewHistory = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatientHistory = new javax.swing.JTable();
        lblBloodError = new javax.swing.JLabel();
        lblRespiratoryRateError = new javax.swing.JLabel();
        jPatientDatabase = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        tblPatientDirectory.setBackground(new java.awt.Color(255, 204, 204));
        tblPatientDirectory.setForeground(new java.awt.Color(0, 153, 153));
        tblPatientDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "First Name", "Last Name", "Age", "City", "Community", "House Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatientDirectory);

        lblBloodPressure.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblBloodPressure.setForeground(new java.awt.Color(153, 153, 0));
        lblBloodPressure.setText("Blood Pressure");

        lblRespiratoryRate.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblRespiratoryRate.setForeground(new java.awt.Color(153, 153, 0));
        lblRespiratoryRate.setText("Respiratory Rate");

        txtBloodPressure.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        txtBloodPressure.setForeground(new java.awt.Color(153, 153, 0));
        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });
        txtBloodPressure.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBloodPressureKeyReleased(evt);
            }
        });

        txtRespiratoryRate.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        txtRespiratoryRate.setForeground(new java.awt.Color(153, 153, 0));
        txtRespiratoryRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRespiratoryRateKeyReleased(evt);
            }
        });

        lblPatientID.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblPatientID.setForeground(new java.awt.Color(153, 153, 0));
        lblPatientID.setText("Patient ID");

        lblTxtPatID.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblTxtPatID.setForeground(new java.awt.Color(102, 102, 102));

        btnSaveDetails.setBackground(new java.awt.Color(153, 204, 0));
        btnSaveDetails.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnSaveDetails.setForeground(new java.awt.Color(153, 153, 0));
        btnSaveDetails.setText("Save");
        btnSaveDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDetailsActionPerformed(evt);
            }
        });

        btnAddVitals.setBackground(new java.awt.Color(153, 204, 0));
        btnAddVitals.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnAddVitals.setForeground(new java.awt.Color(153, 153, 0));
        btnAddVitals.setText("Add Vitals");
        btnAddVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalsActionPerformed(evt);
            }
        });

        btnViewHistory.setBackground(new java.awt.Color(153, 204, 0));
        btnViewHistory.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnViewHistory.setForeground(new java.awt.Color(153, 153, 0));
        btnViewHistory.setText("View History");
        btnViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHistoryActionPerformed(evt);
            }
        });

        tblPatientHistory.setBackground(new java.awt.Color(204, 255, 204));
        tblPatientHistory.setForeground(new java.awt.Color(51, 51, 0));
        tblPatientHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Encounter No", "Blood Pressure", "Respiratory Rate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPatientHistory);

        lblBloodError.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblBloodError.setForeground(new java.awt.Color(0, 102, 0));

        lblRespiratoryRateError.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblRespiratoryRateError.setForeground(new java.awt.Color(0, 102, 0));

        jPatientDatabase.setFont(new java.awt.Font("Didot", 3, 24)); // NOI18N
        jPatientDatabase.setForeground(new java.awt.Color(153, 153, 0));
        jPatientDatabase.setText("Patient Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddVitals))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPatientID)
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(lblTxtPatID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblRespiratoryRate)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnSaveDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBloodError, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblRespiratoryRateError, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(98, 98, 98))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jPatientDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblPatientID, lblRespiratoryRate});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBloodPressure, txtRespiratoryRate});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBloodError, lblRespiratoryRateError});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPatientDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddVitals)
                    .addComponent(btnViewHistory))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientID)
                    .addComponent(lblTxtPatID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBloodPressure)
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRespiratoryRate))
                                .addGap(50, 50, 50)
                                .addComponent(btnSaveDetails))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRespiratoryRateError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblBloodError, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBloodError, lblBloodPressure, lblRespiratoryRate, lblRespiratoryRateError, txtBloodPressure, txtRespiratoryRate});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblPatientID, lblTxtPatID});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatientDirectory.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPatientDirectory.getModel();
        System.out.println(model.getValueAt(selectedRowIndex, 0));
        Patient patient = (Patient) model.getValueAt(selectedRowIndex , 0);
        
        lblTxtPatID.setText(Integer.toString(patient.getPatientid()));
    }//GEN-LAST:event_btnAddVitalsActionPerformed

    private void btnSaveDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDetailsActionPerformed
        // TODO add your handling code here:
         if(txtRespiratoryRate.getText().isBlank()|| txtRespiratoryRate.getText().isEmpty() 
                || txtBloodPressure.getText().isBlank() || txtBloodPressure.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "Vital Signs Cannot be Blank");
        
        
        }
        else{
        boolean patientYN;
        boolean isNormal;
        int encNo = 0;
        int selectedRowIndex = tblPatientDirectory.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPatientDirectory.getModel();
        System.out.println(model.getValueAt(selectedRowIndex, 0));
        Patient patient = (Patient) model.getValueAt(selectedRowIndex , 0);
        patientYN = isPatientPresent(patient.getPatientid());
        System.out.println(patientYN);
        VitalSign vitalSign = new VitalSign();
        Encounter encounter = new Encounter();
        vitalSign.setRespiratoryrate(Double.parseDouble(txtRespiratoryRate.getText()));
        vitalSign.setBloodpressure(Double.parseDouble(txtBloodPressure.getText()));
        
        
        if(patientYN){
        encNo =  getEncNo(patient.getPatientid());
            encounter.setEncounterno(encNo+1);
        }else{
            encounter.setEncounterno(1);
        }
        
        encounter.setEncpatientid(patient.getPatientid());
        encounter.addVitalSign(vitalSign);
        encounterHistory.addEncounterInList(encounter);
        
        isNormal = isNormal(patient.getPatientage(), vitalSign.getBloodpressure(),vitalSign.getRespiratoryrate());
        
        if (!isNormal){
            abnormalPatients.addNewPatient(patient);
            abnormalEncounters.addEncounterInList(encounter);
        
        }
        System.out.println(encounterHistory.getEncounterHistoryList().get(0));
       }
    }//GEN-LAST:event_btnSaveDetailsActionPerformed

    private void btnViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHistoryActionPerformed
        // TODO add your handling code here:
        
       
        int selectedRowIndex = tblPatientDirectory.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPatientDirectory.getModel();
        System.out.println(model.getValueAt(selectedRowIndex, 0));
        Patient patient = (Patient) model.getValueAt(selectedRowIndex , 0);
//        lblEncHisPatId.setText(Integer.toString(patient.getPatientid()));
        DefaultTableModel tblPatientHistoryModel = (DefaultTableModel) tblPatientHistory.getModel();
        tblPatientHistoryModel.setRowCount(0);
        //get filtered data
        ArrayList<Encounter> list = getFilteredData(patient.getPatientid());
        
        //eoc
        //for(Encounter encounter : encounterHistory.getEncounterHistoryList()){
        for(Encounter encounter : list){    
            Object[] row = new Object[3];
            row[0] = encounter.getEncounterno();
            VitalSign vitalSign = encounter.getVitalSignList().get(0);
            row[1] = vitalSign.getBloodpressure();
            row[2] = vitalSign.getRespiratoryrate();
            tblPatientHistoryModel.addRow(row);
        }
        
        
    }//GEN-LAST:event_btnViewHistoryActionPerformed

    private void txtBloodPressureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBloodPressureKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{2,3}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtBloodPressure.getText());
        if(!match.matches()){
            lblBloodError.setText("Blood Pressure Should be 2 to 3 digits");
        }else{
            lblBloodError.setText("");
        }
    }//GEN-LAST:event_txtBloodPressureKeyReleased

    private void txtRespiratoryRateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespiratoryRateKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{2}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtRespiratoryRate.getText());
        if(!match.matches()){
            lblRespiratoryRateError.setText("Respiratory Rate Should be 2 digits");
        }else{
            lblRespiratoryRateError.setText("");
        }
    }//GEN-LAST:event_txtRespiratoryRateKeyReleased

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVitals;
    private javax.swing.JButton btnSaveDetails;
    private javax.swing.JButton btnViewHistory;
    private javax.swing.JLabel jPatientDatabase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBloodError;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblRespiratoryRate;
    private javax.swing.JLabel lblRespiratoryRateError;
    private javax.swing.JLabel lblTxtPatID;
    private javax.swing.JTable tblPatientDirectory;
    private javax.swing.JTable tblPatientHistory;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtRespiratoryRate;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatientDirectory.getModel();
        model.setRowCount(0);
        for (Patient patient: patientDirectory.getPatientList()){
        Object[] row = new Object[7];
        row[0] = patient;
        row[1] = patient.getPatientfirstname();
        row[2] = patient.getPatientlastname();
        row[3] = patient.getPatientage();
        row[4] = patient.getPatientcity();
        row[5] = patient.getPatientcommunity();
        row[6] = patient.getPatienthouse();
        model.addRow(row);
    }
}

    private boolean isPatientPresent(int patientId) {
        boolean present = false;
        for(Encounter encounter : encounterHistory.getEncounterHistoryList()){
        if(encounter.getEncpatientid()== patientId){
            present = true;
        }
        else{
            present = false;
        }
        }
       return present;
    }

    private int getEncNo(int patientId) {
        var result = new ArrayList<Encounter>();
        for(Encounter enc : encounterHistory.getEncounterHistoryList()){
        if(enc.getEncpatientid() == patientId){
        result.add(enc);
            }
        }
        
        Encounter enc = result.get(result.size()-1);
        return enc.getEncounterno();
            
    }

    private ArrayList<Encounter> getFilteredData(int patientId) {
        var result = new ArrayList<Encounter>();
        for(Encounter enc : encounterHistory.getEncounterHistoryList()){
        if(enc.getEncpatientid()== patientId){
        result.add(enc);
            }
        }
        return result;
        
    }

    private boolean isNormal(int patAge, double bloodpressure, double respiratoryrate) {
        boolean isNorm = false;
        if(patAge <= 40){
            if((bloodpressure<= 130 && bloodpressure>=90) && (respiratoryrate <= 100 && respiratoryrate>=90)){
            isNorm = true;
            }
            else{
            isNorm = false;
            }
            
        }
        else if (patAge >= 41 && patAge <= 100){
            if((bloodpressure<= 140 && bloodpressure>=100) && (respiratoryrate <= 80 && respiratoryrate>=70)){
            isNorm=  true;
            }
            else{
            isNorm = false;
            }
        }
        return isNorm;
        
    }
}