package algorithms;

import java.util.ArrayList;

public class fibonacci {
	public static void main(String[] args) {
		fibonacci phib = new fibonacci();
		System.out.println(phib.fibonacciList(50));
	}
ArrayList<Integer> fibonacciList(int n){
	ArrayList<Integer> list = new ArrayList<>();
	list.add(0);
	list.add(0);
	list.add(1);
	list.add(1);
	for(int i = 4; i<=n; i++) {
		int j = list.get(i-1) + list.get(i-2);
		list.add(i, j);
	}
	return list;
}
}
