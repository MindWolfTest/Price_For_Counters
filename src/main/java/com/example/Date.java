package com.example;

import java.time.LocalDateTime;

import static com.example.constants.ConstMonth.*;

public class Date
{
    LocalDateTime date = LocalDateTime.now();

    public int getCurrentYear()
    {
        return date.getYear();
    }

    public String getCurrentMonth()
    {
        String month = String.valueOf(date.getMonth());
        switch (month)
        {
            case JANUARY:
                return RUS_JANUARY;

            case FEBRUARY:
                return RUS_FEBRUARY;

            case MARCH:
                return RUS_MARCH;

            case APRIL:
                return RUS_APRIL;

            case MAY:
                return RUS_MAY;

            case JUNE:
                return RUS_JUNE;

            case JULY:
                return RUS_JULY;

            case AUGUST:
                return RUS_AUGUST;

            case SEPTEMBER:
                return RUS_SEPTEMBER;

            case OCTOBER:
                return RUS_OCTOBER;

            case NOVEMBER:
                return RUS_NOVEMBER;

            case DECEMBER:
                return RUS_DECEMBER;

        }
        return month;
    }
}
