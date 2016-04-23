/**
 * Created by fatel on 2016/4/23.
 * 扫描器输入
 */
import java.lang.*;
import java.util.*;

public class Robot_4 {
    private String Robot_id;
    private String Robot_name;
    private double Robot_speed;
    private double Robot_temp;
    private Scanner sc = new Scanner(System.in);

    public Robot_4(){
        Robot_id = "R04";
        Robot_name = "正义高达";
        try {
            System.out.print("请输入当前速度：");
            Robot_speed = sc.nextDouble();
            System.out.print("请输入当前温度：");
            Robot_temp = sc.nextDouble();
        }
        catch (Exception var3) {}
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

    public void main_4(Robot_4 r4){
        r4.output();
        r4.judge();
    }
}
