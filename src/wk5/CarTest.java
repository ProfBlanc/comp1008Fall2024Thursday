package wk5;


import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @Test
    public void testCarAllArgsConstructor(){

        Car car = new Car("yellow", 1500d, (byte)5, 25f, Car.EngineSizes.V12, 25D);
        assertNotNull(car);
        assertTrue(car.getColor().length() >= 3);
        assertEquals((byte)5, car.getNumDoors());
    }
    @Test
    public void testCarAllArgsConstructorIncorrectValues(){

    Car car = new Car("ab", -100d, (byte)10, Car.MIN_WHEEL_SIZE - 20,
            Car.EngineSizes.V3, -1d);

    assertNotNull(car);
    assertNotEquals("ab", car.getColor());
    assertEquals((byte)2, car.getNumDoors());
    }


    //annoation   // primitive data types + s  ALSO strings
    @ParameterizedTest
    @ValueSource( bytes = {1, 10, 20, 6 , -10, 50, -100} )
    public void testSetNumDoorsBadValuesFiltered(byte doorValue){

        Car car = new Car();
        car.setNumDoors(doorValue);
        assertNotEquals(doorValue, car.getNumDoors()) ;
    }

    @ParameterizedTest
    @CsvSource({"blue,2000,4","orange,12345,3","turquoise,98765,5"})
    public void testCar3ArgConstructorGoodValues(String color, double weight, byte numberOfDoors){

        Car car = new Car(color, weight, numberOfDoors);
        assertNotNull(car);
        assertEquals(color, car.getColor());
        assertEquals(numberOfDoors, car.getNumDoors());
        assertEquals(weight, car.getWeight());
    }

}