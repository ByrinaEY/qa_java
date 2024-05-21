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
public class FelineTest {
    private List<String> expectedFood;
    @Mock
    Animal animal;
    Feline feline;

    @Before
    public void setFeline() {
        feline = new Feline();
        expectedFood = List.of("Животные", "Птицы", "Рыба");

    }
//    @Test
//    public void foodFelineTest() throws Exception {
//        Mockito.when(animal.getFood("Хищник")).thenReturn(expectedFood);
//        List<String> foodFeline = feline.eatMeat();
//        assertEquals(expectedFood, foodFeline);
//    }

    @Test
    public void getCatFamily() {
        String result = feline.getFamily();
        assertEquals("Кошачьи", result);
    }

    @Test
    public void getOneKitten(){
        int result = feline.getKittens();
        assertEquals(1, result);
    }
    @Test
    public void countKitten(){
        int result = feline.getKittens(2);
        assertEquals(2, result);
    }

}
