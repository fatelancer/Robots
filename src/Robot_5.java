/**
 * Created by fatel on 2016/4/23.
 * 对话框输入
 */
import javax.swing.*;
import java.lang.*;


public class Robot_5 {
    private String Robot_id;
    private String Robot_name;
    private double Robot_speed;
    private double Robot_temp;

    public Robot_5(){
        Robot_id = "R05";
        Robot_name = "强袭自由高达";
        try {
            Robot_speed = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "请输入当前速度",
                    "输入当前速度",
                    JOptionPane.INFORMATION_MESSAGE));
            Robot_temp = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "请输入当前温度",
                    "输入当前温度",
                    JOptionPane.INFORMATION_MESSAGE));
        }
        catch (Exception var5) {}

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
        JOptionPane.showMessageDialog(null,
                "机器人ID："+ Robot_id + "\n" + "机器人代号:" + Robot_name + "\n" +
                "当前速度：" + Robot_speed + "m/s\n" + "当前温度：" + Robot_temp + "℃"+ "\n" +
                judgespeed() + "\n"+judgetemp(),
                "输出机器人当前信息",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void main_5(Robot_5 r5){
        r5.output();
    }
}
