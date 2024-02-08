package programsTest;

import programs.LToUandViceVersa;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class LToUandViceVersaTest {
    LToUandViceVersa ob = new LToUandViceVersa();
    @Test
    public void test1(){
        Assert.assertEquals("SaNgAvI",ob.ltouandViceVersa("sAnGaVi"));

        Assert.assertEquals("He shells",ob.ltouandViceVersa("hE SHELLS"));
    }
}