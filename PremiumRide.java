package javaapplication57;

public class PremiumRide extends Ride {
    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(String passengerName, String pickup, String destination,
                       double distanceKm, int durationMin, double pricePerKm,
                       double comfortFee, double surgeMultiplier) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        if (comfortFee >= 0) {
            this.comfortFee = comfortFee;
        } else {
            System.out.println("Warning: comfortFee cannot be negative. Set to 0.");
            this.comfortFee = 0;
        }
        if (surgeMultiplier >= 1.0 && surgeMultiplier <= 3.0) {
            this.surgeMultiplier = surgeMultiplier;
        } else {
            System.out.println("Warning: surgeMultiplier must be between 1.0 and 3.0. Set to 1.0.");
            this.surgeMultiplier = 1.0;
        }
    }

    public double getComfortFee() { return comfortFee; }
    public double getSurgeMultiplier() { return surgeMultiplier; }

    @Override
    public double calculateFare() {
        return (super.calculateFare() + comfortFee) * surgeMultiplier;
    }

    @Override
    public String toString() {
        return super.toString() + ", comfortFee=" + comfortFee
                + ", surgeMultiplier=" + surgeMultiplier;
    }
}
