package wk5;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

@Test
    public void testCarDefaultConstructor() {

    Car car = new Car();

    assertEquals(2, car.getNumDoors());//EXPECTED // ACTUALLY
    assertNotNull(car);
    assertNotEquals("", car.getColor());
    assertFalse(car.isBigCar());
    assertEquals(car.getEngineSize(), Car.EngineSizes.V4);
}
//test the 3 arg constructor
    //create at least 3 assersions


}