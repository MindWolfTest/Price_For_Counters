package com.example;

import com.example.model.Data;

import java.util.Scanner;

public class Scaner
{
    Scanner scanner = new Scanner(System.in);
    //Data data = new Data();

    public int enterYear()
    {
        System.out.print("Введи год:\t");
        //data.setYear(year);
        //System.out.println(data.getYear());
        return scanner.nextInt();
    }

    public String enterMonth()
    {
        System.out.print("\nВведи месяц:\t");
        //data.setMonth(month);
        //System.out.println(data.getMonth());
        return scanner.next();
    }

    public double enterNewDataCounterHotWaterInBathroom()
    {
        System.out.print("\nВведи показания счетчика за горячую воду в ванной:\t");
        //data.setNewCounterHotWaterInBathroom(newCounterHotWaterInBathroom);
        //System.out.println(data.getNewCounterHotWaterInBathroom());
        return scanner.nextDouble();
    }

    public double enterNewDataCounterColdWaterInBathroom()
    {
        System.out.print("\nВведи показания счетчика за холодную воду в ванной:\t");
        //data.setNewCounterColdWaterInBathroom(newCounterColdWaterInBathroom);
        return scanner.nextDouble();
    }

    public double enterNewDataCounterHotWaterInKitchen()
    {
        System.out.print("\nВведи показания счетчика за горячую воду на кухне:\t");
        //data.setNewCounterHotWaterInKitchen(newCounterHotWaterInKitchen);
        return scanner.nextDouble();
    }

    public double enterNewDataCounterColdWaterInKitchen()
    {
        System.out.print("\nВведи показания счетчика за холодную воду на кухне:\t");
        //data.setNewCounterColdWaterInKitchen(newCounterColdWaterInKitchen);
        return scanner.nextDouble();
    }

    public double enterNewDataEnergyCounter()
    {
        System.out.print("\nВведи показания счетчика за электричество:\t");
        //data.setNewEnergyCounter(newEnergyCounter);
        return scanner.nextDouble();
    }
}
