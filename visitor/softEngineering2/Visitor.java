package softEngineering2;

public interface Visitor {
	public String visit(Car car);
	public String visit(Boat boat);
	public String visit(Plane plane);
}
