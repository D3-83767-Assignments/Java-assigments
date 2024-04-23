import java.util.Scanner;

public class Assign01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		double samosa = 40.0;
		double idli = 80.0;
		double dosa = 100.0;
		double paneer = 150.0;
		double rabdi = 50.0;
		double pizza = 250.0;
		double burger = 100.0;
		double biryani = 200.0;
		double bhel = 50.0;
		
		
		double totalBill = 0.0;
		
	      while(true) {
	    	  
	        System.out.println("Enter your choice 1.Samosa 2.idli 3.dosa"
	        		+ " 4.paneer 5.rabdi 6.pizza 7.burger 8.biryani 9 bhel 10. generate bill");
	    	int choice = sc.nextInt();
	    	  
	    	
			if(choice >0 && choice <10) {
				System.out.println("Enter Count :");
		  		int count = sc.nextInt();
		  		
				switch(choice){
				//System.out.println("inside switch");
				case 1 :
					totalBill += samosa * count;
					break;
					
				case 2 :
					totalBill += idli * count;
					break;
					
				case 3 :
					totalBill += dosa * count;
					break;
					
				case 4 :
					totalBill += paneer * count;
					break;
					
				case 5 :
					totalBill += rabdi * count;
					break;
					
				case 6 :
					totalBill += pizza * count;
					break;
					
				case 7 :
					totalBill += burger * count;
					break;
				
				case 8 :
					totalBill += biryani * count;
					break;
					
				case 9 :
					totalBill += bhel * count;
					break;
				}
			}
				else if(choice == 10) {
					System.out.println("total Bill :" + totalBill);
					break;
				}
				else {
					System.out.println("wrong choice entered");
					break;
				}
	      }
	      System.out.println("Thank you !!");
			
		}
		
	   
	}



