/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author Normal
 */
public class ActivitySelection extends javax.swing.JPanel {

    /**
     * Creates new form ActivitySelection1
     */
    public ActivitySelection() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        activity_selection_header = new javax.swing.JPanel();
        activity_dropdown = new javax.swing.JComboBox();
        activities_label = new javax.swing.JLabel();
        ok_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();

        activity_selection_header.setBorder(javax.swing.BorderFactory.createTitledBorder("Activity Selection"));
        activity_selection_header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        activity_selection_header.setName(""); // NOI18N

        activity_dropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activity 1", "Activity 2", "Activity 3", "Activity 4" }));
        activity_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activity_dropdownActionPerformed(evt);
            }
        });

        activities_label.setText("Activities:");

        ok_button.setText("OK");
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");

        javax.swing.GroupLayout activity_selection_headerLayout = new javax.swing.GroupLayout(activity_selection_header);
        activity_selection_header.setLayout(activity_selection_headerLayout);
        activity_selection_headerLayout.setHorizontalGroup(
            activity_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activity_selection_headerLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(activities_label, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(activity_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activity_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(activity_selection_headerLayout.createSequentialGroup()
                        .addComponent(ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancel_button)))
                .addGap(69, 69, 69))
        );
        activity_selection_headerLayout.setVerticalGroup(
            activity_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activity_selection_headerLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(activity_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activity_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activities_label))
                .addGap(18, 18, 18)
                .addGroup(activity_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok_button)
                    .addComponent(cancel_button))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(activity_selection_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(activity_selection_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ok_buttonActionPerformed

    private void activity_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activity_dropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activity_dropdownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activities_label;
    private javax.swing.JComboBox activity_dropdown;
    private javax.swing.JPanel activity_selection_header;
    private javax.swing.JButton cancel_button;
    private javax.swing.JButton ok_button;
    // End of variables declaration//GEN-END:variables
}
