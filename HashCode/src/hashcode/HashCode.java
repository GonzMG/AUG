package hashcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author gonzalo
 */
public class HashCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fname = "prueba.in";
        readFile(fname);
    }
    
    public static void readFile(String fname){
        BufferedReader br = null;
        FileReader fr = null;
        
        //String fname = "prueba.in";
        
        try {
            fr = new FileReader(fname);
            br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("ERROR");
        }
    }
    
}
