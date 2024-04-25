
public class Invoice {
	
	//adding method local variables
	String partNo;
	String partDescription;
	int quantity;
	double pricePerItem;
	double amount;
	
	//adding paramaeterized constructor
	public Invoice(String partNo, String partDescription, int quantity, double pricePerItem) {
		super();
		this.partNo = partNo;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	//adding  getter setters
	public String getPartNo() {
		return partNo;
	}
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
    //facillitator
	double calculateAmount() {
		return amount = quantity * pricePerItem;
	}
}
