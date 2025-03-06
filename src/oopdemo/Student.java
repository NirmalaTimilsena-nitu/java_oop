package oopdemo;


public class Student {
	// variable declaration\
	int roll_no;
	String name;
	String address;
	//constructor
	Student(){
		roll_no = 0;
		name = " ";
		address = " ";
		System.out.println(" This is the student constructor...");
		
	}
public static void main(String[] args) {
	Student std = new Student();//object Declaration
}

}

