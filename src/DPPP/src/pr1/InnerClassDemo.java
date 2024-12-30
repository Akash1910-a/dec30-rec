package pr1;

import pr1.Employee.Address;

class Employee{
	int id;
	String name;
	int sal;
	Address cuurentAddress = new Address("MG Road","502","HYD","TG","500028");
	Address permanentAddress = new Address("Kamal X Road","102","HYD","TG","500028");
	
	
	class Address{
		String street;
		String flatNo;
		String city;
		String state;
		String pinCode;
		public Address(String street, String flatNo, String city, String state, String pinCode) {
			super();
			this.street = street;
			this.flatNo = flatNo;
			this.city = city;
			this.state = state;
			this.pinCode = pinCode;
		}
		@Override
		public String toString() {
			return "Address [street=" + street + ", flatNo=" + flatNo + ", city=" + city + ", state=" + state
					+ ", pinCode=" + pinCode + "]";
		}
		
		
		
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {

		
	}

}
