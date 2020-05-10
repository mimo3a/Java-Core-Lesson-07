package ua.lviv.lgs.aeroplane;

public class ApplicationPlane {
	public static void main(String[] args) {

		SU_27 p1 = new SU_27();
		
		System.out.println("Color of plane is " + p1.getPlaneColor());
		System.out.println("Max speed of plane is " + p1.getMaxSpeed());
		
		p1.engineLaunch();
		p1.takeOff();
		p1.plane.up();
		p1.plane.down();
		p1.plane.left();
		p1.plane.right();
		p1.stelsTechnology();
		p1.nuclearStrike();
		p1.turboAcceleration();
		p1.landing();
		
		
		

	}

}
