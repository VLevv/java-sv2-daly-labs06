package day05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    @Test
    void testWorks(){
        Store store = new Store();
        store.addProducts(new Product("alma",Type.FOOD,200));
        store.addProducts(new Product("alma",Type.FOOD,200));
        store.addProducts(new Product("alma",Type.FOOD,200));
        store.addProducts(new Product("póló",Type.CLOTHES,2000));
        store.addProducts(new Product("póló",Type.CLOTHES,2000));
        assertEquals(Arrays.asList(3,2),store.sameTypeAmount());
    }
}
