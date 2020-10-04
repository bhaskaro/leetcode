package com.oggu.lc.medium.concurr;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;

/**
 * @author Bhaskar
 */
public class ZeroEvenOdd {

    private static Logger logger = LogManager.getLogger();

    private int n;
    private int x = 0;

    private boolean zero;

    public ZeroEvenOdd(int n) {
        this.n = n;
        zero = n > 0;
    }

    public static void main(String[] args) {

        try {
            final ZeroEvenOdd zeo = new ZeroEvenOdd(1); // 3 is the n in the test case

            final IntConsumer ic = (x) -> logger.info("{} ", x);

            ExecutorService es = Executors.newFixedThreadPool(3); // need at least 3 threads going
            es.submit(() -> {
                try {
                    zeo.zero(ic);
                } catch (InterruptedException ign) {
                    logger.error(ign);
                }
            });
            es.submit(() -> {
                try {
                    zeo.even(ic);
                } catch (InterruptedException ign) {
                    logger.error(ign);
                }
            });
            es.submit(() -> {
                try {
                    zeo.odd(ic);
                } catch (InterruptedException ign) {
                    logger.error(ign);
                }
            });

            es.shutdown();
            es.awaitTermination(1, TimeUnit.DAYS); // OK crazy - but ...

        } catch (Throwable t) {
            logger.error(t);
            System.exit(-2);
        }
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
}
