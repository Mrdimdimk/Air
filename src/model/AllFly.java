package model;

public abstract class AllFly {
	private String manufacter;
	private int countEgine;
	private int fuelConsumption;

//	public AllFly() {
//
//	}
	
	static { System.out.println("Fly");
		
	}

	public AllFly(int fuelConsumption, int countEgine, String manufacter) {
		this.manufacter = manufacter;
		this.countEgine = countEgine;
		this.fuelConsumption = fuelConsumption;
	}

	public void setManufacter(String manufacter) {
		this.manufacter = manufacter;
	}

	public void setCountEngine(int countEgine) {
		this.countEgine = countEgine;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public String getManufacter() {
		return manufacter;
	}

	public int getCountEgine() {
		return countEgine;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}
	
	public void ShowParamsAllFly(){
		System.out.println("Производитель : " + this.manufacter );
		System.out.println("Количество двигателей : "+ this.countEgine);
		System.out.println("Количество потребляемого топлива : " +this.fuelConsumption);
	}
	
}
