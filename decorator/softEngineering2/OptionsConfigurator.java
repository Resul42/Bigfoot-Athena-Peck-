package softEngineering2;

abstract class OptionsConfigurator implements NewCar{
	
	protected NewCar temporaryCar;
	
	public OptionsConfigurator(NewCar newNewCar){
		
		temporaryCar = newNewCar;
	}
	
	public String getOptions(){
		return temporaryCar.getOptions();
	}

	public double getPrice(){
		return temporaryCar.getPrice();
	}
}
