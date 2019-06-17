package cn.itcast.day01.demo04;

public class Demo02CalculatorLambda {

    public static void main(String[] args) {
        method((int a, int b) -> {
            return a + b;
        });
    }

    public static void method(Calculator calculator) {
        int result = calculator.sum(1234, 789);
        System.out.println(result);
    }
}
