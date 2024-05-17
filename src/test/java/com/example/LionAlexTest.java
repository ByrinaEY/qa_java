package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    private List<String> expectedFriends;
    @Mock
    LionAlex lionAlex;
    Feline feline;

    @Before
    public void setLionAlex() throws Exception {
        lionAlex = new LionAlex(feline);
        expectedFriends = List.of("Марти", "Глория", "Мелман");
    }
    @Test
    public void getNewYorkLiving() {
        String result = lionAlex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", result);
    }

    @Test
    public void getOKitten() throws Exception {
        int result = lionAlex.getKittens();
        assertEquals(0, result);
    }
   @Test
    public void getFriendsList(){
       List<String> friendAlexLion = lionAlex.getFriends();
       assertEquals(expectedFriends, friendAlexLion);
   }

}
