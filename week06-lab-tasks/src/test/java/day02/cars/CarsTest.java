package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarsTest {
    Car car1;
    Car car2;
    CarShop carShop;
    @BeforeEach
    void init(){
        car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
        carShop = new CarShop("Best Car", 10_000_000);
    }
    @Test
    void testCars(){
        car1.decreasePrice(10);
        assertTrue(carShop.addCar(car1));
        assertFalse(carShop.addCar(car2));
        assertEquals(2070000,carShop.getCarsForSell().get(0).getPrice());
        assertEquals(1,carShop.getCarsForSell().size());
        assertEquals(2070000,carShop.sumCarPrice());
        assertEquals(1, carShop.numberOfCarsCheaperThan(3_000_000));
        assertEquals(1,carShop.carsWithBrand("Toyota").size());
    }
}
