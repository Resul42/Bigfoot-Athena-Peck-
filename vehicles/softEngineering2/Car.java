package softEngineering2;

class Car implements Visitable{
	private String vroom;
	
	Car(String carsound){
		vroom = carsound;
		
	}
	public String getSound(){
		return vroom;
	}
	@Override
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}


