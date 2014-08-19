/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClasses;

import java.text.DecimalFormat;
import javax.swing.JPanel;

/**
 *
 * @author DaVo
 */
public class wpmTimer extends JPanel implements Runnable {

    private double startTime, finishTime, time, wpm;
    private boolean isTiming;
    private int numWords;
    private javax.swing.JLabel timerLabel;
    private volatile Thread blinker;
    private DecimalFormat df;

    public wpmTimer() {
        this.startTime = 0;
        this.finishTime = 0;
        this.time = 0;
        this.isTiming = false;
        this.numWords = 0;
        this.wpm = 0;
        df = new DecimalFormat("#.#");

    }

    public void reset() {
        this.startTime = 0;
        this.finishTime = 0;
        this.time = 0;
        this.isTiming = false;
        this.numWords = 0;
        this.wpm = 0;

    }

    public boolean isTiming() {
        return this.isTiming;
    }

    public void stopThread() {
        this.blinker = null;
    }

    public void setTimerLabel(javax.swing.JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    public void startTimer() {
        if (!this.isTiming) {
            this.time = 0;
            this.startTime = System.currentTimeMillis();
            this.isTiming = true;
            //System.out.println("Timer Started...");
        } else {
            System.out.println("Timer is already timing...");
        }
    }

    public void stopTimer() {
        if (!this.isTiming) {
            System.out.println("Timer hasn't started...");
        }
        this.finishTime = System.currentTimeMillis();
        this.time = (this.finishTime - this.startTime) / 1000;
        this.isTiming = false;
    }

    public double getTime() {
        if (this.isTiming == true) {
            this.time = (System.currentTimeMillis() - this.startTime) / 1000;
        }
        return this.time;
    }

    public void setNumWords(int numWords) {
        this.numWords = numWords;
    }

    public int getNumWords() {
        return this.numWords;
    }

    public double getWpm() {
        this.wpm = ((long) this.numWords / this.time) * 60;
        return this.wpm;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
        this.time = this.wpm / this.numWords;
    }

    @Override
    public void run() {
        Thread thisThread = Thread.currentThread();
        this.blinker = thisThread;
        while (blinker == thisThread) {
            this.timerLabel.setText(" " + this.df.format(getTime()));
            repaint();
            try {
                thisThread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }

    }
}
