package com.oggu.lc.medium;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInAStringTest {

    String s = "   the    sky    is blue   ";
    String result = "blue is sky the";

    @Test
    public void reverseWords() {

        String out = ReverseWordsInAString.reverseWords(s);
        Assert.assertEquals(result, out);
    }
}