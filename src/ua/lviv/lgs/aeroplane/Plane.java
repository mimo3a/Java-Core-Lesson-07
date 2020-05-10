package ua.lviv.lgs.aeroplane;

public abstract class Plane {

	private double planeLength = 21.935;
	private double planeWidth = 14.698;
	private int planeWeight = 16300;


	

	void engineLaunch() {
		int intime = (int) (22 + Math.random() * 66);
		System.out.println("Plane kann to launch in " + intime + " min");
	}

	void takeOff() {
		double flydistance = Math.random() * 1000;
		System.out.println("Plane kann to fly " + flydistance + " km");
	}

	void landing() {
		System.out.println("The plane go to landing");
	}

	public double getPlaneLength() {
		return planeLength;
	}

	public void setPlaneLength(double planeLength) {
		this.planeLength = planeLength;
	}

	public double getPlaneWidth() {
		return planeWidth;
	}

	public void setPlaneWidth(double planeWidth) {
		this.planeWidth = planeWidth;
	}

	public int getPlaneWeight() {
		return planeWeight;
	}

	public void setPlaneWeight(int planeWeight) {
		this.planeWeight = planeWeight;
	}

}
