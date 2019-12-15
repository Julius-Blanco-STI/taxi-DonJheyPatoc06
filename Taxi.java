/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SERVER
 */
public class Taxi {

private int x = 0;
private int y = 0;
private String PlateNumber = "null";
private int destEx = 0;
private int destYy = 0;
public String name = "null";

    public Taxi(String name) {
     this.name = name;
     
    }
    public int getX(){
     return this.x;
    }
    public int getY(){
     return this.y;
    }
    public String getPlateNum(){
     return this.PlateNumber;
    }
    public int getDestinationX(){
     return this.destEx;
    }
    public int getDestinationY(){
     return this.destYy;
    }
    public void run(String run){
     int t = run.length();
     for(int jhey = 0; jhey < t; jhey++){
      
      if(run.charAt(jhey) == 'l'){
       x--;
      }else if (run.charAt(jhey) == 'r'){
       x++;
      }else if (run.charAt(jhey) == 'u'){
       y++;
      }else if(run.charAt(jhey) == 'd'){
       y--;
      }
     }
    }
    public void Book(int x, int y){
     this.destEx = x;
     this.destYy = y;     
    }
    public void reachedDestination(){
     if(this.destEx == destEx && this.destYy == destYy){
      System.out.println("True");
     }
     else {
      System.out.println("False");
     }
    }
   
    public void printCurrentLocation(){
        
     System.out.println("Your location is " + x + " " + y);
     
    }
}

