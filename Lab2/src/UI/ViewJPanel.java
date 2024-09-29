/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.VitalSigns;
import Model.VitalSignsHistory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author macbookair
 */
public class ViewJPanel extends javax.swing.JPanel {

    VitalSignsHistory vitalSignsHistory;
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.vitalSignsHistory = vitalSignsHistory;
        
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

        tempL = new javax.swing.JLabel();
        BloodPL = new javax.swing.JLabel();
        PulseL = new javax.swing.JLabel();
        DateL = new javax.swing.JLabel();
        vitals = new javax.swing.JLabel();
        TempT = new javax.swing.JTextField();
        BloodPT = new javax.swing.JTextField();
        PulseT = new javax.swing.JTextField();
        DateT = new javax.swing.JTextField();
        viewb = new javax.swing.JButton();
        deleteb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VitalsTable = new javax.swing.JTable();

        tempL.setText("Temperature");

        BloodPL.setText("BloodPressure");

        PulseL.setText("Pulse");

        DateL.setText("Date");

        vitals.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        vitals.setText("View Vital Signs");

        BloodPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodPTActionPerformed(evt);
            }
        });

        DateT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTActionPerformed(evt);
            }
        });

        viewb.setText("View");
        viewb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbActionPerformed(evt);
            }
        });

        deleteb.setText("Delete");
        deleteb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebActionPerformed(evt);
            }
        });

        VitalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Temperature", "BloodPressure", "Pulse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VitalsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DateL)
                                    .addComponent(PulseL))
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BloodPT, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateT, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BloodPL)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PulseT, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(tempL)
                                    .addGap(91, 91, 91)
                                    .addComponent(TempT, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(vitals))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewb)
                .addGap(35, 35, 35)
                .addComponent(deleteb)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(vitals)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewb)
                    .addComponent(deleteb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempL)
                    .addComponent(TempT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodPL)
                    .addComponent(PulseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PulseL)
                    .addComponent(BloodPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateL)
                    .addComponent(DateT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BloodPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodPTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodPTActionPerformed

    private void DateTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateTActionPerformed

    private void viewbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbActionPerformed
        // TODO add your handling code here:
       int selectedIndex = VitalsTable.getSelectedRow();
       if (selectedIndex<0){
           JOptionPane.showMessageDialog(this , "Please Select row First","Warning",JOptionPane.WARNING_MESSAGE);
           return;
           
           
       }
          DefaultTableModel model = (DefaultTableModel) VitalsTable.getModel();
          VitalSigns selectedVitals = (VitalSigns) model.getValueAt(selectedIndex , 0);
          
          if (selectedVitals != null){
              TempT.setText(Double.toString(selectedVitals.getTemperature()));
              BloodPT.setText(Double.toString(selectedVitals.getBloodPressure()));
              PulseT.setText(Integer.toString(selectedVitals.getPulse()));
              DateT.setText((selectedVitals.getDate()));
          
          }

    }//GEN-LAST:event_viewbActionPerformed

    private void deletebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebActionPerformed
        // TODO add your handling code here:
        int selectedIndex = VitalsTable.getSelectedRow();
       if (selectedIndex<0){
           JOptionPane.showMessageDialog(this , "Please Select row First","Warning",JOptionPane.PLAIN_MESSAGE);
           return;
           
           
       }
          DefaultTableModel model = (DefaultTableModel) VitalsTable.getModel();
          VitalSigns selectedVitals = (VitalSigns) model.getValueAt(selectedIndex , 0);
          
          if(selectedVitals != null){
              vitalSignsHistory.removeVitals(selectedVitals);
          }
          populateTable();
    }//GEN-LAST:event_deletebActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodPL;
    private javax.swing.JTextField BloodPT;
    private javax.swing.JLabel DateL;
    private javax.swing.JTextField DateT;
    private javax.swing.JLabel PulseL;
    private javax.swing.JTextField PulseT;
    private javax.swing.JTextField TempT;
    private javax.swing.JTable VitalsTable;
    private javax.swing.JButton deleteb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tempL;
    private javax.swing.JButton viewb;
    private javax.swing.JLabel vitals;
    // End of variables declaration//GEN-END:variables

   private void populateTable(){
       DefaultTableModel model = (DefaultTableModel) VitalsTable.getModel();
       model.setRowCount(0);
       
        for (VitalSigns vs : vitalSignsHistory.getHistory()){{
            Object[] row = new Object[4];
            row[0] = vs;
            row[1] = vs.getTemperature();
            row[2] = vs.getBloodPressure();
            row[3] = vs.getPulse();
            
            model.addRow(row);
                   
        }
   }
         
}}