/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import database.CourseAccess;
import gui.types.*;
import gui.utils.GUIUtils;

import types.Activity;
import types.Course;

/**
 *
 * @author Jordan
 */
public class SelectActivityMatrix extends MSPanel {

    /**
     * Creates new form SelectActivityMatrix1
     */
    private Course c;
    public SelectActivityMatrix(Course course) {
	super("Activity Selection");

        this.c = course;
        
        initComponents();
        
        //Populate student dropdowns
        System.out.println("Accessing Student List");
        student_select_dropdown.setModel(new javax.swing.DefaultComboBoxModel(CourseAccess.accessStudentList(c.getCourseID())));
        
        //Populate assignment dropdown based on the student
        Object[] assignment_list = database.CourseAccess.accessActivityList(course.getCourseID());
        //String[] assignment_list_string = (String[])assignment_list;
        assignment_select_dropdown.setModel(new javax.swing.DefaultComboBoxModel(assignment_list));
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        student_matrix_header = new javax.swing.JPanel();
        ok_button = new javax.swing.JButton();
        student_select_dropdown = new javax.swing.JComboBox();
        assignment_select_dropdown = new javax.swing.JComboBox();
        student_label = new javax.swing.JLabel();
        assignment_label = new javax.swing.JLabel();

        student_matrix_header.setBorder(javax.swing.BorderFactory.createTitledBorder("Select the Desired Activity:"));
        student_matrix_header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        student_matrix_header.setName(""); // NOI18N

        ok_button.setText("OK");
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        student_select_dropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student A", "Student B", "Student C" }));

        assignment_select_dropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assignment 1", "Assignment 2", "Assignment 3" }));

        student_label.setText("Student:");

        assignment_label.setText("Activity:");

        javax.swing.GroupLayout student_matrix_headerLayout = new javax.swing.GroupLayout(student_matrix_header);
        student_matrix_header.setLayout(student_matrix_headerLayout);
        student_matrix_headerLayout.setHorizontalGroup(
            student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_matrix_headerLayout.createSequentialGroup()
                .addGroup(student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(student_matrix_headerLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, student_matrix_headerLayout.createSequentialGroup()
                                .addComponent(assignment_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                                .addComponent(assignment_select_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(student_matrix_headerLayout.createSequentialGroup()
                                .addComponent(student_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(student_select_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, student_matrix_headerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        student_matrix_headerLayout.setVerticalGroup(
            student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_matrix_headerLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(student_matrix_headerLayout.createSequentialGroup()
                        .addGroup(student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(student_select_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_label))
                        .addGap(78, 78, 78))
                    .addGroup(student_matrix_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(assignment_label)
                        .addComponent(assignment_select_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(ok_button))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(student_matrix_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(student_matrix_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
        String c_id = c.getCourseID();
        Activity act = database.CourseAccess.constructActivityObject(c_id, assignment_select_dropdown.getSelectedItem().toString());
        String id = student_select_dropdown.getSelectedItem().toString();
        Object[] student_list = CourseAccess.accessStudentList(c_id);
        
        String[] pass_array = id.split(" - ");
        String student_name = pass_array[0];
        int student_id = Integer.parseInt(pass_array[1]);
        
        if (act.isProgramming()) //Activity is code
            GUIUtils.getMasterFrame(this).movePage(new MarkingCode(c_id, act, student_id, student_name, student_list));
        else //Activity is not code
            GUIUtils.getMasterFrame(this).movePage(new MarkingPDF(c_id, act, student_id, student_name, student_list));
    }//GEN-LAST:event_ok_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignment_label;
    private javax.swing.JComboBox assignment_select_dropdown;
    private javax.swing.JButton ok_button;
    private javax.swing.JLabel student_label;
    private javax.swing.JPanel student_matrix_header;
    private javax.swing.JComboBox student_select_dropdown;
    // End of variables declaration//GEN-END:variables
}
