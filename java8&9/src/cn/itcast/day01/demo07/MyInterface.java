package cn.itcast.day01.demo07;

/*
接口的实现类当中必须对接口所有的抽象方法都要覆盖重写，除非实现类是一个抽象类
接口升级：本来是2个抽相方法，现在需要3个抽象方法。

设计模式当中的开闭原则：对拓展开放，对修改关闭。

从Java8开始，接口当中允许定义default默认方法
常量的修饰符：public static final（都可以省略）
抽象方法的修饰符：public abstract (都可以省略)
默认方法的修饰符：public default (public可以省略，default不能省略)

默认方法可以有方法体实现！
默认方法也可以进行覆盖重写：去掉default关键字，重新指定大括号方法体。
 */
public interface MyInterface {

    void method1();//本来已经存在的抽象方法

    void method2();//本来已经存在的抽象方法

    //现在需要新定义一个方法
//    public void methodNew();

    default void methodNew() {
        System.out.println("接口的默认方法执行！");
    }


}
