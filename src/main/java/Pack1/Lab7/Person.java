package Pack1.Lab7;

public class Person {

	String fisrtName;
	String lastName;
	String gender;
	String mobNum;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String acceptPhoneNumber(String num) {
		return num;
	}
	
	public String display() {
		return "Person [fisrtName=" + fisrtName + ", lastName=" + lastName + ", gender=" + gender + ", mobNum=" + mobNum
				+ "]";
	}

	
}
