package hashcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author gonzalo
 */
public class HashCode {
    
    public int[][] m_data;          // Matrix with ride input data
    public static int row;
    public static int column;
    public static int vehicles;
    public static int rides;
    public static int bonus;
    public static int steps;
    
    public Ride ride;
    
    public static void main(String[] args) {
        String fname = "a_example.in";
        readFile(fname);
    }
    
    public static void readFile(String fname){
        BufferedReader br = null;
        FileReader fr = null;
        
        // rows, columns, vehicles, rides, bonus, steps
        // o_x, o_y, f_x, f_y, start, finish
        
        try {
            fr = new FileReader(fname);
            br = new BufferedReader(fr);

            String line;
            int i = 0;

            while((line = br.readLine()) != null) {
                //System.out.println(line);
                if(i == 0){
                    String[] finput;                // Data split of the first row
                    finput = line.split(" ");
                    row = Integer.parseInt(finput[0]);
                    column = Integer.parseInt(finput[1]);
                    vehicles = Integer.parseInt(finput[2]);
                    rides = Integer.parseInt(finput[3]);
                    bonus = Integer.parseInt(finput[4]);
                    steps = Integer.parseInt(finput[5]);
                }else{
                    int xi;
                    int yi;
                    int xf;
                    int yf;
                    int early;
                    int latest;
                    
                    String[] finput;                
                    finput = line.split(" ");
                    
                    xi = Integer.parseInt(finput[0]);
                    yi = Integer.parseInt(finput[1]);
                    xf = Integer.parseInt(finput[2]);
                    yf = Integer.parseInt(finput[3]);
                    early = Integer.parseInt(finput[4]);
                    latest = Integer.parseInt(finput[5]);
                    
                    ride = new Ride(xi, yi, xf, yf, early, latest);
                }
            }
        }catch(IOException e){
            System.out.println("ERROR");
        }
    }
    
}
