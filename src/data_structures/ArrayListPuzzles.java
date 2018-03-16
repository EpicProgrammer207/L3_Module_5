package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPuzzles {
public static void main(String[] args) {
	ArrayListPuzzles p = new ArrayListPuzzles();
	p.DinnerDecider();
	p.killArrayList();
}
	void DinnerDecider() {
	  ArrayList<String> list = new ArrayList<>();
		list.add("Steak");
		list.add("Chicken");
		list.add("Shrimp");
		list.add("Pork");
		list.add("asdf");
		int rand = new Random().nextInt(list.size());
	System.out.println("You should eat " + list.get(rand) + " for dinner!");
	}
	void killArrayList() {
		ArrayList<Integer> list = new ArrayList<>();
		for(long i = 0; i<1000000000; i++) {
			for(long j = 0; i<1000000000; i++) {
				for(long k = 0; i<1000000000; i++) {
					for(long m = 0; i<1000000000; i++) {
						list.add((int) i);
					}
					list.add((int) i);
				}
				list.add((int) i);
			}
			list.add((int) i);
		}
	}
}
