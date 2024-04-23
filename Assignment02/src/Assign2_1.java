import java.util.Scanner;

public class Assign2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int allowedCredit = 50000;
		int accountNO;
		int beginningBalance;
		int totalItemcharged;
		int allCreditsApplied;
		int newBalance;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Account No :");
		accountNO = sc.nextInt();
		
		System.out.println("Enter Pending balance at beginning of month");
		beginningBalance = sc.nextInt();
		
		System.out.println("Enter taotal of all items charged by user");
		totalItemcharged = sc.nextInt();
		
		System.out.println("Enter total of all credits appled to customers accout  :");
		allCreditsApplied = sc.nextInt();
		
		newBalance = beginningBalance + totalItemcharged - allCreditsApplied;
		
		if(newBalance > allowedCredit) {
			System.out.println("credit limit exceeded");
		}
		else {
			System.out.println("credit within limit");
		}
		
		

	}

}
