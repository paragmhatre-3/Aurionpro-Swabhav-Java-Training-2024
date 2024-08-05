import com.aurionpro.structural.facade.model.HotelReception;

public class HotelReceptionTest {
	public static void main(String []args) {
		HotelReception waiter = new HotelReception();
		System.out.println("Which Cuisine Would you like to have today?");
		System.out.println("1.Indian Cuisine");
		System.out.println("2.Italian Cuisine");
		
		waiter.getIndianMenu();
	}
	
}
