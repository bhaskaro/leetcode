/**
 * 
 */
package com.oggu.lc.medium.concurr;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;

/**
 * @author Bhaskar
 *
 */
public class ZeroEvenOdd {

	private int n;
	private int x = 0;

	private boolean zero = false;

	public ZeroEvenOdd(int n) {
		this.n = n;
		zero = n > 0 ? true : false;
	}

	// printNumber.accept(x) outputs "x", where x is an integer.
	public synchronized void zero(IntConsumer printNumber) throws InterruptedException {

		while (x < n)
			if (zero) {
				printNumber.accept(0);
				x++;
				zero = !zero;
				this.notifyAll();
			} else
				this.wait();
	}

	public synchronized void odd(IntConsumer printNumber) throws InterruptedException {

		while (x <= n)
			if (x % 2 == 1 && !zero) {
				printNumber.accept(x);
				if (x == n) {
					x++;
					zero = false;
				} else
					zero = !zero;
				this.notifyAll();
			} else
				this.wait();

	}

	public synchronized void even(IntConsumer printNumber) throws InterruptedException {

		while (x <= n)
			if (x % 2 == 0 && !zero) {
				printNumber.accept(x);

				if (x == n) {
					x++;
					zero = false;
				} else
					zero = !zero;
				this.notifyAll();
			} else
				this.wait();
	}

	public static void main(String args[]) {

		try {
			final ZeroEvenOdd zeo = new ZeroEvenOdd(1); // 3 is the n in the test case

			final IntConsumer ic = (x) -> System.out.print(Integer.valueOf(x) + " ");

			ExecutorService es = Executors.newFixedThreadPool(3); // need at least 3 threads going
			es.submit(() -> {
				try {
					zeo.zero(ic);
				} catch (InterruptedException ign) {
				}
			});
			es.submit(() -> {
				try {
					zeo.even(ic);
				} catch (InterruptedException ign) {
				}
			});
			es.submit(() -> {
				try {
					zeo.odd(ic);
				} catch (InterruptedException ign) {
				}
			});

			es.shutdown();
			es.awaitTermination(1, TimeUnit.DAYS); // OK crazy - but ...
			System.out.println();

		} catch (Throwable t) {
			t.printStackTrace();
			System.out.println("===================");
			System.exit(-2);
		}
	}
}
