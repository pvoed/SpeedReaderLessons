/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClasses;

/**
 *
 * @author DaVo
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class TextChunkParser {

    private int chunkWidth, pointerLocation, numChunks, numWords;
    private ArrayList<String> pharseWords, pharseChunks;
    private String text;

    public TextChunkParser() {
        this.text = "";
        this.chunkWidth = 0;
        this.pointerLocation = 0;
        this.numChunks = 0;
        this.numWords = 0;
        this.pharseWords = new ArrayList<String>();
        this.pharseChunks = new ArrayList<String>();
  
    }

    public void clear() {
        this.text = "";
        this.chunkWidth = 0;
        this.pointerLocation = 0;
        this.numChunks = 0;
        this.numWords = 0;
        this.pharseWords.clear();
        this.pharseChunks.clear();

    }

    public void pointerPlus() {
        this.pointerLocation++;

    }

    public int getPointerLocation() {
        return this.pointerLocation;
    }

    public String getText() {
        for (int i = 0; i < pharseChunks.size(); i++) {
            this.text = this.text + (pharseChunks.get(i) + "|");
        }
        return this.text;
    }

    public void PharseText(String text) {
        StringTokenizer st = new StringTokenizer(text);
        while (st.hasMoreTokens()) {
            pharseWords.add(st.nextToken());
        }
    }

    public void chunk() {
        Iterator<String> i = pharseWords.iterator();
        String current, next;
        current = "";
        next = "";
        if (i.hasNext()) {
            while (i.hasNext()) {
                //this.numWords++;
                current = i.next();
                //System.out.println(current);
                if (current.length() > chunkWidth) {
                    this.pharseChunks.add(current);
                } else {
                    while (current.length() < chunkWidth && i.hasNext()) {

                        next = i.next();

                        if (next.length() + current.length() + 1 < chunkWidth) {
                            current = current + " " + next;
                        } else {
                            //System.out.println(current);
                            this.pharseChunks.add(current + " ");
                            current = next;
                        }
                    }
                }

            }
            this.pharseChunks.add(current);
        }
        //this.pharseChunks.add(current);
        this.numChunks = this.pharseChunks.size();
    }

    public int getNumWords() {
        StringTokenizer st = new StringTokenizer(text);
        this.numWords = st.countTokens();
        return this.numWords;

    }

    public int getNumChunks() {
        return this.numChunks;
    }

    public void printSinglePharses() {
        for (int i = 0; i < pharseChunks.size(); i++) {
            System.out.println(pharseChunks.get(i));
        }

    }

    public void setPointer(int pointerLocation) {
        this.pointerLocation = pointerLocation;
    }

    public String getChunk(int index) {
        return this.pharseChunks.get(index);

    }

    public void printSingleWords() {
        for (int i = 0; i < pharseWords.size(); i++) {
            System.out.println(pharseWords.get(i));
        }

    }

    public void setChunkWidth(int chunkWidth) {
        this.chunkWidth = chunkWidth;
    }

    public int getChunkWidth() {
        return this.chunkWidth;
    }
}
