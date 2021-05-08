package model;

public class PercussionRubbed extends Percussion{

	//attributes

	//relations
	private ExternalObject playedWith;

	//constructor
	public PercussionRubbed(String reference, double height, double length, double width, Location located, 
		Distributor distributedBy, ExternalObject playedWith){

		super(reference, height, length, width, located, distributedBy);
		this.playedWith = playedWith;
	}

	//getters and setters
	public ExternalObject getPlayedWith(){
		return playedWith;
	}
	public void setPlayedWith(ExternalObject playedWith){

		this.playedWith = playedWith;
	}
}