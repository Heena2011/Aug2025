package Pack1.Lab6;

public class PersonMain {

	public static void main(String[] args) {

		Person p = new Person("Heena", "Mulani", "F");

		System.out.println("Person Details");
		System.out.println("-----------------");
		System.out.println("FirstName: " + p.getFisrtName());
		System.out.println("LastName: " + p.getLastName());
		System.out.println("Gender: " + p.getGender());

	}
}
