/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClasses;

/**
 *
 * @author DaVo
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TextPassage {

    private int numWords, numChars;
    private String phraseBody, title;

    public TextPassage() {
        this.numWords = 0;
        this.numChars = 0;
        this.phraseBody = "-Blank Passage-";
        this.title = "No Title";
    }
    public void addTextPassage(String passage){
        this.phraseBody = passage;
        this.numChars = passage.length();
    
    }
    public void setNumWords(int numWords){
        this.numWords = numWords;
    }

    public void addTextPassageFile(String fileLocation) {
        //if not a file exist with such a name, then take it as the pharse
        File f = new File(fileLocation);
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            String line;
            this.phraseBody = "";
            this.title = fileLocation.substring(fileLocation.lastIndexOf("/") + 1);

            while ((line = br.readLine()) != null) {
                this.phraseBody = this.phraseBody + line;
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        StringTokenizer st = new StringTokenizer(this.phraseBody);
        this.numWords = st.countTokens();
        String s = this.phraseBody;
        //this.phraseBody.replaceAll(title, title)
        s.replaceAll(" ","");
        
        this.numChars = s.length();// this.phraseBody.length();
    }

    public int getNumChars() {
        return this.numChars;
    }

    public String getPharseBody() {
        return this.phraseBody;
    }

    public int getNumWords() {
        return this.numWords;
    }

    public String getTitle() {
        return this.title;
    }
}
