/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import model.Car;
import model.CarHistory;

/**
 *
 * @author vinithiteshharsora
 */
public class MainJFrame extends javax.swing.JFrame {
        
        CarHistory history;
        CarHistory carHistory;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        
        initComponents();
        
        history = new CarHistory();
        carHistory = new CarHistory();
        carHistory = getDataFromCSV();
        
    }
    
private CarHistory getDataFromCSV() {
    CarHistory csvData = new CarHistory();
    Path pathToFile = Paths.get("/Users/vinithiteshharsora/desktop/CarData.csv");
    //System.out.println(pathToFile);
    try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)){
    String line = br.readLine();
    while(line!= null){
    System.out.println(line);
    String[] attributes = line.split(",");
    Car car = addCar(attributes);
    csvData.addNewCar(car);
    line = br.readLine();

    }
    }catch(IOException ioe){
    ioe.printStackTrace();
    }
    //System.out.println(csvData);
    return csvData;
    }
//
//
//
private Car addCar(String[] attributes) {
Car car = new Car();
System.out.println(attributes[1]);
car.setManufacturer(attributes[0]);
car.setYearOfManufacturing(Integer.parseInt(attributes[1]));
car.setModelNumber((attributes[2]));
car.setSerialNumber((attributes[4]));
car.setMinimumSeats(Integer.parseInt(attributes[3]));
car.setListOfCarsAvailableinaGivenCity((attributes[5]));
car.setCurrentlyAvailableCars(Integer.parseInt(attributes[9]));
car.setListOfCarsthathaveExpiredMaintenanceCertificate(Boolean.parseBoolean(attributes[6]));
car.setCarManufacturersUsedUber(attributes[7]);
car.setAvailableCar(Boolean.parseBoolean(attributes[8]));
//car.setLastTimeFleetlogUpdated(Integer.parseInt(attributes[10]));
return car;

}
//}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        SearchByManufacturer = new javax.swing.JButton();
        YearOfManufacturing = new javax.swing.JButton();
        MinimumSeats = new javax.swing.JButton();
        SerialNumber = new javax.swing.JButton();
        ModelNumber = new javax.swing.JButton();
        City = new javax.swing.JButton();
        CarManufacturedUsedbyUber = new javax.swing.JButton();
        FirstAvailableCar = new javax.swing.JButton();
        MaintenanceCertificate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        workPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setPreferredSize(new java.awt.Dimension(150, 1000));

        btnCreate.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnCreate.setText("Add Car");
        btnCreate.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnView.setText("View Fleet");
        btnView.setPreferredSize(new java.awt.Dimension(100, 30));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        SearchByManufacturer.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        SearchByManufacturer.setText("Search By Manufacturer");
        SearchByManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByManufacturerActionPerformed(evt);
            }
        });

        YearOfManufacturing.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        YearOfManufacturing.setText("Year of Manufacturing");
        YearOfManufacturing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearOfManufacturingActionPerformed(evt);
            }
        });

        MinimumSeats.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        MinimumSeats.setText("Minimum Seats");
        MinimumSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimumSeatsActionPerformed(evt);
            }
        });

        SerialNumber.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        SerialNumber.setText("Serial Number");
        SerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerialNumberActionPerformed(evt);
            }
        });

        ModelNumber.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        ModelNumber.setText("Model  Number");
        ModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelNumberActionPerformed(evt);
            }
        });

        City.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        City.setText("City");
        City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityActionPerformed(evt);
            }
        });

        CarManufacturedUsedbyUber.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        CarManufacturedUsedbyUber.setText("Used by Uber");
        CarManufacturedUsedbyUber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarManufacturedUsedbyUberActionPerformed(evt);
            }
        });

        FirstAvailableCar.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        FirstAvailableCar.setText("Current Available Car");
        FirstAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstAvailableCarActionPerformed(evt);
            }
        });

        MaintenanceCertificate.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        MaintenanceCertificate.setText("Maintenance Certificate");
        MaintenanceCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaintenanceCertificateActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        jButton1.setText("Car Attributes");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(FirstAvailableCar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(CarManufacturedUsedbyUber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(City, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModelNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(SerialNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MinimumSeats, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(YearOfManufacturing, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(SearchByManufacturer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MaintenanceCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addGap(25, 25, 25)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(SearchByManufacturer)
                .addGap(25, 25, 25)
                .addComponent(YearOfManufacturing)
                .addGap(25, 25, 25)
                .addComponent(MinimumSeats)
                .addGap(25, 25, 25)
                .addComponent(SerialNumber)
                .addGap(25, 25, 25)
                .addComponent(ModelNumber)
                .addGap(25, 25, 25)
                .addComponent(City)
                .addGap(25, 25, 25)
                .addComponent(CarManufacturedUsedbyUber)
                .addGap(25, 25, 25)
                .addComponent(FirstAvailableCar)
                .addGap(25, 25, 25)
                .addComponent(MaintenanceCertificate)
                .addContainerGap())
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CarManufacturedUsedbyUber, City, FirstAvailableCar, MaintenanceCertificate, MinimumSeats, ModelNumber, SearchByManufacturer, SerialNumber, YearOfManufacturing, btnCreate, btnView});

        splitPane.setLeftComponent(controlPanel);

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(workPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateJPanel createPanel = new CreateJPanel(carHistory);
        splitPane.setRightComponent(createPanel);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewPanel = new ViewJPanel(carHistory);
        splitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnViewActionPerformed

    private void SearchByManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByManufacturerActionPerformed
        // TODO add your handling code here:
        SearchByManufacturer search = new SearchByManufacturer(carHistory);
        splitPane.setRightComponent(search);
        
    }//GEN-LAST:event_SearchByManufacturerActionPerformed

    private void YearOfManufacturingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearOfManufacturingActionPerformed
        // TODO add your handling code here:
        YearOfManufacturing search = new YearOfManufacturing(carHistory);
        splitPane.setRightComponent(search);      
    }//GEN-LAST:event_YearOfManufacturingActionPerformed

    private void MinimumSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimumSeatsActionPerformed
        // TODO add your handling code here:
                MinimumSeats search = new MinimumSeats (carHistory);
                splitPane.setRightComponent(search);  
    }//GEN-LAST:event_MinimumSeatsActionPerformed

    private void SerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerialNumberActionPerformed
        // TODO add your handling code here:
        SerialNumber search = new SerialNumber(carHistory);
                splitPane.setRightComponent(search); 
    }//GEN-LAST:event_SerialNumberActionPerformed

    private void ModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelNumberActionPerformed
        // TODO add your handling code here:
        ModelNumber search = new ModelNumber(carHistory);
        splitPane.setRightComponent(search);
    }//GEN-LAST:event_ModelNumberActionPerformed

    private void CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityActionPerformed
        // TODO add your handling code here:
        City search = new City(carHistory);
        splitPane.setRightComponent(search);
    }//GEN-LAST:event_CityActionPerformed

    private void CarManufacturedUsedbyUberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarManufacturedUsedbyUberActionPerformed
        // TODO add your handling code here:
        CarManufacturedUsedbyUber search = new CarManufacturedUsedbyUber(carHistory);
        splitPane.setRightComponent(search);
    }//GEN-LAST:event_CarManufacturedUsedbyUberActionPerformed

    private void FirstAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstAvailableCarActionPerformed
        // TODO add your handling code here:
        CurrentAvailableCar search = new CurrentAvailableCar(carHistory);
        splitPane.setRightComponent(search);
    }//GEN-LAST:event_FirstAvailableCarActionPerformed

    private void MaintenanceCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaintenanceCertificateActionPerformed
        // TODO add your handling code here:
        MaintenanceCertificate search = new MaintenanceCertificate(carHistory);
        splitPane.setRightComponent(search);
    }//GEN-LAST:event_MaintenanceCertificateActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CarManufacturedUsedbyUber;
    private javax.swing.JButton City;
    private javax.swing.JButton FirstAvailableCar;
    private javax.swing.JButton MaintenanceCertificate;
    private javax.swing.JButton MinimumSeats;
    private javax.swing.JButton ModelNumber;
    private javax.swing.JButton SearchByManufacturer;
    private javax.swing.JButton SerialNumber;
    private javax.swing.JButton YearOfManufacturing;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
