package People;

public class Person{
	private String firstName;
	private String lastName;
	private int age;
	private char sex;
	
	public void setFirstName(String fName){
		firstName = fName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String lName){
		lastName = lName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	public void setSex(char s){
		sex = s;
	}
	public char getSex(){
		return sex;
	}
	public String getPersonInfo(){
		return "First Name: " + firstName + "\n" +
		"Last name: " + lastName + "\n" +
		"Age: " + age + "\n" +
		"Gender : " + sex + "";
	}
}
