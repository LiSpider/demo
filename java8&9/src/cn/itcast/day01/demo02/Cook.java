package cn.itcast.day01.demo02;

/**
 * 使用Lambda表达式的必要前提
 * 1.必须有一个接口
 * 2.接口中必须保证有且仅有一个抽象方法
 */
public interface Cook {
    //唯一方法
    void makeFood();
}
