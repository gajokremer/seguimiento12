package model;

public class StringedStruck extends Stringed{

	//attributes
	private double boxHeight;
	private double boxLength;
	private double boxWidth;
	private String material;
	private double octaves;

	//relations
	private Orientation oriented;

	//constructor
	public StringedStruck(String reference, double height, double length, double width, Location located, 
		Distributor distributedBy, double boxHeight, double boxLength, double boxWidth, String material, double octaves, 
		Orientation oriented){

		super(reference, height, length, width, located, distributedBy);
		this.boxHeight = boxHeight;
		this.boxLength = boxLength;
		this.boxWidth = boxWidth;
		this.material = material;
		this.octaves = octaves;
		this.oriented = oriented;
	}

	//getters and setters
	public double getBoxHeight(){
		return boxHeight;
	}
	public void setBoxHeight(double boxHeight){
		this.boxHeight = boxHeight;
	}

	public double getBoxLength(){
		return boxLength;
	}
	public void setBoxLength(double boxLength){
		this.boxLength = boxLength;
	}

	public double getBoxWidth(){
		return boxWidth;
	}
	public void setBoxWidth(double boxWidth){
		this.boxWidth = boxWidth;
	}

	public String getMaterial(){
		return material;
	}
	public void setMaterial(String material){
		this.material = material;
	}

	public double getOctaves(){
		return octaves;
	}
	public void setOctaves(double octaves){
		this.octaves = octaves;
	}
}