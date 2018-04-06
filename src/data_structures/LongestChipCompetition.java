package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class LongestChipCompetition {
	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest
	 * chip. (In England, french fries are called "chips".) * Find the Beatle with
	 * the longest chip. You may not edit the Chip or Beatle classes. Make sure to
	 * initialize The Beatles before you start your search. *
	 **/
	public static void main(String[] args) {
		LongestChipCompetition chip = new LongestChipCompetition();
		chip.initializeBeatles();
		Chip longestChip = new Chip(0.0);
		for(int i = 0; i<4; i++) {
			theBeatles.get(i).initializePlateOfChips();
			for(int j = 0; j<theBeatles.get(i).numberOfChips; j++) {
			
				if(j==0) {
					longestChip = theBeatles.get(i).getChips().get(0);
				}
				else if(theBeatles.get(i).getChips().get(j).getLength() > longestChip.getLength()) {
					longestChip = theBeatles.get(i).getChips().get(j);
				}
			}
			System.out.println(longestChip.getLength());
		}
	}
	private static ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();
	

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");
		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}
}

class Beatle {
	String name;
	 ArrayList<Chip> chips = new ArrayList<Chip>();
	 int numberOfChips = new Random().nextInt(100);
	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	void initializePlateOfChips() {
		
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("eo"))
				chips.add(new Chip(10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}
}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}
