package softEngineering2;

class Boat implements Visitable {
private String Toet;
	
	Boat(String boatSound){
		Toet = boatSound;
		
	}
	public String getSound(){
		return Toet;
	}
	
	@Override
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);	}

}
