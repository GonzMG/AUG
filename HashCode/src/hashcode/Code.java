/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Code {
    public int row;
    public int column;
    public int vehicles;
    //public int rides;
    public int bonus;
    public int max_steps;
    public int steps = 0;
    public ArrayList<Ride> rides;
    public ArrayList<Car> cars;
    
    public void readFile(String fname){
        BufferedReader br = null;
        FileReader fr = null;
        rides = new ArrayList<>();
        
        // rows, columns, vehicles, rides, bonus, steps
        // o_x, o_y, f_x, f_y, start, finish
        
        try {
            fr = new FileReader(fname);
            br = new BufferedReader(fr);

            String line;
            int i = 0;

            while((line = br.readLine()) != null) {
                System.out.println(line);
                if(i == 0){
                    String[] finput;                // Data split of the first row
                    finput = line.split(" ");
                    row = Integer.parseInt(finput[0]);
                    column = Integer.parseInt(finput[1]);
                    vehicles = Integer.parseInt(finput[2]);
                    //rides = Integer.parseInt(finput[3]);
                    bonus = Integer.parseInt(finput[4]);
                    max_steps = Integer.parseInt(finput[5]);
                    
                    //Add car to cars
                    for(int z = 0; z < vehicles; z++){
                        cars.add(new Car());
                    }
                    
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
                    
                    Ride ride = new Ride(xi, yi, xf, yf, early, latest);
                    rides.add(ride);
                }
            }
        }catch(IOException e){
            System.out.println("ERROR");
        }
    }
    
    public void  getTimeCar(){
        for(Car c: cars){
            for(Ride r: rides){
                if (c.busy == false){
                    c.total_time.add(getPasos(c.x, c.y));
                }
                else{
                    c.total_time.add(-1);
                }
            }
        }
    }
}
