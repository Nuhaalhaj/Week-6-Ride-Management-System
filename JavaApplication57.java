package javaapplication57;

import java.util.ArrayList;

public class JavaApplication57 {
    public static void main(String[] args) {
        ArrayList<Ride> rides = new ArrayList<>();

        rides.add(new Ride("Ali", "Home", "School", 10.0, 20, 5.0));
        rides.add(new EconomyRide("Ali", "Kayseri", "Konya", 150, 50, 23, 5.0));
        rides.add(new PremiumRide("Ahmet", "Istanbul", "Bursa", 70, 45, 6.0, 45, 2.0));
        rides.add(new SharedRide("Mohamed", "Kayseri", "Eskisehir", 80, 23, 56, 8.0, 2));

        for (int i = 0; i < rides.size(); i++) {
            System.out.println(rides.get(i));
            double fare = rides.get(i).calculateFare();
            System.out.printf("Fare: %.2f TL%n%n", fare);
        }
    }
}
