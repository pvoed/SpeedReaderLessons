/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ModelClasses.TextChunkParser;
import ModelClasses.TextPassage;
import ModelClasses.TextScroller;
import ModelClasses.wpmTimer;
import java.awt.Window;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author DaVo
 */
public class ReadingPassageQuiz extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
   
    private TextPassage tp;
    private boolean isTiming;
    private DecimalFormat df;
    private wpmTimer wt;
    public ReadingPassageQuiz() {
        initComponents();
      
        this.tp = new TextPassage();
        this.isTiming = false;
        this.wt = new wpmTimer();
        //this.wt.setTimerLabel(this.timerLabel);
        this.df = new DecimalFormat("#.##");
        this.wt.setTimerLabel(this.timerLabel);
        this.tp.addTextPassage("Reading is becoming more and more important in the new knowledge economy and remains the most effective human activity for transforming information into knowledge. If top readers read at speeds of above 1000 words per minute (wpm) with near 85% comprehension, they only represent 1% of readers. Average readers are the majority and only reach around 200 wpm with a typical comprehension of 60%. This seems surprising since most readers, actively reading work documents, newspapers, magazines, books or the contents of a computer display are practicing daily for at least one hour. With such an intense training everyone should be close to top performances. Unfortunately, this is far from the real situation. The average reader is five time slower than the good reader. Things are even worse if we consider reading efficiency as well as speed. Reading efficiency is reading speed weighted by comprehension rate and it amounts to 200 x 60% or 120 efficient words per minute (ewpm) for the average reader and to 1000 x 85% or 850 ewpm for top readers. Thus, an efficiency ratio of seven divides these two categories. Compare the results of the average reader to other areas. We may imagine a sprinter practicing every day for several years on the running track and then just calmly walking for a race. We can also picture a racing driver never exceeding 30 mph or a pianist playing every day of the week for 20 years and only able to play music like a beginner. Unfortunately, since the age of 12, most readers do not substantially improve their efficiency and never reach their full capacity. Every computer-user who is also a slow typist is aware of the benefits he could obtain with a typing course, but nearly no one suspects the much higher profits he could reach by improving his reading comprehension and speed. The rapid improvement of voice recognition may gradually make typing virtuosity obsolete since a good typist performs well under the speed of speech. On the other hand, human or computer speaking, with an average speed of 150 wpm, will always remain many times slower than a good reader, without any consideration of the skimming and skipping possibilities. There are three possible ways to improve reading. The fastest is probably a speed reading seminar based upon good materials and animated by a dynamic instructor. It is quite usual for a slow reader to double and even triple his reading efficiency during a two-day class offering a positive atmosphere, carefully selected texts and comprehension tests. However, as this rapid and encouraging improvement is not sufficiently anchored, it often fades with time. A book about speed reading is the second possibility. Such a book usually provides speed and comprehension tests as well as techniques to improve reading. It often includes more general information about concentration, interest stimulation, skimming techniques and ways to approach a text. Some methods may include audio or videocassettes. A book-based method requires a good deal of time as well as a strong commitment from the reader. Finally, a speed reading computer program is probably the most efficient way to achieve top reading levels. Computers offer unique exercises to boost reading efficiency through interactivity, text animation and pacing. Higher reading skills obtained with a computer screen are totally transferable to reading from paper. Unfortunately the inverse way does not work so well. Speed reading software delivers enjoyable and fast paced training, thus giving the consistent practice necessary to break lifelong slow reading habits. This is the task that seminars and speed reading books usually leave up to the reader.");
        this.tp.setNumWords(597);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        StartButton = new javax.swing.JButton();
        FinButton = new javax.swing.JButton();
        timerLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        StartButton.setText("Start");
        StartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartButtonMouseClicked(evt);
            }
        });

        FinButton.setText("Done");
        FinButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinButtonMouseClicked(evt);
            }
        });

        timerLabel.setText("0.0");

        jLabel1.setText(" s");

        jLabel2.setText("Time:");

        jLabel3.setText("WPM:");

        jLabel4.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(StartButton)
                        .addGap(72, 72, 72)
                        .addComponent(FinButton)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartButton)
                    .addComponent(FinButton)
                    .addComponent(timerLabel)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButtonMouseClicked
        jTextArea1.setText(this.tp.getPharseBody());
         if (!this.isTiming) {
            this.wt.reset();
            this.isTiming = true;
            this.timerLabel.setText("0.00");
            this.wt.startTimer();
          
            this.StartButton.setText("Done & Ready To Quiz");
            new Thread(this.wt).start();
        } else {
            this.isTiming = false;
            this.wt.stopTimer();
            //stop thread
            this.wt.stopThread();
            //df.setMaximumFractionDigits(1);
            this.timerLabel.setText(" " + this.df.format(this.wt.getTime()));
            System.out.println("the time apparently in secs: " + wt.getTime());
            this.jLabel4.setText("" + this.df.format((this.tp.getNumWords() / (this.wt.getTime())) * 60));
              
             JFrame frame = new JFrame();
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             Quiz view = null;
             view = new Quiz((int)((this.tp.getNumWords() / (this.wt.getTime())) * 60));
             frame.setContentPane(view);
             frame.pack();
             frame.setVisible(true);
            
        }
        
    }//GEN-LAST:event_StartButtonMouseClicked

    private void FinButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinButtonMouseClicked
        // TODO add your handling code here:
        Window w = SwingUtilities.getWindowAncestor(ReadingPassageQuiz.this);
        w.setVisible(false);
    }//GEN-LAST:event_FinButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FinButton;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
}