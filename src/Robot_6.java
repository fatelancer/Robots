/**
 * Created by fatel on 2016/4/23.
 * 窗口界面输入
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Robot_6 extends JFrame {
    private String Robot_id;
    private String Robot_name;
    private double Robot_speed;
    private double Robot_temp;

    JPanel p1 = new JPanel();//区域模块
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();

    JLabel l1 = new JLabel("请输入当前速度");//文字标签
    JLabel l2 = new JLabel("请输入当前温度");
    JLabel l3 = new JLabel("输出信息");

    JTextField f1 = new JTextField();//文字输入框
    JTextField f2 = new JTextField();
    JTextArea a = new JTextArea(10,30);//文字输出去区
    JButton b = new JButton("确定");

    public Robot_6(){
        this.setLayout(new BorderLayout());
        p1.setLayout(new GridLayout(6, 3));//区域模块1的部件添加
        p1.add(l1);
        p1.add(f1);
        p1.add(l2);
        p1.add(f2);

        this.add(p1, BorderLayout.NORTH);//区域1在整个窗口中的位置布局
        p2.add(b, BorderLayout.CENTER);
        this.add(p2, BorderLayout.CENTER);
        p3.add(l3, BorderLayout.NORTH);
        p3.add(a, BorderLayout.CENTER);
        this.add(p3, BorderLayout.SOUTH);

        a.setLineWrap(true);

        this.setSize(400,400);//窗口大小
        this.setVisible(true);//窗口可显示

        Robot_id = "R06";
        Robot_name = "无限正义高达";

        b.addActionListener(//按钮动作侦测
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        try {
                            Robot_speed = Double.parseDouble(f1.getText());
                            Robot_temp = Double.parseDouble(f2.getText());
                            output();
                        }
                        catch (Exception var6) {}
                    }
                });

    }

    public String judgespeed() {
        if (Robot_speed > 10) {
            return "速度过快，建议减速";
        } else {
            return "速度适当，可继续前进";
        }
    }

    public String judgetemp(){
        if (Robot_temp > 90){
            return "温度过高，存在火山复苏嫌疑";
        }
        else{
            return "温度适当，可继续前进";
        }
    }

    public void output(){
        a.setText("机器人ID："+ Robot_id + "\n" + "机器人代号：" + Robot_name + "\n" +
                "当前速度：" + Robot_speed + "m/s\n" + "当前温度：" + Robot_temp + "℃"+ "\n" +
                judgespeed() + "\n"+judgetemp());
    }

    public void main_6(Robot_6 r6){
        //r6.output();
    }
}
