package main.java;

import java.util.Scanner;

public class LeapYearPlus{
    public static void main(String[] args){
        Year temp=new Year();
        Scanner in=new Scanner(System.in);
        System.out.println("please input year");
        temp.setYear(in.nextInt());
        System.out.println("please input month");
        temp.setMonth(in.nextInt());
        System.out.println("please input day");
        temp.setDay(in.nextInt());
        in.close();
    }
    
 static class Year{
    private int year;
    private  int month;
    private  int day;
	public int getYear() {
		return year;
    }
    public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
        if(LeapYear.isLeapYear(this.year)){
            if(isSmallMonth(this.month)){
                if(day>=1 && day<=30 && this.month!=2){
                    this.day=day;
                }
                else if(day>=1 && day<=28 && this.month==2){
                    this.day=day;
                }
                else{
                    this.day=1;
                    System.out.println("input day error");
                }
            }
            else{
                if(day>=1 && day<=31){
                    this.day=day;
                }
                else{
                    this.day=1;
                    System.out.println("input day error");
                }
            }
        }
        else{
            if(isSmallMonth(this.month)){
                if(day>=1 && day<=30 && this.month!=2){
                    this.day=day;
                }
                else if(day>=1 && day<=27 && this.month==2){
                    this.day=day;
                }
                else{
                    this.day=1;
                    System.out.println("input day error");
                }
            }
            else{
                if(day>=1 && day<=31){
                    this.day=day;
                }
                else{
                    this.day=1;
                    System.out.println("input day error");
                }
            }

        }
	}
	
	public void setMonth(int month) {
        if(month>=1 && month<12){
            this.month = month;
        }
        else if(month<1 || month>12){
            this.month=1;
            System.out.println("input month error");
        }   
	}
	public void setYear(int year) {
        if(year<0){
            this.year = 0;
            System.out.println("input year error");
        }
		else{
            this.year=year;
        }
    }
    //大小月份判断
    public boolean isSmallMonth(int month){
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            return false;
        }
        else {
            return true;
        }
    }
}
}