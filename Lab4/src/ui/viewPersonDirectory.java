/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
/**
 *
 * @author vinithiteshharsora
 */

public class viewPersonDirectory extends javax.swing.JPanel {

    /**
     * Creates new form viewPersonDirectory
     */
    PersonDirectory viPersonDirectory;
    PatientDirectory patientDirectory;
    EncounterHistory encounterHistory;
    public viewPersonDirectory(PersonDirectory personDirectory, PatientDirectory patientDirectory, EncounterHistory encounterHistory) {
        initComponents();
        System.out.println("inside right component");
        this.viPersonDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        populateTable();
        comboCommunity.addItem("MALDEN");
        comboCommunity.addItem("HUNTINGTON");
        comboCommunity.setSelectedItem("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLname = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblHouse = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtHouse = new javax.swing.JTextField();
        btnAddPerson = new javax.swing.JButton();
        txtFname = new javax.swing.JTextField();
        lblFname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPersonTable = new javax.swing.JTable();
        btnBookAppointment = new javax.swing.JButton();
        comboCommunity = new javax.swing.JComboBox<>();
        btnEdit = new javax.swing.JButton();
        btnSaveEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblfname = new javax.swing.JLabel();
        lbllname = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lblhouseno = new javax.swing.JLabel();
        jPersonDatabase = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(153, 153, 0));

        lblLname.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblLname.setForeground(new java.awt.Color(153, 153, 0));
        lblLname.setText("Last Name");

        lblAge.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblAge.setForeground(new java.awt.Color(153, 153, 0));
        lblAge.setText("Age");

        lblCommunity.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblCommunity.setForeground(new java.awt.Color(153, 153, 0));
        lblCommunity.setText("Community");

        lblCity.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblCity.setForeground(new java.awt.Color(153, 153, 0));
        lblCity.setText("City");

        lblHouse.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblHouse.setForeground(new java.awt.Color(153, 153, 0));
        lblHouse.setText("House Number");

        txtLname.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        txtLname.setForeground(new java.awt.Color(153, 153, 0));
        txtLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLnameKeyReleased(evt);
            }
        });

        txtAge.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        txtAge.setForeground(new java.awt.Color(153, 153, 0));
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtCity.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        txtCity.setForeground(new java.awt.Color(153, 153, 0));

        txtHouse.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        txtHouse.setForeground(new java.awt.Color(153, 153, 0));
        txtHouse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHouseKeyReleased(evt);
            }
        });

        btnAddPerson.setBackground(new java.awt.Color(153, 255, 204));
        btnAddPerson.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnAddPerson.setForeground(new java.awt.Color(153, 153, 0));
        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        txtFname.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        txtFname.setForeground(new java.awt.Color(153, 153, 0));
        txtFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFnameKeyReleased(evt);
            }
        });

        lblFname.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblFname.setForeground(new java.awt.Color(153, 153, 0));
        lblFname.setText("First Name");

        viewPersonTable.setBackground(new java.awt.Color(255, 255, 204));
        viewPersonTable.setForeground(new java.awt.Color(51, 51, 51));
        viewPersonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age", "City", "Community", "House Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewPersonTable);

        btnBookAppointment.setBackground(new java.awt.Color(153, 255, 204));
        btnBookAppointment.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnBookAppointment.setForeground(new java.awt.Color(153, 153, 0));
        btnBookAppointment.setText("Book Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });

        comboCommunity.setBackground(new java.awt.Color(153, 255, 204));
        comboCommunity.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        comboCommunity.setForeground(new java.awt.Color(153, 153, 0));
        comboCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select Community"}));
        comboCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCommunityActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(153, 255, 204));
        btnEdit.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(153, 153, 0));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSaveEdit.setBackground(new java.awt.Color(153, 255, 204));
        btnSaveEdit.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnSaveEdit.setForeground(new java.awt.Color(153, 153, 0));
        btnSaveEdit.setText("Save");
        btnSaveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 255, 204));
        btnDelete.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 153, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblfname.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblfname.setForeground(new java.awt.Color(0, 102, 102));

        lbllname.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lbllname.setForeground(new java.awt.Color(0, 102, 102));

        lblage.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblage.setForeground(new java.awt.Color(0, 102, 102));

        lblhouseno.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        lblhouseno.setForeground(new java.awt.Color(0, 102, 102));

        jPersonDatabase.setFont(new java.awt.Font("Didot", 3, 24)); // NOI18N
        jPersonDatabase.setForeground(new java.awt.Color(153, 153, 0));
        jPersonDatabase.setText("Person Details");
        jPersonDatabase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddPerson)
                                .addGap(30, 30, 30)
                                .addComponent(btnSaveEdit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblfname, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(lbllname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblhouseno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnDelete)
                                        .addGap(20, 20, 20)))))
                        .addComponent(btnEdit)
                        .addGap(20, 20, 20)
                        .addComponent(btnBookAppointment))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(500, 500, 500)
                            .addComponent(jPersonDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblCity, lblCommunity, lblHouse, lblLname});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddPerson, btnSaveEdit});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnEdit});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtCity, txtFname, txtHouse, txtLname});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPersonDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFname))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBookAppointment)
                            .addComponent(btnEdit)
                            .addComponent(btnDelete))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLname)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAge)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhouseno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHouse)
                        .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPerson)
                    .addComponent(btnSaveEdit))
                .addGap(15, 15, 15))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboCommunity, lblAge, lblCity, lblCommunity, lblFname, lblHouse, lblLname, lblage, lblfname, lblhouseno, lbllname, txtAge, txtCity, txtFname, txtHouse, txtLname});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
        boolean patientYN = false;
        int selectedRowIndex = viewPersonTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) viewPersonTable.getModel();
        System.out.println(model.getValueAt(selectedRowIndex, 0));
        Person person = (Person) model.getValueAt(selectedRowIndex , 0);
        System.out.println(person.getFirstname()+ person.getLastname());
        patientYN = ifPatientExist(person.getFirstname(), person.getLastname());

        if(!patientYN){
            Patient patient = new Patient();
            patient.setPatientfirstname(person.getFirstname());
            patient.setPatientlastname(person.getLastname());
            patient.setPatientage(person.getPersonage());
            patient.setPatientcity(person.getPersoncityname());
            patient.setPatientcommunity(person.getPersoncommunityname());
            patient.setPatienthouse(person.getPersonhouseno());
            patient.setPatientid(getUniqueId());
            patientDirectory.addNewPatient(patient);
            System.out.println(patient.getPatientid());
            JOptionPane.showMessageDialog(this, "Appointment Confirmed ");
        }
        else{
            JOptionPane.showMessageDialog(this, "Appointment Confirmed ");
        }

    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
                   if(txtAge.getText().isBlank() || txtAge.getText().isEmpty()
            || txtCity.getText().isBlank() || txtCity.getText().isEmpty()
           || txtFname.getText().isBlank() || txtFname.getText().isEmpty()
            || txtLname.getText().isBlank() || txtLname.getText().isEmpty()
            || txtHouse.getText().isBlank() || txtHouse.getText().isEmpty()
        ){
            JOptionPane.showMessageDialog(this, "Please enter all fields ! ");

        }
                   else{          
        Person person = new Person();
        person.setPersonage(Integer.parseInt(txtAge.getText()));
        person.setPersoncityname(txtCity.getText());
        //person.setCommunityName(txtCommunity.getText());
        person.setPersoncommunityname(comboCommunity.getSelectedItem().toString());
        person.setPersonhouseno(Integer.parseInt(txtHouse.getText()));
        person.setFirstname(txtFname.getText());
        person.setLastname(txtLname.getText());
        this.viPersonDirectory.addNewPerson(person);
        System.out.println(viPersonDirectory.getPersonList().get(0).toString());

        populateTable();
     
                
            txtAge.setText("");
            txtFname.setText("");
            txtLname.setText("");
            txtCity.setText("");
            txtHouse.setText("");
            comboCommunity.setSelectedItem("");
          {
        JOptionPane.showMessageDialog(this, "Person Details Added Successfully");
        }
    }//GEN-LAST:event_btnAddPersonActionPerformed
    }
    private void comboCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCommunityActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = viewPersonTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) viewPersonTable.getModel();
        System.out.println(model.getValueAt(selectedRowIndex, 0));
        Person person = (Person) model.getValueAt(selectedRowIndex , 0);
        txtAge.setText(String.valueOf(person.getPersonage()));
        txtCity.setText(person.getPersoncityname());
        txtFname.setText(person.getFirstname());
        txtLname.setText(person.getLastname());
        txtHouse.setText(String.valueOf(person.getPersonhouseno()));
        comboCommunity.setSelectedItem(person.getPersoncommunityname());

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEditActionPerformed
        // TODO add your handling code here:
        if(txtAge.getText().isBlank() || txtAge.getText().isEmpty()
            ||txtCity.getText().isBlank() || txtCity.getText().isEmpty()
            ||txtFname.getText().isBlank() || txtFname.getText().isEmpty()
            ||txtLname.getText().isBlank() || txtLname.getText().isEmpty()
            ||txtHouse.getText().isBlank() || txtHouse.getText().isEmpty()

        ){
            JOptionPane.showMessageDialog(this, "Please enter all fields !");

        }else{
        int selectedRowIndex = viewPersonTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) viewPersonTable.getModel();
        System.out.println(model.getValueAt(selectedRowIndex, 0));
        Person person = (Person) model.getValueAt(selectedRowIndex , 0);
        person.setPersonage(Integer.parseInt(txtAge.getText()));
        person.setFirstname(txtFname.getText());
        person.setLastname(txtLname.getText());
        person.setPersoncityname(txtCity.getText());
        person.setPersonhouseno(Integer.parseInt(txtHouse.getText()));
        person.setPersoncommunityname(comboCommunity.getSelectedItem().toString());
        populateTable();
        JOptionPane.showMessageDialog(this, "Record Updated Successfully!");
        txtAge.setText("");
        txtFname.setText("");
        txtLname.setText("");
        txtCity.setText("");
        txtHouse.setText("");
        comboCommunity.setSelectedItem("");
        }
    }//GEN-LAST:event_btnSaveEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = viewPersonTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) viewPersonTable.getModel();
        System.out.println(model.getValueAt(selectedRowIndex, 0));
        Person person = (Person) model.getValueAt(selectedRowIndex , 0);
        viPersonDirectory.getPersonList().remove(selectedRowIndex);
        populateTable();
        JOptionPane.showMessageDialog(this, "Record Deleted Successfully!");

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtFnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFnameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,50}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtFname.getText());
        if(!match.matches()){
            lblfname.setText("Name is Invalid, Please enter Valid name !");
        }else{
            lblfname.setText("");
        }
    }//GEN-LAST:event_txtFnameKeyReleased

    private void txtLnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLnameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,50}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtLname.getText());
        if(!match.matches()){
            lbllname.setText("Name is Invalid, Please enter Valid name !");
        }else{
            lbllname.setText("");
        }
    }//GEN-LAST:event_txtLnameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,3}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtAge.getText());
        if(!match.matches()){
            lblage.setText("Only Numbers and upto 3 digits are allowed");
        }else{
            lblage.setText("");
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtHouseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHouseKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,3}";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtHouse.getText());
        if(!match.matches()){
            lblhouseno.setText("Only Numbers and upto 3 digits are allowed");
        }else{
            lblhouseno.setText("");
        }
    }//GEN-LAST:event_txtHouseKeyReleased

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSaveEdit;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JLabel jPersonDatabase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblfname;
    private javax.swing.JLabel lblhouseno;
    private javax.swing.JLabel lbllname;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTable viewPersonTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) viewPersonTable.getModel();
        model.setRowCount(0);
        for (Person person: viPersonDirectory.getPersonList()){
        Object[] row = new Object[6];
        row[0] = person;
        row[1] = person.getLastname();
        row[2] = person.getPersonage();
        row[3] = person.getPersoncityname();
        row[4] = person.getPersoncommunityname();
        row[5] = person.getPersonhouseno();
        model.addRow(row);
    }
}

    private int getUniqueId() {
        
        int randomPIN = (int)(Math.random()*90000)+10000;
        for(Patient patient : patientDirectory.getPatientList()){
            if(patient.getPatientid()== randomPIN){
            getUniqueId();
            }
        }
        return randomPIN;
    }

    private boolean ifPatientExist(String fName, String lName) {
        boolean exists = false;
        for(Patient patient : patientDirectory.getPatientList()){
        if(patient.getPatientfirstname().equals(fName) && (patient.getPatientlastname()).equals(lName)){
            exists = true;
        }
        }
        return exists;
    }
        
}


