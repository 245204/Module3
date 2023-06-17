package practice;

import java.util.ArrayList;

public class HashSet {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");

		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("banana");

		list.removeAll(fruits); // returns true

		System.out.println(list);
	}
	

}
