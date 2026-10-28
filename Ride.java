package javaapplication57;

public class Ride {
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination,
                double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;

        if (distanceKm > 0) {
            this.distanceKm = distanceKm;
        } else {
            System.out.println("Warning: distanceKm must be positive. Set to 1.");
            this.distanceKm = 1;
        }
        if (durationMin > 0) {
            this.durationMin = durationMin;
        } else {
            System.out.println("Warning: durationMin must be positive. Set to 1.");
            this.durationMin = 1;
        }
        if (pricePerKm > 0) {
            this.pricePerKm = pricePerKm;
        } else {
            System.out.println("Warning: pricePerKm must be positive. Set to 1.");
            this.pricePerKm = 1;
        }
    }

    public String getPassengerName() { return passengerName; }
    public String getPickup() { return pickup; }
    public String getDestination() { return destination; }
    public double getDistanceKm() { return distanceKm; }
    public int getDurationMin() { return durationMin; }
    public double getPricePerKm() { return pricePerKm; }

    public double calculateFare() {
        return distanceKm * pricePerKm;
    }

    @Override
    public String toString() {
        return "Ride: passengerName=" + passengerName
                + ", pickup=" + pickup
                + ", destination=" + destination
                + ", distanceKm=" + distanceKm
                + ", durationMin=" + durationMin
                + ", pricePerKm=" + pricePerKm;
    }
}
