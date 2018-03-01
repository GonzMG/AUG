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
    ArrayList<Integer> total_time;
    public Car(){
        x = 0;
        y = 0;
        total_time = new ArrayList<Integer>();
    }
    public Car(int x, int y, ArrayList<Integer> total_time){
        this.x = x;
        this.y = y;
        this.total_time = total_time;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public ArrayList<Integer> getRides(){
        return total_time;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setRides(ArrayList<Integer> total_time){
        this.total_time=total_time;
    }
    
}
