/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ubersystem;


public class SharedRide extends EconomyRide {
    private int passengerCount;

    public SharedRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMinute, int passengerCount) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm, pricePerMinute);

        if (passengerCount < 1 || passengerCount > 4) {
            System.out.println("Warning: passengerCount must be between 1 and 4. Set to default 1.");
            this.passengerCount = 1;
        } else {
            this.passengerCount = passengerCount;
        }
    }

    public int getPassengerCount() {
        return passengerCount;
    }
    @Override
    public double calculateFare() {
        double economyFare = super.calculateFare();
        return (economyFare / passengerCount) * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Passenger Count: " + passengerCount;
    }
}
    
    
    
   
