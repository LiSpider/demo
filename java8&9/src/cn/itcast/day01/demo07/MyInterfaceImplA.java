package cn.itcast.day01.demo07;

public class MyInterfaceImplA implements MyInterface {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void methodNew() {
        System.out.println("实现类A当中覆盖重写了接口的默认方法！");
    }
}
