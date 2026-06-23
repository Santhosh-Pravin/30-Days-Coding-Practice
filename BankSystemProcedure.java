import java.util.Scanner;
public class BankSystemProcedure {
    public static void main(String[] args) {
		int total=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of accounts");
		int n = input.nextInt();
		input.nextLine();
        int[] balances = new int[n];
		String add_more="y";
		for(int j=0;add_more.equals("y") && j<n;j++){
			System.out.println("Enter Account Balance");
			balances[j] = input.nextInt();
			input.nextLine();
		    System.out.println("Do you want to add more? (y/n)");
			add_more = input.nextLine();
		}
		for(int i=0; i<balances.length;i++){
			total+=balances[i];
		}
		System.out.println("The total is "+total);
    }
}
