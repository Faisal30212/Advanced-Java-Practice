package com.besant.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nameList =new ArrayList<String>();
		//nameList.add(null); //commented because of sorting ,it will not allow the null value
		nameList.add("Zoro");
		nameList.add("Lufy");
		nameList.add("Itachi");
		nameList.add("Naruto");
		nameList.add("Shanks");// we can insert n number of values 
		nameList.add("Naruto");//we can insert duplicate value also
		//nameList.add(null);//We can enter n numbers of null values
		System.out.println(nameList);//Before sorting
		//ArrayList is maintaining insertion order
		Collections.sort(nameList);//Sorting the array list
		System.out.println(nameList);//After sorting 
		nameList.remove(0);//To remove an element from the Index using index number
		System.out.println(nameList);
		//fast in searching values
		//Bitwise shifting 
		//Slower in listing 

	}

}
