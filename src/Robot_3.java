/**
 * Created by fatel on 2016/4/23.
 * 键盘输入
 */
import java.lang.*;
import java.io.*;

public class Robot_3 {
    private String Robot_id;
    private String Robot_name;
    private double Robot_speed;
    private double Robot_temp;
    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);

    public Robot_3(){
        Robot_id = "R03";
        Robot_name = "自由高达";
        try {
            System.out.print("请输入当前速度：");
            Robot_speed = Double.parseDouble(br.readLine());
            System.out.print("请输入当前温度：");
            Robot_temp = Double.parseDouble(br.readLine());
        }
        catch (Exception var2) {}
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

    public void main_3(Robot_3 r3){
        r3.output();
        r3.judge();
    }
}
