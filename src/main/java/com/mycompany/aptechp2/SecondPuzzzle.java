
package com.mycompany.aptechp2;

import static com.mycompany.aptechp2.PuzzleGame2.hour;
import static com.mycompany.aptechp2.PuzzleGame2.millisecond;
import static com.mycompany.aptechp2.PuzzleGame2.minute;
import static com.mycompany.aptechp2.PuzzleGame2.second;
import java.awt.Component;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SecondPuzzzle extends javax.swing.JFrame {
   
    //Declaration And Initialization of Global Variables used in the Project
    static boolean state= true;
    int Puzzle=1001 ;
    int Puzzles=1002;
    
    public SecondPuzzzle() {
        initComponents();
         //code for a single Character.
        TxtNumber2.setDocument(new Limited(1));
        TxtNumber3.setDocument(new Limited(1));
        TxtNumber5.setDocument(new Limited(1));
        TxtNumber6.setDocument(new Limited(1));
        TxtNumber9.setDocument(new Limited(1));
        TxtNumber11.setDocument(new Limited(1));
        TxtNumber12.setDocument(new Limited(1));
        TxtNumber13.setDocument(new Limited(1));
        TxtNumber14.setDocument(new Limited(1));
        TxtNumber15.setDocument(new Limited(1));
        TxtNumber16.setDocument(new Limited(1));
        TxtNumber17.setDocument(new Limited(1));
        TxtNumber18.setDocument(new Limited(1));
        TxtNumber21.setDocument(new Limited(1));
        TxtNumber22.setDocument(new Limited(1));
        TxtNumber24.setDocument(new Limited(1));
        TxtNumber25.setDocument(new Limited(1));
        TxtNumber26.setDocument(new Limited(1));
        TxtNumber27.setDocument(new Limited(1));
        TxtNumber28.setDocument(new Limited(1));
        TxtNumber29.setDocument(new Limited(1));
        TxtNumber30.setDocument(new Limited(1));
        TxtNumber31.setDocument(new Limited(1));
        TxtNumber32.setDocument(new Limited(1));
        TxtNumber35.setDocument(new Limited(1));
        TxtNumber37.setDocument(new Limited(1));
        TxtNumber38.setDocument(new Limited(1));
        
        //code for a single Character.
        txtNumber2.setDocument(new Limited(1));
        txtNumber3.setDocument(new Limited(1));
        txtNumber5.setDocument(new Limited(1));
        txtNumber6.setDocument(new Limited(1));
        txtNumber9.setDocument(new Limited(1));
        txtNumber11.setDocument(new Limited(1));
        txtNumber12.setDocument(new Limited(1));
        txtNumber13.setDocument(new Limited(1));
        txtNumber14.setDocument(new Limited(1));
        txtNumber15.setDocument(new Limited(1));
        txtNumber16.setDocument(new Limited(1));
        txtNumber17.setDocument(new Limited(1));
        txtNumber18.setDocument(new Limited(1));
        txtNumber21.setDocument(new Limited(1));
        txtNumber22.setDocument(new Limited(1));
        txtNumber24.setDocument(new Limited(1));
        txtNumber25.setDocument(new Limited(1));
        txtNumber26.setDocument(new Limited(1));
        txtNumber27.setDocument(new Limited(1));
        txtNumber28.setDocument(new Limited(1));
        txtNumber29.setDocument(new Limited(1));
        txtNumber30.setDocument(new Limited(1));
        txtNumber31.setDocument(new Limited(1));
        txtNumber32.setDocument(new Limited(1));
        txtNumber35.setDocument(new Limited(1));
        txtNumber33.setDocument(new Limited(1));
        txtNumber36.setDocument(new Limited(1));
        txtNumber19.setDocument(new Limited(1));
        txtNumber20.setDocument(new Limited(1));
        txtNumber22.setDocument(new Limited(1));
        txtNumber23.setDocument(new Limited(1));
        txtNumber24.setDocument(new Limited(1));
        
    }
    //Method to Display Time Taken To solve the Puzzle.
   
    public void timeTaken(){
        if(state==false){
            TxtHr.getText();   
            JOptionPane.showMessageDialog(null, "You have played the game for a Time of:" + hour +":" + minute+":" +second+":" +millisecond);
            JOptionPane.showMessageDialog(null, "Thanks for playing the Game." +" "+ "Good Bye!!!");
           
        }
    }
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TxtNumber1 = new javax.swing.JTextField();
        TxtNumber6 = new javax.swing.JTextField();
        TxtNumber2 = new javax.swing.JTextField();
        TxtNumber3 = new javax.swing.JTextField();
        TxtNumber4 = new javax.swing.JTextField();
        TxtNumber5 = new javax.swing.JTextField();
        TxtNumber7 = new javax.swing.JTextField();
        TxtNumber8 = new javax.swing.JTextField();
        TxtNumber9 = new javax.swing.JTextField();
        TxtNumber10 = new javax.swing.JTextField();
        TxtNumber11 = new javax.swing.JTextField();
        TxtNumber12 = new javax.swing.JTextField();
        TxtNumber15 = new javax.swing.JTextField();
        TxtNumber16 = new javax.swing.JTextField();
        TxtNumber18 = new javax.swing.JTextField();
        TxtNumber13 = new javax.swing.JTextField();
        TxtNumber14 = new javax.swing.JTextField();
        TxtNumber17 = new javax.swing.JTextField();
        TxtNumber25 = new javax.swing.JTextField();
        TxtNumber22 = new javax.swing.JTextField();
        TxtNumber23 = new javax.swing.JTextField();
        TxtNumber26 = new javax.swing.JTextField();
        TxtNumber21 = new javax.swing.JTextField();
        TxtNumber24 = new javax.swing.JTextField();
        TxtNumber28 = new javax.swing.JTextField();
        TxtNumber32 = new javax.swing.JTextField();
        TxtNumber31 = new javax.swing.JTextField();
        TxtNumber30 = new javax.swing.JTextField();
        TxtNumber29 = new javax.swing.JTextField();
        TxtNumber27 = new javax.swing.JTextField();
        TxtNumber38 = new javax.swing.JTextField();
        TxtNumber37 = new javax.swing.JTextField();
        TxtNumber36 = new javax.swing.JTextField();
        TxtNumber35 = new javax.swing.JTextField();
        TxtNumber34 = new javax.swing.JTextField();
        TxtNumber33 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        BtnStart = new javax.swing.JButton();
        BtnSubmit = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        TxtHr = new javax.swing.JTextField();
        TxtM = new javax.swing.JTextField();
        TxtS = new javax.swing.JTextField();
        TxtMS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPuzzleId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtNumber1 = new javax.swing.JTextField();
        txtNumber6 = new javax.swing.JTextField();
        txtNumber2 = new javax.swing.JTextField();
        txtNumber3 = new javax.swing.JTextField();
        txtNumber4 = new javax.swing.JTextField();
        txtNumber5 = new javax.swing.JTextField();
        txtNumber7 = new javax.swing.JTextField();
        txtNumber8 = new javax.swing.JTextField();
        txtNumber9 = new javax.swing.JTextField();
        txtNumber10 = new javax.swing.JTextField();
        txtNumber11 = new javax.swing.JTextField();
        txtNumber12 = new javax.swing.JTextField();
        txtNumber15 = new javax.swing.JTextField();
        txtNumber16 = new javax.swing.JTextField();
        txtNumber18 = new javax.swing.JTextField();
        txtNumber13 = new javax.swing.JTextField();
        txtNumber14 = new javax.swing.JTextField();
        txtNumber17 = new javax.swing.JTextField();
        txtNumber23 = new javax.swing.JTextField();
        txtNumber20 = new javax.swing.JTextField();
        txtNumber21 = new javax.swing.JTextField();
        txtNumber24 = new javax.swing.JTextField();
        txtNumber19 = new javax.swing.JTextField();
        txtNumber22 = new javax.swing.JTextField();
        txtNumber26 = new javax.swing.JTextField();
        txtNumber30 = new javax.swing.JTextField();
        txtNumber29 = new javax.swing.JTextField();
        txtNumber28 = new javax.swing.JTextField();
        txtNumber27 = new javax.swing.JTextField();
        txtNumber25 = new javax.swing.JTextField();
        txtNumber36 = new javax.swing.JTextField();
        txtNumber35 = new javax.swing.JTextField();
        txtNumber34 = new javax.swing.JTextField();
        txtNumber33 = new javax.swing.JTextField();
        txtNumber32 = new javax.swing.JTextField();
        txtNumber31 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnExit1 = new javax.swing.JButton();
        BtnStart1 = new javax.swing.JButton();
        BtnSubmit1 = new javax.swing.JButton();
        btnRESET = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        TxtHr1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtM1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtS1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtMS1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lblPuzzleIds = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose from the two CrossWord And Solve The Puzzle");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        TxtNumber1.setBackground(new java.awt.Color(51, 51, 255));
        TxtNumber1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber1.setText("s");
        TxtNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumber1ActionPerformed(evt);
            }
        });

        TxtNumber6.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber6KeyPressed(evt);
            }
        });

        TxtNumber2.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber2KeyPressed(evt);
            }
        });

        TxtNumber3.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber3KeyPressed(evt);
            }
        });

        TxtNumber4.setBackground(new java.awt.Color(51, 51, 255));
        TxtNumber4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber4.setText("o");

        TxtNumber5.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber5KeyPressed(evt);
            }
        });

        TxtNumber7.setBackground(new java.awt.Color(51, 51, 255));
        TxtNumber7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber7.setText("*");

        TxtNumber8.setBackground(new java.awt.Color(51, 51, 255));
        TxtNumber8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber8.setText("*");

        TxtNumber9.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber9KeyPressed(evt);
            }
        });

        TxtNumber10.setBackground(new java.awt.Color(51, 51, 255));
        TxtNumber10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber10.setText("*");

        TxtNumber11.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber11KeyPressed(evt);
            }
        });

        TxtNumber12.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber12KeyPressed(evt);
            }
        });

        TxtNumber15.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber15.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber15KeyPressed(evt);
            }
        });

        TxtNumber16.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber16.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber16KeyPressed(evt);
            }
        });

        TxtNumber18.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber18.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber18KeyPressed(evt);
            }
        });

        TxtNumber13.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber13KeyPressed(evt);
            }
        });

        TxtNumber14.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber14.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber14KeyPressed(evt);
            }
        });

        TxtNumber17.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber17.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber17KeyPressed(evt);
            }
        });

        TxtNumber25.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber25.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber25KeyPressed(evt);
            }
        });

        TxtNumber22.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber22.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber22KeyPressed(evt);
            }
        });

        TxtNumber23.setBackground(new java.awt.Color(51, 51, 255));
        TxtNumber23.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber23.setText("c");

        TxtNumber26.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber26.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber26KeyPressed(evt);
            }
        });

        TxtNumber21.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber21.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumber21ActionPerformed(evt);
            }
        });
        TxtNumber21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber21KeyPressed(evt);
            }
        });

        TxtNumber24.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber24.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber24KeyPressed(evt);
            }
        });

        TxtNumber28.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber28.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber28KeyPressed(evt);
            }
        });

        TxtNumber32.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber32.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber32KeyPressed(evt);
            }
        });

        TxtNumber31.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber31.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumber31ActionPerformed(evt);
            }
        });
        TxtNumber31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber31KeyPressed(evt);
            }
        });

        TxtNumber30.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber30.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber30KeyPressed(evt);
            }
        });

        TxtNumber29.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber29.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber29KeyPressed(evt);
            }
        });

        TxtNumber27.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber27.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber27KeyPressed(evt);
            }
        });

        TxtNumber38.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber38.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber38KeyPressed(evt);
            }
        });

        TxtNumber37.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber37.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber37KeyPressed(evt);
            }
        });

        TxtNumber36.setBackground(new java.awt.Color(51, 51, 255));
        TxtNumber36.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber36.setText("*");

        TxtNumber35.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber35.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber35KeyPressed(evt);
            }
        });

        TxtNumber34.setBackground(new java.awt.Color(51, 51, 255));
        TxtNumber34.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber34.setText("*");

        TxtNumber33.setBackground(new java.awt.Color(51, 51, 255));
        TxtNumber33.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtNumber33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber33.setText("*");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("(6).Non volatile ROM that enables idividual byte of data");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("(1).An institution for educating children");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("(5).A village in Sloviakia");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("(3).Very Beautiful or Attractive");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("(4).A container in which something is kept for cooling");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("(2).Chemical element,A white lustrus metal");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setText("Dear Player,Look For A Word that Best Describes the sentence and fill in the word in each Box.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(17, 17, 17)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(128, 128, 128)))
        );

        BtnExit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnExit.setText("Exit Game");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        BtnStart.setBackground(new java.awt.Color(0, 255, 0));
        BtnStart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnStart.setForeground(new java.awt.Color(255, 255, 255));
        BtnStart.setText("Start");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        BtnSubmit.setBackground(new java.awt.Color(51, 51, 255));
        BtnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        BtnSubmit.setText("Submit");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });

        BtnReset.setBackground(new java.awt.Color(0, 0, 0));
        BtnReset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnReset.setForeground(new java.awt.Color(255, 255, 255));
        BtnReset.setText("Reset");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 4));

        TxtHr.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtHr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtHr.setText("00:");

        TxtM.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtM.setText("00:");

        TxtS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtS.setText("00:");

        TxtMS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtMS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtMS.setText("0000");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HR");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("M");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("S");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MS");

        lblPuzzleId.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPuzzleId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuzzleId.setText("ID:1001");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtS, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtM, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtHr, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TxtMS, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPuzzleId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtHr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(TxtMS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPuzzleId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(TxtNumber13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(TxtNumber26, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber25, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber24, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber23, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber21, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(TxtNumber27, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber30, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber31, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber32, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(TxtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(TxtNumber12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(TxtNumber38, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber37, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber36, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber35, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber34, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNumber33, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(12, 12, 12)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BtnSubmit)
                        .addGap(49, 49, 49)
                        .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtNumber12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtNumber11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNumber13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNumber26, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber22, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNumber27, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber28, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber29, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber30, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber32, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNumber38, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber37, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber36, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber35, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber33, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("GAME2");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("GAME1");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        txtNumber1.setBackground(new java.awt.Color(51, 51, 255));
        txtNumber1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber1.setText("p");

        txtNumber6.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber6KeyPressed(evt);
            }
        });

        txtNumber2.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber2KeyPressed(evt);
            }
        });

        txtNumber3.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber3KeyPressed(evt);
            }
        });

        txtNumber4.setBackground(new java.awt.Color(51, 51, 255));
        txtNumber4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber4.setText("p");

        txtNumber5.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber5KeyPressed(evt);
            }
        });

        txtNumber7.setBackground(new java.awt.Color(51, 51, 255));
        txtNumber7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber7.setText("*");

        txtNumber8.setBackground(new java.awt.Color(51, 51, 255));
        txtNumber8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber8.setText("*");

        txtNumber9.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber9KeyPressed(evt);
            }
        });

        txtNumber10.setBackground(new java.awt.Color(51, 51, 255));
        txtNumber10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber10.setText("*");

        txtNumber11.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber11KeyPressed(evt);
            }
        });

        txtNumber12.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber12KeyPressed(evt);
            }
        });

        txtNumber15.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber15.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber15KeyPressed(evt);
            }
        });

        txtNumber16.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber16.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber16KeyPressed(evt);
            }
        });

        txtNumber18.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber18.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber18KeyPressed(evt);
            }
        });

        txtNumber13.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber13KeyPressed(evt);
            }
        });

        txtNumber14.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber14.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber14KeyPressed(evt);
            }
        });

        txtNumber17.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber17.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber17KeyPressed(evt);
            }
        });

        txtNumber23.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber23.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber23KeyPressed(evt);
            }
        });

        txtNumber20.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber20.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber20ActionPerformed(evt);
            }
        });
        txtNumber20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber20KeyPressed(evt);
            }
        });

        txtNumber21.setBackground(new java.awt.Color(51, 51, 255));
        txtNumber21.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber21.setText("a");

        txtNumber24.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber24.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber24KeyPressed(evt);
            }
        });

        txtNumber19.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber19.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber19KeyPressed(evt);
            }
        });

        txtNumber22.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber22.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber22ActionPerformed(evt);
            }
        });
        txtNumber22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber22KeyPressed(evt);
            }
        });

        txtNumber26.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber26.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber26KeyPressed(evt);
            }
        });

        txtNumber30.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber30.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber30KeyPressed(evt);
            }
        });

        txtNumber29.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber29.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber29ActionPerformed(evt);
            }
        });
        txtNumber29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber29KeyPressed(evt);
            }
        });

        txtNumber28.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber28.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber28KeyPressed(evt);
            }
        });

        txtNumber27.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber27.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber27KeyPressed(evt);
            }
        });

        txtNumber25.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber25.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber25KeyPressed(evt);
            }
        });

        txtNumber36.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber36.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber36KeyPressed(evt);
            }
        });

        txtNumber35.setBackground(new java.awt.Color(255, 255, 51));
        txtNumber35.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber35KeyPressed(evt);
            }
        });

        txtNumber34.setBackground(new java.awt.Color(51, 51, 255));
        txtNumber34.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber34.setText("*");

        txtNumber33.setBackground(new java.awt.Color(255, 255, 51));
        txtNumber33.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber33KeyPressed(evt);
            }
        });

        txtNumber32.setBackground(new java.awt.Color(51, 51, 255));
        txtNumber32.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber32.setText("*");
        txtNumber32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber32ActionPerformed(evt);
            }
        });

        txtNumber31.setBackground(new java.awt.Color(51, 51, 255));
        txtNumber31.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber31.setText("*");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("(6).One's Father's Name ");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("(5)A soluble powder obtained from certain lichens");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("(1).Human Beigns in general or collectively");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("(3).Content is available,Sale or selling");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("(2). school children that are taught by a teacher");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("(4).Form an ideal of,imagine or conceive ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Dear Player,Look For A Word that Best Describes the sentence and fill in the word in each Box.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 30, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        BtnExit1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnExit1.setText("Exit Game");
        BtnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExit1ActionPerformed(evt);
            }
        });

        BtnStart1.setBackground(new java.awt.Color(0, 255, 0));
        BtnStart1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnStart1.setForeground(new java.awt.Color(255, 255, 255));
        BtnStart1.setText("Start");
        BtnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStart1ActionPerformed(evt);
            }
        });

        BtnSubmit1.setBackground(new java.awt.Color(51, 51, 255));
        BtnSubmit1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnSubmit1.setForeground(new java.awt.Color(255, 255, 255));
        BtnSubmit1.setText("Submit");
        BtnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmit1ActionPerformed(evt);
            }
        });

        btnRESET.setBackground(new java.awt.Color(0, 0, 0));
        btnRESET.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnRESET.setForeground(new java.awt.Color(255, 255, 255));
        btnRESET.setText("Reset");
        btnRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRESETActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 4));

        TxtHr1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtHr1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtHr1.setText("00:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("HR");

        TxtM1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtM1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtM1.setText("00:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("M");

        TxtS1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtS1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtS1.setText("00:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("S");

        TxtMS1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtMS1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtMS1.setText("0000");
        TxtMS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMS1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MS");

        lblPuzzleIds.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPuzzleIds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuzzleIds.setText("ID:1002");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtM1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtHr1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtS1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtMS1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPuzzleIds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtHr1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addComponent(TxtM1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(TxtS1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtMS1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPuzzleIds, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BtnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRESET, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber24, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber23, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber21, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber25, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber26, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber27, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber30, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber36, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber35, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber34, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber33, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber32, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber31, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNumber12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumber11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber22, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber26, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber27, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber28, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber29, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber30, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber36, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber35, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber33, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber32, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRESET, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnGoBack.setBackground(new java.awt.Color(51, 51, 255));
        btnGoBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGoBack.setForeground(new java.awt.Color(255, 255, 255));
        btnGoBack.setText("GO BACK");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(318, 318, 318)
                        .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(518, 518, 518))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(262, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(btnGoBack))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNumber31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumber31ActionPerformed
        
    }//GEN-LAST:event_TxtNumber31ActionPerformed

    private void txtNumber29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber29ActionPerformed
        
    }//GEN-LAST:event_txtNumber29ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        //code for UnEditable Text for Second puzzle 6*6 
        //Only The admin can edit this .
        txtNumber1.setText("p");
        txtNumber1.setEditable(false);
        
        txtNumber4.setText("p");
        txtNumber4.setEditable(false);
        
        txtNumber7.setText("*");
        txtNumber7.setEditable(false);
        
        txtNumber8.setText("*");
        txtNumber8.setEditable(false);
        
        txtNumber10.setText("*");
        txtNumber10.setEditable(false);
              
        txtNumber31.setText("*");
        txtNumber31.setEditable(false);
        
        txtNumber32.setText("*");
        txtNumber32.setEditable(false);
        
        txtNumber34.setText("*");
        txtNumber34.setEditable(false);
        
        txtNumber21.setText("a");
        txtNumber21.setEditable(false);
        
        //code for UnEditable Text for First puzzle 6*6 
              
        TxtNumber1.setText("s");
        TxtNumber1.setEditable(false);
        
        TxtNumber4.setText("o");
        TxtNumber4.setEditable(false);
        
        TxtNumber7.setText("*");
        TxtNumber7.setEditable(false);
        
        TxtNumber8.setText("*");
        TxtNumber8.setEditable(false);
        
        TxtNumber10.setText("*");
        TxtNumber10.setEditable(false);
            
        TxtNumber23.setText(" c");
        TxtNumber23.setEditable(false);
        
        TxtNumber33.setText("*");
        TxtNumber33.setEditable(false);
        
        TxtNumber34.setText("*");
        TxtNumber34.setEditable(false);
        
        TxtNumber36.setText("*");
        TxtNumber36.setEditable(false);
        
        
        
       
        
    }//GEN-LAST:event_formComponentShown

    private void TxtNumber21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumber21ActionPerformed
       
    }//GEN-LAST:event_TxtNumber21ActionPerformed

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
           // Code For Time,that is Method to make the time running dynamically.
        
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
                            TxtMS.setText(" : " +millisecond);
                            millisecond++;
                            TxtS.setText(" : " +second);
                            TxtM.setText(" : " +minute );
                            TxtHr.setText(" : " +hour);
                            
                            
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
    }//GEN-LAST:event_BtnStartActionPerformed

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        state = false;
         //Code To ask for a user Name and display the Name And Welcome Message
        String name;
        name =  JOptionPane.showInputDialog("Please Enter your Name");
        JOptionPane.showMessageDialog(null, "Welcome!!! : " + name  ); 
        
         //code to Diplay The puzzle Id.   
        lblPuzzleId.getText();
        JOptionPane.showMessageDialog(null, "Your Puzzle id is:"+Puzzle );
        
        //Calling Time Method.
        timeTaken();
    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void BtnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmit1ActionPerformed
      
    //Code To ask for a user Name and display the Name And Welcome Message
        state = false;
        String name;
        name =  JOptionPane.showInputDialog("Please Enter your Name");
        JOptionPane.showMessageDialog(null, "Welcome!!! " +name  );
        
        //code to Diplay The puzzle Id.
        lblPuzzleIds.getText();
        JOptionPane.showMessageDialog(null, "Your Puzzle id is:"+Puzzles );
        
         //Calling Time Method.
        timeTaken(); 
       
        
    }//GEN-LAST:event_BtnSubmit1ActionPerformed

    private void BtnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStart1ActionPerformed
         // Code For Time Taken As the Game Starts
        
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
                            TxtMS1.setText(" : " +millisecond);
                            millisecond++;
                            TxtS1.setText(" : " +second);
                            TxtM1.setText(" : " +minute );
                            TxtHr1.setText(" : " +hour);
                            
                            
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
    }//GEN-LAST:event_BtnStart1ActionPerformed

    private void btnRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESETActionPerformed
        
                     
        // These Lines of code help to Reset The Time After attempting the Puzzle.
        hour = 0;
        minute = 0;
        second = 0;
        millisecond = 0;       
        TxtHr1.setText(" 00: ");
        TxtM1.setText(" 00: ");
        TxtS1.setText(" 00: ");
        TxtMS1.setText(" 0000: ");
        
        // These Lines of code Help to Reset the Puzzle After Attempting the puzzle.
        txtNumber1.setText("p");
        txtNumber2.setText(" ");
        txtNumber3.setText("");
        txtNumber4.setText("p");
        txtNumber5.setText("");
        txtNumber6.setText("");
        txtNumber7.setText("*");
        txtNumber8.setText("*");
        txtNumber9.setText(" ");
        txtNumber10.setText("*");
        txtNumber11.setText("");
        txtNumber12.setText("");
        txtNumber13.setText("");
        txtNumber14.setText("");
        txtNumber15.setText("");
        txtNumber16.setText("");
        txtNumber17.setText(" ");
        txtNumber18.setText(" ");        
        txtNumber21.setText("a");
        txtNumber19.setText(" ");
        txtNumber20.setText(" ");
        txtNumber22.setText(" ");
        txtNumber23.setText(" ");
        txtNumber24.setText(" ");
        txtNumber25.setText(" ");
        txtNumber26.setText(" ");
        txtNumber27.setText(" ");
        txtNumber28.setText(" ");
        txtNumber29.setText(" ");
        txtNumber30.setText(" ");
        txtNumber31.setText("*");       
        txtNumber32.setText("*");
        txtNumber33.setText(" ");
        txtNumber34.setText("*");
        txtNumber35.setText(" ");
        txtNumber36.setText(" ");
      
     

    }//GEN-LAST:event_btnRESETActionPerformed

    private void TxtNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumber1ActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        
             
        // Reset Time code.
        hour = 0;
        minute = 0;
        second = 0;
        millisecond = 0;
        
        TxtHr.setText(" 00: ");
        TxtM.setText(" 00: ");
        TxtS.setText(" 00: ");
        TxtMS.setText(" 0000: ");
        
        // Reset Text code.
        TxtNumber1.setText(" s");
        TxtNumber2.setText(" ");
        TxtNumber3.setText("");
        TxtNumber4.setText(" p");
        TxtNumber5.setText(" ");
        TxtNumber6.setText("");
        TxtNumber7.setText(" *");
        TxtNumber8.setText("*");
        TxtNumber9.setText(" ");
        TxtNumber10.setText("* ");
        TxtNumber11.setText(" ");
        TxtNumber12.setText(" ");
        TxtNumber13.setText(" ");
        TxtNumber14.setText("");
        TxtNumber15.setText(" ");
        TxtNumber16.setText("");
        TxtNumber17.setText(" ");
        TxtNumber18.setText(" ");        
        TxtNumber21.setText(" ");
        TxtNumber22.setText(" ");
        TxtNumber23.setText(" c");
        TxtNumber24.setText(" ");
        TxtNumber25.setText(" ");
        TxtNumber26.setText(" ");
        TxtNumber27.setText(" ");
        TxtNumber28.setText(" ");
        TxtNumber29.setText(" ");
        TxtNumber30.setText(" ");
        TxtNumber31.setText(" ");
        TxtNumber32.setText(" ");
        TxtNumber33.setText(" *");
        TxtNumber34.setText(" *");
        TxtNumber35.setText(" ");
        TxtNumber36.setText("* ");
        TxtNumber37.setText("");
        TxtNumber38.setText("");
        
    }//GEN-LAST:event_BtnResetActionPerformed

    private void TxtNumber2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber2KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber2.setEditable(true);     
      }
      else{
          TxtNumber2.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber2KeyPressed

    private void TxtNumber3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber3KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber3.setEditable(true);     
      }
      else{
          TxtNumber3.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber3KeyPressed

    private void TxtNumber5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber5KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber5.setEditable(true);     
      }
      else{
          TxtNumber5.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber5KeyPressed

    private void TxtNumber6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber6KeyPressed
       // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber6.setEditable(true);     
      }
      else{
          TxtNumber6.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber6KeyPressed

    private void TxtNumber9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber9KeyPressed
       // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber9.setEditable(true);     
      }
      else{
          TxtNumber9.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber9KeyPressed

    private void TxtNumber11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber11KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber11.setEditable(true);     
      }
      else{
          TxtNumber11.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber11KeyPressed

    private void TxtNumber12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber12KeyPressed
         // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber12.setEditable(true);     
      }
      else{
          TxtNumber12.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber12KeyPressed

    private void TxtNumber13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber13KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber13.setEditable(true);     
      }
      else{
          TxtNumber13.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber13KeyPressed

    private void TxtNumber14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber14KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber14.setEditable(true);     
      }
      else{
          TxtNumber14.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber14KeyPressed

    private void TxtNumber15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber15KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber15.setEditable(true);     
      }
      else{
          TxtNumber15.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber15KeyPressed

    private void TxtNumber16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber16KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber16.setEditable(true);     
      }
      else{
          TxtNumber16.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber16KeyPressed

    private void TxtNumber17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber17KeyPressed
         // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber17.setEditable(true);     
      }
      else{
          TxtNumber17.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber17KeyPressed

    private void TxtNumber18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber18KeyPressed
         // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber18.setEditable(true);     
      }
      else{
          TxtNumber18.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber18KeyPressed

    private void TxtNumber21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber21KeyPressed
         // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber21.setEditable(true);     
      }
      else{
          TxtNumber21.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber21KeyPressed

    private void TxtNumber22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber22KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber22.setEditable(true);     
      }
      else{
          TxtNumber22.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber22KeyPressed

    private void TxtNumber24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber24KeyPressed
         // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber24.setEditable(true);     
      }
      else{
          TxtNumber24.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber24KeyPressed

    private void TxtNumber25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber25KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber25.setEditable(true);     
      }
      else{
          TxtNumber25.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber25KeyPressed

    private void TxtNumber26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber26KeyPressed
       // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber26.setEditable(true);     
      }
      else{
          TxtNumber26.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber26KeyPressed

    private void TxtNumber27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber27KeyPressed
         // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber27.setEditable(true);     
      }
      else{
          TxtNumber27.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber27KeyPressed

    private void TxtNumber28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber28KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber28.setEditable(true);     
      }
      else{
          TxtNumber28.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber28KeyPressed

    private void TxtNumber29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber29KeyPressed
             // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber29.setEditable(true);     
      }
      else{
          TxtNumber29.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber29KeyPressed

    private void TxtNumber30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber30KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber30.setEditable(true);     
      }
      else{
          TxtNumber30.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber30KeyPressed

    private void TxtNumber31KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber31KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber31.setEditable(true);     
      }
      else{
          TxtNumber31.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber31KeyPressed

    private void TxtNumber32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber32KeyPressed
       // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber32.setEditable(true);     
      }
      else{
          TxtNumber32.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber32KeyPressed

    private void TxtNumber35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber35KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber35.setEditable(true);     
      }
      else{
          TxtNumber35.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber35KeyPressed

    private void TxtNumber37KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber37KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber37.setEditable(true);     
      }
      else{
          TxtNumber37.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber37KeyPressed

    private void TxtNumber38KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber38KeyPressed
       // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          TxtNumber38.setEditable(true);     
      }
      else{
          TxtNumber38.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_TxtNumber38KeyPressed

    private void txtNumber2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber2KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber2.setEditable(true);     
      }
      else{
          txtNumber2.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber2KeyPressed

    private void txtNumber3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber3KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber3.setEditable(true);     
      }
      else{
          txtNumber3.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber3KeyPressed

    private void txtNumber5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber5KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber5.setEditable(true);     
      }
      else{
          txtNumber5.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber5KeyPressed

    private void txtNumber6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber6KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber6.setEditable(true);     
      }
      else{
          txtNumber6.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber6KeyPressed

    private void txtNumber9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber9KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber9.setEditable(true);     
      }
      else{
          txtNumber9.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber9KeyPressed

    private void txtNumber11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber11KeyPressed
       // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber11.setEditable(true);     
      }
      else{
          txtNumber11.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber11KeyPressed

    private void txtNumber12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber12KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber12.setEditable(true);     
      }
      else{
          txtNumber12.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber12KeyPressed

    private void txtNumber13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber13KeyPressed
      // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber13.setEditable(true);     
      }
      else{
          txtNumber13.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber13KeyPressed

    private void txtNumber14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber14KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber14.setEditable(true);     
      }
      else{
          txtNumber14.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber14KeyPressed

    private void txtNumber15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber15KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber15.setEditable(true);     
      }
      else{
          txtNumber15.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber15KeyPressed

    private void txtNumber16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber16KeyPressed
               // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber16.setEditable(true);     
      }
      else{
          txtNumber16.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber16KeyPressed

    private void txtNumber17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber17KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber17.setEditable(true);     
      }
      else{
          txtNumber17.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber17KeyPressed

    private void txtNumber18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber18KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber18.setEditable(true);     
      }
      else{
          txtNumber18.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber18KeyPressed

    private void txtNumber19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber19KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber19.setEditable(true);     
      }
      else{
          txtNumber19.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber19KeyPressed

    private void txtNumber20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber20ActionPerformed
        
    }//GEN-LAST:event_txtNumber20ActionPerformed

    private void txtNumber20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber20KeyPressed
       // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber20.setEditable(true);     
      }
      else{
          txtNumber20.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber20KeyPressed

    private void txtNumber22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber22KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber22.setEditable(true);     
      }
      else{
          txtNumber22.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber22KeyPressed

    private void txtNumber23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber23KeyPressed
      // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber23.setEditable(true);     
      }
      else{
          txtNumber23.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber23KeyPressed

    private void txtNumber24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber24KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber24.setEditable(true);     
      }
      else{
          txtNumber24.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber24KeyPressed

    private void txtNumber25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber25KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber25.setEditable(true);     
      }
      else{
          txtNumber25.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber25KeyPressed

    private void txtNumber26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber26KeyPressed
      // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber26.setEditable(true);     
      }
      else{
          txtNumber26.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber26KeyPressed

    private void txtNumber27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber27KeyPressed
       // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber27.setEditable(true);     
      }
      else{
          txtNumber27.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber27KeyPressed

    private void txtNumber28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber28KeyPressed
       // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber28.setEditable(true);     
      }
      else{
          txtNumber28.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber28KeyPressed

    private void txtNumber29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber29KeyPressed
      // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber29.setEditable(true);     
      }
      else{
          txtNumber29.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber29KeyPressed

    private void txtNumber30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber30KeyPressed
    // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber30.setEditable(true);     
      }
      else{
          txtNumber30.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber30KeyPressed

    private void txtNumber33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber33KeyPressed
          // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber33.setEditable(true);     
      }
      else{
          txtNumber33.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber33KeyPressed

    private void txtNumber35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber35KeyPressed
          // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber35.setEditable(true);     
      }
      else{
          txtNumber35.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber35KeyPressed

    private void txtNumber36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber36KeyPressed
          // code JTextfield that can accept letters,Whitespace and delete backspase key only.
       char c = evt.getKeyChar();
       
      if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
         
          txtNumber36.setEditable(true);     
      }
      else{
          txtNumber36.setEditable(false);
           JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");
          
          
      }
    }//GEN-LAST:event_txtNumber36KeyPressed

    private void txtNumber22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber22ActionPerformed
        
    }//GEN-LAST:event_txtNumber22ActionPerformed

    private void txtNumber32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber32ActionPerformed
      
    }//GEN-LAST:event_txtNumber32ActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
         // This is the Exit code for Puzzle 1
         
           Component frame = new JFrame("Exit");       
        if(JOptionPane.showConfirmDialog(frame, "Do you Really want to Exit","Puzzle Game?",
             JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
            
            System.exit(0);
            
        }
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExit1ActionPerformed
        // This is the Exit code for Puzzle 2
           Component frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Do you Really want to Exit","Puzzle Game?",
             JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
            
            System.exit(0);
            
        }
    }//GEN-LAST:event_BtnExit1ActionPerformed

    private void TxtMS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMS1ActionPerformed
        
    }//GEN-LAST:event_TxtMS1ActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
      
    }//GEN-LAST:event_btnGoBackActionPerformed

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
            java.util.logging.Logger.getLogger(SecondPuzzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondPuzzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondPuzzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondPuzzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondPuzzzle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnExit1;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnStart;
    private javax.swing.JButton BtnStart1;
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JButton BtnSubmit1;
    private javax.swing.JTextField TxtHr;
    private javax.swing.JTextField TxtHr1;
    private javax.swing.JTextField TxtM;
    private javax.swing.JTextField TxtM1;
    private javax.swing.JTextField TxtMS;
    private javax.swing.JTextField TxtMS1;
    private javax.swing.JTextField TxtNumber1;
    private javax.swing.JTextField TxtNumber10;
    private javax.swing.JTextField TxtNumber11;
    private javax.swing.JTextField TxtNumber12;
    private javax.swing.JTextField TxtNumber13;
    private javax.swing.JTextField TxtNumber14;
    private javax.swing.JTextField TxtNumber15;
    private javax.swing.JTextField TxtNumber16;
    private javax.swing.JTextField TxtNumber17;
    private javax.swing.JTextField TxtNumber18;
    private javax.swing.JTextField TxtNumber2;
    private javax.swing.JTextField TxtNumber21;
    private javax.swing.JTextField TxtNumber22;
    private javax.swing.JTextField TxtNumber23;
    private javax.swing.JTextField TxtNumber24;
    private javax.swing.JTextField TxtNumber25;
    private javax.swing.JTextField TxtNumber26;
    private javax.swing.JTextField TxtNumber27;
    private javax.swing.JTextField TxtNumber28;
    private javax.swing.JTextField TxtNumber29;
    private javax.swing.JTextField TxtNumber3;
    private javax.swing.JTextField TxtNumber30;
    private javax.swing.JTextField TxtNumber31;
    private javax.swing.JTextField TxtNumber32;
    private javax.swing.JTextField TxtNumber33;
    private javax.swing.JTextField TxtNumber34;
    private javax.swing.JTextField TxtNumber35;
    private javax.swing.JTextField TxtNumber36;
    private javax.swing.JTextField TxtNumber37;
    private javax.swing.JTextField TxtNumber38;
    private javax.swing.JTextField TxtNumber4;
    private javax.swing.JTextField TxtNumber5;
    private javax.swing.JTextField TxtNumber6;
    private javax.swing.JTextField TxtNumber7;
    private javax.swing.JTextField TxtNumber8;
    private javax.swing.JTextField TxtNumber9;
    private javax.swing.JTextField TxtS;
    private javax.swing.JTextField TxtS1;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnRESET;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblPuzzleId;
    private javax.swing.JLabel lblPuzzleIds;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JTextField txtNumber10;
    private javax.swing.JTextField txtNumber11;
    private javax.swing.JTextField txtNumber12;
    private javax.swing.JTextField txtNumber13;
    private javax.swing.JTextField txtNumber14;
    private javax.swing.JTextField txtNumber15;
    private javax.swing.JTextField txtNumber16;
    private javax.swing.JTextField txtNumber17;
    private javax.swing.JTextField txtNumber18;
    private javax.swing.JTextField txtNumber19;
    private javax.swing.JTextField txtNumber2;
    private javax.swing.JTextField txtNumber20;
    private javax.swing.JTextField txtNumber21;
    private javax.swing.JTextField txtNumber22;
    private javax.swing.JTextField txtNumber23;
    private javax.swing.JTextField txtNumber24;
    private javax.swing.JTextField txtNumber25;
    private javax.swing.JTextField txtNumber26;
    private javax.swing.JTextField txtNumber27;
    private javax.swing.JTextField txtNumber28;
    private javax.swing.JTextField txtNumber29;
    private javax.swing.JTextField txtNumber3;
    private javax.swing.JTextField txtNumber30;
    private javax.swing.JTextField txtNumber31;
    private javax.swing.JTextField txtNumber32;
    private javax.swing.JTextField txtNumber33;
    private javax.swing.JTextField txtNumber34;
    private javax.swing.JTextField txtNumber35;
    private javax.swing.JTextField txtNumber36;
    private javax.swing.JTextField txtNumber4;
    private javax.swing.JTextField txtNumber5;
    private javax.swing.JTextField txtNumber6;
    private javax.swing.JTextField txtNumber7;
    private javax.swing.JTextField txtNumber8;
    private javax.swing.JTextField txtNumber9;
    // End of variables declaration//GEN-END:variables
}
