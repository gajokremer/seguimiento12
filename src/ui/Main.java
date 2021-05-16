package ui; 

import java.util.Scanner;

import model.MusicShop;
import model.Distributor;
import model.ExternalObject;
import model.Location;
import model.Material;
import model.Orientation;

/*
import model.Wind;
import model.PercussionShaken;
import model.PercussionRubbed;
import model.StringedPlucked;
import model.StringedRubbed;
import model.StringedStruck;
*/

public class Main{

	//relations
	private MusicShop shop;
	private Scanner sc;

	//constructor
	public Main(){

		sc = new Scanner(System.in);
		shop = new MusicShop();
	}

	//main
	public static void main(String [] args){

		System.out.println("\n----------APPLICATION STARTS----------\n");

		Main principal = new Main();

		int option = 0;

		do{

			option = principal.mainMenu();
			principal.executeOperation(option);

		}while(option != 0);
	}

	public int mainMenu(){

		int option = 0;

		System.out.println("\n\n-----MAIN MENU-----\n" + 
			"\n(1) to add a new instrument\n" + 
			"(2) to print all instruments\n" + 
			"(0) to exit");

		option = sc.nextInt();
		sc.nextLine();

		return option;
	}

	public void executeOperation(int operation){

		switch(operation){

			case 0:
				System.out.println("\n-----OPERATION ENDED-----\n");
				break;

			case 1:
				createInstrument();
				break;

			case 2:
				System.out.println("\n---ALL INSTRUMENTS---");
				shop.printAllInstruments();
				break;
		}
	}

	//

public void createInstrument(){

		System.out.println("\n---NEW INSTRUMENT---");

		String type;
		String subType = null;

		System.out.print("Input instrument type: ");
		type = sc.nextLine();

		if(type.equalsIgnoreCase("Percussion") || type.equalsIgnoreCase("Stringed")){

			System.out.print("Input subType: ");
			subType = sc.nextLine();
		}

		System.out.println();

		String reference;
		double height, length, width;
		Location located = null;
		Distributor distributedBy;
		String temp;

		System.out.print("Input reference number: ");
		reference = sc.nextLine();

		System.out.println("\nInput dimensions");
		System.out.print("Height: ");
		height = sc.nextDouble();
		System.out.print("Length: ");
		length = sc.nextDouble();
		System.out.print("Width: ");
		width = sc.nextDouble();

		System.out.print("\nInput location: ");
		sc.nextLine();
		temp = sc.nextLine();

		if(temp.equalsIgnoreCase("Exhibition")){

			located = Location.EXHIBITION;
		}

		if(temp.equalsIgnoreCase("Storage")){

			located = Location.STORAGE;
		}

		if(temp.equalsIgnoreCase("Distributor")){

			located = Location.DISTRIBUTOR;
		}

		distributedBy = createDistributor();


		//types
		if(type.equalsIgnoreCase("Wind")){

			newWindInstrument(reference, height, length, width, located, distributedBy);
		}

		if(type.equalsIgnoreCase("Percussion")){

			newPercussionInstrument(subType, reference, height, length, width, located, distributedBy);
		}

		if(type.equalsIgnoreCase("Stringed")){

			newStringedInstrument(subType, reference, height, length, width, located, distributedBy);
		}
	}

	public void newWindInstrument(String reference, double height, double length, double width, Location located, Distributor distributedBy){

		String temp;

		Material madeOf = null;

		System.out.print("\nInput material: ");
		temp = sc.nextLine();

		if(temp.equalsIgnoreCase("Wood")){

			madeOf = Material.WOOD;
		}

		if(temp.equalsIgnoreCase("Metal")){

			madeOf = Material.METAL;
		}
		
		shop.addWind(reference, height, length, width, located, distributedBy, madeOf);
	}

	public void newPercussionInstrument(String subType, String reference, double height, double length, double width, 
		Location located, Distributor distributedBy){

		if(subType.equalsIgnoreCase("Shaken")){

			String material;

			System.out.print("Input material: ");
			material = sc.nextLine();

			shop.addPercussionShaken(reference, height, length, width, located, distributedBy, material);
		}

		if(subType.equalsIgnoreCase("Rubbed")){

			ExternalObject playedWith = createExternalObject();

			shop.addPercussionRubbed(reference, height, length, width, located, distributedBy, playedWith);
		}
	}

	public void newStringedInstrument(String subType, String reference, double height, double length, double width, 
		Location located, Distributor distributedBy){

		String temp;

		if(subType.equalsIgnoreCase("Plucked")){

			int frets, stringQuantity;
			boolean hasCase = false;

			System.out.print("Input frets: ");
			frets = sc.nextInt();

			System.out.print("Input string quantity: ");
			stringQuantity = sc.nextInt();

			System.out.print("Input if instrument has case: ");
			sc.nextLine();
			temp = sc.nextLine();

			if(temp.equalsIgnoreCase("Yes")){

				hasCase = true;
			}

			shop.addStringedPlucked(reference, height, length, width, located, distributedBy, 
				frets, stringQuantity, hasCase);
		}

		if(subType.equalsIgnoreCase("Rubbed")){

			int bowLength, stringQuantity;

			System.out.print("Input bow length: ");
			bowLength = sc.nextInt();

			System.out.print("Input string quantity: ");
			stringQuantity = sc.nextInt();

			shop.addStringedRubbed(reference, height, length, width, located, distributedBy, 
				bowLength, stringQuantity);
		}

		if(subType.equalsIgnoreCase("Struck")){

			double boxHeight, boxLength, boxWidth;
			String material;
			double octaves;
			Orientation oriented = null;

			System.out.println("\nInput box dimensions");
			System.out.print("Height: ");
			boxHeight = sc.nextDouble();
			System.out.print("Lenght: ");
			boxLength = sc.nextDouble();
			System.out.print("Width:");
			boxWidth = sc.nextDouble();

			System.out.print("\nInput material: ");
			sc.nextLine();
			material = sc.nextLine();

			System.out.print("Input octaves quantity: ");
			octaves = sc.nextDouble();

			System.out.print("Input orientation: ");
			temp = sc.nextLine();
			sc.nextLine();

			if(temp.equalsIgnoreCase("Horizontal")){

				oriented = Orientation.HORIZONTAL;
			}

			if(temp.equalsIgnoreCase("Vertical")){

				oriented = Orientation.VERTICAL;
			}

			shop.addStringedStruck(reference, height, length, width, located, distributedBy, 
				boxHeight, boxLength, boxWidth, material, octaves, oriented);
		}
	}

	//

	public Distributor createDistributor(){

		String name, address, phone;

		System.out.println("\nInput distributor data");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Address: ");
		address = sc.nextLine();
		System.out.print("Phone: ");
		phone = sc.nextLine();

		Distributor distributedBy = shop.addDistributor(name, address, phone);

		return distributedBy;
	}

	public ExternalObject createExternalObject(){

		double objectHeight, objectLength, objectWidth;
		String objectMaterial;

		System.out.println("\nExternal object");
		System.out.print("Input height: ");
		objectHeight = sc.nextDouble();
		System.out.print("Input length: ");
		objectLength = sc.nextDouble();
		System.out.print("Input width: ");
		objectWidth = sc.nextDouble();
		sc.nextLine();
		System.out.print("Input material: ");
		objectMaterial = sc.nextLine();

		ExternalObject playedWith = new ExternalObject(objectHeight, objectLength, objectWidth, objectMaterial);

		return playedWith;
	}
}