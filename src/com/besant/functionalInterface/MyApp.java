package com.besant.functionalInterface;

public class MyApp {
	public static void main(String[] args) {
		SampleClass obj =new SampleClass();
		obj.sayHello();
		
		
		MyFunctionalInterface funobj=()->System.out.println("Hello Good Morning");
		funobj.sayHello();
		
		
		SumOfTwoNumbers sumobj =(a,b)->{
			int result=a+b;
			System.out.println("the result is"+result);
			};
			
			sumobj.addTwoNumbers(81, 45);
			sumobj.addTwoNumbers(26,64);
			
			
		Multiplication mulobj= (a,b,c)-> {
			int result= a*b*c;
			return result;
		};
		int mulres=mulobj.multiplyThreeNumbers(3,4,6);
		System.out.println("the result is"+mulres);
			
		}
	}


//Can we add default and static methods in interface? if yes explain with example.
