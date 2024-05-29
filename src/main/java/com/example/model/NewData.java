package com.example.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class NewData
{
    private Integer year;
    private String month;
    private double newCounterHotWaterInBathroom;
    private double newCounterColdWaterInBathroom;
    private double newCounterHotWaterInKitchen;
    private double newCounterColdWaterInKitchen;
    private double newEnergyCounter;
}
