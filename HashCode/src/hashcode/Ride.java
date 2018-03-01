/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

/**
 *
 * @author juanpamz
 */
public class Ride {
    private int x0;
    private int x1;
    private int y0;
    private int y1;
    private int earliestStart;
    private int latestFinish;
    
    public Ride(){
        x0=0;
        x1=0;
        y0=0;
        y1=0;
        earliestStart = 0;
        latestFinish = 0;
    }
    public Ride(int x0, int y0, int x1, int y1, int earliestStart, int latestFinish){
        this.x0=0;
        this.x1=0;
        this.y0=0;
        this.y1=0;
        this.earliestStart = earliestStart;
        this.latestFinish = latestFinish;
    }
    
    public int getX0(){
        return x0;
    }
    public int getX1(){
        return x1;
    }
    public int getY0(){
        return x0;
    }
    public int getY1(){
        return x0;
    }  
    public int getEarliestStart(){
        return earliestStart;
    }  
    public int getLatestFinish(){
        return latestFinish;
    }  
}
