/**
 * Created by fatel on 2016/4/23.
 * 实例方法
 */
import java.lang.*;
import java.io.*;

public class Robot_1 {
    private String Robot_id;
    private String Robot_name;
    private double Robot_speed;
    private double Robot_temp;
    public Robot_1(){
        Robot_id = "R01";
        Robot_name = "强袭高达";
    }

    public void input(){
        Robot_speed = 5;
        Robot_temp = 35.45;
    }

    public void judge(){
        if (Robot_speed > 10){
            System.out.println("速度过快，建议减速");
        }
        else{
            System.out.println("速度适当，可继续前进");
        }
        if (Robot_temp > 90){
            System.out.println("温度过高，存在火山复苏嫌疑");
        }
        else{
            System.out.println("温度适当，可继续前进");
        }
    }

    public void output(){
        System.out.println("机器人ID：" + Robot_id);
        System.out.println("机器人代号：" + Robot_name);
        System.out.println("当前速度：" + Robot_speed + "m/s");
        System.out.println("当前温度：" + Robot_temp + "℃");

    }

    public void main_1(){
        Robot_1 r1 = new Robot_1();
        r1.input();
        r1.output();
        r1.judge();
    }

}
