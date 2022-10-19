package com.Xworkz.core_java.polymorphism.overloading;
public class Humanspeaks {
public static void main(String[] args) {
  human ram =new human();
  Unknown unknownperson =new Unknown();
  Friend friend=new Friend();
   ram.speak(unknownperson);
   ram.speak(friend);

	}

}
