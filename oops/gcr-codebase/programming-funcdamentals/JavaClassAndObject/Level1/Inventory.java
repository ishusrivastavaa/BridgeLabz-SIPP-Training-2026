class Item{
	int itemCode;
	String itemName;
	int price;
	int quantity;
	Item(int quantity , int price){
		this.quantity = quantity;
		this.price = price;
	}
	void totalCost(){
		System.out.println("Total PRice is :" + price*quantity);
	}
		
}
public class Inventory{
	public static void main(String args[]){
		Item i = new Item(5 , 45);
		i.totalCost();
	}
}