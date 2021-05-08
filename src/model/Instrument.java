package model;

import model.Location;

public abstract class Instrument{

	//atributes
	private String reference;
	private double height;
	private double length;
	private double width;

	//relations
	private Location located;
	private Distributor distributedBy;

	//constructor
	public Instrument(String reference, double height, double length, double width, Location located, Distributor distributedBy){

		this.reference = reference;
		this.height = height;
		this.length = length;
		this.width = width;
		this.located = located;
		this.distributedBy = distributedBy;
	}

	//getters and setters
	public String getReference(){
		return reference;
	}
	public void setReference(String reference){
		this.reference = reference;
	}

	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height = height;
	}

	public double getLength(){
		return length;
	}
	public void setLength(double length){
		this.length = length;
	}

	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width = width;
	}

	public Location getLocated(){
		return located;
	}
	public void setLocation(Location located){
		this.located = located;
	}

	public Distributor getDistributedby(){
		return distributedBy;
	}
	public void setDistributedBy(Distributor distributedBy){
		this.distributedBy = distributedBy;
	}

	//to String

	public String toString(){

		return "Reference: " + getReference() + 
			"\nHeight: " + getHeight() + 
			"\nLength: " + getLength() + 
			"\nWidth: " + getWidth() + 
			"\nLocation: " + getLocated() + 
			"\n--DISTRIBUTOR-- " + getDistributedby();
	}
}