package main.java.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JCalculator {
    JTextField text1 = new JTextField(3);
    JTextField text2 = new JTextField(3);
    ButtonGroup group = new ButtonGroup();
    JRadioButton c1 = new JRadioButton("+", true);
    JRadioButton c2 = new JRadioButton("-", false);
    JRadioButton c3 = new JRadioButton("*", false);
    JRadioButton c4 = new JRadioButton("/", false);
    JButton b1 = new JButton("calculate");
    JButton b2 = new JButton("clear");
    JLabel result = new JLabel("result");
    JLabel result1 = new JLabel();
    JPanel p5 = new JPanel();

    public void frame() {
        // 框架属性
        JFrame f1 = new JFrame("计算器");
        
        // 元素属性
        JLabel l1 = new JLabel("please input number 1");
        // l1.setSize(20, 20);
        JLabel l2 = new JLabel("please input number 2");
        // 事件绑定
        // text1.addMouseListener(new MyHandle());
        text1.addKeyListener(new MyHandle());
        // text1.setBounds(20, 20, 30, 20);
        // text2.addMouseListener(new MyHandle());
        text2.addKeyListener(new MyHandle());
        f1.addWindowListener(new MyHandle());
        b1.addMouseListener(new MyHandle());
        b2.addMouseListener(new MyHandle());
        

        f1.add(new JPanel());
        // 第一行
        JPanel p1 = new JPanel();
        p1.setBorder(BorderFactory.createEmptyBorder(0,30,0,30));
        p1.setLayout(new GridLayout(1,2));
        p1.add(l1);
        p1.add(text1);
        f1.add(p1);
        // 第二行
        JPanel p2 = new JPanel();
        p2.setBorder(BorderFactory.createEmptyBorder(0,30,0,30));
        p2.setLayout(new GridLayout(1,2));
        p2.add(l2);
        p2.add(text2);
        // p1.setBounds(40, 40, 20, 20);

        f1.add(p2);
        // 第三行
        JPanel p3 = new JPanel();
        p3.setBorder(BorderFactory.createEmptyBorder(0,30,0,30));
        group.add(c1);
        group.add(c2);
        group.add(c3);
        group.add(c4);

        p3.setLayout(new GridLayout(1,4));
        p3.add(c1);
        p3.add(c2);
        p3.add(c3);
        p3.add(c4);
        f1.add(p3);
        // 第四行
        JPanel p4 = new JPanel();
        p4.setBorder(BorderFactory.createEmptyBorder(0,30,0,30));
        p4.setLayout(new GridLayout(1,2));
        p4.add(b1);
        p4.add(b2);
        f1.add(p4);
        // 第五行
        p5.setBorder(BorderFactory.createEmptyBorder(0,30,0,30));
        p5.setLayout(new GridLayout(1,2));
        p5.add(result);
        p5.add(result1);
        f1.add(p5);

        // 刚开始设置会不可见，unknow reason
        f1.setSize(800, 500);
        f1.setLocation(400, 400);
        f1.setLayout(new GridLayout(6, 1, 0, 20));
        //f1.setBounds(20,20,20,20);
        Font font = new Font("宋体", Font.LAYOUT_LEFT_TO_RIGHT, 18);
        f1.setFont(font);
        f1.setBackground(Color.lightGray);
        f1.setVisible(true);

    }

    // 计算
    public double calculateResult() {
        Double num1 = Double.parseDouble(text1.getText());
        Double num2 = Double.parseDouble(text2.getText());
        System.out.println(group.getElements());
        if (c1.isSelected()) {
            // System.out.println(num1);
            // System.out.println(num2);
            return num1 + num2;

        } else if (c2.isSelected()) {
            return num1 - num2;
        } else if (c3.isSelected()) {
            return num1 * num2;
        } else if (c4.isSelected()) {
            return num1 / num2;
        }
        return 0;
    }

    class MyHandle implements KeyListener, MouseListener, WindowListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        // 输入检查
        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getSource() == text1 || e.getSource() == text2) {
                if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                    result1.setText("");
                } else if (e.getKeyChar() != 9 && e.getKeyChar() != 10) {
                    result1.setText("input error");
                    JOptionPane.showMessageDialog(c1, "Input error", "warning", 0);
                    if (e.getSource() == text1) {
                        text1.setText("");
                    }
                    if (e.getSource() == text2) {
                        text2.setText("");
                    }
                }
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == b1) {
                if(Double.parseDouble(text2.getText())==0 && c4.isSelected()){
                    JOptionPane.showMessageDialog(c1, "被除数不能为零", "warning", 0);
                }
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
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {

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

    }
}