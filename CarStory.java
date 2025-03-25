package com.homeDateTimeM13;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

class Car {
    private String name;
    private String carName;
    private double price;
    
    public Car(String name, String carName, double price) {
        this.name = name;
        this.carName = carName;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCarName() {
        return carName;
    }
    
    public void setCarName(String carName) {
        this.carName = carName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}

class CarImplementation {
    public double sumOfPrices(List<Car> carList) {
        return carList.stream()
                      .mapToDouble(Car::getPrice)
                      .sum();
    }
    
    public List<String> printName(List<Car> carList) {
        return carList.stream()
                      .filter(car -> car.getPrice() > 25000)
                      .map(Car::getCarName)
                      .collect(Collectors.toList());
    }
    
    public double maxPrice(List<Car> carList) {
        return carList.stream()
                      .mapToDouble(Car::getPrice)
                      .max()
                      .orElse(0.0);
    }
}

public class CarStory {
	public static void main(String[] args) {
		List<Car> carList = new ArrayList<>();
        carList.add(new Car("Alfa Romeo", "Giulia", 75000));
        carList.add(new Car("Bugatti", "Chiron", 2500000));
        carList.add(new Car("Chrysler", "Pacifica", 35000));
        carList.add(new Car("Dodge", "Viper", 85000));
        carList.add(new Car("Essen", "Phantom", 910000));

        CarImplementation carImplementation = new CarImplementation();

        double totalPrice = carImplementation.sumOfPrices(carList);
        System.out.println(totalPrice); 

        List<String> carNames = carImplementation.printName(carList);
        System.out.println(carNames); 
        double maxPrice = carImplementation.maxPrice(carList);
        System.out.println(maxPrice); 
	}

}
