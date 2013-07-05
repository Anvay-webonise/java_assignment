package com.webonise.assignment.dinnerphilosopher;

import java.util.concurrent.Semaphore;

/**
 * @author Anvay The philosopher class implements runnable interface and
 *         override the Run() method and class contain one synchronized method
 *         pickupChopstick()
 */
public class Philosopher implements Runnable {

	int m = 1;
	Semaphore mySem, myNeighbourSem;
	Thread ph;
	String name = "Philosopher";

	/**
	 * @param id
	 * @param sem1
	 * @param sem2
	 *            Constructor for the class philosopher which will initializes
	 *            following parameter And start the execution of each thread
	 */
	public Philosopher(int id, Semaphore sem1, Semaphore sem2) {

		mySem = sem1;
		myNeighbourSem = sem2;
		ph = new Thread(this, name + id);
		ph.start();
	}

	/**
	 * Think method make sleep the thread for some time as philosopher is
	 * thinking
	 */
	public void think() {
		try {
			System.out.println(ph.getName() + " : is thinking know ");
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			System.out.print("The thread is interrupted : " + ph.getName());
		}
	}

	/**
	 * when philosopher come for eating first the chopstick are check and if
	 * both sticks are available then philosopher allow to eat and after eating
	 * philosopher release both the stick which he acquire
	 */
	synchronized public void pickupChopstick() {
		System.out.println(ph.getName()
				+ " : is trying to pick up LEFT Chopstick");

		try {
			mySem.acquire();

			if (!myNeighbourSem.tryAcquire()) {

				System.out.println(ph.getName()
						+ " : Neighbours (RIGHT) Chopstick is not avaible");
				return;
			}

			this.eat();
			System.out.println(ph.getName()
					+ " : puts down both LEFT and RIGHT chopstick");
		}

		catch (InterruptedException e) {

			System.out.println(ph.getName() + " : interrupted while eating");
		} finally {
			mySem.release();
		}
	}

	/**
	 * The philosopher eat in this method as it sleep for some time.
	 */
	public void eat() {

		System.out
				.println(ph.getName()
						+ " : Neighbours (RIGHT) chopstick is pickup and now eating a meal");
		try {
			Thread.sleep(5000);
			myNeighbourSem.release();
		} catch (InterruptedException e) {

			System.out.println(ph.getName() + " : interrupted while eating");
		}
	}

	@Override
	public void run() {
		while (m > 0) {
			think();
			pickupChopstick();
		}
	}

	/**
	 * @param args
	 *            In main method array objects of both semaphore class and
	 *            philosopher class are initialize.
	 */
	public static void main(String[] args) {

		Semaphore[] mySem = new Semaphore[5];
		for (int i = 0; i < 5; i++) {
			mySem[i] = new Semaphore(1, true);
		}

		Philosopher[] philosopher = new Philosopher[5];
		for (int i = 0; i < 5; i++) {
			int j = i + 1;
			if (j == 5)
				j = 0;
			philosopher[i] = new Philosopher(i, mySem[i], mySem[j]);
		}
	}
}
