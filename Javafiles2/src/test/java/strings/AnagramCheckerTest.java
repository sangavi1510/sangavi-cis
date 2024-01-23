package strings;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class AnagramCheckerTest {
    @org.junit.Test
    public void test1() {

        assertEquals(true, AnagramChecker.checkAnagrams("abc", "cab"));
//        boolean cond = AnagramChecker.checkAnagrams("abc","cab");
//        assertTrue(AnagramChecker.checkAnagrams("abc","cab"));
    }

    @org.junit.Test
    public void test2() {
//        boolean cond = AnagramChecker.checkAnagrams("abc","cab");
        assertFalse(AnagramChecker.checkAnagrams("abc", "bab"));
    }
}
