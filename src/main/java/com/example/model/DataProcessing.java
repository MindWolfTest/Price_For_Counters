package com.example.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.example.constants.ConstForTax.*;

public class DataProcessing
{
    public double priceHotWaterInBathroom(Data data)
    {
        double price =  (data.getNewCounterHotWaterInBathroom() - data.getLastCounterHotWaterInBathroom()) * TAX_FOR_HOT_WATER;

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceColdWaterInBathroom(Data data)
    {
        double price = (data.getNewCounterColdWaterInBathroom() - data.getLastCounterColdWaterInBathroom()) * TAX_FOR_COLD_WATER;

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceHotWaterInKitchen(Data data)
    {
        double price  =  (data.getNewCounterHotWaterInKitchen() - data.getLastCounterHotWaterInKitchen()) * TAX_FOR_HOT_WATER;

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceColdWaterInKitchen(Data data)
    {
        double price = ((data.getNewCounterColdWaterInKitchen() - data.getLastCounterColdWaterInKitchen()) * TAX_FOR_COLD_WATER);

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double usedWaterCounter(Data data)
    {
        return ((data.getNewCounterHotWaterInBathroom() - data.getLastCounterHotWaterInBathroom())
                + (data.getNewCounterColdWaterInBathroom() - data.getLastCounterColdWaterInBathroom())
                + (data.getNewCounterHotWaterInKitchen() - data.getLastCounterHotWaterInKitchen())
                + (data.getNewCounterColdWaterInKitchen() - data.getLastCounterColdWaterInKitchen()));
    }

    public double priceForWaterDrainage(Data data)
    {
        double price = usedWaterCounter(data) * TAX_FOR_WATER_DRAINAGE;

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceForEnergy(Data data)
    {
        double price =  (data.getNewEnergyCounter() - data.getLastEnergyCounter()) * TAX_FOR_ENERGY;

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double totalPrice(Data data)
    {
        double price = priceHotWaterInBathroom(data) + priceColdWaterInBathroom(data) + priceHotWaterInKitchen(data)
                + priceColdWaterInKitchen(data) + priceForEnergy(data) + priceForWaterDrainage(data);

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }
}
