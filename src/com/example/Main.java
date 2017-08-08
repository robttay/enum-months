package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

import static com.example.common.Month.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("Please choose a month:\n"
                + JANUARY + "\t"
                + FEBRUARY + "\t"
                + MARCH + "\t"
                + APRIL + "\t"
                + MAY + "\t"
                + JUNE + "\t"
                + JULY + "\t"
                + AUGUST + "\t"
                + SEPTEMBER + "\t"
                + OCTOBER + "\t"
                + NOVEMBER + "\t"
                + DECEMBER + "\t");

        Scanner input = new Scanner(System.in);
        Month selectedMonth = null;
        try {
            selectedMonth = Month.valueOf(input.nextLine().toUpperCase());


        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a month listed.");
            System.exit(0);
        }
        ArrayList<String> monthList = new ArrayList();

        switch (selectedMonth) {
            case JANUARY:
                monthList.add(Month.JANUARY.getEnglishName());
            case FEBRUARY:
                monthList.add(Month.FEBRUARY.getEnglishName());
            case MARCH:
                monthList.add(Month.MARCH.getEnglishName());
            case APRIL:
                monthList.add(Month.APRIL.getEnglishName());
            case MAY:
                monthList.add(Month.MAY.getEnglishName());
            case JUNE:
                monthList.add(Month.JUNE.getEnglishName());
            case JULY:
                monthList.add(Month.JULY.getEnglishName());
            case AUGUST:
                monthList.add(Month.AUGUST.getEnglishName());
            case SEPTEMBER:
                monthList.add(Month.SEPTEMBER.getEnglishName());
            case OCTOBER:
                monthList.add(Month.OCTOBER.getEnglishName());
            case NOVEMBER:
                monthList.add(Month.NOVEMBER.getEnglishName());
            case DECEMBER:
                monthList.add(Month.DECEMBER.getEnglishName());
                break;
        }

        System.out.println(monthList);

    }
}
