import java.util.Scanner; //importing Scanner

public class Voter {
	public static void main(String[] args){
		int age; //initializing variable age
		Scanner input = new Scanner(System.in);
		System.out.println("Enter voter's age: ");
		age = input.nextInt(); //Taking in user input
		if (age>=18) {  //Deciding whether voter is eligible
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
		input.close(); //closing scanner
	}
}
