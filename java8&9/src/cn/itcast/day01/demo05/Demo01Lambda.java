package cn.itcast.day01.demo05;

public class Demo01Lambda {
    public static void main(String[] args) {
        method(() -> System.out.println("吃饭啦！"));
    }

    public static void method(Cook cook) {
        cook.makeFood();
    }
}
