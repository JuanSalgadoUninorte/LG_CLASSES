package com.lg.grades;

import java.awt.Color;

public class MainMenu extends javax.swing.JFrame {
    
    int xMouse, yMouse;

    public MainMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        CloseForGood = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CreateStudent = new javax.swing.JButton();
        ViewGrades = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CloseForGood.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        CloseForGood.setForeground(new java.awt.Color(255, 255, 255));
        CloseForGood.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseForGood.setText("X");
        CloseForGood.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseForGood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseForGoodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseForGoodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseForGoodMouseExited(evt);
            }
        });
        Background.add(CloseForGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lg/images/lg_logo.png"))); // NOI18N
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 230, 680));

        jPanel2.setBackground(new java.awt.Color(43, 43, 43));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        Header.setBackground(new java.awt.Color(202, 0, 50));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GRADES SYSTEM");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 130));

        CreateStudent.setBackground(new java.awt.Color(0, 0, 0));
        CreateStudent.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        CreateStudent.setForeground(new java.awt.Color(255, 255, 255));
        CreateStudent.setText("STUDENT CREATION");
        CreateStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateStudentMouseClicked(evt);
            }
        });
        Background.add(CreateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        ViewGrades.setBackground(new java.awt.Color(0, 0, 0));
        ViewGrades.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        ViewGrades.setForeground(new java.awt.Color(255, 255, 255));
        ViewGrades.setText("VIEW CLASS NOTES");
        ViewGrades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewGradesMouseClicked(evt);
            }
        });
        Background.add(ViewGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jPanel1.setBackground(new java.awt.Color(202, 0, 58));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void CloseForGoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseForGoodMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseForGoodMouseClicked

    private void CloseForGoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseForGoodMouseEntered
        CloseForGood.setBackground(Color.red);
    }//GEN-LAST:event_CloseForGoodMouseEntered

    private void CloseForGoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseForGoodMouseExited
        CloseForGood.setBackground(Color.black);
    }//GEN-LAST:event_CloseForGoodMouseExited

    private void CreateStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateStudentMouseClicked
        StudentsCreation createSrudent = new StudentsCreation();
        createSrudent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CreateStudentMouseClicked

    private void ViewGradesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewGradesMouseClicked
        ClassGrades grades = new ClassGrades();
        grades.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewGradesMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel CloseForGood;
    private javax.swing.JButton CreateStudent;
    private javax.swing.JPanel Header;
    private javax.swing.JButton ViewGrades;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
