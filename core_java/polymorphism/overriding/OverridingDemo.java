package com.Xworkz.core_java.polymorphism.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
 RBI rbi = new RBI();
 SBI sbi = new SBI();
 HDFC hdfc = new HDFC();
 System.out.println(rbi.getintrest());
 System.out.println(sbi.getintrest());
 System.out.println (hdfc.getintrest());
 

	}

}
