package Pack3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data in YYYY-MM-DD");
		String inputDate = sc.nextLine();
		LocalDate givenDate = LocalDate.parse(inputDate);
		LocalDate currentDate = LocalDate.now();
	
		Period duration = Period.between(givenDate, currentDate);
	
		 System.out.println("\nDuration from " + givenDate + " to " + currentDate + " is:");
	        System.out.println(duration.getYears() + " years, " +
	                           duration.getMonths() + " months, " +
	                           duration.getDays() + " days.");
	        
	        sc.close();
	}
}
