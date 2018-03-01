package hashcode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author gonzalo
 */
public class HashCode {
    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Code code = new Code();
        String fname = "a_example.in";
        code.readFile(fname);
        
        code.getTimeCar();
        code.assignCarToRide();
        code.imprimirFichero();
    }  
}
