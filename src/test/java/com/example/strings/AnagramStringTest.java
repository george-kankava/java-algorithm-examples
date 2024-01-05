package com.example.strings;


import org.example.strings.AnagramString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramStringTest {

    @Test
    public void testIsAnagramTest() {
        Assertions.assertTrue(AnagramString.isAnagram("army", "mary"));
        Assertions.assertTrue(AnagramString.isAnagram("mary", "army"));
        Assertions.assertTrue(AnagramString.isAnagram("stop", "pots"));
        Assertions.assertTrue(AnagramString.isAnagram("pots", "stop"));
        Assertions.assertFalse(AnagramString.isAnagram("pots", "stopa"));
        Assertions.assertFalse(AnagramString.isAnagram("stopa", "pots"));
    }

    @Test
    public void testIsAnagramTestBySorting() {
        Assertions.assertTrue(AnagramString.isAnagramBySorting("army", "mary"));
        Assertions.assertTrue(AnagramString.isAnagramBySorting("mary", "army"));
        Assertions.assertTrue(AnagramString.isAnagramBySorting("stop", "pots"));
        Assertions.assertTrue(AnagramString.isAnagramBySorting("pots", "stop"));
        Assertions.assertFalse(AnagramString.isAnagramBySorting("pots", "stopa"));
        Assertions.assertFalse(AnagramString.isAnagramBySorting("stopa", "pots"));
    }

    @Test
    public void testIsAnagramTestWithStringBuilder() {
        Assertions.assertTrue(AnagramString.isAnagramByWithStringBuilder("army", "mary"));
        Assertions.assertTrue(AnagramString.isAnagramByWithStringBuilder("mary", "army"));
        Assertions.assertTrue(AnagramString.isAnagramByWithStringBuilder("stop", "pots"));
        Assertions.assertTrue(AnagramString.isAnagramByWithStringBuilder("pots", "stop"));
        Assertions.assertFalse(AnagramString.isAnagramByWithStringBuilder("pots", "stopa"));
        Assertions.assertFalse(AnagramString.isAnagramByWithStringBuilder("stopa", "pots"));
    }
}
