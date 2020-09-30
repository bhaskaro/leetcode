/**
 *
 */
package com.oggu.lc.medium.concurr;

/**
 * @author Bhaskar
 *
 */
public class H2O {

    private int hCount = 0;

    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        synchronized (this) {
            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            while (hCount == 2)
                this.wait();

            releaseHydrogen.run();
            hCount++;
            this.notify();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        synchronized (this) {
            while (hCount < 2)
                this.wait();

            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
            hCount = 0;
            this.notify();
        }
    }
}
