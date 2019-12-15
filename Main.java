/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SERVER
 */

    public class Main {
   
    public static void main(String[] args) {
     
     Taxi x = new Taxi("ILYSM55612");
     x.run("udrrldr");
     x.printCurrentLocation();
     x.Book(1,1);
     System.out.println("Your Plate Number is " + x.name);
     x.run("Start");
     x.reachedDestination();
     
     
     
    }
}

