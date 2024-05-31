package com.example.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.example.constants.ConstForDecimal.SCALE;
import static com.example.constants.ConstForTax.*;

public class DataProcessing
{
    public double priceHotWaterInBathroom(LastData lastData, NewData newData)
    {
        double price =  (newData.getNewCounterHotWaterInBathroom() - lastData.getLastCounterHotWaterInBathroom()) * TAX_FOR_HOT_WATER;

        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(SCALE, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceColdWaterInBathroom(LastData lastData, NewData newData)
    {
        double price = (newData.getNewCounterColdWaterInBathroom() - lastData.getLastCounterColdWaterInBathroom()) * TAX_FOR_COLD_WATER;

        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(SCALE, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceHotWaterInKitchen(LastData lastData, NewData newData)
    {
        double price  =  (newData.getNewCounterHotWaterInKitchen() - lastData.getLastCounterHotWaterInKitchen()) * TAX_FOR_HOT_WATER;

        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(SCALE, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceColdWaterInKitchen(LastData lastData, NewData newData)
    {
        double price = ((newData.getNewCounterColdWaterInKitchen() - lastData.getLastCounterColdWaterInKitchen()) * TAX_FOR_COLD_WATER);

        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(SCALE, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double usedWaterCounter(LastData lastData, NewData newData)
    {
        double price = ((newData.getNewCounterHotWaterInBathroom() - lastData.getLastCounterHotWaterInBathroom())
                + (newData.getNewCounterColdWaterInBathroom() - lastData.getLastCounterColdWaterInBathroom())
                + (newData.getNewCounterHotWaterInKitchen() - lastData.getLastCounterHotWaterInKitchen())
                + (newData.getNewCounterColdWaterInKitchen() - lastData.getLastCounterColdWaterInKitchen()));

        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(SCALE, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceForWaterDrainage(LastData lastData, NewData newData)
    {
        double price = usedWaterCounter(lastData, newData) * TAX_FOR_WATER_DRAINAGE;

        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(SCALE, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double priceForEnergy(LastData lastData, NewData newData)
    {
        double price =  (newData.getNewEnergyCounter() - lastData.getLastEnergyCounter()) * TAX_FOR_ENERGY;

        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(SCALE, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

    public double totalPrice(LastData lastData , NewData newData)
    {
        double price = priceHotWaterInBathroom(lastData, newData) + priceColdWaterInBathroom(lastData, newData)
                + priceHotWaterInKitchen(lastData, newData) + priceColdWaterInKitchen(lastData, newData)
                + priceForEnergy(lastData, newData) + priceForWaterDrainage(lastData, newData);

        BigDecimal bigDecimal = new BigDecimal(price);
        bigDecimal = bigDecimal.setScale(SCALE, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }
}
