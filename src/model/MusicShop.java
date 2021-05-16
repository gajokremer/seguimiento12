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

	public void addWind(String reference, double height, double length, double width, 
		Location located, Distributor distributedBy, Material madeOf){
		
		if(totalInstruments < MAX_INSTRUMENTS){

			boolean empty = false;
			int i;

			for(i = 0; i < instruments.length && !empty; i++){

				if(instruments[i] == null){

					instruments[i] = new Wind(reference, height, length, width, located, distributedBy, madeOf);
					totalInstruments++;
					empty = true;
				}
			}
		}
	}

	public void addPercussionShaken(String reference, double height, double length, double width, 
		Location located, Distributor distributedBy, String material){

		if(totalInstruments < MAX_INSTRUMENTS){

			boolean empty = false;
			int i;

			for(i = 0; i < instruments.length && !empty; i++){

				if(instruments[i] == null){

					instruments[i] = new PercussionShaken(reference, height, length, width, located, distributedBy, material);
					totalInstruments++;
					empty = true;
				}
			}
		}
	}

	public void addPercussionRubbed(String reference, double height, double length, double width, 
		Location located, Distributor distributedBy, ExternalObject playedWith){

		if(totalInstruments < MAX_INSTRUMENTS){

			boolean empty = false;
			int i;

			for(i = 0; i < instruments.length && !empty; i++){

				if(instruments[i] == null){

					instruments[i] = new PercussionRubbed(reference, height, length, width, located, distributedBy, playedWith);
					totalInstruments++;
					empty = true;
				}
			}
		}
	}

	public void addStringedPlucked(String reference, double height, double length, double width, 
		Location located, Distributor distributedBy, int frets, int stringQuantity, boolean hasCase){

		if(totalInstruments < MAX_INSTRUMENTS){

			boolean empty = false;
			int i;

			for(i = 0; i < instruments.length && !empty; i++){

				if(instruments[i] == null){

					instruments[i] = new StringedPlucked(reference, height, length, width, located, distributedBy, 
						frets, stringQuantity, hasCase);
					totalInstruments++;
					empty = true;
				}
			}
		}
	}

	public void addStringedRubbed(String reference, double height, double length, double width, 
		Location located, Distributor distributedBy, double bowLength, int stringQuantity){

		if(totalInstruments < MAX_INSTRUMENTS){

			boolean empty = false;
			int i;

			for(i = 0; i < instruments.length && !empty; i++){

				if(instruments[i] == null){

					instruments[i] = new StringedRubbed(reference, height, length, width, located, distributedBy, 
					bowLength, stringQuantity);
					totalInstruments++;
					empty = true;
				}
			}
		}
	}

	public void addStringedStruck(String reference, double height, double length, double width, Location 
		located, Distributor distributedBy, double boxHeight, double boxLength, double boxWidth, 
		String material, double octaves, Orientation oriented){

		if(totalInstruments < MAX_INSTRUMENTS){

			boolean empty = false;
			int i;

			for(i = 0; i < instruments.length && !empty; i++){

				if(instruments[i] == null){

					instruments[i] = new StringedStruck(reference, height, length, width, located, distributedBy, 
						boxHeight, boxLength, boxWidth, material, octaves, oriented);
					totalInstruments++;
					empty = true;
				}
			}
		}
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

			for(int i = 0; i < instruments.length; i++){

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