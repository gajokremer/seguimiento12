package model;

public class StringedPlucked extends Stringed{

	//attributes
	private int frets;
	private int stringQuantity;
	private boolean hasCase;

	//relations

	//constructor
	public StringedPlucked(String reference, double height, double length, double width, Location located, 
		Distributor distributedBy, int frets, int stringQuantity, boolean hasCase){

		super(reference, height, length, width, located, distributedBy);
		this.frets = frets;
		this.stringQuantity = stringQuantity;
		this.hasCase = hasCase;
	}

	//getters and setters
	public int getFrets(){
		return frets;
	}
	public void setFrets(int frets){
		this.frets = frets;
	}

	public int getStringQuantity(){
		return stringQuantity;
	}
	public void setStringQuantity(int stringQuantity){
		this.stringQuantity = stringQuantity;
	}

	public boolean getHasCase(){
		return hasCase;
	}
	public void setHasCase(boolean hasCase){
		this.hasCase = hasCase;
	}
}