package programs;

import programs.RepeatedCharacters;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class RepeatedCharactersTest {
    RepeatedCharacters rc = new RepeatedCharacters();
    @Test
    public void test1(){
        Assert.assertEquals("a",rc.findRepeatedCharacters("sangavi"));
        Assert.assertEquals("am",rc.findRepeatedCharacters("sangavikema"));
    }
}