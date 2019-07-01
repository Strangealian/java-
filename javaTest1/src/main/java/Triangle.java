package main.java;
public class Triangle extends Shape{

    public Triangle(double width, double height, double temp) {
        super(width, height,temp);
        if(width+height<=temp || width+temp<=height || height+temp<=width){
            this.height=this.width=this.temp=0;
            System.out.println("input error");
        }
    }

    @Override
    public double area() {
        return this.height*this.width/2;
    }

    @Override
    public double perimeter() {
        return this.height+this.width+this.temp;
    }
    
}