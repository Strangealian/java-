package main.java.gui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Cal {
    TextField text1 = new TextField(3);
    TextField text2 = new TextField(3);
    CheckboxGroup group = new CheckboxGroup();
    Checkbox c1 = new Checkbox("+", true, group);
    Checkbox c2 = new Checkbox("-", false, group);
    Checkbox c3 = new Checkbox("*", false, group);
    Checkbox c4 = new Checkbox("/", false, group);
    Button b1 = new Button("calculate");
    Button b2 = new Button("clear");
    Label result = new Label("result");
    Label result1 = new Label();
    Panel p5 = new Panel();

    public void frame() {
        // 框架属性
        Frame f1 = new Frame("计算器");

        f1.setSize(800, 500);
        f1.setLocation(400, 400);

        f1.setLayout(new GridLayout(6, 1, 0, 20));
        Font font = new Font("宋体", Font.BOLD, 25);
        f1.setFont(font);
        f1.setBackground(Color.lightGray);
        // 元素属性
        Label l1 = new Label("please input number 1");
        // l1.setSize(20, 20);
        Label l2 = new Label("please input number 2");
        // 事件绑定
        // text1.addMouseListener(new MyHandle());
        text1.addKeyListener(new MyHandle());
        //text1.setBounds(20, 20, 30, 20);
        // text2.addMouseListener(new MyHandle());
        text2.addKeyListener(new MyHandle());
        f1.addWindowListener(new MyHandle());
        b1.addMouseListener(new MyHandle());
        b2.addMouseListener(new MyHandle());
        // text1.setBackground(Color.RED);

        // Label plus=new Label("+");
        // Label minus=new Label("-");
        // Label mult=new Label("*");
        // Label de=new Label("/");

        f1.add(new Panel());
        // 第一行
        Panel p1 = new Panel();
        // p1.setBackground(Color.GRAY);
        // p1.setVisible(true);
        // p1.setSize(600, 300);;
        // GridBagConstraints bag=new GridBagConstraints(2,6, 0, 0, 0, 0, 0, 0, null, 0,
        // 0);
        p1.setLayout(new GridLayout(1, 2));
        p1.add(l1);
        p1.add(text1);
        f1.add(p1);
        // 第二行
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(1, 2));
        p2.add(l2);
        p2.add(text2);
        //p1.setBounds(40, 40, 20, 20);

        f1.add(p2);
        // 第三行
        Panel p3 = new Panel();
        p3.setLayout(new GridLayout(1, 4));
        p3.add(c1);
        p3.add(c2);
        p3.add(c3);
        p3.add(c4);
        f1.add(p3);
        // 第四行
        Panel p4 = new Panel();
        p4.setLayout(new GridLayout(1, 2));
        p4.add(b1);
        p4.add(b2);
        f1.add(p4);
        // 第五行

        p5.setLayout(new GridLayout(1, 2));
        p5.add(result);
        p5.add(result1);
        f1.add(p5);

        // 刚开始设置会不可见，unknow reason
        f1.setVisible(true);

    }

    // 计算
    public double calculateResult() {
        Double num1 = Double.parseDouble(text1.getText());
        Double num2 = Double.parseDouble(text2.getText());
        if (c1.getState()) {
            // System.out.println(num1);
            // System.out.println(num2);
            return num1 + num2;

        } else if (c2.getState()) {
            return num1 - num2;
        } else if (c3.getState()) {
            return num1 * num2;
        } else if (c4.getState()) {
            return num1 / num2;
        }
        return 0;
    }

    class MyHandle implements ActionListener, KeyListener, MouseListener, WindowListener{

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }
        //输入检查
        @Override
        public void keyReleased(KeyEvent e) {
            if(e.getSource()==text1 || e.getSource()==text2){
                if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
                    result1.setText("");
                }
                else if(e.getKeyChar()!=9 && e.getKeyChar()!=10){
                    result1.setText("input error");
                    if(e.getSource()==text1){
                        text1.setText("");
                    }
                    if(e.getSource()==text2){
                        text2.setText("");
                    }
                }
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == b1) {
                Double temp = calculateResult();
                result1.setText(temp.toString());
            }
            if (e.getSource() == b2) {
                text1.setText("");
                text2.setText("");
                result1.setText("");
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }
}