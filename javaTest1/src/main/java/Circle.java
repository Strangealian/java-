package main.java;
public class Circle extends Shape{

    public Circle(double width) {
        super(width);
        if(width<0){
            this.width=0;
            System.out.println("input error");
        }
    }

    @Override
    public double area() {
        
        return this.width*this.width*Math.PI;
    }

    @Override
    public double perimeter() {
        return this.width*2*Math.PI;
    }
    
}