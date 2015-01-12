/* ExampleConstructor */

package day1.examples;

public class ExampleConstructor {
	private String itemName;
	private double itemPrice;
	
	//constructor's name must be the same as the class name 
	public ExampleConstructor(String name,double price){
		itemName = name;
		itemPrice = price;
	}
	public String getName(){
		return itemName;
	}
	public double getPrice(){
		return itemPrice;
	}
}

/* Main Program */

package day1.examples;

public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleConstructor schoolBag = new ExampleConstructor("JanSport", 44.5);
		
		System.out.println("The price of " + schoolBag.getName() + " " + schoolBag.getPrice());
	}	

}
