/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ubersystem;


public class Ride {
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;
        if(distanceKm<0){
            System.out.println("Warning: distanceKm must be positive");
            this.distanceKm=1;
        }else{
            this.distanceKm = distanceKm;
        }
        if(durationMin<0){
            System.out.println("Warning: durationMin must be positive.");
            this.durationMin=1;
        }else{
            this.durationMin = durationMin;
        }
        if(pricePerKm<0){
            System.out.println("Warning: pricePerKm must be positive.");
            this.pricePerKm=1;
        }else{
            this.pricePerKm = pricePerKm;
        }
        
    }

    public String getPassengerNumber() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }
    public double calculateFare(){
        return distanceKm*pricePerKm;
    }
    @Override
    public String toString(){
        return "Passenger: " + passengerName +
               ", Pickup: " + pickup +
               ", Destination: " + destination +
               ", Distance: " + distanceKm + " km" +
               ", Duration: " + durationMin + " mins" +
               ", Price/Km: " + pricePerKm + " TL";
    }
    
    
    
}
