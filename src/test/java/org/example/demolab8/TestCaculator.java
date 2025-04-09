package org.example.demolab8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaculator {

    @Test
    public void testSum() {
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sum(5,5),25);
    }

    public void testSub() {
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sub(2,2),0);
    }
}
