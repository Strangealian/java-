package main.java;

import java.util.Scanner;

public class LeapYearAndException {
    public static void main(String[] args) {
        Year temp = new Year();
        Scanner in = new Scanner(System.in);
        System.out.println("please input year");
        
        while (temp.yearTag) {
            try {
                temp.setYear(in.nextInt());
            } catch (MyException e1) {
                e1.printStackTrace();
                System.out.println(e1.getMessage());
            }

        }
        while (temp.monthTag) {
            System.out.println("please input month");
            try {
                temp.setMonth(in.nextInt());
            } catch (MyException e) {
                e.printStackTrace();
            }

        }
        while (temp.dayTag) {
            System.out.println("please input day");
            try {
                temp.setDay(in.nextInt());
            } catch (MyException e) {
                e.printStackTrace();
            }

        }

        in.close();
    }

    public boolean YearTag;

}

class Year {
    boolean yearTag=true;
    boolean monthTag=true;
    boolean dayTag=true;
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws MyException {
        // if(LeapYear.isLeapYear(this.year)){
        // if(isSmallMonth(this.month)){
        // if(day>=1 && day<=30 && this.month!=2){
        // this.day=day;
        // }
        // else if(day>=1 && day<=28 && this.month==2){
        // this.day=day;
        // }
        // else{
        // this.day=1;
        // System.out.println("input day error");
        // }
        // }
        // else{
        // if(day>=1 && day<=31){
        // this.day=day;
        // }
        // else{
        // this.day=1;
        // System.out.println("input day error");
        // }
        // }
        // }
        // else{
        // if(isSmallMonth(this.month)){
        // if(day>=1 && day<=30 && this.month!=2){
        // this.day=day;
        // }
        // else if(day>=1 && day<=27 && this.month==2){
        // this.day=day;
        // }
        // else{
        // this.day=1;
        // System.out.println("input day error");
        // }
        // }
        // else{
        // if(day>=1 && day<=31){
        // this.day=day;
        // }
        // else{
        // this.day=1;
        // System.out.println("input day error");
        // }
        // }

        // }
        if (LeapYear.isLeapYear(this.year)) {
            if (isSmallMonth(this.month)) {
                if (day >= 1 && day <= 30 && this.month != 2) {
                    this.day = day;
                    dayTag=false;
                } else if (day >= 1 && day <= 28 && this.month == 2) {
                    this.day = day;
                    dayTag=false;
                } else {
                    throw new MyException("day input error");
                }
            } else {
                if (day >= 1 && day <= 31) {
                    this.day = day;
                    dayTag=false;
                } else {
                    throw new MyException("day input error");
                }
            }
        } else {
            if (isSmallMonth(this.month)) {
                if (day >= 1 && day <= 30 && this.month != 2) {
                    this.day = day;
                    dayTag=false;
                } else if (day >= 1 && day <= 27 && this.month == 2) {
                    this.day = day;
                    dayTag=false;
                } else {
                    throw new MyException("day input error");
                }
            } else {
                if (day >= 1 && day <= 31) {
                    this.day = day;
                    dayTag=false;
                } else {
                    throw new MyException("day input error");
                }
            }

        }
    }

    public void setMonth(int month) throws MyException {
        // if(month>=1 && month<12){
        // this.month = month;
        // }
        // else if(month<1 || month>12){
        // this.month=1;
        // System.out.println("input month error");
        // }
        if (month >= 1 && month < 12) {
            this.month = month;
            monthTag=false;
        } else {
            throw new MyException("month input error");
        }
    }

    public void setYear(int year) throws MyException {
        // if(year<0){
        // this.year = 0;
        // System.out.println("input year error");
        // }
        // else{
        // this.year=year;
        // }
        if (year > 0 && year <= 3000) {
            this.year = year;
            yearTag=false;
        } else {
            throw new MyException("year input error");
        }
    }

    // 大小月份判断
    public boolean isSmallMonth(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return false;
        } else {
            return true;
        }
    }
}

class MyException extends Exception {
    private static final long serialVersionUID = 1L;

    public MyException() {

    }

    public MyException(String s) {
        super(s);
    }
}