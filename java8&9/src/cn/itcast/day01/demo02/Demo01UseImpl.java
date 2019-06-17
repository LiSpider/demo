package cn.itcast.day01.demo02;

public class Demo01UseImpl {
    public static void main(String[] args) {
        method(new CookImpl());
    }

    public static void method(Cook cook) {
        cook.makeFood();
    }
}
