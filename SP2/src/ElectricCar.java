public class ElectricCar extends ACar
{
    int batteryCapacityKWh;
    int maxRangeKm;
    int whPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh, int maxRangeKm)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
        this.whPrKm = batteryCapacityKWh*1000 / maxRangeKm;
    }

    // returns the battery capacity in kilowatt hours
    public int getBatteryCapacityKWh()
    {
        return batteryCapacityKWh;
    }

    // returns the maximum range in kilometres.
    public int getMaxRangeKm()
    {
        return maxRangeKm;
    }

    // returns the power consumption in watt hours per driven kilometre.
    public int getWhPrKm()
    {
        return whPrKm;
    }


    @Override
    public int getRegistrationFee()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "ElectricCar: " +
                "BatteryCapacityKWh: " + batteryCapacityKWh +
                "MaxRangeKm: " + maxRangeKm +
                "WhPrKm: " + whPrKm + super.toString()+
                "\n\n";
    }
}
