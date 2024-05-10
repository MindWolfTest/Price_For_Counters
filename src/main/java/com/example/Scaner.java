package com.example;

import com.example.model.Data;

import java.util.Scanner;

public class Scaner
{
    Scanner scanner = new Scanner(System.in);
    Data data = new Data();

    public Scaner enterYear()
    {
        System.out.print("Введи год:\t");
        int year = scanner.nextInt();
        data.setYear(year);
        //System.out.println(data.getYear());
        return this;
    }

    public Scaner enterMonth()
    {
        System.out.print("\nВведи месяц:\t");
        String month = scanner.next();
        data.setMonth(month);
        //System.out.println(data.getMonth());
        return this;
    }

    public Scaner enterNewDataCounterHotWaterInBathroom()
    {
        System.out.print("\nВведи показания счетчика за горячую воду в ванной:\t");
        double newCounterHotWaterInBathroom = scanner.nextDouble();
        data.setNewCounterHotWaterInBathroom(newCounterHotWaterInBathroom);
        //System.out.println(data.getNewCounterHotWaterInBathroom());
        return this;
    }

    public Scaner enterNewDataCounterColdWaterInBathroom()
    {
        System.out.print("\nВведи показания счетчика за холодную воду в ванной:\t");
        double newCounterColdWaterInBathroom = scanner.nextDouble();
        data.setNewCounterColdWaterInBathroom(newCounterColdWaterInBathroom);
        return this;
    }

    public Scaner enterNewDataCounterHotWaterInKitchen()
    {
        System.out.print("\nВведи показания счетчика за горячую воду на кухне:\t");
        double newCounterHotWaterInKitchen = scanner.nextDouble();
        data.setNewCounterHotWaterInKitchen(newCounterHotWaterInKitchen);
        return this;
    }

    public Scaner enterNewDataCounterColdWaterInKitchen()
    {
        System.out.print("\nВведи показания счетчика за холодную воду на кухне:\t");
        double newCounterColdWaterInKitchen = scanner.nextDouble();
        data.setNewCounterColdWaterInKitchen(newCounterColdWaterInKitchen);
        return this;
    }

    public Scaner enterNewDataEnergyCounter()
    {
        System.out.print("\nВведи показания счетчика за электричество:\t");
        double newEnergyCounter = scanner.nextDouble();
        data.setNewEnergyCounter(newEnergyCounter);
        return this;
    }
}
