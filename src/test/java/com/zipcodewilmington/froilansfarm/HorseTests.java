package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Assert;
import org.junit.Test;

public class HorseTests {

  /*  @Test
    public void eatTest(){
        //Given
        Horse horse = new Horse();
        Boolean expected = true;

        //When
        horse.eat(horse);

        //Then
        Assert.assertEquals(expected, horse.checkisFed(horse));
    }*/

    


    @Test
    public void makeNoiseTest(){
        //Given
        Horse horse = new Horse();
        String expected = "Let the ruling classes tremble at a Communistic revolution";

        //Then
        Assert.assertEquals(expected, horse.makeNoise());
    }
}
