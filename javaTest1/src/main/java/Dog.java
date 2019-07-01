package main.java;
public class Dog extends Animal{
    public static void main(String[] args){
        Dog dog1=new Dog("Bob", 13);
        dog1.eat();
        dog1.sleep();
    }
    public Dog(String s, int id){
        super(s, id);
    }
}