package hashcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author gonzalo
 */
public class HashCode {
    
    public static void main(String[] args) {
        Code code = new Code();
        String fname = "a_example.in";
        code.readFile(fname);
    }  
}
