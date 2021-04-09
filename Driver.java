package HW7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import HW7.Set.Cartesian;

public class Driver extends Set{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr1;	//arr1 will contain {-1,0,1,2,3}
		ArrayList<Integer> arr2;	//will contain {0,2,4,6,8}
		ArrayList<Integer> arr3;	//arr3 = {}

		LinkedList<Integer> link1;	//will contain {-6, -2, 8, 15}
		LinkedList<Integer> link2;	//will contain {-10 to 10}
		LinkedList<Integer> link3;	//link3 = {}
		
		
			arr1 = new ArrayList<>();		//will contain {-1,0,1,2,3}
			for(int i =-1; i < 3; i++) {
				arr1.add(i);
			}
			
			arr2 = new ArrayList<>();		//will contain {0,2,4,6,8}
			for(int i = 0; i <= 8; i++) {
				if(i % 2 == 0)
					arr2.add(i);
			}
			
			
			arr3 = new ArrayList<>();		//empty set, so {}
			
			link1 = new LinkedList<>();		//will contain {-6, -2, 8, 15}
			link1.add(-6);
			link1.add(-2);
			link1.add(8);
			link1.add(10);

			link2 = new LinkedList<>();		//will contain {-10 to 10}
			for(int i = -10; i < 11; i++) {
				link2.add(i);
			}
			link3 = new LinkedList<>();		//empty set, {}
			
		
		
		//test isElement
		System.out.println("-----Start of isElement Tests-----");
		System.out.println(isElement(-6,link1));
		System.out.println(isElement(6,arr2));
		System.out.println(isElement(-1,arr1));
		System.out.println(isElement(0,arr3));
		System.out.println(isElement(0,link3));
		System.out.println(isElement(10,arr2));
		
		System.out.println("-----End of isElement Tests-----");
		System.out.println();
		
		//test isSubset
		System.out.println("-----Start of isSubset Tests-----");
		System.out.println(isSubset(link1, link2));
		System.out.println(isSubset(link2, link1));
		System.out.println(isSubset(link3, arr3));
		System.out.println(isSubset(link3, link2));
		System.out.println(isSubset(arr3, link1));
		System.out.println("-----End of isSubset Tests-----");
		System.out.println();
		
		//test isSuperSet
		System.out.println("-----Start of isSuperSet Tests-----");
		System.out.println(isSuperSet(link1, link2));
		System.out.println(isSuperSet(link2, link1));
		System.out.println(isSuperSet(link3, arr3));
		System.out.println(isSuperSet(link3, arr2));
		System.out.println(isSuperSet(link2, arr3));
		System.out.println("-----End of isSuperSet Tests-----");
		System.out.println();
	
		//test Union
		System.out.println("-----Start of Union Tests-----");
		List<Integer> emptyList = Set.union(arr3, link3);		//empty lists
		System.out.println(emptyList.size());
		
		List<Integer> CombinedList = Set.union(arr2, link2);	
		System.out.println();
		List<Integer> CombinedList1 = Set.union(arr1, link1);
		
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(-6);
		answer.add(-2);
		answer.add(-1);
		answer.add(0);
		answer.add(1);
		answer.add(2);
		answer.add(8);
		answer.add(10);
		
		System.out.println("----------tests sorting method---------  " + answer.equals(CombinedList1));
		System.out.println("-----End of Union Tests-----");
		System.out.println();
		
		//test Intersection
		System.out.println("-----Start of intersection Tests-----");
		List<Integer> emptyList1 = Set.intersection(link2, link3);
		emptyList1 = intersection(link2, link3);					// compares with an empty list
		System.out.println(emptyList1);
		
		List<Integer> intersectionSome = Set.intersection(link2, arr2);
		intersectionSome = intersection(link1, arr2);					// compares with some elements
		System.out.println(intersectionSome);
		
		List<Integer> intersection = Set.intersection(link2, arr2);
		intersection = intersection(link3, arr2);					// compares with no elements
		System.out.println(intersection);
		
		System.out.println("------End of intersection Tests-----");
		System.out.println();
		
		//testing subtract method
		System.out.println("-----Start of Subtract Tests-----");
		List<Integer> emptyAgain = Set.subtract(link3, link2);				//subtract a set from empty set
		emptyAgain = subtract(link3, link2);
		System.out.println(emptyAgain);
		
		List<Integer> subtract = Set.subtract(arr2, arr1);
		subtract = subtract(arr2, arr1);									// subtract some elements but not all
		System.out.println(subtract);
		
		List<Integer> subtract1 = Set.subtract(arr1, arr2);
		subtract1 = subtract(arr1, arr2);									// subtract some elements but not all
		System.out.println(subtract1);
		System.out.println("-----End of Subtract Tests-----");
		System.out.println();
		
		//testing equals method
		System.out.println("-----Start of Equals Tests-----");
		List<Integer> equalsTest = new ArrayList<>();						//will contain {-1,0,1,2}
		for(int i =-1; i < 3; i++) {
			equalsTest.add(i);
		}
		
		System.out.println(equals(equalsTest, arr1));
		System.out.println(equalsTest);
		System.out.println(link1);
		System.out.println(equals(arr2, arr1));
		System.out.println(equals(arr3, link3));
		
		System.out.println("-----End of Equals Tests-----");
		System.out.println();
		
//		System.out.println("-----Start of Complement Tests-----");
//		List<Integer> comptest = new ArrayList<>();
//		
//		System.out.println(complement(arr2,-3,9));
//		System.out.println("-----End of Complement Tests-----");
//		System.out.println();
		
		//sort is just Collections.sort and pass in the list
		System.out.println("sort is just Collections.sort and pass in the list");
		System.out.println();
		
		
		//testing Cartesian Product
		System.out.println("-----Start of Cartesain Product Tests-----");
		List<Cartesian> emptyCarteasian = Set.cartesianProduct(arr1, arr3);			//Cartesian product with empty set will return empty set
		System.out.println(emptyCarteasian);
		List<Cartesian> newCarteasian = Set.cartesianProduct(arr1, arr2);	
	
		System.out.println(newCarteasian);											//very long Cartesian list
		
		List<Integer> smallList = new ArrayList<>();
		smallList.add(7);
		smallList.add(2);
		
		
		List<Cartesian> answer1 = Set.cartesianProduct(link1, smallList);
		answer1.clear();
		answer1.add(new Cartesian(-6,2));
		answer1.add(new Cartesian(-6,7));
		answer1.add(new Cartesian(-2,2));
		answer1.add(new Cartesian(-2,7));
		answer1.add(new Cartesian(8,2));
		answer1.add(new Cartesian(8,7));
		answer1.add(new Cartesian(10,2));
		answer1.add(new Cartesian(10,7));
		
		System.out.println("does Answer1 equal newCartesian because it shouldn't  " + answer1.equals(newCarteasian));
		
		List<Cartesian> newerCarteasian;
		newerCarteasian = cartesianProduct(link1, smallList);
		System.out.println();
		
		System.out.println("does Answer1 equal NewerCartesian because it should--------  " + answer1.equals(newerCarteasian));
		System.out.println(newerCarteasian);
		System.out.println(answer1);										// test should come back as true because all the elements are added manually into answer1 manually
	}
	
}
