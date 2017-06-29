
public class CarApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.setMake("Porshe");
		c.setModel("911");
		c.setColor("red");
		Driver d = new Driver();
		d.setName("Tom");
		d.setAge(16);
		c.setDriver(d);
		c.starting();
		c.stopped();
		c.accelerating();
		c.mph();
		
		Car b = new Car();
		b.setMake("Jetta");
		b.setColor("blue");
		d.setName("Tom");
		d.setAge(16);
		b.setDriver(d);
		b.starting();
		b.stopped();
		b.accelerating();
		b.mph();
	}

}
