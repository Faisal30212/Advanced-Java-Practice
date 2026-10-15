package com.besant.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numList =new ArrayList<Integer>();
		numList.add(2);
		numList.add(25);
		numList.add(14);
		numList.add(18);
		numList.add(52);
		numList.add(36);
		numList.add(45);
		numList.add(45);
		numList.add(61);
		numList.add(40);
		numList.add(32);
		numList.add(32);
		numList.add(31);
		numList.add(4);
		numList.add(74);
		numList.add(9);
		
		//converting  collection to stream 1st step.
		List<Integer> resultList =numList.stream()
		.filter(n-> n%2==0)//Writing a intermediate method 
		.sorted()//sort the numbers in ascending order
		.map(n->n*10)//multipling each element with this(map) method
		.collect(Collectors.toList());//Collect terminal method.
		System.out.println(resultList);
		
		
		numList.stream()
		.filter(n-> n%2==0)
		.sorted()
		.forEach(n->System.out.println(n));
		
		
		long result =numList.stream()
		.filter(n-> n%2==0)
		.sorted()
		.distinct()
		.count();
		System.out.println("Total Even number is"+ result);
		
// Printing even or odd in normal method.		
//		for(Integer n:numList) {
//			if(n%2 ==0 ) {
//				System.out.println("Even NUmber"+n);
//			}else {
//				System.out.println("Odd number"+n );
//			}
//		}
		
		}

}
