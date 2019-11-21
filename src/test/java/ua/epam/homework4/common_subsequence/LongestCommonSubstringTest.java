package ua.epam.homework4.common_subsequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubstringTest {
    LongestCommonSubstring longestCommonSubstring = new LongestCommonSubstring();
    String string1 = "abcJava";
    String string2 = "abcJava";

    String string3 = "abcJava";
    String string4 = "686786";

    String string5 = "";
    String string6 = "";

    String string7 = "";
    String string8 = "abcJava";

    String string9 = "a";
    String string10 = "abcJava";

    @Test
    public void comparingIdenticalStrings() {
        assertEquals("abcJava", longestCommonSubstring.getCommonSubstring(string1, string2));
    }

    @Test
    public void comparingCompletelyDifferentStrings() {
        assertEquals("", longestCommonSubstring.getCommonSubstring(string3, string4));
    }

    @Test
    public void comparingTwoEmptyStrings() {
        assertEquals("", longestCommonSubstring.getCommonSubstring(string5, string6));
    }

    @Test
    public void comparingNonEmptyStringWithEmptyString() {
        assertEquals("", longestCommonSubstring.getCommonSubstring(string7, string8));
    }

    @Test
    public void comparingOneCharToString() {
        assertEquals("a", longestCommonSubstring.getCommonSubstring(string9, string10));
    }
}
