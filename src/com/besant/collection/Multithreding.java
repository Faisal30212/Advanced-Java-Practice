package com.besant.collection;

public class Multithreding extends Thread {
@Override
public void run() {
	for(int i=0;i<10;i++) {
	System.out.println(getName()+"Hello"+i);
} 
}
public static void main(String[] args) {
	System.out.println("Program Start");
	Multithreding t1= new Multithreding ();
	Multithreding t2= new Multithreding ();
	Multithreding t3= new Multithreding ();
	Multithreding t4= new Multithreding ();
	Multithreding t5= new Multithreding ();
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	//t5.start();
	try {
		t5.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("End of the program");
	}
	try {
		t5.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

