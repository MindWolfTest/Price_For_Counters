package com.example.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.example.constants.ConstForTax.*;

public class DataProcessing
{
    public double priceHotWaterInBathroom(LastData lastData)
    {
        double price =  (lastData.getNewCounterHotWaterInBathroom() - lastData.getLastCounterHotWaterInBathroom()) * TAX_FOR_HOT_WATER;

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceColdWaterInBathroom(LastData lastData)
    {
        double price = (lastData.getNewCounterColdWaterInBathroom() - lastData.getLastCounterColdWaterInBathroom()) * TAX_FOR_COLD_WATER;

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceHotWaterInKitchen(LastData lastData)
    {
        double price  =  (lastData.getNewCounterHotWaterInKitchen() - lastData.getLastCounterHotWaterInKitchen()) * TAX_FOR_HOT_WATER;

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceColdWaterInKitchen(LastData lastData)
    {
        double price = ((lastData.getNewCounterColdWaterInKitchen() - lastData.getLastCounterColdWaterInKitchen()) * TAX_FOR_COLD_WATER);

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double usedWaterCounter(LastData lastData)
    {
        return ((lastData.getNewCounterHotWaterInBathroom() - lastData.getLastCounterHotWaterInBathroom())
                + (lastData.getNewCounterColdWaterInBathroom() - lastData.getLastCounterColdWaterInBathroom())
                + (lastData.getNewCounterHotWaterInKitchen() - lastData.getLastCounterHotWaterInKitchen())
                + (lastData.getNewCounterColdWaterInKitchen() - lastData.getLastCounterColdWaterInKitchen()));
    }

    public double priceForWaterDrainage(LastData lastData)
    {
        double price = usedWaterCounter(lastData) * TAX_FOR_WATER_DRAINAGE;

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceForEnergy(LastData lastData)
    {
        double price =  (lastData.getNewEnergyCounter() - lastData.getLastEnergyCounter()) * TAX_FOR_ENERGY;

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double totalPrice(LastData lastData)
    {
        double price = priceHotWaterInBathroom(lastData) + priceColdWaterInBathroom(lastData) + priceHotWaterInKitchen(lastData)
                + priceColdWaterInKitchen(lastData) + priceForEnergy(lastData) + priceForWaterDrainage(lastData);

        int scale = 2;
        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }
}
