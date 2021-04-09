package HW7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Set {

	/**
	 * Check if passed in Integer is part of passed in List.
	 * 
	 * @param i
	 * @param list
	 * @return booelan
	 */
	public static boolean isElement(Integer i, List<Integer> list) {

		if (list.contains(i)) {
			return true;
		}

		return false;
	}

	/**
	 * Check if list1 is a subset of list2. Subset means all elements in list1 must
	 * be in list2. If so return true, else return false.
	 * 
	 * @param list1
	 * @param list2
	 * @return boolean
	 */
	public static boolean isSubset(List<Integer> list1, List<Integer> list2) {
		int counter = 0;

		for (int i = 0; i < list2.size(); i++) {

			if (list1.contains(list2.get(i))) {
				++counter;
				if (counter == list1.size()) {
					return true;
				}
			}

		}
		if (counter == list1.size()) {
			return true;
		}
		return false;
	}

	/**
	 * Check if list1 is a super set of list2. Super set means all elements in list2
	 * must be in list1. Return true if so, false otherwise.
	 * 
	 * @param list1
	 * @param list2
	 * @return boolean
	 */
	public static boolean isSuperSet(List<Integer> list1, List<Integer> list2) {
		int counter = 0;

		for (int i = 0; i < list1.size(); i++) {

			if (list2.contains(list1.get(i))) {
				++counter;
				if (counter == list2.size()) {
					return true;
				}
			}

		}
		if (counter == list2.size()) {
			return true;
		}

		return false;
	}

	/**
	 * Perform the union of list1 and list2. Union means take all elements from each
	 * List and combine them into one List. If duplicate elements, only include one
	 * of the element. For example, if 3 occurred in both Lists, the resulting List
	 * will only contain one 3. This method will return a new combined List that is
	 * sorted from smallest to largest.
	 * 
	 * @param list1
	 * @param list2
	 * @return list
	 */
	public static List<Integer> union(List<Integer> list1, List<Integer> list2) {
		// TODO

		if (list1.isEmpty()) {
			return list2;
		}
		if (list2.isEmpty()) {
			return list1;
		}

		List<Integer> storage = new ArrayList<Integer>();
		List<Integer> combined = list1;

		for (int i = 0; i < list2.size(); i++) {
			if (!(list1.contains(list2.get(i)))) {
				combined.add(list2.get(i));
			}

			// list1.add(list2.get(i));
		}

		Collections.sort(combined);

//		for (int i= 0; i < storage.size(); i++) {
//			if(list1.get(i).equals(list1.get(i+1))) {
//				list1.remove(i);
//				//list1.
//			}
//		}

		System.out.println(combined);
		return combined;
		// return null;
	}

	/**
	 * Perform intersection of list1 and list2. Intersection means to only include
	 * an element if it is in both Lists. This method will return a new interesected
	 * List that is sorted from smallest to largest.
	 * 
	 * @param list1
	 * @param list2
	 * @return list
	 */
	public static List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
		List<Integer> insect = new ArrayList<>();

//		if (!(list1.isEmpty())) {
//			list1.clear();
//		}
		for (int i = 0; i < list2.size(); i++) {
			if (list1.contains(list2.get(i))) {
				insect.add(list2.get(i));

			}
		}
		for (int i = 0; i < list1.size(); i++) {
			if (list2.contains(list1.get(i))) {
				if (!(insect.contains(list1.get(i)))) {
					insect.add(list1.get(i));
				}

			}
		}

		Collections.sort(insect);
//		System.out.println(list1);
//		System.out.println(list1);
//		System.out.println(list1);
		return insect;

		// return null;
	}

	/**
	 * Perform subtract of sets. list1 - list2. The result will be a List that
	 * contains all elements in list1 minus any elements that also occur in list2.
	 * This method will return a new subtracted List that is sorted from smallest to
	 * largest.
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static List<Integer> subtract(List<Integer> list1, List<Integer> list2) {
		// TODO

		for (int i = 0; i < list2.size(); i++) {
			if (list1.contains(list2.get(i))) {
				list1.remove(list2.get(i));

			}
		}
		Collections.sort(list1);
		return list1;
	}

	/**
	 * Two lists are equal if all the elements in list1 occur in list2, and all
	 * elements in list2 occur in list1. Order does matter here.
	 * 
	 * @param list1
	 * @param list2
	 * @return boolean
	 */
	public static boolean equals(List<Integer> list1, List<Integer> list2) {
		Collections.sort(list1);
		Collections.sort(list2);
		if (list1.containsAll(list2) && list2.containsAll(list1)) {
			return true;
		}
		return false;
	}

	/**
	 * Use the lower and upper bounds to return the complement of the list passed
	 * in. If the lower bound is greater than the upper bound, return an empty list.
	 * 
	 * @param list
	 * @param lowerBound
	 * @param upperBound
	 * @return
	 */
	public static List<Integer> complement(List<Integer> list, int lowerBound, int upperBound) {
		
		List<Integer> comp = new ArrayList<>();
		Collections.sort(list);
		comp=list;
		for(int i = 0; i < list.size(); i++) {
			for(int j = lowerBound; i < upperBound; j++) {
				if(!(list.contains(j))) {
					comp.add(j);
				}
			//list.add(list.get(i));
		}
		
		}
	
		System.out.println(comp);
		return comp;
	}

	/**
	 * Sort the list passed in from smallest to the larget. Notice, there is no
	 * return type, so this sorts the List in place.
	 * 
	 * @param list
	 */
	public static void sort(List<Integer> list) {
		Collections.sort(list);
	}

	/**
	 * Perform the cartesian product of two lists. This method will store the result
	 * as a List that holds Cartesian objects. Both lists must be sorted before
	 * performing the cartesian product. Elements in list1 should be the first
	 * element in each product. If the either list is empty, return an empty List.
	 * 
	 * See handout for example.
	 * 
	 * @param list1
	 * @param list2
	 * @return list
	 */
	public static List<Cartesian> cartesianProduct(List<Integer> list1, List<Integer> list2) {

		Collections.sort(list1);
		Collections.sort(list2);

		List<Cartesian> answer = new ArrayList<Cartesian>();

		if (list1.isEmpty() || list2.isEmpty()) {

			return Collections.emptyList();
		}

		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				answer.add((new Cartesian(list1.get(i), list2.get(j))));
			}
			
		}
		
		return answer;
	}

	/**
	 * Create a helper class called Cartesian. This class is meant to represent a
	 * Tuple used in the Cartesian Product method. It is a very simple class that
	 * holds two int variables. A constructor, toString, and equals method are the
	 * only required methods. No setters or getters are needed.
	 *
	 */
	protected static class Cartesian {
		public int y;
		public int x;
		// TODO

		public Cartesian(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return "(" + this.x + "," + this.y + ")";
		}

		public boolean equals(Object o) {
			if (o instanceof Cartesian) {
				Cartesian tmp = (Cartesian) o;
				return this.x == tmp.x && this.y == tmp.y;
			}
			return false;
		}

	}

}
