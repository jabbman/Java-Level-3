public class Parts {

	private String partNumber;// 5 spaces
	private String description;// max 30
	private double price; // double
	private String wareHouseID; //3 chars
	private int quantity; // integer

	public Parts(String partNumber, String description, double price,
			String wareHouseID, int quantity) {
		super();

		this.partNumber = partNumber;
		this.description = description;
		this.price = price;
		this.wareHouseID = wareHouseID;
		this.quantity = quantity;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public String getWareHouseID() {
		return wareHouseID;
	}

	public int getQuantity() {
		return quantity;
	}

}
