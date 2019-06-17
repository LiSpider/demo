package cn.itcast.day01.demo05;

/*
Lambda表达式必须有上下文推导
1.根据调用方法的参数推导得知Lambda对应接口
2.根据局部变量的赋值推导得知Lambda对应的接口

Lambda对应的接口当中必须有且仅有一个抽象方法
 */
public class Demo02Lambda {

    public static void main(String[] args) {
        Runnable task = () -> System.out.println("多线程任务执行");
        new Thread(task).start();

    }

}
