package javaapplication57;

public class EconomyRide extends Ride {
    private double pricePerMinute;

    public EconomyRide(String passengerName, String pickup, String destination,
                       double distanceKm, int durationMin, double pricePerKm,
                       double pricePerMinute) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        if (pricePerMinute >= 0) {
            this.pricePerMinute = pricePerMinute;
        } else {
            System.out.println("Warning: pricePerMinute cannot be negative. Set to 0.");
            this.pricePerMinute = 0;
        }
    }

    public double getPricePerMinute() { return pricePerMinute; }

    @Override
    public double calculateFare() {
        double result = super.calculateFare() + getDurationMin() * pricePerMinute;
        if (result < 50) {
            return 50;
        } else {
            return result;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", pricePerMinute=" + pricePerMinute;
    }
}
