package model;

public class PercussionShaken extends Percussion{

	//attributes
	private String material;

	//relations

	//constructor
	public PercussionShaken(String reference, double height, double length, double width, Location located, 
		Distributor distributedBy, String material){

		super(reference, height, length, width, located, distributedBy);
		this.material = material;
	}

	//getters and setters
	public String getMaterial(){
		return material;
	}
	public void setMaterial(String material){
		this.material = material;
	}

	//to String
	public String toString(){

		String out = "Reference: " + getReference() + 
		"\nDimensions (height, length, width): " + getHeight() + ", " + getLength() + ", " + getWidth() +
		"\nLocation: " + getLocated() + 
		"\n---DISTRIBUTOR: " + getDistributedby() + 
		"\nMaterial: " + getMaterial();

		return out;
	}
}