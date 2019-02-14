package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BearNecessities {

	private Table table = new Table();
	private Goldilocks goldilocks;
	private int placeCount;

	public void init() {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter values for goldilocks:");
			String gold = scan.nextLine();
			String[] goldArr = gold.split(" ");
			this.setGoldilocks(new Goldilocks(Integer.parseInt(goldArr[1]), Integer.parseInt(goldArr[0])));
			List<String> places = new ArrayList<>();
			while (true) {
				System.out.println("Please enter a place or q to quit:");
				String place = scan.nextLine();
				if (place.toLowerCase().equals("q")) {
					break;
				}
				places.add(place);
			}
			String [] placeArr = null;
			for (String place : places) {
				placeArr = place.split(" ");
				this.table.addPlace(new Place(new Porridge(Integer.parseInt(placeArr[1])), new Chair(Integer.parseInt(placeArr[0])), ++placeCount));
			}
		}
	}
	
	public List<Integer> output() {
		return this.table.getOK(this.goldilocks);
	}

	public Goldilocks getGoldilocks() {
		return goldilocks;
	}

	public void setGoldilocks(Goldilocks goldilocks) {
		this.goldilocks = goldilocks;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

}
