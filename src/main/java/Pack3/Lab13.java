package Pack3;

import java.time.LocalDate;
import java.util.Scanner;

public class Lab13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input purchase date
        System.out.print("Enter product purchase date (YYYY-MM-DD): ");
        String dateInput = sc.nextLine();
        LocalDate purchaseDate = LocalDate.parse(dateInput);

        // Input warranty period
        System.out.print("Enter warranty period (Years): ");
        int years = sc.nextInt();

        System.out.print("Enter warranty period (Months): ");
        int months = sc.nextInt();

        // Call method
        LocalDate expiryDate = getWarrantyExpiryDate(purchaseDate, years, months);

        // Print expiry date
        System.out.println("\nWarranty expires on: " + expiryDate);

        sc.close();
    }

    // Method to calculate expiry date
    public static LocalDate getWarrantyExpiryDate(LocalDate purchaseDate, int years, int months) {
        return purchaseDate.plusYears(years).plusMonths(months);
    }
}
