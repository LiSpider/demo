package cn.itcast.day01.demo08;

/*
从Java8开始，接口当中允许定义静态方法
 */
public interface Animal {

    void eat();

    static Animal getAnimal() {
        return new Cat();
    }

}
