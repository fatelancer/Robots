/**
 * Created by fatel on 2016/4/23.
 * the main class to manage 6 robots, each robot has its own class to do specific operation
 * when these robots reach a settled speed or temperature, they will signal an alarm;
 */
import java.lang.*;
import java.io.*;

public class RobotManage {
    private String Robot_id;
    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);
    private static int Robot_flag;

    public RobotManage() {
        try {
            System.out.print("请输入要操作的机器人编号（1-6，0为退出系统）：");
            Robot_id = br.readLine();
        }
        catch (Exception var1) {}//输入输出异常处理
    }

    public void judge(){
        switch (Robot_id){
            case "0":
                Robot_flag = 0;
                break;
            case "1":
                Robot_1 r1 = new Robot_1();
                r1.main_1();
                Robot_flag = 1;
                break;
            case "2":
                Robot_2 r2 = new Robot_2(0,0);
                r2.main_2();
                Robot_flag = 1;
                break;
            case "3":
                Robot_3 r3 = new Robot_3();
                r3.main_3(r3);
                Robot_flag = 1;
                break;
            case "4":
                Robot_4 r4 = new Robot_4();
                r4.main_4(r4);
                Robot_flag = 1;
                break;
            case "5":
                Robot_5 r5 = new Robot_5();
                r5.main_5(r5);
                Robot_flag = 1;
                break;
            case "6":
                Robot_6 r6 = new Robot_6();
                r6.main_6(r6);
                Robot_flag = 1;
                break;
            default:
                Robot_flag = 2;
                break;
        }
    }

    public static void main(String [] args){
        while (true){
            RobotManage rm = new RobotManage();
            rm.judge();
            if (Robot_flag == 2) {
                System.out.println("输入错误请重新输入");
            }
            if (Robot_flag == 0){
                System.out.println("退出系统");
                break;
            }
        }
        System.exit(0);

    }
}
