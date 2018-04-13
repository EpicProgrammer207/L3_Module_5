package data_structures;

import java.util.Random;

public class KinderEgg {
	public static void main(String[] args) {
		TastyEgg myKinderSurprise = new TastyEgg(new Egg(new Toy())); // Your mission: Find out what toy is
					System.out.println(myKinderSurprise.getKinderSurpriseContents().getEggContents().getToyName());																// inside your KinderSurprise.
	}
}

class TastyEgg {
	private Egg egg;

	public TastyEgg(Egg egg) {
		this.egg = egg;
	}

	Egg getKinderSurpriseContents() { // ADD CODE HERE
	Egg e = new Egg(new Toy());
	return e;
	}
}

class Egg {
	private Toy toy;

	public Egg(Toy toy) {
		this.toy = toy;
	}

	Toy getEggContents() {
		Toy t = new Toy();
		return t;
		// ADD CODE HERE
	}
}

class Toy {
	String getToyName() {
		int randomToySelector = new Random().nextInt(2);
		if (randomToySelector == 0)
			return "play doh";
		else if (randomToySelector == 1)
			return "train";
		else return null;
	}
}