import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		String partNo;
		String partDescription;
		int quantity;
		double pricePerItem;
		double amount;
		double checkPrice;
		int checkQuantity;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Part No : ");
		partNo = sc.next();
		System.out.println("Enter partDescription :");
		partDescription = sc.next();
		System.out.println("Enter pricePerItem");
		pricePerItem = sc.nextInt();
		System.out.println("Enter quantity: ");
		quantity = sc.nextInt();
		
		//creating obj
		Invoice obj = new Invoice(partNo, partDescription,quantity, pricePerItem);
		
		checkPrice = obj.getPricePerItem();
		if(checkPrice < 0) {
			obj.setPricePerItem(0.0);
		}
		
		checkQuantity = obj.getQuantity();
		if(checkQuantity <0) {
			obj.setQuantity(0);
		}
		
		amount =obj.calculateAmount();
		System.out.println(amount);
	}

}
