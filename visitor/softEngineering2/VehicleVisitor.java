package softEngineering2;

import javax.swing.JTextArea;

public class VehicleVisitor implements Visitor {
	JTextArea textarea = new JTextArea();


	@Override
	public String visit(Car car) {
		return "The car makes the sound:\n"+car.getSound();
	}

	@Override
	public String visit(Boat boat) {
		return "A Boat makes the sound:\n"+boat.getSound();
	}

	@Override
	public String visit(Plane plane) {
		System.out.println("A plane makes the sound:");
		return "A plane makes the sound:\n"+plane.getSound();
	}

}
