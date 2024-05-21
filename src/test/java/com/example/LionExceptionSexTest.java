package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionExceptionSexTest {
    String sex;
    Feline feline;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Львенок"},
                {null},
        };
    }
    public LionExceptionSexTest(String sex) {
        this.sex =sex;
    }
    @Test(expected = Exception.class )
    public void doesHaveMane () throws Exception {
       Lion lion = new Lion(sex, feline);

    }
}

