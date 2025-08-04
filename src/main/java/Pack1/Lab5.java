package Pack1;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n>0) {
			System.out.println("Number is positive");
		}else{
			System.out.println("Number is negative");
		}
	}
}
