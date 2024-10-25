package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void calculateWaterBill() {
        // Prepare
        var waterMeter = new WaterMeter();

        assertEquals(22.74, waterMeter.calculateWaterBill(1800), 0);
        assertEquals(22.74, waterMeter.calculateWaterBill(2244), 0);
        assertEquals(26.64, waterMeter.calculateWaterBill(2245), 0);
        assertEquals(26.64, waterMeter.calculateWaterBill(2992), 0);
        assertEquals(46.14, waterMeter.calculateWaterBill(6000), 0);
        assertEquals(53.94, waterMeter.calculateWaterBill(8000), 0);

        assertEquals(18.84, waterMeter.calculateWaterBill(0), 0);
        assertEquals(18.84, waterMeter.calculateWaterBill(1496), 0);
        assertEquals(22.74, waterMeter.calculateWaterBill(1497), 0);
        assertEquals(18.84, waterMeter.calculateWaterBill(-20), 0);
    }
}