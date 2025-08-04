package Pack1.Lab8;

public class Person {
	String fisrtName;
	String lastName;
	Gender gender;
	

	enum Gender {M, F};
	public Person() {
		
	}
	public Person(String fisrtName, String lastName, Gender gender) {
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String acceptPhoneNumber(String num) {
		return num;
	}
}
