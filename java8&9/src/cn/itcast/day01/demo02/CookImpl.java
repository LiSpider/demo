package cn.itcast.day01.demo02;

public class CookImpl implements Cook {

    @Override
    public void makeFood() {
        System.out.println("吃饭啦！实现类的方法执行了");
    }
}
