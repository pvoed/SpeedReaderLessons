/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClasses;

//import java.text.DecimalFormat;
import javax.swing.JPanel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author DaVo
 */
public class TextScroller extends JPanel implements Runnable {

    private TextChunkParser tcp;
    private TextPassage tp;
    private boolean isActive;
    private int wpm;
    private javax.swing.JTextPane TextArea;
    private javax.swing.JTextField singlePrintArea;
    private double charPerMin, charPerSecond, secondsPerChunk, avgWords;
    private volatile Thread blinker;
    private javax.swing.JButton autoButton;

    public TextScroller() {
    }

    public TextScroller(TextChunkParser tcp, TextPassage tp, int wpm, javax.swing.JTextPane TextArea, javax.swing.JButton autoButton, javax.swing.JTextField singlePrintArea) {
        this.isActive = false;
        this.tcp = tcp;
        this.tp = tp;
        this.wpm = wpm;
        this.TextArea = TextArea;
        this.autoButton = autoButton;
        System.out.println("wpm : " + this.wpm);
        this.avgWords = ((double) this.tp.getNumChars() / (double) this.tp.getNumWords());
        System.out.println("avg words: " + this.avgWords);
        this.charPerMin = (double) this.wpm * this.avgWords;
        this.charPerSecond = this.charPerMin / 60;
        this.singlePrintArea = singlePrintArea;
        //System.out.println("numChar " +this.tp.getNumChars()+" numwords: "+ this.tp.getNumWords()+ "char/words: "+ (this.tp.getNumChars()/this.tp.getNumWords()));

        System.out.println("charPerSec = " + this.charPerSecond + " -> CharPerMin/60 =" + this.charPerMin + "/60");
        //System.out.println("new theory: " +(this.charPerSecond*.0001));
        this.secondsPerChunk = (double) tcp.getChunkWidth() / this.charPerSecond;
        System.out.println("secondsperchunk * num chunks total time for reading it: " + this.secondsPerChunk * tcp.getNumChunks() + " in mins its : " + ((this.secondsPerChunk * tcp.getNumChunks()) / 60));
        //System.out.println(tcp.getChunkWidth());
        System.out.println(this.secondsPerChunk * 1000 + " milisconds pre chunk");
        System.out.println("seconds = " + this.secondsPerChunk);// * 1000));

    }

    public void stopThread() {
        this.blinker = null;
    }

    public void setActive() {
        this.isActive = true;
    }

    public void setDeactive() {
        this.isActive = false;
    }

    public boolean isActive() {
        return this.isActive;
    }

    @Override
    public void run() {
        /*
         double charPerMin = this.wpm*5;
         double charPerSecond = charPerMin/60;
         double secondsPerChunk = tcp.getChunkWidth()/charPerSecond;
         //if(secondsPerChunk<1){
         //    secondsPerChunk = 1;
         //}
      
    
         DecimalFormat df = new DecimalFormat("#.##");
         System.out.println("charPerMin: "+df.format(charPerMin));
         System.out.println("charPerSecond: "+df.format(charPerSecond));
         System.out.println("secondsPerChunk: "+df.format(secondsPerChunk));
         */
        //System.out.println("pointer loc: : " +this.tcp.getPointerLocation() +" numChunks: "+ this.tcp.getNumChunks());
        Thread thisThread = Thread.currentThread();
        this.blinker = thisThread;
        while (this.blinker == thisThread) {


            for (int j = this.tcp.getPointerLocation(); j < this.tcp.getNumChunks(); j++) {

                this.tcp.pointerPlus();
                this.TextArea.setText("");
                //style sheet
                StyledDocument sd = this.TextArea.getStyledDocument();
                //SimpleAttributeSet underline = new SimpleAttributeSet();
                SimpleAttributeSet bold = new SimpleAttributeSet();
                SimpleAttributeSet plain = new SimpleAttributeSet();
                //StyleConstants.setUnderline(underline, true);
                StyleConstants.setBold(bold, true);
                StyleConstants.setUnderline(bold, true);
                //print out entire pharse with the new location bolded
                try {

                    for (int i = 0; i < tcp.getNumChunks(); i++) {

                        if (i == tcp.getPointerLocation()) {
                            sd.insertString(sd.getLength(), tcp.getChunk(i), bold);//, bo(this.getWidth() / 2ld);
                            //this.singlePrintArea.setLocation(this.singlePrintArea.getLocation().x - (8 * this.tcp.getChunk(i).length()) / 2, this.singlePrintArea.getLocation().y);
                            //this.singlePrintArea.setSize(8 * this.tcp.getChunk(i).length(), this.singlePrintArea.getHeight());
                            this.singlePrintArea.setText(tcp.getChunk(i));

                        } else {
                            sd.insertString(sd.getLength(), tcp.getChunk(i), plain);
                            //chunkSIzeTextField.setText(tcp.getChunk(i));
                        }

                    }

                } catch (Exception e) {
                    System.out.println(e);
                }



                repaint();

                //sleep based on time provided per chunk
                try {
                    Thread.sleep((int) (this.secondsPerChunk * 1000));
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                if (!this.isActive) {
                    this.blinker = null;
                    this.isActive = false;
                    j = tcp.getNumChunks();
                }
            }
            this.blinker = null;
            this.isActive = false;
            this.autoButton.setText("Automate");
        }



    }
}
