package builders;

import cars.Car;
import cars.CarType;
import components.Engine;
import components.GpsNavigator;
import components.Transmission;
import components.TripComputer;

public class CarBuilder implements Builder{

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;


    @Override
    public void setCarType(CarType type) {
        // TODO Auto-generated method stub
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        // TODO Auto-generated method stub
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        // TODO Auto-generated method stub
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        // TODO Auto-generated method stub
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        // TODO Auto-generated method stub
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GpsNavigator gpsNavigator) {
        // TODO Auto-generated method stub
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        // TODO Auto-generated method stub
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

}
