package Pack1.Lab8;

import java.util.Scanner;

import Pack1.Lab8.Person.Gender;

public class PersonaMain {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Person p = new Person("Heena","Mulani",'F');
		Person p1 = new Person();
		p1.setFisrtName("Heena");
		p1.setLastName("Mulani");
		Gender g = Person.Gender.F;
		p1.setGender(g);
		
		System.out.println("Person Details");
		System.out.println("-----------------");
		System.out.println("FirstName: " + p1.getFisrtName());
		System.out.println("LastName: " + p1.getLastName());
		System.out.println("Gender: " + p1.getGender());
		System.out.println("Enter mobile number:");
		String acceptedNumber = sc.next();
		System.out.println("Mobile Number: "+ acceptedNumber);
		
}
}