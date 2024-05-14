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

    private double lastCounterHotWaterInBathroom;
    private double newCounterHotWaterInBathroom;

    private double lastCounterColdWaterInBathroom;
    private double newCounterColdWaterInBathroom;

    private double lastCounterHotWaterInKitchen;
    private double newCounterHotWaterInKitchen;

    private double lastCounterColdWaterInKitchen;
    private double newCounterColdWaterInKitchen;

    private double lastEnergyCounter;
    private double newEnergyCounter;
}
