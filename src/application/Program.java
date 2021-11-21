package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> names1 = new HashSet<>();
		Set<String> names2 = new TreeSet<>();
		Set<String> names3 = new LinkedHashSet<>();
		
		names1.add("Djalma");
		names1.add("Virginia");
		names1.add("Eurides");
		names1.add("Sara");
		
		names2.add("Djalma");
		names2.add("Virginia");
		names2.add("Eurides");
		names2.add("Sara");
		
		names3.add("Djalma");
		names3.add("Virginia");
		names3.add("Eurides");
		names3.add("Sara");
		
		for (String s : names1) {
			System.out.println(s);
		}
		
		System.out.println();
		for (String s : names2) {
			System.out.println(s);
		}
		
		System.out.println();
		for (String s : names3) {
			System.out.println(s);
		}

	}

}
