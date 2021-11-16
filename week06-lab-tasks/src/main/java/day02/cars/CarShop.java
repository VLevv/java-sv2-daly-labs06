package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxCarPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, int maxCarPrice) {
        this.name = name;
        this.maxCarPrice = maxCarPrice;
    }

    public String getName() {
        return name;
    }

    public int getMaxCarPrice() {
        return maxCarPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    public boolean addCar(Car car){
        if(car.getPrice()<=maxCarPrice){
            carsForSell.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice(){
        int sum=0;
        for (Car c :
                carsForSell) {
            sum+=c.getPrice();
        }
        return sum;
    }

    public int numberOfCarsCheaperThan(int price){
        int c=0;
        for (Car car :
                carsForSell) {
            if(car.getPrice()<price){
                c++;
            }
        }
        return c;
    }

    public List<Car> carsWithBrand(String brand){
        List<Car> tmp = new ArrayList<>();
        for (Car c :
                carsForSell) {
            if (c.getBrand().equals(brand)) {
            tmp.add(c);
            }
        }
            return tmp;
    }
}
