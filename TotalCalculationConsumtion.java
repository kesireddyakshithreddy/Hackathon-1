import java.util.Scanner;

public class TotalCalculationConsumtion {
    // Method to calculate total consumption
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read morning and evening usage from user
        System.out.print("Enter morning water usage (litres): ");
        int morningUsage = sc.nextInt();

        System.out.print("Enter evening water usage (litres): ");
        int eveningUsage = sc.nextInt();

        // Call the method to calculate total
        int totalConsumption = calculateTotal(morningUsage, eveningUsage);

        // Display result
        System.out.println("Total Water Consumption: " + totalConsumption + " litres");

        sc.close();
    }
}


