package model;

public class Distributor{

	//atributes
	private String name;
	private String address;
	private String phone;

	//relations

	//constructor
	public Distributor(String name, String address, String phone){

		this.name = name;
		this.address =  address;
		this.phone = phone;
	}

	//getters and setters
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}

	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}

	//to String
	public String toString(){

		return "\nName: " + getName() + 
		"\nAddress: " + getAddress() + 
		"\nPhone: " + getPhone();
	}
}