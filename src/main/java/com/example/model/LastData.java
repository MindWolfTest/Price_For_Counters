package com.example.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class LastData
{
    private double lastCounterHotWaterInBathroom;

    private double lastCounterColdWaterInBathroom;

    private double lastCounterHotWaterInKitchen;

    private double lastCounterColdWaterInKitchen;

    private double lastEnergyCounter;
}
