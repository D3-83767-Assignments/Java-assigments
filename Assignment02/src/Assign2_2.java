import java.util.Scanner;

public class Assign2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int totalMilesPerDay;
         int costPerGallon;
         int avgPerGallon;
         int parkingFees;
         int tollsPerDay;
         int drivingCost;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter Total miles driven per day");
         totalMilesPerDay = sc.nextInt();
         
         System.out.println("Cost per gallon of gasoline");
         costPerGallon = sc.nextInt();
         
         System.out.println("Average miles per gallon");
         avgPerGallon = sc.nextInt();
         
         System.out.println("Parking fees per day");
         parkingFees = sc.nextInt();
         
         System.out.println("Tolls per day");
         tollsPerDay = sc.nextInt();
         
         drivingCost = (totalMilesPerDay / avgPerGallon) * costPerGallon + parkingFees + tollsPerDay;
         
         System.out.println("Your daily driving cost : " + drivingCost);
	}

}
