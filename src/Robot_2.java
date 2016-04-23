/**
 * Created by fatel on 2016/4/23.
 * 构造方法
 */
public class Robot_2 {
    private String Robot_id;
    private String Robot_name;
    private double Robot_speed;
    private double Robot_temp;
    public Robot_2(double s, double t){
        Robot_id = "R02";
        Robot_name = "圣盾高达";
        Robot_speed = s;
        Robot_temp = t;
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
    public void main_2(){
        Robot_2 r2 = new Robot_2(5, 60.32);
        r2.output();
        r2.judge();
    }
}
