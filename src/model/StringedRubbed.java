package model;

public class StringedRubbed extends Stringed{

	//attributes
	private double bowLength;
	private int stringQuantity;

	//relations

	//constructor
	public StringedRubbed(String reference, double height, double length, double width, Location located, 
		Distributor distributedBy, double bowLength, int stringQuantity){

		super(reference, height, length, width, located, distributedBy);
		this.bowLength = bowLength;
		this.stringQuantity = stringQuantity;
	}

	//getters and setters
	public double getBowLenght(){
		return bowLength;
	}
	public void setBowLenght(double bowLength){
		this.bowLength = bowLength;
	}

	public int getStringQuantity(){
		return stringQuantity;
	}
	public void setStringQuantity(int stringQuantity){
		this.stringQuantity = stringQuantity;
	}
}