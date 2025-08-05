package Pack3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab12 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input first date
	        System.out.print("Enter first date (YYYY-MM-DD): ");
	        LocalDate firstDate = LocalDate.parse(sc.nextLine());

	        // Input second date
	        System.out.print("Enter second date (YYYY-MM-DD): ");
	        LocalDate secondDate = LocalDate.parse(sc.nextLine());

	        // Ensure the first date is before the second
	        if (firstDate.isAfter(secondDate)) {
	            // Swap dates if needed
	            LocalDate temp = firstDate;
	            firstDate = secondDate;
	            secondDate = temp;
	        }

	        // Calculate the period between the two dates
	        Period duration = Period.between(firstDate, secondDate);

	        // Print result
	        System.out.println("\nDuration between " + firstDate + " and " + secondDate + ":");
	        System.out.println(duration.getYears() + " years, " +
	                           duration.getMonths() + " months, " +
	                           duration.getDays() + " days.");

	        sc.close();
	    }
}
