package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPuzzles {
	public static void main(String[] args) {
		ArrayListPuzzles p = new ArrayListPuzzles();

		p.makeJokes();
		p.DinnerDecider();
		System.out.println(p.bandName());
	}

	public void DinnerDecider() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Steak");
		list.add("Chicken");
		list.add("Shrimp");
		list.add("Pork");
		list.add("asdf");
		int rand = new Random().nextInt(list.size());
		System.out.println("You should eat " + list.get(rand) + " for dinner!");
	}

	public void makeJokes() {
		ArrayList<String> jokes = new ArrayList<String>();
		jokes.add("Why did the cow cross the road?");
		jokes.add("Why do I make bad jokes?");
		jokes.add("What do you call Chewbacca when he gets chocolate on himself?");
		ArrayList<String> punchlines = new ArrayList<String>();
		punchlines.add("To get to the udder side");
		punchlines.add("IDK");
		punchlines.add("Chocolate chip wookie");
		Random ran =  new Random();
		int r = ran.nextInt(jokes.size());
		System.out.println(jokes.get(r));
		 System.out.println(punchlines.get(r));
	
	}
String bandName() {
	ArrayList<String> adjectives = new ArrayList<>();
	ArrayList<String> nouns = new ArrayList<>();
	adjectives.add("Smart");
	adjectives.add("Stinky");
	adjectives.add("Stupid");
	adjectives.add("Ecstatic");
	adjectives.add("Eloquent");
	adjectives.add("Brave");
	adjectives.add("Idiotic");
	nouns.add("Green Beans");
	nouns.add("Band");
	nouns.add("Programmers");
	nouns.add("Gamers");
	nouns.add("Programmers");
	nouns.add("Hobos");
	Random ran =  new Random();
	int r = ran.nextInt(adjectives.size());
	Random rand =  new Random();
	int j = ran.nextInt(nouns.size());
	return adjectives.get(r) + " " + nouns.get(j);
}
}
