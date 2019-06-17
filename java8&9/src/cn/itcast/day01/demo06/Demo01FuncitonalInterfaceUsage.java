package cn.itcast.day01.demo06;

public class Demo01FuncitonalInterfaceUsage {
    public static void main(String[] args) {
        MyInterface lambda = () -> System.out.println("Lambda表达式！");
        lambda.method();
    }
}
