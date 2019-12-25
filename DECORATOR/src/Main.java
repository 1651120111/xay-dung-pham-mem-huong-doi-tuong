
public class Main {
	public static void main(String[] args) {
		
//		Order bread = new Bread();
//		System.out.printf(bread.addToOrder());
//		Order lecttuce = new Lecttuce(bread);
//		System.out.printf(lecttuce.addToOrder());
//		
//		Order tomatoes = new Tomatoes(bread);
//		System.out.printf(tomatoes.addToOrder());
//		
//		Order tomatoes1 = new Tomatoes(bread);
//		System.out.printf(tomatoes1.addToOrder());
//		Order lecttuce1 = new Lecttuce(bread);
//		System.out.printf(lecttuce1.addToOrder());
		Order bread = new Toppings(new Lecttuce(new Lecttuce(new Tomatoes(new Bread()))) ){
		};
		
		System.out.printf(bread.addToOrder());
		
	}
}
