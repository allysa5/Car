
public class Car implements iCar {
	private String make;
	private String model;
	private String color;
	private Driver driver;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
		System.out.printf("The drivers name is %s\n",driver.getName());
	}
	public void starting() {
		System.out.printf("The %s %s is starting\n",this.getColor(),this.getMake());

	}
	@Override
	public void accelerating() {
		System.out.printf("The %s %s is accelerating\n",this.getColor(),this.getMake());

	}
	
	@Override
	public void mph(){
		System.out.printf("The %s %s is going 50mph\n",this.getColor(),this.getMake());

	}
	
	@Override
	public void stopped() {
		System.out.printf("The %s %s is stopped\n",this.getColor(),this.getMake());

	}
}
