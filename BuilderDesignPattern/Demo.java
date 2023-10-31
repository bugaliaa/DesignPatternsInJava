import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);

        Car sportsCar = carBuilder.getResult();
        System.out.println("Car built:\n" + sportsCar.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();

        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
