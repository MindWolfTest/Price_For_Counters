package com.example;

import java.time.LocalDateTime;
import java.util.HashMap;

import static com.example.constants.ConstMonth.*;

public class Date
{
    LocalDateTime date = LocalDateTime.now();

    public int getCurrentYear()
    {
        return date.getYear();
    }

    // Remove from exploitation
    /*public String getCurrentMonth()
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
    }*/

    public HashMap<String, String> createHashMap()
    {
        HashMap<String, String> dateMap = new HashMap<>();
        dateMap.put(JANUARY, RUS_JANUARY);
        dateMap.put(FEBRUARY, RUS_FEBRUARY);
        dateMap.put(MARCH, RUS_MARCH);
        dateMap.put(APRIL, RUS_APRIL);
        dateMap.put(MAY, RUS_MAY);
        dateMap.put(JUNE, RUS_JUNE);
        dateMap.put(JULY, RUS_JULY);
        dateMap.put(AUGUST, RUS_AUGUST);
        dateMap.put(SEPTEMBER, RUS_SEPTEMBER);
        dateMap.put(OCTOBER,RUS_OCTOBER);
        dateMap.put(NOVEMBER,RUS_NOVEMBER);
        dateMap.put(DECEMBER, RUS_DECEMBER);
        return dateMap;
    }

    public String getMonthNow()
    {
        String month = date.getMonth().name();
        return createHashMap().get(month);
    }
}
