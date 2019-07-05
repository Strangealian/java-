package main.java;
public class Rect extends Shape{

    public Rect(double width, double height) {
        super(width, height);
        if(this.width<0 || this.height<0){
            this.width=0;
            this.height=0;
            System.out.println("input error");
        }
    }

    @Override
    public double area() {
        return this.height*this.width;
    }

    @Override
    public double perimeter() {
        return 2*(this.height+this.width);
    }
    
}
//Test