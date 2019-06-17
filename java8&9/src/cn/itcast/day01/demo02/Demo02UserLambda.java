package cn.itcast.day01.demo02;

//Lambda的标准格式：(参数类型 参数名称) -> {语句代码}
public class Demo02UserLambda {

    public static void main(String[] args) {
        method(() -> {System.out.println("吃饭啦！(Lambda表达式)");});
    }

    public static void method(Cook cook) {
        cook.makeFood();
    }
}
