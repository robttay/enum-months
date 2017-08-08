package com.example.common;


import org.apache.commons.lang.StringUtils;

public enum Month {

    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private String englishName;

    public String getEnglishName() {
        return englishName;
    }


    Month() {
        this.englishName = this.toString().substring(0, 1).toUpperCase() + this.toString().toLowerCase().substring(1);


    }
}