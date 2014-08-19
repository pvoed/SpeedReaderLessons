/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ModelClasses.TextChunkParser;
import ModelClasses.TextPassage;
import ModelClasses.TextScroller;
import ModelClasses.wpmTimer;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author DaVo
 */
public class ReadHelper extends javax.swing.JPanel {

    private TextChunkParser tcp;
    private TextPassage tp;
    private wpmTimer wt;
    private boolean isTiming;
    private JFileChooser javaFileChooser;
    private TextScroller ts;
    private DecimalFormat df;
    //private Thread TextThread;

    public ReadHelper() {
        initComponents();
        this.javaFileChooser = new JFileChooser();
        this.tcp = new TextChunkParser();
        this.tp = new TextPassage();
        this.wt = new wpmTimer();
        this.isTiming = false;
        this.ts = new TextScroller();
        this.wt.setTimerLabel(this.timerLabel);
        this.df = new DecimalFormat("#.#");
        //TextThread = new Thread(ts);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartTimerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTextPane = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        UploadButton = new javax.swing.JButton();
        chunkSIzeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SetChunkButton = new javax.swing.JButton();
        JumpButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        wpmLabel = new javax.swing.JLabel();
        CalculateBUtton = new javax.swing.JButton();
        AutomateButtton = new javax.swing.JButton();
        wpmTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SingleChunkPrint = new javax.swing.JTextField(){
            @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g); // Do the original draw
                g.drawLine(SingleChunkPrint.getWidth()/2, 0, SingleChunkPrint.getWidth()/2, SingleChunkPrint.getHeight()); // Write here your coordinates
            }
        };
        InsLabel = new javax.swing.JLabel();
        quizButton = new javax.swing.JButton();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jumpHandler(evt);
            }
        });

        StartTimerButton.setText("Start Timer");
        StartTimerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartTimerButtonMouseClicked(evt);
            }
        });

        mainTextPane.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        mainTextPane.setFocusable(false);
        jScrollPane1.setViewportView(mainTextPane);

        jLabel1.setText("Time:");

        timerLabel.setText("0");

        UploadButton.setText("Upload File");
        UploadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UploadButtonMouseClicked(evt);
            }
        });

        chunkSIzeTextField.setText("20");
        chunkSIzeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chunkSIzeTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("s");

        jLabel4.setText("ChunkSize");

        SetChunkButton.setText("set");
        SetChunkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetChunkButtonMouseClicked(evt);
            }
        });

        JumpButton.setText("Jump");
        JumpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JumpButtonMouseClicked(evt);
            }
        });

        jLabel5.setText("WMP:");

        wpmLabel.setText("0.0");

        CalculateBUtton.setText("Calculate");
        CalculateBUtton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalculateBUttonMouseClicked(evt);
            }
        });

        AutomateButtton.setText("Automate");
        AutomateButtton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AutomateButttonMouseClicked(evt);
            }
        });

        jLabel7.setText("WMP");

        SingleChunkPrint.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        SingleChunkPrint.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        InsLabel.setText("Keep your eyes in the middle of the line and try to absorb the whole chunked phrase.");

        quizButton.setText("Test Reading Compreshension");
        quizButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quizButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(quizButton)
                                .addGap(460, 460, 460)
                                .addComponent(CalculateBUtton)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(wpmLabel)
                                .addGap(0, 64, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UploadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JumpButton)
                                .addGap(336, 336, 336)
                                .addComponent(StartTimerButton))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(timerLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chunkSIzeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SingleChunkPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(SetChunkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(214, 214, 214)
                                                .addComponent(AutomateButtton)
                                                .addGap(18, 18, 18)
                                                .addComponent(wpmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel7)))))
                                .addGap(143, 143, 143)))))
                .addGap(67, 67, 67))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(timerLabel)
                    .addComponent(jLabel3)
                    .addComponent(SingleChunkPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartTimerButton)
                    .addComponent(UploadButton)
                    .addComponent(JumpButton))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AutomateButtton)
                        .addComponent(wpmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(chunkSIzeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(SetChunkButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CalculateBUtton)
                            .addComponent(wpmLabel)
                            .addComponent(jLabel5)
                            .addComponent(quizButton))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UploadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadButtonMouseClicked
        //a dialog box asking for the files location
        int rc = this.javaFileChooser.showOpenDialog(this);
        if (rc == JFileChooser.APPROVE_OPTION) {
            File selected = this.javaFileChooser.getSelectedFile();
            File dir = selected;
            System.out.println(dir.getPath());
            this.tp.addTextPassageFile(dir.getPath());
            //checks to see if there are any values in the set chunksize textfield
            this.tcp.clear();
            this.mainTextPane.setText("");
            if (this.chunkSIzeTextField.getText() == null) {
                this.tcp.setChunkWidth(20);
            } else {
                this.tcp.setChunkWidth(Integer.parseInt(this.chunkSIzeTextField.getText()));
            }
            //uploads file onto the parser
            this.tcp.PharseText(tp.getPharseBody());
            this.tcp.chunk();
            System.out.println("Num Chunks: " + this.tcp.getNumChunks());
            this.tcp.printSinglePharses();
            //styleizes the text before printing
            StyledDocument sd = mainTextPane.getStyledDocument();
            SimpleAttributeSet bold = new SimpleAttributeSet();
            SimpleAttributeSet plain = new SimpleAttributeSet();
            StyleConstants.setBold(bold, true);
            StyleConstants.setUnderline(bold, true);


            try {
                for (int i = 0; i < this.tcp.getNumChunks(); i++) {
                    if (i == this.tcp.getPointerLocation()) {
                        sd.insertString(sd.getLength(), this.tcp.getChunk(i), bold);

                        SingleChunkPrint.setText(tcp.getChunk(i));
                    } else {
                        sd.insertString(sd.getLength(), this.tcp.getChunk(i), plain);

                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_UploadButtonMouseClicked

    private void StartTimerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartTimerButtonMouseClicked

        if (!this.isTiming) {
            this.wt.reset();
            this.isTiming = true;
            this.timerLabel.setText("0.0");
            this.wt.startTimer();
            this.StartTimerButton.setText("Stop Timer");
            //run thread
            new Thread(this.wt).start();
        } else {
            this.isTiming = false;
            this.wt.stopTimer();
            //stop thread
            this.wt.stopThread();
            this.StartTimerButton.setText("Start Timer");
            //df.setMaximumFractionDigits(1);
            this.timerLabel.setText(" " + this.df.format(this.wt.getTime()));
        }
        //System.out.println("time afer timer has stoped: " + df.format(wt.getTime()));
        //System.out.println("isTiming : " + wt.isTiming());
    }//GEN-LAST:event_StartTimerButtonMouseClicked

    private void chunkSIzeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chunkSIzeTextFieldActionPerformed
    }//GEN-LAST:event_chunkSIzeTextFieldActionPerformed

    private void SetChunkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetChunkButtonMouseClicked
        this.mainTextPane.setText("");
        if (Integer.parseInt(this.chunkSIzeTextField.getText()) <= 0 || Integer.parseInt(this.chunkSIzeTextField.getText()) > 0) {
            tcp.clear();
            this.tcp.setChunkWidth(Integer.parseInt(this.chunkSIzeTextField.getText()));
            //uploads file onto the parser
            this.tcp.PharseText(tp.getPharseBody());
            this.tcp.chunk();
            System.out.println("Num Chunks: " + this.tcp.getNumChunks());
            this.tcp.printSinglePharses();
            //styleizes the text before printing
            StyledDocument sd = mainTextPane.getStyledDocument();
            SimpleAttributeSet bold = new SimpleAttributeSet();
            SimpleAttributeSet plain = new SimpleAttributeSet();
            StyleConstants.setBold(bold, true);
            StyleConstants.setUnderline(bold, true);


            try {
                for (int i = 0; i < this.tcp.getNumChunks(); i++) {
                    if (i == this.tcp.getPointerLocation()) {
                        sd.insertString(sd.getLength(), this.tcp.getChunk(i), bold);
                        this.SingleChunkPrint.setLocation((this.getWidth() / 2) - (8 * this.tcp.getChunk(i).length()) / 2, this.SingleChunkPrint.getLocation().y);
                        this.SingleChunkPrint.setSize(8 * this.tcp.getChunk(i).length(), this.SingleChunkPrint.getHeight());
                        SingleChunkPrint.setText(tcp.getChunk(i));
                    } else {
                        sd.insertString(sd.getLength(), this.tcp.getChunk(i), plain);
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            this.tcp.setChunkWidth(20);
        }

    }//GEN-LAST:event_SetChunkButtonMouseClicked

    private void JumpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JumpButtonMouseClicked

        this.tcp.pointerPlus();
        this.mainTextPane.setText("");

        //allows text stylizations
        StyledDocument sd = this.mainTextPane.getStyledDocument();
        SimpleAttributeSet underline = new SimpleAttributeSet();
        SimpleAttributeSet bold = new SimpleAttributeSet();
        SimpleAttributeSet plain = new SimpleAttributeSet();
        //StyleConstants.setUnderline(underline, true);
        StyleConstants.setBold(bold, true);
        StyleConstants.setUnderline(bold, true);
        try {
            for (int i = 0; i < this.tcp.getNumChunks(); i++) {

                if (i == this.tcp.getPointerLocation()) {
                    sd.insertString(sd.getLength(), this.tcp.getChunk(i), bold);
                    SingleChunkPrint.setText(tcp.getChunk(i));
                    this.SingleChunkPrint.setLocation((this.getWidth() / 2) - (8 * this.tcp.getChunk(i).length()) / 2, this.SingleChunkPrint.getLocation().y);
                    this.SingleChunkPrint.setSize(8 * this.tcp.getChunk(i).length(), this.SingleChunkPrint.getHeight());
                } else {
                    sd.insertString(sd.getLength(), this.tcp.getChunk(i), plain);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (tcp.getPointerLocation() >= tcp.getNumChunks()) {
            tcp.setPointer(-1);
        }
    }//GEN-LAST:event_JumpButtonMouseClicked

    private void CalculateBUttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculateBUttonMouseClicked
        //System.out.println(wt.getWpm());
        //System.out.println("wt.isTiming: " + wt.isTiming());
        //System.out.println("wt.getTime: " + wt.getTime());
        //System.out.println(df.format((tp.getNumWords() / (wt.getTime())) * 60));
        System.out.println("the time apparently in secs: " + wt.getTime());
        this.wpmLabel.setText("" + this.df.format((this.tp.getNumWords() / (this.wt.getTime())) * 60));
    }//GEN-LAST:event_CalculateBUttonMouseClicked

    private void jumpHandler(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumpHandler

    }//GEN-LAST:event_jumpHandler

    private void AutomateButttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AutomateButttonMouseClicked
        //wpm to cpm has a factor of 5 in the english language
        //wpm -> cpm -> cps
        if (!this.ts.isActive()) {
            //this.ts = new TextScroller(this.tcp, this.tp, Integer.parseInt(this.wpmTextField.getText()), this.mainTextPane, this.AutomateButtton, this.SingleChunkPrint);//,this.tp.getNumChars(), this.tp.getNumWords());
            this.ts = new TextScroller(this.tcp, this.tp, Integer.parseInt(this.wpmTextField.getText()), this.mainTextPane, this.AutomateButtton, this.SingleChunkPrint);
            //System.out.println("numChar " +this.tp.getNumChars()+" numwords: "+ this.tp.getNumWords()+ "char/words: "+ (this.tp.getNumChars()/this.tp.getNumWords()));
            new Thread(this.ts).start();
            this.ts.setActive();
            this.AutomateButtton.setText("Stop Automating");
        } else if (this.ts.isActive()) {
            this.ts.setDeactive();
            this.ts.stopThread();
            this.AutomateButtton.setText("Automate");
        }

    }//GEN-LAST:event_AutomateButttonMouseClicked

    private void quizButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quizButtonMouseClicked
        // TODO add your handling code here:
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ReadingPassageQuiz view = null;
        view = new ReadingPassageQuiz();
        frame.setContentPane(view);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_quizButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AutomateButtton;
    private javax.swing.JButton CalculateBUtton;
    private javax.swing.JLabel InsLabel;
    private javax.swing.JButton JumpButton;
    private javax.swing.JButton SetChunkButton;
    private javax.swing.JTextField SingleChunkPrint;
    private javax.swing.JButton StartTimerButton;
    private javax.swing.JButton UploadButton;
    private javax.swing.JTextField chunkSIzeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane mainTextPane;
    private javax.swing.JButton quizButton;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JLabel wpmLabel;
    private javax.swing.JTextField wpmTextField;
    // End of variables declaration//GEN-END:variables
}
