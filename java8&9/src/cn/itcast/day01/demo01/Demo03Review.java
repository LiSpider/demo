package cn.itcast.day01.demo01;

public class Demo03Review {

    public static void main(String[] args) {
        //1.使用实现类
        new Thread(new MyRunnableImpl()).start();

        //2.使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类的方法！");
            }
        }).start();

        //3.

    }
}
