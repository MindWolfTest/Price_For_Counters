package com.example.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Data
{
    private int lastRow;
    private int newRow;

    private int year;
    private String month;

    private double lastCounterHotWaterInTheBathroom;
    private double newCounterHotWaterInBathroom;

    private double lastCounterColdWaterInTheBathroom;
    private double newCounterColdWaterInBathroom;

    private double lastCounterHotWaterInTheKitchen;
    private double newCounterHotWaterInKitchen;

    private double lastCounterColdWaterInTheKitchen;
    private double newCounterColdWaterInKitchen;

    private double lastEnergyCounter;
    private double newEnergyCounter;
}
