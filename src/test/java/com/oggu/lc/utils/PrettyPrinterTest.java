package com.oggu.lc.utils;

import org.testng.annotations.Test;

public class PrettyPrinterTest {

    @Test
    public void testPrint() {

        String[][] data = new String[][]{{"ID, NAME"}, {"101, Don"}, {"102, Joe"},};
        PrettyPrinter pp = new PrettyPrinter(System.out);
        pp.print(data);
    }
}