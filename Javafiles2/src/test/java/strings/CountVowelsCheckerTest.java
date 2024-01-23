package strings;

import org.junit.Test;
import strings.AnagramChecker;
import strings.CountVowels;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class CountVowelsCheckerTest {

    @Test
    public void test1(){
//        boolean cond = CountVowels.countVowels("abc");
        assertEquals(1,CountVowels.countVowels("abc"));
    }
    @Test
    public void test2(){
//        boolean cond = CountVowels.countVowels("abc");
        assertEquals(5,CountVowels.countVowels("aeiou"));
    }

    @Test
    public void test3(){
//        boolean cond = CountVowels.countVowels("abc");
        assertEquals(0,CountVowels.countVowels(""));
    }

}
