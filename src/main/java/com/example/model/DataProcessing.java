package com.example.model;

public class DataProcessing
{
    public double price(double lastDataCounter, double newDataCounter, double tax)
    {
        return (newDataCounter-lastDataCounter)*tax;
    }

    public double fullPriceForAllCounters(double priceForHotWaterInBathroom, double priceForColdWaterInBathroom,
                                          double priceForHotWaterInKitchen, double priceForColdWaterInKitchen,
                                          double priceForWaterDrainAge, double priceForEnergy)
    {
        return priceForHotWaterInBathroom + priceForColdWaterInBathroom
                + priceForHotWaterInKitchen + priceForColdWaterInKitchen + priceForWaterDrainAge + priceForEnergy;
    }

    public double usedWater(double lastDataCounter, double newDataCounter)
    {
        return newDataCounter - lastDataCounter;
    }

    public double usedWaterDrainage(double usedHotWaterInBathroom, double usedColdWaterInBathroom,
                                    double usedHotWaterInKitchen, double usedColdWaterInKitchen)
    {
        return usedHotWaterInBathroom + usedColdWaterInBathroom + usedHotWaterInKitchen + usedColdWaterInKitchen;
    }

    public double priceForWaterDrainage(double usedHotWaterInBathroom, double usedColdWaterInBathroom,
                                        double usedHotWaterInKitchen, double usedColdWaterInKitchen, double tax)
    {
        return (usedHotWaterInBathroom + usedColdWaterInBathroom + usedHotWaterInKitchen + usedColdWaterInKitchen) * tax;
    }
}
