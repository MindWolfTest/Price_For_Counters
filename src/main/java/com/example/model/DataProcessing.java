package com.example.model;

import static com.example.constants.ConstForTax.*;

public class DataProcessing
{
    public double priceHotWaterInBathroom(Data data)
    {
        return ((data.getNewCounterHotWaterInBathroom() - data.getLastCounterHotWaterInTheBathroom()) * TAX_FOR_HOT_WATER);
    }

    public double priceColdWaterInBathroom(Data data)
    {
        return ((data.getNewCounterColdWaterInBathroom() - data.getLastCounterColdWaterInTheBathroom()) * TAX_FOR_COLD_WATER);
    }

    public double priceHotWaterInKitchen(Data data)
    {
        return ((data.getNewCounterHotWaterInKitchen() - data.getLastCounterHotWaterInTheKitchen()) * TAX_FOR_HOT_WATER);
    }

    public double priceColdWaterInKitchen(Data data)
    {
        return ((data.getNewCounterColdWaterInKitchen() - data.getLastCounterColdWaterInTheKitchen()) * TAX_FOR_COLD_WATER);
    }

    public double usedWaterCounter(Data data)
    {
        return ((data.getNewCounterHotWaterInBathroom() - data.getLastCounterHotWaterInTheBathroom())
                + (data.getNewCounterColdWaterInBathroom() - data.getLastCounterColdWaterInTheBathroom())
                + (data.getNewCounterHotWaterInKitchen() - data.getLastCounterHotWaterInTheKitchen())
                + (data.getNewCounterColdWaterInKitchen() - data.getLastCounterColdWaterInTheKitchen()));
    }

    public double priceForEnergy(Data data)
    {
        return ((data.getNewEnergyCounter() - data.getLastEnergyCounter()) * TAX_FOR_ENERGY);
    }

    public double priceForWaterDrainage(Data data)
    {
        return (usedWaterCounter(data) * TAX_FOR_WATER_DRAINAGE);
    }

    public double totalPrice(Data data)
    {
        return priceHotWaterInBathroom(data) + priceColdWaterInBathroom(data) + priceHotWaterInKitchen(data)
                + priceColdWaterInKitchen(data) + priceForEnergy(data) + priceForWaterDrainage(data);
    }
}
