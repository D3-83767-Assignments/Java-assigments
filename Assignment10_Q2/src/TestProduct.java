import java.util.Arrays;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Product[ ]arr = new Product[3];
//		arr[0] = new Product(1,"Anil","mobile",6000);
//		arr[1] = new Product(1,"Anil","nytrogen",6000);
//		arr[2] = new Product(1,"Anil","apple",6000);
		Product[] arr = {
				new Product(1,"Anil","mobile",6000),
				new Product(2,"Mukesh","headphone",3000),
				new Product(5, "Sham","earphone",5000),
				new Product(1,"Nikhil","keyboard",9000),
				new Product(3, "Akash","purse",7000), 
				new Product(4,"Anil","shoose", 6000),
				new Product(2,"Mukesh","jeans", 3000),
				new Product(5, "Sham","ipad", 5000),
				new Product(1,"Nikhil","cords", 9000),
				new Product(3, "Akash","shirts",7000)};
	
		System.out.println("Before sorting --> ");
		for (Product product : arr)
			System.out.println(product);
		
	     Arrays.sort(arr);
		
		System.out.println("After sorting --> ");
		for (Product product : arr)
			System.out.println(product);

	}

}
