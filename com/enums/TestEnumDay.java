package com.enums;

public class TestEnumDay {

    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.THURSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);

        System.out.println();

        for (Day val : Day.values()) {
            System.out.println(val);
        }
    }

}
