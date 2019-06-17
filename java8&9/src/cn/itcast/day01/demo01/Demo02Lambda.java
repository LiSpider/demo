package cn.itcast.day01.demo01;

public class Demo02Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("线程任务执行啦！")).start();
    }
}
