package com.zipcodewilmington.froilansfarm.FroilanFarmTests.Weekdays;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Farm.DayOfWeek;
import com.zipcodewilmington.froilansfarm.Farm.FroilanFarm.FarmWeek;
import com.zipcodewilmington.froilansfarm.Farm.FroilanFarm.FroilanFarm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Thursday {

    private FroilanFarm froilanFarm = FroilanFarm.getInstance();
    private FarmWeek week = new FarmWeek();

    @Before
    public void setUp(){
        froilanFarm.setUp();
    }

    @Test
    public void horseTest(){
        Horse horse = froilanFarm.getFarm().getStables().get(0).getHorses().get(0);
        Assert.assertFalse(horse.getHasBeenRiddenToday());
        Assert.assertFalse(horse.getHasBeenFed());
    }

    @Test
    public void horseTest2(){
        week.week(DayOfWeek.THURSDAY);
        Horse horse = froilanFarm.getFarm().getStables().get(0).getHorses().get(0);
        Assert.assertTrue(horse.getHasBeenRiddenToday());
        Assert.assertTrue(horse.getHasBeenFed());
    }


    @Test
    public void carrotTest(){
        week.week(DayOfWeek.THURSDAY);

        Integer expected = 280;
        Assert.assertEquals(expected, froilanFarm.getFarm().getBarn().getCarrotStoreHouse().getAmountInStorage());
    }

    @Test
    public void cornTest(){
        week.week(DayOfWeek.THURSDAY);

        Integer expected = 365;
        Assert.assertEquals(expected, froilanFarm.getFarm().getBarn().getCornStoreHouse().getAmountInStorage());
    }

    @Test
    public void tomatoTest(){
        week.week(DayOfWeek.THURSDAY);

        Integer expected = 440;
        Assert.assertEquals(expected, froilanFarm.getFarm().getBarn().getTomatoStoreHouse().getAmountInStorage());
    }

    @Test
    public void eggTest(){
        week.week(DayOfWeek.THURSDAY);

        Integer expected = 340;
        Assert.assertEquals(expected, froilanFarm.getFarm().getBarn().getEggStoreHouse().getAmountInStorage());
    }

    @Test
    public void fieldTest(){
        week.week(DayOfWeek.THURSDAY);
        Assert.assertFalse(froilanFarm.getFarm().getField().getHasBeenFertilized());
    }

    @Test
    public void fieldTest2(){
        week.week(DayOfWeek.THURSDAY);
        Assert.assertTrue(froilanFarm.getFarm().getField().getHasBeenHarvested());
    }


}

