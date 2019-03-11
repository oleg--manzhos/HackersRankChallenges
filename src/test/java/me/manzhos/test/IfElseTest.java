package me.manzhos.test;

import manzhos.me.IfElseChallenge;
import me.manzhos.dataprovider.IfElseDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IfElseTest {

    @Test(dataProvider = "ifElse", dataProviderClass= IfElseDataProvider.class)
    public void testIfElse(int input, String result){
        Assert.assertEquals(IfElseChallenge.validateInput(input), result);
    }
}
