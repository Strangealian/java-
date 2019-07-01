package main.java.gui;
import java.awt.*;
public class Cal{
    public static void main(String[] args){
        //框架属性
        Frame f1=new Frame("计算器");
        f1.pack();
        
        f1.setSize(800,500);
        f1.setLocation(400,400);
       
        f1.setLayout(new GridLayout(6,1,0,20));
        Font font = new Font("Verdana", Font.BOLD, 25);
        f1.setFont(font);
        f1.setBackground(Color.lightGray);
        //元素属性
        Label l1=new Label("please input number 1");
        //l1.setSize(20, 20);
        Label l2=new Label("please input number 2");
        TextField text1=new TextField(3);
        TextField text2=new TextField(3);
        CheckboxGroup group=new CheckboxGroup();
        Checkbox c1=new Checkbox("+",true,group);
        Checkbox c2=new Checkbox("-",false,group);
        Checkbox c3=new Checkbox("*",false,group);
        Checkbox c4=new Checkbox("/",false,group);
        // Label plus=new Label("+");
        // Label minus=new Label("-");
        // Label mult=new Label("*");
        // Label de=new Label("/");
        Button b1=new Button("calculate");
        Button b2=new Button("clear");
        Label result=new Label("result");

        f1.add(new Panel());
        //第一行
        Panel p1=new Panel();
        p1.setVisible(true);
        //p1.setSize(600, 300);;
        //GridBagConstraints bag=new GridBagConstraints(2,6, 0, 0, 0, 0, 0, 0, null, 0, 0);
        p1.setLayout(new GridLayout(1,2));
        p1.add(l1);
        p1.add(text1);
        f1.add(p1);
        //第二行
        Panel p2=new Panel();
        p2.setLayout(new GridLayout(1,2));
        p2.add(l2);
        p2.add(text2);
        
        f1.add(p2);
        //第三行
        Panel p3=new Panel();
        p3.setLayout(new GridLayout(1,4));
        p3.add(c1);
        p3.add(c2);
        p3.add(c3);
        p3.add(c4);
        f1.add(p3);
        //第四行
        Panel p4=new Panel();
        p4.setLayout(new GridLayout(1,2));
        p4.add(b1);
        p4.add(b2);
        f1.add(p4);
        //第五行
        Panel p5=new Panel();
        p5.setLayout(new GridLayout(1,2));
        p5.add(result);
        f1.add(p5);
        //刚开始设置会不可见，unknow reason
        f1.setVisible(true);
        
        

    }
}