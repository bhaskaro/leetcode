package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWordsInAStringTest {

    String s1 = "   the    sky    is blue   ";
    String s2 = "a good   example";

    String result1 = "blue is sky the";
    String result2 = "example good a";

    @Test
    public void reverseWords() {

        String out = ReverseWordsInAString.reverseWords(s1);
        Assert.assertEquals(result1, out);

        out = ReverseWordsInAString.reverseWords(s2);
        Assert.assertEquals(result2, out);
    }

    @Test
    public void reverseWordsWithSB() {

        String out = ReverseWordsInAString.reverseWordsWithSB(s1);
        Assert.assertEquals(result1, out);

        out = ReverseWordsInAString.reverseWords(s2);
        Assert.assertEquals(result2, out);
    }
}