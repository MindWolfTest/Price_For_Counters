package com.example;

import java.util.Scanner;

public class Scaner
{
    static Scanner scanner = new Scanner(System.in);

    public int enterYear()
    {
        System.out.print("Введи год:\t");
        return scanner.nextInt();
    }

    public String enterMonth()
    {
        System.out.print("\nВведи месяц:\t");
        return scanner.next();
    }

    public double enterNewDataCounterHotWaterInBathroom()
    {
        System.out.print("\nВведи показания счетчика за горячую воду в ванной:\t");
        return scanner.nextDouble();
    }

    public double enterNewDataCounterColdWaterInBathroom()
    {
        System.out.print("\nВведи показания счетчика за холодную воду в ванной:\t");
        return scanner.nextDouble();
    }

    public double enterNewDataCounterHotWaterInKitchen()
    {
        System.out.print("\nВведи показания счетчика за горячую воду на кухне:\t");
        return scanner.nextDouble();
    }

    public double enterNewDataCounterColdWaterInKitchen()
    {
        System.out.print("\nВведи показания счетчика за холодную воду на кухне:\t");
        return scanner.nextDouble();
    }

    public double enterNewDataEnergyCounter()
    {
        System.out.print("\nВведи показания счетчика за электричество:\t");
        return scanner.nextDouble();
    }
}
