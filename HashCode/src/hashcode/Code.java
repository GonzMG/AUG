/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
    public ArrayList<Integer> cocheLleva;
    
    public void readFile(String fname){
        BufferedReader br = null;
        FileReader fr = null;
        rides = new ArrayList<>();
        cars = new ArrayList<>();
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
                i++;
            }
            //Add car to cars
            for(int z = 0; z < vehicles; z++){
                System.out.println("IM");
                cars.add(new Car());
            }
        }catch(IOException e){
            System.out.println("ERROR");
        }
    }
    
    public void  getTimeCar(){
        System.out.println(rides.size());
        for(Car c: cars){
            for(Ride r: rides){
                if (c.busy == false){
                    c.total_time.add(r.getPasos(c.getX(), c.getY()));
                }
                else{
                    c.total_time.add(-1);
                }
            }
        }
        
        for(Car c: cars){
            System.out.println("-------------------");
            System.out.println("Car total times");
            for(int i = 0; i < c.total_time.size(); i++){
                System.out.println(c.total_time.get(i) + " ");
            }
        }
    }
    
    public void assignCarToRide(){
        
        cocheLleva=new ArrayList<>();
        while(steps < max_steps && cocheLleva.size() != rides.size()){
            for(int i=0; i< rides.size(); i++){
                if(!rides.get(i).ocupado){
                    int cocheAsignado=-1;
                    for(int j=0;j<cars.size();j++){
                        if(!cars.get(j).busy){
                            int minVal=Integer.MAX_VALUE;
                            if(cars.get(j).total_time.get(i)<minVal){
                                minVal = cars.get(j).total_time.get(i);
                                cocheAsignado=j;
                            }
                        }
                    }
                    if(cocheAsignado != -1){
                        cars.get(cocheAsignado).busy=true;
                        rides.get(i).ocupado = true;
                        cocheLleva.add(cocheAsignado);
                    }
                    System.out.println("Ride:"+i+" Coche:"+cocheAsignado);
                }else{
                    
                    rides.get(i).ridePasos-=1;
                    if(rides.get(i).ridePasos==0){
                        for(int xx=0; xx<cocheLleva.size();xx++){
                            if(cocheLleva.get(xx) == i){
                                cars.get(xx).busy=false;
                            }
                        }
                    }
                }
            }
            //System.out.println("SIZE:"+cocheLleva.size());
            steps++;
        }
        System.out.println(cocheLleva);
    }
    
    public void imprimirFichero() throws FileNotFoundException, UnsupportedEncodingException{
        PrintWriter writer = new PrintWriter("archivoOut.txt", "UTF-8");
        for(int i = 0; i < cars.size(); i++){
            //
            
            writer.print(i+1 + " ");
            for(int j=0;j<cocheLleva.size();j++){
                for(int xx=0; xx<cocheLleva.size();xx++){
                    if(cocheLleva.get(xx) == i){
                        writer.print(xx + " ");
                    }
                }
            }
            
            
            //
        }
        writer.close();
    }
}
