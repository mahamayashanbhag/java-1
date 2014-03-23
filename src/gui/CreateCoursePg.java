/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author Pun
 */
public class CreateCoursePg extends javax.swing.JFrame {

    /**
     * Creates new form LandingPage
     */
    public CreateCoursePg() {
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

        TopPanel = new javax.swing.JPanel();
        Role = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        CreateCoursePanel = new javax.swing.JPanel();
        CourseNameLabel = new javax.swing.JLabel();
        CourseIdLabel = new javax.swing.JLabel();
        InstructorNameLabel = new javax.swing.JLabel();
        InstructorIdLabel = new javax.swing.JLabel();
        TaNameLabel = new javax.swing.JLabel();
        TaIdLabel = new javax.swing.JLabel();
        CourseStartLabel = new javax.swing.JLabel();
        StudListLabel = new javax.swing.JLabel();
        CourseEndLabel = new javax.swing.JLabel();
        CourseName = new javax.swing.JTextField();
        CourseId = new javax.swing.JTextField();
        InstructorName = new javax.swing.JTextField();
        InstructorId = new javax.swing.JTextField();
        TaName = new javax.swing.JTextField();
        TaId = new javax.swing.JTextField();
        CourseStart = new javax.swing.JFormattedTextField();
        CourseEnd = new javax.swing.JFormattedTextField();
        Studlistfilelocation = new javax.swing.JTextField();
        ChooseFileStudList = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        SubmitCourse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MarkShark - Create A Page");
        setResizable(false);

        Role.setText("Role: Assistant Admin.");

        Logout.setText("Log Out");

        jButton1.setText("Back");

        CreateCoursePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Create A Course"));

        CourseNameLabel.setText("Course Name");

        CourseIdLabel.setText("Course ID");

        InstructorNameLabel.setText("Instructor Name");

        InstructorIdLabel.setText("Instructor ID");

        TaNameLabel.setText("TA/Marker Name");

        TaIdLabel.setText("TA/Marker ID");

        CourseStartLabel.setText("Course Start Date");

        StudListLabel.setText("Student List (.csv)");

        CourseEndLabel.setText("Course End Date");

        CourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseNameActionPerformed(evt);
            }
        });

        InstructorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructorNameActionPerformed(evt);
            }
        });

        CourseStart.setText("DD/MM/YY");

        CourseEnd.setText("DD/MM/YY");
        CourseEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseEndActionPerformed(evt);
            }
        });

        Studlistfilelocation.setText("File Location...");

        ChooseFileStudList.setText("Choose File");

        javax.swing.GroupLayout CreateCoursePanelLayout = new javax.swing.GroupLayout(CreateCoursePanel);
        CreateCoursePanel.setLayout(CreateCoursePanelLayout);
        CreateCoursePanelLayout.setHorizontalGroup(
            CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateCoursePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateCoursePanelLayout.createSequentialGroup()
                        .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CreateCoursePanelLayout.createSequentialGroup()
                                .addComponent(StudListLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Studlistfilelocation, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ChooseFileStudList))
                            .addGroup(CreateCoursePanelLayout.createSequentialGroup()
                                .addComponent(CourseStartLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CourseStart, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CourseEndLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CourseEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CreateCoursePanelLayout.createSequentialGroup()
                        .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CreateCoursePanelLayout.createSequentialGroup()
                                .addComponent(TaNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TaName))
                            .addComponent(InstructorNameLabel)
                            .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(CreateCoursePanelLayout.createSequentialGroup()
                                    .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TaIdLabel)
                                        .addComponent(CourseIdLabel))
                                    .addGap(34, 34, 34)
                                    .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TaId, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CourseId, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(CreateCoursePanelLayout.createSequentialGroup()
                                    .addComponent(CourseNameLabel)
                                    .addGap(34, 34, 34)
                                    .addComponent(CourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(196, Short.MAX_VALUE))
                    .addGroup(CreateCoursePanelLayout.createSequentialGroup()
                        .addComponent(InstructorIdLabel)
                        .addGap(40, 40, 40)
                        .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InstructorId, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CreateCoursePanelLayout.createSequentialGroup()
                                .addComponent(InstructorName)
                                .addGap(196, 196, 196))))))
        );
        CreateCoursePanelLayout.setVerticalGroup(
            CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateCoursePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseNameLabel)
                    .addComponent(CourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseIdLabel)
                    .addComponent(CourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InstructorNameLabel)
                    .addComponent(InstructorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InstructorIdLabel)
                    .addComponent(InstructorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TaNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TaIdLabel)
                    .addComponent(TaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseStartLabel)
                    .addComponent(CourseStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseEndLabel)
                    .addComponent(CourseEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CreateCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudListLabel)
                    .addComponent(Studlistfilelocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChooseFileStudList))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Cancel.setText("Submit");

        SubmitCourse.setText("Cancel");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TopPanelLayout.createSequentialGroup()
                        .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(TopPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(CreateCoursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TopPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SubmitCourse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cancel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(TopPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TopPanelLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 490, Short.MAX_VALUE)
                                .addComponent(Logout))
                            .addGroup(TopPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Role)))))
                .addContainerGap())
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Role)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logout)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateCoursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(SubmitCourse))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(655, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseNameActionPerformed

    private void CourseEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseEndActionPerformed

    private void InstructorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstructorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InstructorNameActionPerformed

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
            java.util.logging.Logger.getLogger(CreateCoursePg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateCoursePg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateCoursePg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateCoursePg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CreateCoursePg().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton ChooseFileStudList;
    private javax.swing.JFormattedTextField CourseEnd;
    private javax.swing.JLabel CourseEndLabel;
    private javax.swing.JTextField CourseId;
    private javax.swing.JLabel CourseIdLabel;
    private javax.swing.JTextField CourseName;
    private javax.swing.JLabel CourseNameLabel;
    private javax.swing.JFormattedTextField CourseStart;
    private javax.swing.JLabel CourseStartLabel;
    private javax.swing.JPanel CreateCoursePanel;
    private javax.swing.JTextField InstructorId;
    private javax.swing.JLabel InstructorIdLabel;
    private javax.swing.JTextField InstructorName;
    private javax.swing.JLabel InstructorNameLabel;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel Role;
    private javax.swing.JLabel StudListLabel;
    private javax.swing.JTextField Studlistfilelocation;
    private javax.swing.JButton SubmitCourse;
    private javax.swing.JTextField TaId;
    private javax.swing.JLabel TaIdLabel;
    private javax.swing.JTextField TaName;
    private javax.swing.JLabel TaNameLabel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
