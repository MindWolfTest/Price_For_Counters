package com.example.model;

import lombok.*;

import static com.example.constants.ConstForTax.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder

public class DataProcessing
{
    private double price;



    public static DataProcessing priceHotWaterInBathroom(Data data)
    {
        return new DataProcessing((data.getNewCounterHotWaterInBathroom() -
                data.getLastCounterHotWaterInTheBathroom())*TAX_FOR_HOT_WATER);
    }

    public static DataProcessing priceColdWaterInBathroom(Data data)
    {
        return new DataProcessing((data.getNewCounterColdWaterInBathroom()-
                data.getLastCounterColdWaterInTheBathroom())*TAX_FOR_COLD_WATER);
    }

    public static DataProcessing priceHotWaterInKitchen(Data data)
    {
        return new DataProcessing((data.getNewCounterHotWaterInKitchen() -
                data.getLastCounterHotWaterInTheKitchen()*TAX_FOR_HOT_WATER));
    }

    public static DataProcessing priceColdWaterInKitchen(Data data)
    {
        return new DataProcessing((data.getNewCounterColdWaterInKitchen() -
                data.getLastCounterColdWaterInTheKitchen())*TAX_FOR_COLD_WATER);
    }

    public static DataProcessing usedWaterCounter(Data data)
    {
        return new DataProcessing((data.getNewCounterHotWaterInBathroom() - data.getLastCounterHotWaterInTheBathroom()) +
                (data.getNewCounterColdWaterInBathroom() - data.getLastCounterColdWaterInTheBathroom()) +
                (data.getNewCounterHotWaterInKitchen() - data.getLastCounterHotWaterInTheKitchen()) +
                (data.getNewCounterColdWaterInKitchen() - data.getLastCounterColdWaterInTheKitchen()));
    }

    public static DataProcessing priceForEnergy(Data data)
    {
        return new DataProcessing((data.getNewEnergyCounter() -
                data.getLastEnergyCounter())*TAX_FOR_ENERGY);
    }

    public static DataProcessing priceForWaterDrainage(Data data)
    {
        return new DataProcessing(data.getUsedWater()*TAX_FOR_WATER_DRAINAGE);
    }
}
