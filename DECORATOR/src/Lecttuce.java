class Lecttuce extends Toppings{
	
	public Lecttuce(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
	
	}
		@Override
		public String addToOrder(){
			return super.addToOrder() + " + Lectuce";
	}
}
