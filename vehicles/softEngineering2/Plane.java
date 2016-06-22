package softEngineering2;

class Plane implements Visitable {
	private String Toet;
		
		Plane(String planeSound){
			Toet = planeSound;
			
		}
		public String getSound(){
			return Toet;
		}
		
		@Override
		public String accept(Visitor visitor) {
			// TODO Auto-generated method stub
			return visitor.visit(this);
			}

}
