import People.*;
import java.util.Scanner;

public class MakeAPerson{
	public static void main(String[] args){
		Person you = new Person();
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("Enter your First Name: ");
		you.setFirstName(inputDevice.nextLine());
		//you.firstName = inputDevice.nextLine();
		
		System.out.print("Enter your Last Name: ");
		you.setLastName(inputDevice.nextLine());
		//you.lastName = inputDevice.nextLine();
		
		System.out.print("Enter your Age: ");
		you.setAge(inputDevice.nextInt());
		//you.age = nextInt();
		inputDevice.nextLine();
		
		System.out.print("Enter your Sex/Gender '(m or f)': ");
		you.setSex(inputDevice.next().charAt(0));
		//you.sex = inputDevice.nextChar();
		
		System.out.println("");
		System.out.println(you.getPersonInfo());
	}
}