
class Tomatoes extends Toppings{
	public Tomatoes(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
			}
	@Override
	public String addToOrder(){
		return super.addToOrder() +" + tomatoes";
	}
}
