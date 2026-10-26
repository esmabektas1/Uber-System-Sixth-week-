/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ubersystem;

import java.util.ArrayList;


public class UberSystem {

    public static void main(String[] args) { //main class
        ArrayList<Ride> rides = new ArrayList<>();

        Ride basicRide = new Ride("John Doe", "Downtown", "Uptown", 15.0, 30, 20.0);
        EconomyRide economyRide = new EconomyRide("Jane Smith", "Station", "Airport", 8.0, 20, 15.0, 2.5);
        PremiumRide premiumRide = new PremiumRide("Alice Johnson", "Hotel", "Convention Center", 40.0, 50, 35.0, 100.0, 1.5);
        SharedRide sharedRide = new SharedRide("Bob Brown", "Mall", "Campus", 12.0, 35, 18.0, 2.0, 3);

        rides.add(basicRide);
        rides.add(economyRide);
        rides.add(premiumRide);
        rides.add(sharedRide);

        System.out.println("===== RIDE DETAILS AND FARES =====\n");
        for (Ride ride : rides) {
            System.out.println(ride.toString());
            System.out.printf("Calculated Fare: %.2f TL\n", ride.calculateFare());
            System.out.println("--------------------------------------------------");
        }
    }
}
        
        
        
    
    

