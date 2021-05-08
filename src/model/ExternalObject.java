package model;

public class ExternalObject{

	//attributes
	private double objectHeight;
	private double objectLength;
	private double objectWidth;
	private String objectMaterial;

	//relations

	//constructor
	public ExternalObject(double objectHeight, double objectLength, double objectWidth, String objectMaterial){

		this.objectHeight = objectHeight;
		this.objectLength = objectLength;
		this.objectWidth = objectWidth;
		this.objectMaterial = objectMaterial;
	}

	//getters and setters
	public double getObjectHeight(){
		return objectHeight;
	}
	public void setObjectHeight(double objectHeight){
		this.objectHeight = objectHeight;
	}

	public double getObjectLength(){
		return objectLength;
	}
	public void setObjectLength(double objectLength){
		this.objectLength = objectLength;
	}

	public double setObjectWidth(){
		return objectWidth;
	}
	public void getObjectWidth(double objectWidth){
		this.objectWidth = objectWidth;
	}

	public String getObjectMaterial(){
		return objectMaterial;
	}
	public void setObjectMaterial(String objectMaterial){
		this.objectMaterial = objectMaterial;
	}
}