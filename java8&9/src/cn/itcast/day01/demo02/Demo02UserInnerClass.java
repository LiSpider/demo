package cn.itcast.day01.demo02;

public class Demo02UserInnerClass {

    public static void main(String[] args) {
        method(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦！匿名内部类方法");
            }
        });

    }

    public static void method(Cook cook) {
        cook.makeFood();
    }
}
