/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import java.util.ArrayList;

/**
 *
 * @author juanpamz
 */
public class Car {
    private int x;
    private int y;
    ArrayList<Integer> rides;
    public Car(){
        x = 0;
        y = 0;
        rides = new ArrayList<Integer>();
    }
    public Car(int x, int y, ArrayList<Integer> rides){
        this.x = x;
        this.y = y;
        this.rides = rides;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public ArrayList<Integer> getRides(){
        return rides;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setRides(ArrayList<Integer> rides){
        this.rides=rides;
    }
    
}
