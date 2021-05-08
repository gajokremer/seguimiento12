package model;

public class MusicShop{

	//attributes
	public static final int MAX_INSTRUMENTS = 100;  
	private int totalInstruments = 0;

	//relations
	private Instrument [] instruments;

	//constructor
	public MusicShop(){

		instruments = new Instrument[MAX_INSTRUMENTS]; 
	}

	//getters and setters
	public int getTotalInstruments(){
		return totalInstruments;
	}
	public void setTotalInstruments(int totalInstruments){
		this.totalInstruments = totalInstruments;
	}

	//methods
	public void addInstrument(String reference, double height, double length, double width, Location located, Distributor distributedBy){

		/*
		if(totalInstruments < MAX_INSTRUMENTS){

			boolean empty = false;
			int pos;

			for(pos = 0; pos < MAX_INSTRUMENTS && !empty; pos++){

				if(instruments[pos] == null){

					instruments[pos] = new Instrument(reference, height, length, width, located, distributedBy);
					totalInstruments++;
					empty = true;
				}
			}
		}
		*/
	}

	public Distributor addDistributor(String name, String address, String phone){

		Distributor	distributedBy = new Distributor(name, address, phone);

		return distributedBy;
	}

	public ExternalObject addExternalObject(double objectHeight, double objectLength, double objectWidth, String objectMaterial){

		ExternalObject playedWith = new ExternalObject(objectHeight, objectLength, objectWidth, objectMaterial);

		return playedWith;
	}

	public void printAllInstruments(){

		if(totalInstruments != 0){

			for(int i = 0; i < MAX_INSTRUMENTS; i++){

				if(instruments[i] != null){

					System.out.println("\nInstrument " + i);
					System.out.println(instruments[i].toString());
				}
			}

		}else{

			System.out.println("\nERROR: No instruments registered");
		}
	}
}