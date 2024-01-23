package strings;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

class ReverseWordsInSentenceTest {

    @Test
    public void test1() {
        String str1="Hello World";
        String str2="dlroW olleH";
        assertEquals(str2,ReverseWordsInSentence.reverseString(str1));
    }
    @Test
    public void test2(){
        String str1="";
        String str2="";
        assertEquals(str2,ReverseWordsInSentence.reverseString(str1));
    }

}