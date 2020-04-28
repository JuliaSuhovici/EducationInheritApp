package parking.application;
class Phone{
	
	private int number;
	private String model;
	private int weight;
	
	Phone(){
		
	}
	
	Phone(int number, String model){
		this.number = number;
		this.model = model;
	}
	
	Phone(int number, String model, int weight){
		this(number, model);
		this.weight = weight;
		
	}

	
	public void recieveCall(String name) {
		System.out.println( name + " is calling you!");
	}
	
	public void recieveCall(String name, int number) {
		System.out.println( number + name + " is calling you!");
	}
	
	public int getNumber() {
		return number;
	}
}
