package com.Xworkz.core_java.inheritance.Association;

public class HasaRelationshipDemo {

	public static void main(String[] args) {
      Library central = new Library();
      central.name= "central";
      central.noOfBooks=500;
      central.location="hubli";
      central.student=new Student();
      System.out.println("Library name:"+ central.name);
      System.out.println("student name:"+ central.student.name);
      System.out.println("student id:"+ central.student.id );
   
      System.out.println("student college:"+ central.student.college );
      

	}

}
