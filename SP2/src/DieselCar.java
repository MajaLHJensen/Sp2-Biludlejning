public class DieselCar extends AFuelCar
{
    boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    public String getFuelType()
    {
        return "Diesel";
    }

    public int getRegistrationFee()

    {
        int fee = 0;

        if (hasParticleFilter)
        {
            fee += 1000;
        }

        if ((20 <= kmPrLitre()) && (kmPrLitre() <= 50))
        {
            fee = 130;
            return fee;
        } else if ((15 <= kmPrLitre()) && (kmPrLitre() <= 20))
        {
            fee = 1390;
            return fee;
        } else if ((10 <= kmPrLitre()) && (kmPrLitre() <= 15))
        {
            fee = 1850;
            return fee;
        } else if ((5 <= kmPrLitre()) && (kmPrLitre() <= 10))
        {
            fee = 2770;
            return fee;
        } else if (kmPrLitre() < 5)
        {
            fee = 15260;
            return fee;
        }

        return 0;
    }

    @Override
    public String toString()
    {
        return "DieselCar: " +
                "HasParticleFilter: " + hasParticleFilter + super.toString()+
                "\n\n";
    }
}
