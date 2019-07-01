package main.java;

import java.util.Random;

public class Test{
    public static void main(String[] args){
        Random ra=new Random();
        double width=ra.nextDouble()*100;
        double height=ra.nextDouble()*10;
        double radius=ra.nextDouble()*100;
        System.out.println(height);
        Shape circle=new Circle(radius);
        System.out.println("Circle:");
        System.out.println(String.format("%.2f", circle.area()));
        System.out.println(circle.perimeter());
        Shape rect=new Rect(width, height);
        System.out.println("rectangle:");
        System.out.println(rect.area());
        System.out.println(rect.area());
        //Shape c1=new Shape(10);
        // Shape c2=new Circle(10);
        // System.out.println(c1.equals(c2));
        // System.out.println(c1==c2);

    }
}