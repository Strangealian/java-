package main.java;

import main.java.LeapYearPlus.Year;

public class LeapYear {

    public static void main(String[] args){
        Year temp=new Year();
        temp.setYear(2008);
        temp.setMonth(3);
        temp.setDay(20);
        boolean result=LeapYear.isLeapYear(temp.getYear());
        System.out.println(result);

    }
    //能被4整除和不能被100整除的年份，能被400和100整除的年份为闰年
    public static boolean isLeapYear(int year){
        if(((year%400==0)&&(year%100)==0) ||(year%100!=0)&&(year%4==0)){
            return true;
        }
        else {
            return false;
        }

    }
}
// class Year{
//     int year;
//     int month;
//     int day;
//     public Year(){
//         this.year=0;
//         this.month=0;
//         this.day=0;
//     }
//     public Year(int year, int month,int day){
//         this.year=year;
//         this.month=month;
//         this.day=day;
//     }
// }