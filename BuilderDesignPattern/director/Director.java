package director;

import builders.Builder;
import cars.CarType;
import components.Engine;
import components.GpsNavigator;
import components.Transmission;
import components.TripComputer;

public class Director {

    public void construstSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setEngine(new Engine(3.0, 0));
        builder.setSeats(2);
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setGPSNavigator(new GpsNavigator());
        builder.setTripComputer(new TripComputer());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setEngine(new Engine(1.2, 0));
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setGPSNavigator(new GpsNavigator());
        builder.setTripComputer(new TripComputer());
    }

    public void constructSuvCar(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setEngine(new Engine(2.5, 0));
        builder.setSeats(4);
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GpsNavigator());
    }
}
