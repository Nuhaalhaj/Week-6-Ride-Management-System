package javaapplication57;

public class SharedRide extends EconomyRide {
    private int passengerCount;

    public SharedRide(String passengerName, String pickup, String destination,
                      double distanceKm, int durationMin, double pricePerKm,
                      double pricePerMinute, int passengerCount) {
        super(passengerName, pickup, destination, distanceKm, durationMin,
              pricePerKm, pricePerMinute);
        if (passengerCount >= 1 && passengerCount <= 4) {
            this.passengerCount = passengerCount;
        } else {
            System.out.println("Warning: passengerCount must be between 1 and 4. Set to 1.");
            this.passengerCount = 1;
        }
    }

    public int getPassengerCount() { return passengerCount; }

    @Override
    public double calculateFare() {
        return (super.calculateFare() / passengerCount) * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", passengerCount=" + passengerCount;
    }
}
