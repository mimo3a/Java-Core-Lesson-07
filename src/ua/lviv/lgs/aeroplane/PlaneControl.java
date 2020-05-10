package ua.lviv.lgs.aeroplane;

public class PlaneControl {
	
	void up() {
		int moove = (int)  (Math.random()*50);
		System.out.println("Go UP on " + moove + "m");
	}
	void down() {
		int moove = (int)  (Math.random()*50);
		System.out.println("Go DOWN on " + moove + "m");
	}
		
	void left() {
		int moove = (int)  (Math.random()*50);
		System.out.println("Go LEFT on " + moove + "m");
	}
		
	void right() {
		int moove = (int)  (Math.random()*50);
		System.out.println("Go RIGHT on " + moove + "m");
	}

}
