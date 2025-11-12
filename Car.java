import java.util.Scanner;

class Car {
    // Fields
    String model;
    double rentPerDay;
    int daysRented;

    // Constructor
    Car(String model, double rentPerDay, int daysRented) {
        this.model = model;
        this.rentPerDay = rentPerDay;
        this.daysRented = daysRented;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Rent Per Day: ₹" + rentPerDay);
        System.out.println("Days Rented: " + daysRented);
    }

    // Method to calculate total rent
    double calculateRent() {
        return rentPerDay * daysRented;
    }

    // Method to display total rent
    void displayTotalRent() {
        System.out.println("Total Rent for " + model + ": ₹" + calculateRent());
        System.out.println("-----------------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to hold 3 Car objects
        Car[] cars = new Car[3];

        // Get input for 3 cars
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Car " + (i + 1) + ":");

            System.out.print("Enter Car Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Rent Per Day (₹): ");
            double rentPerDay = sc.nextDouble();

            System.out.print("Enter Number of Days Rented: ");
            int daysRented = sc.nextInt();
            sc.nextLine(); // consume newline

            cars[i] = new Car(model, rentPerDay, daysRented);
        }

        // Display details and total rent for all cars
        System.out.println("\n========== CAR RENT DETAILS ==========");
        for (Car car : cars) {
            car.displayDetails();
            car.displayTotalRent();
        }

        sc.close();
    }
}
