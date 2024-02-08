package programsTest;

import programs.CountUniqueWords;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class CountUniqueWordsTest {

    CountUniqueWords cw = new CountUniqueWords();
    @Test
    public void test1(){
        Assert.assertEquals(3,cw.countUniqueWords("san s sa"));

        Assert.assertEquals(1,cw.countUniqueWords("san san sa"));

        Assert.assertEquals(0,cw.countUniqueWords("san san san"));
    }
}