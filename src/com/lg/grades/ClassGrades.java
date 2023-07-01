package com.lg.grades;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClassGrades extends javax.swing.JFrame {

    Conn conexion = new Conn();
    Connection conectividad = conexion.conectado();
    DefaultTableModel modelo;
    DefaultTableModel modelo2;
    Document document;
    FileOutputStream archive;
    Paragraph title;
    List<Individual> people = new ArrayList<>();
    List<Individual> people2 = new ArrayList<>();
    LocalDateTime actualDate = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM dd HH-mm yyyy");
            String dateFormatted = actualDate.format(format);

    int xMouse, yMouse;

    public ClassGrades() {
        initComponents();
        llenarCombobox();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        CloseForGood = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Students = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        General = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        GeneralaAverage = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ClassNumber = new javax.swing.JComboBox<>();
        GeneralPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
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

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lg/images/lg_logo.png"))); // NOI18N
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 230, 680));

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

        jPanel1.setBackground(new java.awt.Color(202, 0, 58));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CLASS GRADES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 130));

        Menu.setBackground(new java.awt.Color(0, 0, 0));
        Menu.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("BACK");
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 630, 80, 30));

        Students.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        Students.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Java", "Math", "SQL", "English", "Average"
            }
        ));
        jScrollPane1.setViewportView(Students);

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 500, 240));

        General.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        General.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "English", "SQL", "Java", "Math"
            }
        ));
        jScrollPane2.setViewportView(General);

        Background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 300, 50));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel1.setText("Class");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setText("Class Average");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setText("General Average");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 110, -1));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 500, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 500, 10));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 200, 20));

        GeneralaAverage.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        Background.add(GeneralaAverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 70, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setText("Student Grades");
        Background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Consultar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        Background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        Background.add(ClassNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 90, -1));

        GeneralPDF.setBackground(new java.awt.Color(0, 0, 0));
        GeneralPDF.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        GeneralPDF.setForeground(new java.awt.Color(255, 255, 255));
        GeneralPDF.setText("GENERATE PDF");
        GeneralPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeneralPDFMouseClicked(evt);
            }
        });
        Background.add(GeneralPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuActionPerformed

    private void CloseForGoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseForGoodMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseForGoodMouseClicked

    private void CloseForGoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseForGoodMouseEntered
        CloseForGood.setBackground(Color.red);
    }//GEN-LAST:event_CloseForGoodMouseEntered

    private void CloseForGoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseForGoodMouseExited
        CloseForGood.setBackground(Color.black);
    }//GEN-LAST:event_CloseForGoodMouseExited

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String clase = ClassNumber.getSelectedItem().toString();
        float promedio = (float) 0.0;
        Object students[] = new Object[6];
        Object grade[] = new Object[4];
        ResultSet rs, rs1, rs2;
        modelo = (DefaultTableModel) Students.getModel();
        modelo2 = (DefaultTableModel) General.getModel();
        modelo.setRowCount(0);
        modelo2.setRowCount(0);

        try {

            PreparedStatement ps2 = conectividad.prepareStatement(
                    "SELECT avg((EnglishGrade+SQLGrade+JavaGrade+MathGrade)/4) as StudentAVG from class_01 where ClassCode = ?");
            ps2.setString(1, clase);
            rs2 = ps2.executeQuery();
            while (rs2.next()) {
                promedio = rs2.getFloat("StudentAVG");
            }
            float promedio2 = Math.round(promedio * 100.0f) / 100.0f;
            GeneralaAverage.setText(Float.toString(promedio2));

            PreparedStatement ps1 = conectividad.prepareStatement(
                    "SELECT avg(EnglishGrade) as English, avg(SQLGrade) as 'SQL', avg(JavaGrade) as Java, avg(MathGrade) as Math from class_01 where ClassCode = ?");
            ps1.setString(1, clase);
            rs1 = ps1.executeQuery();
            Individual grupal = new Individual();
            while (rs1.next()) {
                grade[0] = rs1.getFloat("English");
                grupal.setEnglishGradeTXT(Float.toString(rs1.getFloat("English")));
                grade[1] = rs1.getFloat("SQL");
                grupal.setSQLGradeTXT(Float.toString(rs1.getFloat("SQL")));
                grade[2] = rs1.getFloat("Java");
                grupal.setJavaGradeTXT(Float.toString(rs1.getFloat("Java")));
                grade[3] = rs1.getFloat("Math");
                grupal.setMathGradeTXT(Float.toString(rs1.getFloat("Math")));
                modelo2.addRow(grade);
                people.add(grupal);
            }

            General.setModel(modelo2);
            PreparedStatement ps = conectividad.prepareStatement(
                    "SELECT StudentID, EnglishGrade, SQLGrade, JavaGrade, MathGrade, AVG((EnglishGrade + SQLGrade + JavaGrade + MathGrade) / 4) AS StudentAVG\n"
                    + "FROM class_01\n"
                    + "WHERE ClassCode = ?\n"
                    + "GROUP BY StudentID, EnglishGrade, SQLGrade, JavaGrade, MathGrade");
            ps.setString(1, clase);
            rs = ps.executeQuery();
            Individual grupal2 = new Individual();
            while (rs.next()) {
                students[0] = rs.getString("StudentID");
                grupal2.setStudentIDTXT(rs.getString("StudentID"));
                students[1] = rs.getFloat("EnglishGrade");
                grupal2.setEnglishGradeTXT2(Float.toString(rs.getFloat("EnglishGrade")));
                students[2] = rs.getFloat("SQLGrade");
                grupal2.setSQLGradeTXT2(Float.toString(rs.getFloat("SQLGrade")));
                students[3] = rs.getFloat("JavaGrade");
                grupal2.setJavaGradeTXT2(Float.toString(rs.getFloat("JavaGrade")));
                students[4] = rs.getFloat("MathGrade");
                grupal2.setMathGradeTXT2(Float.toString(rs.getFloat("MathGrade")));
                students[5] = Math.round(rs.getFloat("StudentAVG") * 100.0f) / 100.0f;
                String average = Float.toString(Math.round(rs.getFloat("StudentAVG") * 100.0f) / 100.0f);
                grupal2.setStudentAverageTXT(average);
                modelo.addRow(students);
                people2.add(grupal2);
            }

            Students.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void GeneralPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeneralPDFMouseClicked
        document = new Document();
        title = new Paragraph("Class " + ClassNumber.getSelectedItem().toString() + " Grades");
        try {
            archive = new FileOutputStream("PDFs/Class " + ClassNumber.getSelectedItem().toString() + " Grades "+dateFormatted+".pdf");
            PdfWriter.getInstance(document, archive);
            document.open();
            title.setAlignment(1);
            document.add(title);
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Student grades"));
            document.add(Chunk.NEWLINE);
            PdfPTable tableByStudents = new PdfPTable(6);
            tableByStudents.setWidthPercentage(100);
            PdfPCell StudentID = new PdfPCell(new Phrase("StudentID"));
            PdfPCell EnglishGradeST = new PdfPCell(new Phrase("English"));
            PdfPCell SQLGradeST = new PdfPCell(new Phrase("SQL"));
            PdfPCell JavaGradeST = new PdfPCell(new Phrase("Java"));
            PdfPCell MathGradeST = new PdfPCell(new Phrase("Math"));
            PdfPCell StudentAverage = new PdfPCell(new Phrase("Average"));
            tableByStudents.addCell(StudentID);
            tableByStudents.addCell(EnglishGradeST);
            tableByStudents.addCell(SQLGradeST);
            tableByStudents.addCell(JavaGradeST);
            tableByStudents.addCell(MathGradeST);
            tableByStudents.addCell(StudentAverage);

            for (Individual total : this.people2) {
                tableByStudents.addCell(total.getStudentIDTXT());
                tableByStudents.addCell(total.getEnglishGradeTXT2());
                tableByStudents.addCell(total.getSQLGradeTXT2());
                tableByStudents.addCell(total.getJavaGradeTXT2());
                tableByStudents.addCell(total.getMathGradeTXT2());
                tableByStudents.addCell(total.getStudentAverageTXT());
            }
            document.add(tableByStudents);
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("General grades by subject"));
            document.add(Chunk.NEWLINE);
            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100);
            PdfPCell EnglishGrade = new PdfPCell(new Phrase("English"));
            PdfPCell SQLGrade = new PdfPCell(new Phrase("SQL"));
            PdfPCell JavaGrade = new PdfPCell(new Phrase("Java"));
            PdfPCell MathGrade = new PdfPCell(new Phrase("Math"));
            table.addCell(EnglishGrade);
            table.addCell(SQLGrade);
            table.addCell(JavaGrade);
            table.addCell(MathGrade);

            for (Individual individual : this.people) {
                table.addCell(individual.getEnglishGradeTXT());
                table.addCell(individual.getSQLGradeTXT());
                table.addCell(individual.getJavaGradeTXT());
                table.addCell(individual.getMathGradeTXT());
            }
            document.add(table);
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("General Grade Average: "+GeneralaAverage.getText()));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Date: " + dateFormatted));
            document.close();
            JOptionPane.showMessageDialog(null, "PDF Generated Successfuly In The Folder PDFs");

        } catch (Exception ex) {
            System.out.println("PDF Generation failed with error: " + ex);
        }
    }//GEN-LAST:event_GeneralPDFMouseClicked

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
            java.util.logging.Logger.getLogger(ClassGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JComboBox<String> ClassNumber;
    private javax.swing.JLabel CloseForGood;
    public javax.swing.JTable General;
    private javax.swing.JButton GeneralPDF;
    private javax.swing.JLabel GeneralaAverage;
    private javax.swing.JPanel Header;
    private javax.swing.JButton Menu;
    public javax.swing.JTable Students;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

    private void llenarCombobox() {
        try {
            Statement ps2 = conectividad.createStatement();
            ResultSet rs = ps2.executeQuery("SELECT DISTINCT ClassCode FROM class_01");
            while (rs.next()) {
                ClassNumber.addItem(rs.getString("ClassCode"));
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }

    }
}
