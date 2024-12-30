package edu.stpeters;
//is / has relation
class Person {
	int aadhar;
	String namae;
	String address;
}
class Worker extends Person { // is /// Worker is a Person
	Address permanentAddress;//Worker has permanent Address
	Address tempAddress;//Worker has temp Address
	Address offAddress;//Worker has office Address
}
class Address {
	String street;
	String flat;
	String pincode;
}
public class multiInDemo {
	public static void main(String[] args) {
		
	}
}  
