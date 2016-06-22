package softEngineering2;

public class VisitorTesting {
	public static void main(String[] args){
		VehicleVisitor visitor = new VehicleVisitor(); 
		
		Car audi = new Car("vroem, vroem");
		Boat shgip = new Boat("Toet, Toet");
		Plane airbus = new Plane("Zoefffff");
		
		
		System.out.println(audi.accept(visitor)+ "\n");
		System.out.println(shgip.accept(visitor)+ "\n");
		System.out.println(airbus.accept(visitor)+ "\n");
	}

}
