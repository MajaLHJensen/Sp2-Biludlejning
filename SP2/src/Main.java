import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        FleetOfCars fleetofcars = new FleetOfCars();

        Car Gasolinecar = new GasolineCar("bl26782",  "audi",  "r4",  5, 50);
        Car Dieselcar = new DieselCar("am63428",  "volkswagen",  "up",  5, 50, true);
        Car Electriccar = new ElectricCar("kl52738",  "Tesla", "Model s", 5,  25,  50);

        fleetofcars.addCar(Gasolinecar);
        fleetofcars.addCar(Dieselcar);
        fleetofcars.addCar(Electriccar);

         System.out.println(fleetofcars.getTotalRegistrationFeeForFleet());

        System.out.println(fleetofcars);
    }


}