/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.group5.Application;

import com.group5.Car.Car;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author gabrielloslos
 */
public class RentCarForm extends javax.swing.JFrame {
    
    
    private long dayDuration = 0;
    private double rentPricePerDay = 0;
    private Car car;
    /**
     * Creates new form RentCarForm
     */
    public RentCarForm(Car car) {
        rentPricePerDay = car.getStatus().getPrice().getRentPricePerDay();
        this.car = car;
        initComponents();
        int day = LocalDate.now().getDayOfMonth()-1;
        int month = LocalDate.now().getMonthValue()-1;
        int year = LocalDate.now().getYear();
        this.CBBeginDay.setSelectedIndex(day);
        this.CBBeginMonth.setSelectedIndex(month);
        this.CBBeginYear.setSelectedItem(Integer.toString(year));
        this.CBEndDay.setSelectedIndex(day);
        this.CBEndMonth.setSelectedIndex(month);
        this.CBEndYear.setSelectedItem(Integer.toString(year));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CBBeginMonth = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        BTNSetToday = new javax.swing.JButton();
        CBBeginDay = new javax.swing.JComboBox<>();
        CBBeginYear = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CBEndMonth = new javax.swing.JComboBox<>();
        CBEndDay = new javax.swing.JComboBox<>();
        CBEndYear = new javax.swing.JComboBox<>();
        BTNSetDuration = new javax.swing.JButton();
        BTNCalculateTotalPrice = new javax.swing.JButton();
        TFTotalPrice = new javax.swing.JTextField();
        BTNConfirmRent = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        jPanel1.setBackground(new java.awt.Color(223, 74, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 235, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rent Car");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(54, 63, 125));

        CBBeginMonth.setBackground(new java.awt.Color(75, 84, 139));
        CBBeginMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Begin Rent Date");

        BTNSetToday.setText("Set Today");
        BTNSetToday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSetTodayActionPerformed(evt);
            }
        });

        CBBeginDay.setBackground(new java.awt.Color(75, 84, 139));
        CBBeginDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1  ", "2  ", "3  ", "4  ", "5  ", "6  ", "7  ", "8  ", "9  ", "10  ", "11  ", "12  ", "13  ", "14  ", "15  ", "16  ", "17  ", "18  ", "19  ", "20  ", "21  ", "22  ", "23  ", "24  ", "25  ", "26  ", "27  ", "28  ", "29  ", "30  ", "31  " }));

        CBBeginYear.setBackground(new java.awt.Color(75, 84, 139));
        CBBeginYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034" }));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("End Rent Date");

        CBEndMonth.setBackground(new java.awt.Color(75, 84, 139));
        CBEndMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        CBEndDay.setBackground(new java.awt.Color(75, 84, 139));
        CBEndDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1  ", "2  ", "3  ", "4  ", "5  ", "6  ", "7  ", "8  ", "9  ", "10  ", "11  ", "12  ", "13  ", "14  ", "15  ", "16  ", "17  ", "18  ", "19  ", "20  ", "21  ", "22  ", "23  ", "24  ", "25  ", "26  ", "27  ", "28  ", "29  ", "30  ", "31  " }));

        CBEndYear.setBackground(new java.awt.Color(75, 84, 139));
        CBEndYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034" }));

        BTNSetDuration.setText("Set Duration");
        BTNSetDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSetDurationActionPerformed(evt);
            }
        });

        BTNCalculateTotalPrice.setText("Calculate Total Price:");
        BTNCalculateTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCalculateTotalPriceActionPerformed(evt);
            }
        });

        TFTotalPrice.setText("...");

        BTNConfirmRent.setBackground(new java.awt.Color(148, 28, 0));
        BTNConfirmRent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNConfirmRent.setForeground(new java.awt.Color(242, 235, 235));
        BTNConfirmRent.setText("CONFIRM RENT");
        BTNConfirmRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNConfirmRentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNSetDuration))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CBEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBEndYear, 0, 219, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTNConfirmRent, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BTNCalculateTotalPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFTotalPrice))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CBBeginMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBBeginDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBBeginYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNSetToday, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BTNSetToday, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBBeginMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBBeginDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBBeginYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BTNSetDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCalculateTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BTNConfirmRent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNSetDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSetDurationActionPerformed
        LocalDate end = LocalDate.of(Integer.parseInt(this.CBBeginYear.getSelectedItem().toString()), this.CBBeginMonth.getSelectedIndex()+1, this.CBBeginDay.getSelectedIndex()+1);
        try {
            end = end.plusDays(Integer.parseInt(JOptionPane.showInputDialog(null, "Input Rent Duration")));
            int day = end.getDayOfMonth()-1;
            int month = end.getMonthValue()-1;
            int year = end.getYear();
            this.CBEndDay.setSelectedIndex(day);
            this.CBEndMonth.setSelectedIndex(month);
            this.CBEndYear.setSelectedItem(Integer.toString(year));
            //JOptionPane.showMessageDialog(null, "it works " + day + " " + month + " " + year);
        } catch (Exception e) {}
        
    }//GEN-LAST:event_BTNSetDurationActionPerformed

    private void BTNCalculateTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCalculateTotalPriceActionPerformed
        LocalDate begin = LocalDate.of(Integer.parseInt(this.CBBeginYear.getSelectedItem().toString()), this.CBBeginMonth.getSelectedIndex()+1, this.CBBeginDay.getSelectedIndex()+1);
        LocalDate end = LocalDate.of(Integer.parseInt(this.CBEndYear.getSelectedItem().toString()), this.CBEndMonth.getSelectedIndex()+1, this.CBEndDay.getSelectedIndex()+1);;
        dayDuration = ChronoUnit.DAYS.between(begin, end);
        double totalPrice = dayDuration * rentPricePerDay;
        this.TFTotalPrice.setText(Double.toString(totalPrice));
    }//GEN-LAST:event_BTNCalculateTotalPriceActionPerformed

    private void BTNConfirmRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNConfirmRentActionPerformed

        //car.getStatus().rentTo();

    }//GEN-LAST:event_BTNConfirmRentActionPerformed

    private void BTNSetTodayActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int day = LocalDate.now().getDayOfMonth()-1;
        int month = LocalDate.now().getMonthValue()-1;
        int year = LocalDate.now().getYear();
        this.CBBeginDay.setSelectedIndex(day);
        this.CBBeginMonth.setSelectedIndex(month);
        this.CBBeginYear.setSelectedItem(Integer.toString(year));
    }

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
            java.util.logging.Logger.getLogger(RentCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCalculateTotalPrice;
    private javax.swing.JButton BTNConfirmRent;
    private javax.swing.JButton BTNSetDuration;
    private javax.swing.JButton BTNSetToday;
    private javax.swing.JComboBox<String> CBBeginDay;
    private javax.swing.JComboBox<String> CBBeginMonth;
    private javax.swing.JComboBox<String> CBBeginYear;
    private javax.swing.JComboBox<String> CBEndDay;
    private javax.swing.JComboBox<String> CBEndMonth;
    private javax.swing.JComboBox<String> CBEndYear;
    private javax.swing.JTextField TFTotalPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
