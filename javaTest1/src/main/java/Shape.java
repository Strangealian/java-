package main.java;
public abstract class Shape{
    double width;
    double height;
    double temp;
    //this is for circle, width equals to radius
    public Shape(double width){
        this.width=width;
    }
    //this is for ractangle
    public Shape(double width, double height){
        this.width=width;
        this.height=height;
    }
    //this is for triangle
    public Shape(double height, double width, double temp){
        this.height=height;
        this.width=width;
        this.temp=temp;
    }
    public abstract double area();
    public abstract double perimeter();
}