package com.Xworkz.core_java.inheritance.composition;

public class HumanheartDemo {

	public static void main(String[] args) {
  Human human = new Human();
  human.gender = "male";
  human.Heart = new Heart();
  System.out.println("human gender: "+human.gender);
  System.out.println("Heart pumps:  " +human.Heart.pumps);
  System.out.println("Heart beats:  "+human.Heart.heartbeats);
  
  
	}

}
