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
        }
        catch (IllegalArgumentException e) {
            System.out.println("Please enter a month listed.");
            System.exit(0);
        }
        ArrayList<Month> monthList = new ArrayList();

        switch (selectedMonth) {
            case JANUARY: monthList.add(JANUARY);
            case FEBRUARY: monthList.add(FEBRUARY);
            case MARCH: monthList.add(MARCH);
            case APRIL: monthList.add(APRIL);
            case MAY: monthList.add(MAY);
            case JUNE: monthList.add(JUNE);
            case JULY: monthList.add(JULY);
            case AUGUST: monthList.add(AUGUST);
            case SEPTEMBER: monthList.add(SEPTEMBER);
            case OCTOBER: monthList.add(OCTOBER);
            case NOVEMBER: monthList.add(NOVEMBER);
            case DECEMBER: monthList.add(DECEMBER);
            break;
        }

        System.out.println(monthList);

    }
}
