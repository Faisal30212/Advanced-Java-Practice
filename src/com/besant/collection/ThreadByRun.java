package com.besant.collection;

public class ThreadByRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(
                Thread.currentThread().getName() + " : " + i
            );
        }
    }

    public static void main(String[] args) {

        ThreadByRun obj = new ThreadByRun();

        Thread t1 = new Thread(obj, "Thread-1");
        Thread t2 = new Thread(obj, "Thread-2");

        t1.start();
        t2.start();
        try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			t2.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
