package cn.itcast.day01.demo04;

/**
 * Lambda表达式的省略规则
 * 1.参数的类型可以省略。但是只能同时省略所有参数类型，或者干脆都不省略，不能只写个别参数类型
 * 2.如果参数有且仅有一个，那么小括号可以省略
 * 3.如果大括号之内的语句有且仅有一个，那么无论有没有返回值，return，大括号，分号都可以省略
 */
public class Demo02LambdaFormat {

    public static void main(String[] args) {
        method((a, b) -> a + b);
    }

    public static void method(Calculator calculator) {
        int result = calculator.sum(1234, 789);
        System.out.println(result);
    }
}
