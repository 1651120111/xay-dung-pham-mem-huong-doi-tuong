
abstract class Toppings implements Order{
	protected Order order;
	public Toppings (Order order) {
		this.order = order;
		
	}
	@Override
	public String addToOrder() {
		return order.addToOrder();
		
	}
}
