package model;

public class Wind extends Instrument{

	//attributes

	//relations
	private Material madeOf;

	//constructor
	public Wind(String reference, double height, double length, double width, Location located, Distributor distributedBy, Material madeOf){

		super(reference, height, length, width, located, distributedBy);
		this.madeOf = madeOf;
	}

	//getters and setters
	public Material getMadeOf(){
		return madeOf;
	}
	public void setMadeOf(Material madeOf){
		this.madeOf = madeOf;
	}

	//to String
	public String toString(){

		String out = "Reference: " + getReference() + 
		"\nDimensions (height, length, width: " + getHeight() + ", " + getLength() + ", " + getWidth() +
		"\nLocation: " + getLocated() + 
		"\nDistributor: " + getDistributedby() + 
		"\nMaterial: " + madeOf;

		return out;
	}
}