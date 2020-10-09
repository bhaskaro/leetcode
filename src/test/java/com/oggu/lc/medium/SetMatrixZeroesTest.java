package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.SecureRandom;
import java.util.Random;

public class SetMatrixZeroesTest {

    @Test
    public void testMain() {

        SetMatrixZeroes.main(null);
    }

    @Test
    public void testSetZeroes() {

        int rows = 5;
        int cols = 5;
        Random ran = new SecureRandom();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = ran.nextInt(10);

        SetMatrixZeroes.setZeroes(arr);
        Assert.assertNotNull(arr);
    }
}