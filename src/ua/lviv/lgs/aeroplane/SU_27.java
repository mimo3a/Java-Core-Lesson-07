package ua.lviv.lgs.aeroplane;

public class SU_27 extends Plane implements SpecialOpportunity{
	
	private int maxSpeed = 2500;
	private String planeColor = "Silver";
	
	PlaneControl plane = new PlaneControl();
	
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setPlaneColor(String planeColor) {
		this.planeColor = planeColor;
	}
	

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public String getPlaneColor() {
		return planeColor;
	}

	
	@Override
	public void turboAcceleration() {
		int turboSpeed = this.maxSpeed + (int) (Math.random() * 500);
		System.out.println("Turbospeed is " + turboSpeed + " km/h");
		
	}

	@Override
	public void stelsTechnology() {
		System.out.println("Plane is not visible for " + (int) (Math.random() * 100) + " min");
		
		
	}

	@Override
	public void nuclearStrike() {
		System.out.println("Strike will be with " + (int) (Math.random() * 11) + " bombs");
		
	}

}
