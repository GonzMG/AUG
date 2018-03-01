/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import static java.lang.Math.abs;

public class Ride {
    private int x0;
    private int x1;
    private int y0;
    private int y1;
    private int earliestStart;
    private int latestFinish;
    public boolean ocupado;
    public int ridePasos;
    
    public Ride(){
        x0=0;
        x1=0;
        y0=0;
        y1=0;
        earliestStart = 0;
        latestFinish = 0;
        ocupado = false;
        ridePasos = abs(this.x1-this.x0)+abs(this.y1-this.y0);
    }
    public Ride(int x0, int y0, int x1, int y1, int earliestStart, int latestFinish){
        this.x0=x0;
        this.y0=y0;
        this.x1=x1;
        this.y1=y1;
        this.earliestStart = earliestStart;
        this.latestFinish = latestFinish;
        ocupado=false;
        ridePasos = abs(this.x1-this.x0)+abs(this.y1-this.y0);
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
    public int getPasos(int carX, int carY){
        int pasos = abs(carX-this.x0)+abs(carY-this.y0);
        if(earliestStart >= pasos){
            pasos = earliestStart;
        }
        return pasos;
    }
}
