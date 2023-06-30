package com.lg.grades;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class StudentsCreation extends javax.swing.JFrame {

    int xMouse, yMouse;

    Conn conexion = new Conn();
    Connection conectividad = conexion.conectado();

    public StudentsCreation() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        CloseForGood = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BackToMenu = new javax.swing.JButton();
        SaveInfo = new javax.swing.JButton();
        ClassNumber = new javax.swing.JTextField();
        EnglishGrade = new javax.swing.JTextField();
        SQLGrade = new javax.swing.JTextField();
        MathGrade = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        JavaGrade2 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        StudentID = new javax.swing.JLabel();
        background1 = new javax.swing.JPanel();
        CloseForGood1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Header1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ClassNumber1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BackToMenu1 = new javax.swing.JButton();
        SaveInfo1 = new javax.swing.JButton();
        JavaGrade1 = new javax.swing.JTextField();
        StudentID1 = new javax.swing.JTextField();
        EnglishGrade1 = new javax.swing.JTextField();
        SQLGrade1 = new javax.swing.JTextField();
        MathGrade1 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        background.add(CloseForGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lg/images/lg_logo.png"))); // NOI18N
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 230, 680));

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

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

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

        background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(202, 0, 58));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("STUDENTS FORM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 130));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel1.setText("Class number:");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setText("Grades:");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 560, 10));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setText("Java");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setText("SQL");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel7.setText("English");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel8.setText("Math");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        BackToMenu.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenu.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        BackToMenu.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenu.setText("BACK");
        BackToMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToMenuMouseClicked(evt);
            }
        });
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });
        background.add(BackToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 80, 30));

        SaveInfo.setBackground(new java.awt.Color(0, 0, 0));
        SaveInfo.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        SaveInfo.setForeground(new java.awt.Color(255, 255, 255));
        SaveInfo.setText("SAVE");
        SaveInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveInfoMouseClicked(evt);
            }
        });
        background.add(SaveInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 80, 30));

        ClassNumber.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        ClassNumber.setBorder(null);
        ClassNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClassNumberMousePressed(evt);
            }
        });
        background.add(ClassNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 210, -1));

        EnglishGrade.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        EnglishGrade.setBorder(null);
        EnglishGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnglishGradeMousePressed(evt);
            }
        });
        background.add(EnglishGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 210, -1));

        SQLGrade.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        SQLGrade.setBorder(null);
        SQLGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SQLGradeMousePressed(evt);
            }
        });
        background.add(SQLGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 210, -1));

        MathGrade.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        MathGrade.setBorder(null);
        MathGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MathGradeMousePressed(evt);
            }
        });
        MathGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MathGradeActionPerformed(evt);
            }
        });
        background.add(MathGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 210, -1));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 210, 10));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 210, 10));
        background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 210, 10));
        background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 210, 10));
        background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 210, 10));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel9.setText("Student ID:");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        JavaGrade2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        JavaGrade2.setBorder(null);
        JavaGrade2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JavaGrade2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JavaGrade2MousePressed(evt);
            }
        });
        background.add(JavaGrade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 210, -1));
        background.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 210, 10));

        StudentID.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        StudentID.setText("AUTOGENERATED");
        background.add(StudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 120, 20));

        background1.setBackground(new java.awt.Color(255, 255, 255));
        background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CloseForGood1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        CloseForGood1.setForeground(new java.awt.Color(255, 255, 255));
        CloseForGood1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseForGood1.setText("X");
        CloseForGood1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseForGood1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseForGood1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseForGood1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseForGood1MouseExited(evt);
            }
        });
        background1.add(CloseForGood1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lg/images/lg_logo.png"))); // NOI18N
        background1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 230, 680));

        jPanel3.setBackground(new java.awt.Color(43, 43, 43));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        background1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        Header1.setBackground(new java.awt.Color(202, 0, 50));
        Header1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Header1MouseDragged(evt);
            }
        });
        Header1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Header1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Header1Layout = new javax.swing.GroupLayout(Header1);
        Header1.setLayout(Header1Layout);
        Header1Layout.setHorizontalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        Header1Layout.setVerticalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        background1.add(Header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(202, 0, 58));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("STUDENTS FORM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 130));

        ClassNumber1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        ClassNumber1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        background1.add(ClassNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 210, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel12.setText("Class number:");
        background1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel13.setText("Grades:");
        background1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));
        background1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 560, 10));

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel14.setText("Java");
        background1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel15.setText("SQL");
        background1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel16.setText("English");
        background1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel17.setText("Math");
        background1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        BackToMenu1.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenu1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        BackToMenu1.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenu1.setText("BACK");
        BackToMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToMenu1MouseClicked(evt);
            }
        });
        BackToMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenu1ActionPerformed(evt);
            }
        });
        background1.add(BackToMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 80, 30));

        SaveInfo1.setBackground(new java.awt.Color(0, 0, 0));
        SaveInfo1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        SaveInfo1.setForeground(new java.awt.Color(255, 255, 255));
        SaveInfo1.setText("SAVE");
        SaveInfo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveInfo1MouseClicked(evt);
            }
        });
        background1.add(SaveInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 80, 30));

        JavaGrade1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        JavaGrade1.setBorder(null);
        JavaGrade1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JavaGrade1MousePressed(evt);
            }
        });
        background1.add(JavaGrade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 210, -1));

        StudentID1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        StudentID1.setBorder(null);
        StudentID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentID1ActionPerformed(evt);
            }
        });
        background1.add(StudentID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 210, -1));

        EnglishGrade1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        EnglishGrade1.setBorder(null);
        EnglishGrade1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnglishGrade1MousePressed(evt);
            }
        });
        background1.add(EnglishGrade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 210, -1));

        SQLGrade1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        SQLGrade1.setBorder(null);
        SQLGrade1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SQLGrade1MousePressed(evt);
            }
        });
        background1.add(SQLGrade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 210, -1));

        MathGrade1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        MathGrade1.setBorder(null);
        MathGrade1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MathGrade1MousePressed(evt);
            }
        });
        MathGrade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MathGrade1ActionPerformed(evt);
            }
        });
        background1.add(MathGrade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 210, -1));
        background1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 210, 10));
        background1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 210, 10));
        background1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 210, 10));
        background1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 210, 10));
        background1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 210, 10));

        jLabel18.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel18.setText("Student ID:");
        background1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToMenuActionPerformed

    private void MathGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MathGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MathGradeActionPerformed

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

    private void ClassNumberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClassNumberMousePressed

    }//GEN-LAST:event_ClassNumberMousePressed

    private void EnglishGradeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnglishGradeMousePressed

    }//GEN-LAST:event_EnglishGradeMousePressed

    private void SQLGradeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SQLGradeMousePressed

    }//GEN-LAST:event_SQLGradeMousePressed

    private void MathGradeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MathGradeMousePressed

    }//GEN-LAST:event_MathGradeMousePressed

    private void BackToMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToMenuMouseClicked
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackToMenuMouseClicked

    private void SaveInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveInfoMouseClicked
        cargarEstudiante();
        try {
            PreparedStatement ps = conectividad.prepareStatement(
                    "insert into class_01 (StudentID, ClassCode, JavaGrade, SQLGrade, EnglishGrade, MathGrade) values (?,?,?,?,?,?)");
            ps.setString(1, StudentID.getText());
            ps.setString(2, ClassNumber.getText());
            ps.setString(3, JavaGrade2.getText());
            ps.setString(4, SQLGrade.getText());
            ps.setString(5, EnglishGrade.getText());
            ps.setString(6, MathGrade.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student ID: " + StudentID.getText() + " added.");
            cleanBoxes();

        } catch (SQLException e) {
            System.out.println("Error al crear estudiante: " + e);
        }
    }//GEN-LAST:event_SaveInfoMouseClicked

    private void CloseForGood1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseForGood1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseForGood1MouseClicked

    private void CloseForGood1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseForGood1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseForGood1MouseEntered

    private void CloseForGood1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseForGood1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseForGood1MouseExited

    private void Header1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Header1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Header1MouseDragged

    private void Header1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Header1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Header1MousePressed

    private void BackToMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToMenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToMenu1MouseClicked

    private void BackToMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToMenu1ActionPerformed

    private void SaveInfo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveInfo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveInfo1MouseClicked

    private void JavaGrade1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JavaGrade1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JavaGrade1MousePressed

    private void StudentID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentID1ActionPerformed

    private void EnglishGrade1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnglishGrade1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnglishGrade1MousePressed

    private void SQLGrade1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SQLGrade1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SQLGrade1MousePressed

    private void MathGrade1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MathGrade1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MathGrade1MousePressed

    private void MathGrade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MathGrade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MathGrade1ActionPerformed

    private void JavaGrade2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JavaGrade2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JavaGrade2MousePressed

    private void JavaGrade2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JavaGrade2MouseClicked
        cargarEstudiante();
    }//GEN-LAST:event_JavaGrade2MouseClicked

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
            java.util.logging.Logger.getLogger(StudentsCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenu;
    private javax.swing.JButton BackToMenu1;
    private javax.swing.JTextField ClassNumber;
    private javax.swing.JComboBox<String> ClassNumber1;
    private javax.swing.JLabel CloseForGood;
    private javax.swing.JLabel CloseForGood1;
    private javax.swing.JTextField EnglishGrade;
    private javax.swing.JTextField EnglishGrade1;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Header1;
    private javax.swing.JTextField JavaGrade1;
    private javax.swing.JTextField JavaGrade2;
    private javax.swing.JTextField MathGrade;
    private javax.swing.JTextField MathGrade1;
    private javax.swing.JTextField SQLGrade;
    private javax.swing.JTextField SQLGrade1;
    private javax.swing.JButton SaveInfo;
    private javax.swing.JButton SaveInfo1;
    private javax.swing.JLabel StudentID;
    private javax.swing.JTextField StudentID1;
    private javax.swing.JPanel background;
    private javax.swing.JPanel background1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables

    private void cleanBoxes() {
        StudentID.setText("AUTOGENERATED");
        ClassNumber.setText("");
        JavaGrade2.setText("");
        SQLGrade.setText("");
        EnglishGrade.setText("");
        MathGrade.setText("");
    }

    private void cargarEstudiante() {
        StudentID.setText("");
        try {
            int indice = 0;
            Statement ps2 = conectividad.createStatement();
            ResultSet rs = ps2.executeQuery("SELECT MAX(id) as indice from class_01 WHERE ClassCode = " + ClassNumber.getText());
            if (rs.next()) {
                indice = rs.getInt("indice") + 1;
            }else{
                indice = 1;
            }
            StudentID.setText("STD" + Integer.toString(indice));
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }
}
