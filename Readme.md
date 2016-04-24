# JAVA 课程小组作业

## 框架

- 该类为主类，主程序main中放置`while(true)`循环
    - 当输入为1-6时，对机器人1-6进行操作
    - 当输入为0，退出系统
    - 当输入为除以上之外的数，重新输入

 *注意：对于机器人6，在点击关闭窗口时，进程会卡住，因而在while循环外添加`System.exit(0);`*

## 实例方法操作

- 即建立相应类的实例，调用示例中的`input()`函数对实例的属性进行赋值；

本工程中建立的属性如下：
```JAVA
       public class Robot_1 {
           private String Robot_id;//机器人ID
           private String Robot_name;//机器人代号
           private double Robot_speed;//当前速度
           private double Robot_temp;//当前温度
       }
```
## 构造方法操作

- 与上一例类似，本例采用构造函数即`Robot_2(0,0)`进行赋值

## 键盘输入方法操作

- 本例使用键盘输入输出进行赋值即`InputStreamReader`和`BufferedReader`

*本例中注意键盘输入异常处理，推荐使用`try...catch`*

```JAVA
try {
// 输入执行代码
}
catch (Exception var) {
//输入处理代码
}
```
## 扫描器输入方法操作

- 本例中使用扫描器读取键盘输入即`Scanner`，同样有异常处理

## 对话框输入操作

- 本例中使用`JOptionPane.showInputDialog`对数据进行输入
- 使用`JOptionPane.showMessageDialog`对数据进行输出

关于以上函数中的四个参数：
```JAVA
public static void showMessageDialog(Component parentComponent,
        Object message, String title, int messageType);
```

## 窗口GUI输入操作

- 本例使用GUI窗口进行输入输出
- 调用了`JPanel`，`JLabel`，`JTextField`，`JTextAera`和`JButton`四个类，具体使用参见代码

