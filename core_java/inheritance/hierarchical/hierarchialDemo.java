package com.Xworkz.core_java.inheritance.hierarchical;

public class hierarchialDemo {

	public static void main(String[] args) {
		
		Vehicle Vehicle = new Vehicle();
		bike bike = new bike();
		car car = new car();
		truck truck = new truck();
		
		bike.speed();
		bike.stunt();
		
		car.speed();
		car.drift();
		
		truck.speed();
		truck.carryload();
		 
 
	}

}
