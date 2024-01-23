package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsTest {

    @Test
    public void test1() {
        String str1="sangavi";
        assertEquals(3,CountVowels.countVowels(str1));
    }

    @Test
    public void test2() {
        String str2="";
        assertEquals(0,CountVowels.countVowels(str2));
    }
}