/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import gui.utils.*;
import gui.types.*;
import javax.swing.*;
import java.awt.event.*;
import types.*;

/**
 *
 * @author colin
 */
public class LandingPageInstructor extends MSPanel {
    private Instructor a;

    /**
     * Creates new form LandingPageSysAdmin
     */
    public LandingPageInstructor(Instructor a) {
	super("Instructor");
	this.a = a;

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

        tasks_panel = new javax.swing.JPanel();
        marking_button = new javax.swing.JButton();
        activity_management_button = new javax.swing.JButton();

        tasks_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tasks"));

        marking_button.setText("Marking");
        marking_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marking_buttonActionPerformed(evt);
            }
        });

        activity_management_button.setText("Activity Management");
        activity_management_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activity_management_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tasks_panelLayout = new javax.swing.GroupLayout(tasks_panel);
        tasks_panel.setLayout(tasks_panelLayout);
        tasks_panelLayout.setHorizontalGroup(
            tasks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasks_panelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(tasks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(activity_management_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marking_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        tasks_panelLayout.setVerticalGroup(
            tasks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasks_panelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(marking_button)
                .addGap(37, 37, 37)
                .addComponent(activity_management_button)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tasks_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tasks_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void marking_buttonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_marking_buttonActionPerformed
        GUIUtils.getMasterFrame(this).movePage(new CourseSelection(MARKING, a));
    }//GEN-LAST:event_marking_buttonActionPerformed

    private void activity_management_buttonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_activity_management_buttonActionPerformed
<<<<<<< HEAD
        GUIUtils.getMasterFrame(this).movePage(new CourseSelection(ACT_MANAGE, a));
=======
        //for Markus : perhaps needs instructor passed through? 
        GUIUtils.getMasterFrame(this).movePage(new ActivityManagement(a)); // added a here, could be wrong
>>>>>>> af807c5ef8ad4f5ad553dd5e2073577ba9b810a5
    }//GEN-LAST:event_activity_management_buttonActionPerformed

    private static final int MARKING = 3;
    private static final int ACT_MANAGE = 4;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activity_management_button;
    private javax.swing.JButton marking_button;
    private javax.swing.JPanel tasks_panel;
    // End of variables declaration//GEN-END:variables
}
