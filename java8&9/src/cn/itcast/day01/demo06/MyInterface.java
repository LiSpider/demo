package cn.itcast.day01.demo06;


/*
函数式接口：接口当中有且仅有一个抽象方法
@FunctionalInterface注解：用来检测一个接口是不是函数式接口
编译的时候，写上这个注解：
1.如果是函数式接口，那么编译通过
2.如果不是函数式接口，那么编译失败

注意事项：
@FunctionalInterface注解是可选的，就算不用这个注解，
只要保证接口满足函数式接口的定义要求，也照样是函数式接口
 */
@FunctionalInterface
public interface MyInterface {

    void method();
}
