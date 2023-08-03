
package com.mycompany.aptechp2;

import java.awt.Component;
import static java.lang.Thread.sleep;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class PuzzleGame2 extends javax.swing.JFrame {

   //Declaration of Variables
    static boolean state = true;
   
    String color;
    public PuzzleGame2() {
        initComponents();
        
        txtNum1.setDocument(new Limited(1));
        txtNum2.setDocument(new Limited(1));
        txtNum4.setDocument(new Limited(1));
        txtNum6.setDocument(new Limited(1));
        txtNum8.setDocument(new Limited(1));
        txtNum9.setDocument(new Limited(1));
        txtNum10.setDocument(new Limited(1));
        txtNum11.setDocument(new Limited(1));
        txtNum12.setDocument(new Limited(1));
        txtNum14.setDocument(new Limited(1));
        txtNum16.setDocument(new Limited(1));
 
        
    }

   
    //Declaration and initialization of Time Variables
    static int millisecond = 0;
    static int second = 0;
    static int minute = 0;
    static int hour = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNum4 = new javax.swing.JTextField();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        txtNum3 = new javax.swing.JTextField();
        txtNum8 = new javax.swing.JTextField();
        txtNum7 = new javax.swing.JTextField();
        txtNum6 = new javax.swing.JTextField();
        txtNum5 = new javax.swing.JTextField();
        txtNum11 = new javax.swing.JTextField();
        txtNum10 = new javax.swing.JTextField();
        txtNum9 = new javax.swing.JTextField();
        txtNum12 = new javax.swing.JTextField();
        txtNum16 = new javax.swing.JTextField();
        txtNum15 = new javax.swing.JTextField();
        txtNum13 = new javax.swing.JTextField();
        txtNum14 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnResetGame1 = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblHour = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMinute = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSecond = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblMilliSec = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtnum6 = new javax.swing.JTextField();
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        txtnum3 = new javax.swing.JTextField();
        txtnum4 = new javax.swing.JTextField();
        txtnum5 = new javax.swing.JTextField();
        txtnum12 = new javax.swing.JTextField();
        txtnum11 = new javax.swing.JTextField();
        txtnum10 = new javax.swing.JTextField();
        txtnum9 = new javax.swing.JTextField();
        txtnum8 = new javax.swing.JTextField();
        txtnum7 = new javax.swing.JTextField();
        txtnum13 = new javax.swing.JTextField();
        txtnum14 = new javax.swing.JTextField();
        txtnum15 = new javax.swing.JTextField();
        txtnum16 = new javax.swing.JTextField();
        txtnum17 = new javax.swing.JTextField();
        txtnum18 = new javax.swing.JTextField();
        txtnum19 = new javax.swing.JTextField();
        txtnum20 = new javax.swing.JTextField();
        txtnum21 = new javax.swing.JTextField();
        txtnum22 = new javax.swing.JTextField();
        txtnum23 = new javax.swing.JTextField();
        txtnum24 = new javax.swing.JTextField();
        txtnum25 = new javax.swing.JTextField();
        txtnum27 = new javax.swing.JTextField();
        txtnum30 = new javax.swing.JTextField();
        txtnum26 = new javax.swing.JTextField();
        txtnum29 = new javax.swing.JTextField();
        txtnum28 = new javax.swing.JTextField();
        txtnum34 = new javax.swing.JTextField();
        txtnum32 = new javax.swing.JTextField();
        txtnum36 = new javax.swing.JTextField();
        txtnum31 = new javax.swing.JTextField();
        txtnum35 = new javax.swing.JTextField();
        txtnum33 = new javax.swing.JTextField();
        btnExit2 = new javax.swing.JButton();
        btnStart2 = new javax.swing.JButton();
        btnSubmit2 = new javax.swing.JButton();
        btnReset2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblHour1 = new javax.swing.JLabel();
        lblHr = new javax.swing.JLabel();
        lblMinute1 = new javax.swing.JLabel();
        lblminute = new javax.swing.JLabel();
        lblSecond1 = new javax.swing.JLabel();
        lblSeconds = new javax.swing.JLabel();
        lblMilliSec1 = new javax.swing.JLabel();
        lblMilliS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CrossWords Puzzle Game");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Game1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Game2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(469, 469, 469)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });

        txtNum4.setBackground(new java.awt.Color(255, 255, 0));
        txtNum4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum4ActionPerformed(evt);
            }
        });
        txtNum4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum4KeyPressed(evt);
            }
        });

        txtNum1.setBackground(new java.awt.Color(255, 255, 0));
        txtNum1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum1ActionPerformed(evt);
            }
        });
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum1KeyPressed(evt);
            }
        });

        txtNum2.setBackground(new java.awt.Color(255, 255, 0));
        txtNum2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum2ActionPerformed(evt);
            }
        });
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum2KeyPressed(evt);
            }
        });

        txtNum3.setBackground(new java.awt.Color(0, 0, 255));
        txtNum3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum3.setText("p");

        txtNum8.setBackground(new java.awt.Color(255, 255, 0));
        txtNum8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum8ActionPerformed(evt);
            }
        });
        txtNum8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum8KeyPressed(evt);
            }
        });

        txtNum7.setBackground(new java.awt.Color(0, 0, 255));
        txtNum7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txtNum7ComponentShown(evt);
            }
        });
        txtNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum7ActionPerformed(evt);
            }
        });

        txtNum6.setBackground(new java.awt.Color(255, 255, 0));
        txtNum6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum6ActionPerformed(evt);
            }
        });
        txtNum6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum6KeyPressed(evt);
            }
        });

        txtNum5.setBackground(new java.awt.Color(0, 0, 255));
        txtNum5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txtNum5ComponentShown(evt);
            }
        });
        txtNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum5ActionPerformed(evt);
            }
        });
        txtNum5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum5KeyPressed(evt);
            }
        });

        txtNum11.setBackground(new java.awt.Color(255, 255, 0));
        txtNum11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum11ActionPerformed(evt);
            }
        });
        txtNum11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum11KeyPressed(evt);
            }
        });

        txtNum10.setBackground(new java.awt.Color(255, 255, 0));
        txtNum10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum10ActionPerformed(evt);
            }
        });
        txtNum10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum10KeyPressed(evt);
            }
        });

        txtNum9.setBackground(new java.awt.Color(255, 255, 0));
        txtNum9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum9ActionPerformed(evt);
            }
        });
        txtNum9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum9KeyPressed(evt);
            }
        });

        txtNum12.setBackground(new java.awt.Color(255, 255, 0));
        txtNum12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum12ActionPerformed(evt);
            }
        });
        txtNum12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum12KeyPressed(evt);
            }
        });

        txtNum16.setBackground(new java.awt.Color(0, 0, 255));
        txtNum16.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum16ActionPerformed(evt);
            }
        });

        txtNum15.setBackground(new java.awt.Color(255, 255, 0));
        txtNum15.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum15ActionPerformed(evt);
            }
        });
        txtNum15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum15KeyPressed(evt);
            }
        });

        txtNum13.setBackground(new java.awt.Color(255, 255, 0));
        txtNum13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum13ActionPerformed(evt);
            }
        });
        txtNum13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum13KeyPressed(evt);
            }
        });

        txtNum14.setBackground(new java.awt.Color(0, 0, 255));
        txtNum14.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNum14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum14ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnExit.setText("Exit Game");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnResetGame1.setBackground(new java.awt.Color(0, 0, 0));
        btnResetGame1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnResetGame1.setForeground(new java.awt.Color(255, 255, 255));
        btnResetGame1.setText("Reset");
        btnResetGame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetGame1ActionPerformed(evt);
            }
        });

        btnStart.setBackground(new java.awt.Color(0, 204, 51));
        btnStart.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(0, 0, 255));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        lblHour.setText("00:");

        jLabel6.setText("HR");

        lblMinute.setText("00:");

        jLabel7.setText("M");

        lblSecond.setText("00:");

        jLabel8.setText("S");

        lblMilliSec.setText("0000");

        jLabel5.setText("MilliS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblMilliSec, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHour, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblSecond, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHour, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMilliSec, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNum13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum16))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNum1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(txtNum8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnResetGame1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExit)
                                .addGap(0, 26, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNum13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNum14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNum15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNum16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetGame1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        txtnum6.setBackground(new java.awt.Color(255, 255, 0));
        txtnum6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum6ActionPerformed(evt);
            }
        });
        txtnum6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum6KeyPressed(evt);
            }
        });

        txtnum1.setBackground(new java.awt.Color(0, 0, 255));
        txtnum1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum1.setText("p");
        txtnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum1ActionPerformed(evt);
            }
        });
        txtnum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum1KeyPressed(evt);
            }
        });

        txtnum2.setBackground(new java.awt.Color(255, 255, 0));
        txtnum2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum2ActionPerformed(evt);
            }
        });
        txtnum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum2KeyPressed(evt);
            }
        });

        txtnum3.setBackground(new java.awt.Color(255, 255, 0));
        txtnum3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum3ActionPerformed(evt);
            }
        });
        txtnum3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum3KeyPressed(evt);
            }
        });

        txtnum4.setBackground(new java.awt.Color(0, 0, 255));
        txtnum4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum4.setText("p");

        txtnum5.setBackground(new java.awt.Color(255, 255, 0));
        txtnum5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum5ActionPerformed(evt);
            }
        });
        txtnum5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum5KeyPressed(evt);
            }
        });

        txtnum12.setBackground(new java.awt.Color(255, 255, 0));
        txtnum12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum12ActionPerformed(evt);
            }
        });
        txtnum12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum12KeyPressed(evt);
            }
        });

        txtnum11.setBackground(new java.awt.Color(255, 255, 0));
        txtnum11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum11.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txtnum11ComponentShown(evt);
            }
        });
        txtnum11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum11ActionPerformed(evt);
            }
        });
        txtnum11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum11KeyPressed(evt);
            }
        });

        txtnum10.setBackground(new java.awt.Color(0, 0, 255));
        txtnum10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum10KeyPressed(evt);
            }
        });

        txtnum9.setBackground(new java.awt.Color(255, 255, 0));
        txtnum9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum9ActionPerformed(evt);
            }
        });
        txtnum9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum9KeyPressed(evt);
            }
        });

        txtnum8.setBackground(new java.awt.Color(0, 0, 255));
        txtnum8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum8ActionPerformed(evt);
            }
        });
        txtnum8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum8KeyPressed(evt);
            }
        });

        txtnum7.setBackground(new java.awt.Color(0, 0, 255));
        txtnum7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum7ActionPerformed(evt);
            }
        });
        txtnum7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum7KeyPressed(evt);
            }
        });

        txtnum13.setBackground(new java.awt.Color(255, 255, 0));
        txtnum13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum13ActionPerformed(evt);
            }
        });
        txtnum13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum13KeyPressed(evt);
            }
        });

        txtnum14.setBackground(new java.awt.Color(255, 255, 0));
        txtnum14.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum14ActionPerformed(evt);
            }
        });
        txtnum14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum14KeyPressed(evt);
            }
        });

        txtnum15.setBackground(new java.awt.Color(255, 255, 0));
        txtnum15.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum15ActionPerformed(evt);
            }
        });
        txtnum15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum15KeyPressed(evt);
            }
        });

        txtnum16.setBackground(new java.awt.Color(255, 255, 0));
        txtnum16.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum16ActionPerformed(evt);
            }
        });
        txtnum16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum16KeyPressed(evt);
            }
        });

        txtnum17.setBackground(new java.awt.Color(255, 255, 0));
        txtnum17.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum17ActionPerformed(evt);
            }
        });
        txtnum17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum17KeyPressed(evt);
            }
        });

        txtnum18.setBackground(new java.awt.Color(255, 255, 0));
        txtnum18.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum18ActionPerformed(evt);
            }
        });
        txtnum18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum18KeyPressed(evt);
            }
        });

        txtnum19.setBackground(new java.awt.Color(255, 255, 0));
        txtnum19.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum19ActionPerformed(evt);
            }
        });
        txtnum19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum19KeyPressed(evt);
            }
        });

        txtnum20.setBackground(new java.awt.Color(255, 255, 0));
        txtnum20.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum20ActionPerformed(evt);
            }
        });
        txtnum20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum20KeyPressed(evt);
            }
        });

        txtnum21.setBackground(new java.awt.Color(0, 0, 255));
        txtnum21.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum21.setText("a");

        txtnum22.setBackground(new java.awt.Color(255, 255, 0));
        txtnum22.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum22ActionPerformed(evt);
            }
        });
        txtnum22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum22KeyPressed(evt);
            }
        });

        txtnum23.setBackground(new java.awt.Color(255, 255, 0));
        txtnum23.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum23ActionPerformed(evt);
            }
        });
        txtnum23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum23KeyPressed(evt);
            }
        });

        txtnum24.setBackground(new java.awt.Color(255, 255, 0));
        txtnum24.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum24ActionPerformed(evt);
            }
        });
        txtnum24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum24KeyPressed(evt);
            }
        });

        txtnum25.setBackground(new java.awt.Color(255, 255, 0));
        txtnum25.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum25ActionPerformed(evt);
            }
        });
        txtnum25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum25KeyPressed(evt);
            }
        });

        txtnum27.setBackground(new java.awt.Color(255, 255, 0));
        txtnum27.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum27ActionPerformed(evt);
            }
        });
        txtnum27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum27KeyPressed(evt);
            }
        });

        txtnum30.setBackground(new java.awt.Color(255, 255, 0));
        txtnum30.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum30ActionPerformed(evt);
            }
        });
        txtnum30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum30KeyPressed(evt);
            }
        });

        txtnum26.setBackground(new java.awt.Color(255, 255, 0));
        txtnum26.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum26ActionPerformed(evt);
            }
        });
        txtnum26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum26KeyPressed(evt);
            }
        });

        txtnum29.setBackground(new java.awt.Color(255, 255, 0));
        txtnum29.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum29ActionPerformed(evt);
            }
        });
        txtnum29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum29KeyPressed(evt);
            }
        });

        txtnum28.setBackground(new java.awt.Color(255, 255, 0));
        txtnum28.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum28ActionPerformed(evt);
            }
        });
        txtnum28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum28KeyPressed(evt);
            }
        });

        txtnum34.setBackground(new java.awt.Color(0, 0, 255));
        txtnum34.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum34ActionPerformed(evt);
            }
        });
        txtnum34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum34KeyPressed(evt);
            }
        });

        txtnum32.setBackground(new java.awt.Color(0, 0, 255));
        txtnum32.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum32ActionPerformed(evt);
            }
        });
        txtnum32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum32KeyPressed(evt);
            }
        });

        txtnum36.setBackground(new java.awt.Color(255, 255, 0));
        txtnum36.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum36ActionPerformed(evt);
            }
        });
        txtnum36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum36KeyPressed(evt);
            }
        });

        txtnum31.setBackground(new java.awt.Color(0, 0, 255));
        txtnum31.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum31ActionPerformed(evt);
            }
        });
        txtnum31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum31KeyPressed(evt);
            }
        });

        txtnum35.setBackground(new java.awt.Color(255, 255, 0));
        txtnum35.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum35ActionPerformed(evt);
            }
        });
        txtnum35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum35KeyPressed(evt);
            }
        });

        txtnum33.setBackground(new java.awt.Color(255, 255, 0));
        txtnum33.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtnum33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum33ActionPerformed(evt);
            }
        });
        txtnum33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum33KeyPressed(evt);
            }
        });

        btnExit2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnExit2.setText("Exit Game");
        btnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit2ActionPerformed(evt);
            }
        });

        btnStart2.setBackground(new java.awt.Color(0, 204, 51));
        btnStart2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnStart2.setForeground(new java.awt.Color(255, 255, 255));
        btnStart2.setText("Start");
        btnStart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart2ActionPerformed(evt);
            }
        });

        btnSubmit2.setBackground(new java.awt.Color(0, 0, 255));
        btnSubmit2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnSubmit2.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit2.setText("Submit");
        btnSubmit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit2ActionPerformed(evt);
            }
        });

        btnReset2.setBackground(new java.awt.Color(0, 0, 0));
        btnReset2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnReset2.setForeground(new java.awt.Color(255, 255, 255));
        btnReset2.setText("Reset");
        btnReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset2ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        lblHour1.setText("00:");

        lblHr.setText("HR");

        lblMinute1.setText("00:");

        lblminute.setText("M");

        lblSecond1.setText("00:");

        lblSeconds.setText("S");

        lblMilliSec1.setText("0000");

        lblMilliS.setText("MilliS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMilliS)
                    .addComponent(lblMilliSec1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinute1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHour1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblSecond1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(lblminute, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHour1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMinute1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblminute, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSecond1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMilliSec1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMilliS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnStart2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubmit2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset2)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtnum12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtnum13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtnum24, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum23, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum21, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtnum25, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum26, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum27, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum30, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtnum36, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum35, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum34, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum33, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum32, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum31, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnum12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnum13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnum24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnum25, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum26, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum27, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum28, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum29, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum30, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnum36, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum35, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum34, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum33, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum32, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum31, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum1ActionPerformed
    if(txtNum1.getText().equals("h")){
        txtNum1.setText("h");
        
    }

       
    }//GEN-LAST:event_txtNum1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        //Code for user Input 
        state = false;
       
        String name;
        name =  JOptionPane.showInputDialog("Please Enter your Name");
        JOptionPane.showMessageDialog(null, " " +name +" "+ 
                "You have played the game for a period of:");
        JOptionPane.showMessageDialog(null,"You have played the game for a period of");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // Code For Time
        
            state = true;
            Thread t = new Thread(){
        
            public void run(){
            
                for(;;){
                    
                    if(state == true){
                        try{
                            sleep(8);
                            if(millisecond >100){
                                millisecond = 0;
                                second++;
                                
                            }
                            else if (second>60){
                                
                                millisecond = 0;
                                second = 0;
                                minute++;
                            }
                            else if(minute>60){
                                millisecond = 0;
                                second = 0;
                                minute = 0;
                                hour++;
                            }
                            lblMilliSec.setText(" : " +millisecond);
                            millisecond++;
                            lblSecond.setText(" : " +second);
                            lblMinute.setText(" : " +minute );
                            lblHour.setText(" : " +hour);
                            
                            
                        }
                        catch(Exception e){
                        
                        }
                           
                    }
                    else{
                        break;
                    }
                }
            }
        };
        t.start();
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Code for Exit Button
        Component frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Do you want to Exit","Puzzle Game?",
             JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
            
            System.exit(0);
            
        }
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum7ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNum7ActionPerformed

    private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jPanel2ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // Code for You cannot Edit
        txtNum7.setText("*");
        txtNum7.setEditable(false);
        
        txtNum5.setText("*");
        txtNum5.setEditable(false);
        
        txtNum14.setText("*");
        txtNum14.setEditable(false);
        
        txtNum16.setText("*");
        txtNum16.setEditable(false);
        
        txtnum7.setText("*");
        txtnum7.setEditable(false);
        
        txtnum8.setText("*");
        txtnum8.setEditable(false);
        
        txtnum10.setText("*");
        txtnum10.setEditable(false);
        
        txtnum31.setText("*");
        txtnum31.setEditable(false);
        
        txtnum32.setText("*");
        txtnum32.setEditable(false);
        
        txtnum34.setText("*");
        txtnum34.setEditable(false);
        
        txtNum3.setText("p");
        txtNum3.setEditable(false);
        
        txtnum1.setText("p");
        txtnum1.setEditable(false);
        
        txtnum4.setText("p");
        txtnum4.setEditable(false);
        
        txtnum21.setText("a");
        txtnum21.setEditable(false);
        
       
        
    }//GEN-LAST:event_formComponentShown

    private void txtNum1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyPressed
       // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNum1.setEditable(true);     
      }
      else{
          txtNum1.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
          
      }
        
        
    }//GEN-LAST:event_txtNum1KeyPressed

    private void txtNum2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyPressed
        
            // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
          
          txtNum2.setEditable(true);
          
          
      }
      else{
          txtNum2.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtNum2KeyPressed

    private void txtNum4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum4KeyPressed
        
            // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
          
          txtNum4.setEditable(true);
          
          
      }
      else{
          txtNum4.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtNum4KeyPressed

    private void txtNum6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum6KeyPressed
            // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
          
          txtNum6.setEditable(true);
          
          
      }
      else{
          txtNum6.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtNum6KeyPressed

    private void txtNum8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum8KeyPressed
            // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
          
          txtNum8.setEditable(true);
          
          
      }
      else{
          txtNum8.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtNum8KeyPressed

    private void txtNum9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum9KeyPressed
            // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
          
          txtNum9.setEditable(true);
          
          
      }
      else{
          txtNum9.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtNum9KeyPressed

    private void txtNum10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum10KeyPressed
            // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
          
          txtNum10.setEditable(true);
           
          
          
      }
      else{
          txtNum10.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtNum10KeyPressed

    private void txtNum11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum11KeyPressed
            // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
          
          txtNum11.setEditable(true);
           
          
          
      }
      else{
          txtNum11.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtNum11KeyPressed

    private void txtNum12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum12KeyPressed
            // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
          
          txtNum12.setEditable(true);
           
          
          
      }
      else{
          txtNum12.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtNum12KeyPressed

    private void txtNum13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum13KeyPressed
            // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
          
          txtNum13.setEditable(true);
          
          
          
      }
      else{
          txtNum13.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtNum13KeyPressed

    private void txtNum15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum15KeyPressed
            // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
          
          txtNum15.setEditable(true);
          
          
      }
      else{
          txtNum15.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtNum15KeyPressed

    private void txtNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum5ActionPerformed
         
    }//GEN-LAST:event_txtNum5ActionPerformed

    private void txtNum5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum5KeyPressed
    
    }//GEN-LAST:event_txtNum5KeyPressed

    private void btnResetGame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetGame1ActionPerformed
        
       state = false;
        
        hour = 0;
        minute = 0;
        second = 0;
        millisecond = 0;
        
        lblHour.setText(" 00: ");
        lblMinute.setText(" 00: ");
        lblSecond.setText(" 00: ");
        lblMilliSec.setText(" 0000: ");
        
        
        txtNum1.setText(" ");
        txtNum2.setText(" ");
        txtNum3.setText("p");
        txtNum4.setText(" ");
        txtNum5.setText("* ");
        txtNum6.setText("");
        txtNum7.setText("* ");
        txtNum8.setText("");
        txtNum9.setText(" ");
        txtNum10.setText(" ");
        txtNum11.setText(" ");
        txtNum12.setText(" ");
        txtNum13.setText(" ");
        txtNum14.setText("*");
        txtNum15.setText(" ");
        txtNum16.setText("*");
        
   
        
        
        
        
        
    }//GEN-LAST:event_btnResetGame1ActionPerformed

    private void txtNum10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum10ActionPerformed
       
      
        
    }//GEN-LAST:event_txtNum10ActionPerformed

    private void txtnum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum5ActionPerformed
       
    }//GEN-LAST:event_txtnum5ActionPerformed

    private void txtnum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum8ActionPerformed

    private void txtnum17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum17ActionPerformed

       
    }//GEN-LAST:event_txtnum17ActionPerformed

    private void txtnum20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum20ActionPerformed
       
    }//GEN-LAST:event_txtnum20ActionPerformed

    private void txtnum29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum29ActionPerformed
        
    }//GEN-LAST:event_txtnum29ActionPerformed

    private void txtnum32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum32ActionPerformed

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        
           Component frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Do you want to Exit","Puzzle Game?",
             JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
            
            System.exit(0);
            
        }
    }//GEN-LAST:event_btnExit2ActionPerformed

    private void btnStart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart2ActionPerformed
          state = true;
        Thread t = new Thread(){
        
            public void run(){
            
                for(;;){
                    
                    if(state == true){
                        try{
                            sleep(8);
                            if(millisecond >100){
                                millisecond = 0;
                                second++;
                                
                            }
                            else if (second>60){
                                
                                millisecond = 0;
                                second = 0;
                                minute++;
                            }
                            else if(minute>60){
                                millisecond = 0;
                                second = 0;
                                minute = 0;
                                hour++;
                            }
                            lblMilliS.setText(" : " +millisecond);
                            millisecond++;
                            lblSeconds.setText(" : " +second);
                            lblminute.setText(" : " +minute );
                            lblHr.setText(" : " +hour);
                            
                            
                        }
                        catch(Exception e){
                        
                        }
                           
                    }
                    else{
                        break;
                    }
                }
            }
        };
        t.start();
    }//GEN-LAST:event_btnStart2ActionPerformed

    private void btnSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit2ActionPerformed
        
        state = false;
        String name;
        name =  JOptionPane.showInputDialog("Please Enter your Name");
        JOptionPane.showMessageDialog(null, " Your Name is :" +name);
    }//GEN-LAST:event_btnSubmit2ActionPerformed

    private void btnReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset2ActionPerformed
       // Reset Color code.


        

        
        // Reset Time code.
        hour = 0;
        minute = 0;
        second = 0;
        millisecond = 0;
        
        lblHr.setText(" 00: ");
        lblminute.setText(" 00: ");
        lblSeconds.setText(" 00: ");
        lblMilliS.setText(" 0000: ");
        
        // Reset Text code.
        txtnum1.setText(" p");
        txtnum2.setText(" ");
        txtnum3.setText("");
        txtnum4.setText(" p");
        txtnum5.setText(" ");
        txtnum6.setText("");
        txtnum7.setText(" *");
        txtnum8.setText("*");
        txtnum9.setText(" ");
        txtnum10.setText("* ");
        txtnum11.setText(" ");
        txtnum12.setText(" ");
        txtnum13.setText(" ");
        txtnum14.setText("");
        txtnum15.setText(" ");
        txtnum16.setText("");
        txtnum17.setText(" ");
        txtnum18.setText(" ");
        txtnum19.setText(" ");
        txtnum20.setText(" ");
        txtnum21.setText("a ");
        txtnum22.setText(" ");
        txtnum23.setText(" ");
        txtnum24.setText(" ");
        txtnum25.setText(" ");
        txtnum26.setText(" ");
        txtnum27.setText(" ");
        txtnum28.setText(" ");
        txtnum29.setText(" ");
        txtnum30.setText(" ");
        txtnum31.setText(" *");
        txtnum32.setText("* ");
        txtnum33.setText(" ");
        txtnum34.setText(" *");
        txtnum35.setText(" ");
        txtnum36.setText(" ");
         
        
    }//GEN-LAST:event_btnReset2ActionPerformed

    private void txtnum36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum36ActionPerformed
      
    }//GEN-LAST:event_txtnum36ActionPerformed

    private void txtnum11ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtnum11ComponentShown
       
    }//GEN-LAST:event_txtnum11ComponentShown

    private void txtNum7ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtNum7ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum7ComponentShown

    private void txtNum5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtNum5ComponentShown
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtNum5ComponentShown

    private void txtnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum1ActionPerformed
       
      
        
    }//GEN-LAST:event_txtnum1ActionPerformed

    private void txtnum1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum1KeyPressed

    private void txtnum31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum31ActionPerformed

    private void txtnum2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum2KeyPressed
              char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum2.setEditable(true);
          
          
      }
      else{
          txtnum2.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum2KeyPressed

    private void txtnum3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum3KeyPressed
                 char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum3.setEditable(true);
          
          
      }
      else{
          txtnum3.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
     
    }//GEN-LAST:event_txtnum3KeyPressed

    private void txtnum5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum5KeyPressed
                 char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum5.setEditable(true);
          
          
      }
      else{
          txtnum5.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum5KeyPressed

    private void txtnum6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum6KeyPressed
                 char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum6.setEditable(true);
          
          
      }
      else{
          txtnum6.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum6KeyPressed

    private void txtnum7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum7KeyPressed
                 char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum7.setEditable(true);
          
          
      }
      else{
          txtnum7.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum7KeyPressed

    private void txtnum8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum8KeyPressed
                 char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum8.setEditable(true);
           
      }
      else{
          txtnum8.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum8KeyPressed

    private void txtnum9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum9KeyPressed
                 char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum9.setEditable(true);
          
          
      }
      else{
          txtnum9.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum9KeyPressed

    private void txtnum10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum10KeyPressed
                 char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum10.setEditable(true);
          
          
      }
      else{
          txtnum10.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum10KeyPressed

    private void txtnum11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum11KeyPressed
                 char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum11.setEditable(true);
          
          
      }
      else{
          txtnum11.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum11KeyPressed

    private void txtnum12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum12KeyPressed
                     char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum12.setEditable(true);
          
          
      }
      else{
          txtnum12.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum12KeyPressed

    private void txtnum13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum13KeyPressed
                     char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum13.setEditable(true);
          
          
      }
      else{
          txtnum13.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum13KeyPressed

    private void txtnum14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum14KeyPressed
                     char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum14.setEditable(true);
          
          
      }
      else{
          txtnum14.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum14KeyPressed

    private void txtnum15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum15KeyPressed
                     char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum15.setEditable(true);
          
          
      }
      else{
          txtnum15.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum15KeyPressed

    private void txtnum16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum16KeyPressed
                     char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum16.setEditable(true);
          
          
      }
      else{
          txtnum16.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum16KeyPressed

    private void txtnum17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum17KeyPressed
                     char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum17.setEditable(true);
          
          
      }
      else{
          txtnum17.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum17KeyPressed

    private void txtnum18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum18KeyPressed
                     char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum18.setEditable(true);
          
          
      }
      else{
          txtnum18.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum18KeyPressed

    private void txtnum19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum19KeyPressed
                     char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum19.setEditable(true);
          
          
      }
      else{
          txtnum19.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum19KeyPressed

    private void txtnum20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum20KeyPressed
                     char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum20.setEditable(true);
          
          
      }
      else{
          txtnum20.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum20KeyPressed

    private void txtnum22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum22KeyPressed
                         char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum22.setEditable(true);
          
          
      }
      else{
          txtnum22.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum22KeyPressed

    private void txtnum23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum23KeyPressed
                         char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum23.setEditable(true);
          
          
      }
      else{
          txtnum23.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum23KeyPressed

    private void txtnum24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum24KeyPressed
                         char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum24.setEditable(true);
          
          
      }
      else{
          txtnum24.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum24KeyPressed

    private void txtnum25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum25KeyPressed
                         char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum25.setEditable(true);
          
          
      }
      else{
          txtnum25.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum25KeyPressed

    private void txtnum26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum26KeyPressed
                         char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum26.setEditable(true);
          
          
      }
      else{
          txtnum26.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum26KeyPressed

    private void txtnum27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum27KeyPressed
                         char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum27.setEditable(true);
          
          
      }
      else{
          txtnum27.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum27KeyPressed

    private void txtnum28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum28KeyPressed
                         char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum28.setEditable(true);
          
          
      }
      else{
          txtnum28.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum28KeyPressed

    private void txtnum29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum29KeyPressed
                         char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum29.setEditable(true);
          
          
      }
      else{
          txtnum29.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum29KeyPressed

    private void txtnum30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum30KeyPressed
       char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum30.setEditable(true);
          
          
      }
      else{
          txtnum30.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum30KeyPressed

    private void txtnum31KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum31KeyPressed
          char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum31.setEditable(true);
          
          
      }
      else{
          txtnum31.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum31KeyPressed

    private void txtnum32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum32KeyPressed
          char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum32.setEditable(true);
          
          
      }
      else{
          txtnum32.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum32KeyPressed

    private void txtnum33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum33KeyPressed
          char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum33.setEditable(true);
          
          
      }
      else{
          txtnum33.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum33KeyPressed

    private void txtnum34KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum34KeyPressed
          char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum34.setEditable(true);
          
          
      }
      else{
          txtnum34.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum34KeyPressed

    private void txtnum35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum35KeyPressed
          char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum35.setEditable(true);
          
          
      }
      else{
          txtnum35.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum35KeyPressed

    private void txtnum36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum36KeyPressed
          char d = evt.getKeyChar();
       
      if(Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d)){
          
          txtnum36.setEditable(true);
          
          
      }
      else{
          txtnum36.setEditable(false);
           JOptionPane.showMessageDialog(this, "You cannot enter a number");
          
      }
    }//GEN-LAST:event_txtnum36KeyPressed

    private void txtNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum2ActionPerformed
       
    }//GEN-LAST:event_txtNum2ActionPerformed

    private void txtNum12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum12ActionPerformed

    }//GEN-LAST:event_txtNum12ActionPerformed

    private void txtNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum8ActionPerformed

    }//GEN-LAST:event_txtNum8ActionPerformed

    private void txtNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum4ActionPerformed
      
       
    }//GEN-LAST:event_txtNum4ActionPerformed

    private void txtNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum9ActionPerformed

    }//GEN-LAST:event_txtNum9ActionPerformed

    private void txtNum13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum13ActionPerformed

    }//GEN-LAST:event_txtNum13ActionPerformed

    private void txtNum11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum11ActionPerformed

    }//GEN-LAST:event_txtNum11ActionPerformed

    private void txtNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum6ActionPerformed

    }//GEN-LAST:event_txtNum6ActionPerformed

    private void txtNum15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum15ActionPerformed

    }//GEN-LAST:event_txtNum15ActionPerformed

    private void txtNum14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum14ActionPerformed

    private void txtNum16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum16ActionPerformed

    private void txtnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum2ActionPerformed

    }//GEN-LAST:event_txtnum2ActionPerformed

    private void txtnum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum3ActionPerformed

    }//GEN-LAST:event_txtnum3ActionPerformed

    private void txtnum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum6ActionPerformed
      
    }//GEN-LAST:event_txtnum6ActionPerformed

    private void txtnum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum7ActionPerformed
       
    }//GEN-LAST:event_txtnum7ActionPerformed

    private void txtnum12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum12ActionPerformed

    }//GEN-LAST:event_txtnum12ActionPerformed

    private void txtnum11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum11ActionPerformed

    }//GEN-LAST:event_txtnum11ActionPerformed

    private void txtnum13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum13ActionPerformed

    }//GEN-LAST:event_txtnum13ActionPerformed

    private void txtnum14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum14ActionPerformed

    }//GEN-LAST:event_txtnum14ActionPerformed

    private void txtnum15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum15ActionPerformed

    }//GEN-LAST:event_txtnum15ActionPerformed

    private void txtnum16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum16ActionPerformed

    }//GEN-LAST:event_txtnum16ActionPerformed

    private void txtnum18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum18ActionPerformed

    }//GEN-LAST:event_txtnum18ActionPerformed

    private void txtnum19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum19ActionPerformed
       
    }//GEN-LAST:event_txtnum19ActionPerformed

    private void txtnum22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum22ActionPerformed

    }//GEN-LAST:event_txtnum22ActionPerformed

    private void txtnum23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum23ActionPerformed

    }//GEN-LAST:event_txtnum23ActionPerformed

    private void txtnum24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum24ActionPerformed

    }//GEN-LAST:event_txtnum24ActionPerformed

    private void txtnum25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum25ActionPerformed

    }//GEN-LAST:event_txtnum25ActionPerformed

    private void txtnum26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum26ActionPerformed
       
    }//GEN-LAST:event_txtnum26ActionPerformed

    private void txtnum27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum27ActionPerformed
      
    }//GEN-LAST:event_txtnum27ActionPerformed

    private void txtnum28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum28ActionPerformed
       
    }//GEN-LAST:event_txtnum28ActionPerformed

    private void txtnum30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum30ActionPerformed

    }//GEN-LAST:event_txtnum30ActionPerformed

    private void txtnum33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum33ActionPerformed

    }//GEN-LAST:event_txtnum33ActionPerformed

    private void txtnum34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum34ActionPerformed

    private void txtnum35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum35ActionPerformed

    }//GEN-LAST:event_txtnum35ActionPerformed

    private void txtnum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum9ActionPerformed
      
    }//GEN-LAST:event_txtnum9ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(PuzzleGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuzzleGame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit2;
    private javax.swing.JButton btnReset2;
    private javax.swing.JButton btnResetGame1;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStart2;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblHour1;
    private javax.swing.JLabel lblHr;
    private javax.swing.JLabel lblMilliS;
    private javax.swing.JLabel lblMilliSec;
    private javax.swing.JLabel lblMilliSec1;
    private javax.swing.JLabel lblMinute;
    private javax.swing.JLabel lblMinute1;
    private javax.swing.JLabel lblSecond;
    private javax.swing.JLabel lblSecond1;
    private javax.swing.JLabel lblSeconds;
    private javax.swing.JLabel lblminute;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum10;
    private javax.swing.JTextField txtNum11;
    private javax.swing.JTextField txtNum12;
    private javax.swing.JTextField txtNum13;
    private javax.swing.JTextField txtNum14;
    private javax.swing.JTextField txtNum15;
    private javax.swing.JTextField txtNum16;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNum3;
    private javax.swing.JTextField txtNum4;
    private javax.swing.JTextField txtNum5;
    private javax.swing.JTextField txtNum6;
    private javax.swing.JTextField txtNum7;
    private javax.swing.JTextField txtNum8;
    private javax.swing.JTextField txtNum9;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum10;
    private javax.swing.JTextField txtnum11;
    private javax.swing.JTextField txtnum12;
    private javax.swing.JTextField txtnum13;
    private javax.swing.JTextField txtnum14;
    private javax.swing.JTextField txtnum15;
    private javax.swing.JTextField txtnum16;
    private javax.swing.JTextField txtnum17;
    private javax.swing.JTextField txtnum18;
    private javax.swing.JTextField txtnum19;
    private javax.swing.JTextField txtnum2;
    private javax.swing.JTextField txtnum20;
    private javax.swing.JTextField txtnum21;
    private javax.swing.JTextField txtnum22;
    private javax.swing.JTextField txtnum23;
    private javax.swing.JTextField txtnum24;
    private javax.swing.JTextField txtnum25;
    private javax.swing.JTextField txtnum26;
    private javax.swing.JTextField txtnum27;
    private javax.swing.JTextField txtnum28;
    private javax.swing.JTextField txtnum29;
    private javax.swing.JTextField txtnum3;
    private javax.swing.JTextField txtnum30;
    private javax.swing.JTextField txtnum31;
    private javax.swing.JTextField txtnum32;
    private javax.swing.JTextField txtnum33;
    private javax.swing.JTextField txtnum34;
    private javax.swing.JTextField txtnum35;
    private javax.swing.JTextField txtnum36;
    private javax.swing.JTextField txtnum4;
    private javax.swing.JTextField txtnum5;
    private javax.swing.JTextField txtnum6;
    private javax.swing.JTextField txtnum7;
    private javax.swing.JTextField txtnum8;
    private javax.swing.JTextField txtnum9;
    // End of variables declaration//GEN-END:variables
}
