import java.util.Random;
class Car {
    String model;
    String brand;
    String color;

    public Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }
    public void printInfo() {
        System.out.println(
                "Model: " + this.model +
                "; Brand: " + this.brand +
                "; Color: " + this.color
        );
        
    }
}
class CarFactory {
    String[] colors = {"red","black","white"};
    Random rand = new Random();

    public Car buildCar() {
        int colorPicker = rand.nextInt(0, colors.length);
        String color = colors[colorPicker];

        return new Car("Ford", "Mustang", color); // giving our Mustang random color
    }
}

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car car1 = carFactory.buildCar();
        Car car2 = carFactory.buildCar();

        car1.printInfo();
        car2.printInfo();
    }
}
