public class Car {
	String brand;
	String model;
	int year;
	String colour;
	boolean isRunning;
	
	public Car(String carBrand,String carModel,int Year,String carColour){
		brand = carBrand;
		model = carModel;
		year = Year;
		colour = carColour;
		isRunning = false;
	}
	
	public void startEngine(){
		if(isRunning = false){
	        isRunning = true;
		    System.out.println("The car has started running");
		}
		else{
			System.out.println("The car is already running");
		}
	}
	
	public void stopEngine(){
		if(isRunning = true){
		    isRunning = false;
		    System.out.println("The car has stopped running");
		}
		else{
			System.out.println("The car is already at stop");
		}
	}
	
	public void displayInfo(){
		System.out.println("Brand  :   "+brand);
		System.out.println("Model  :   "+model);
		System.out.println("Year   :   "+year);
		System.out.println("Colour :   "+colour);
	}
	
	public void getAge(){
		int current_year = 2025;
		int ages = current_year-year;
		System.out.println("The car's age is : "+ages);
	}
	
	public static void main(String[] args) {
		Car car1 = new Car("Audi","Q5",2007,"silver");
		Car car2 = new Car("Toyota","Corolla",2011,"black");
		Car car3 = new Car("Benz","RL",2024,"Black - N");
		
		car1.startEngine();
		car1.stopEngine();
		car1.displayInfo();
		car1.getAge();
		
		car2.startEngine();
		car2.stopEngine();
		car2.displayInfo();
		car2.getAge();
		
		car3.startEngine();
		car3.stopEngine();
		car3.displayInfo();
		car3.getAge();
	}
}