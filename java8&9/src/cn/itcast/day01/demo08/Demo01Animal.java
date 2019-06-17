package cn.itcast.day01.demo08;

/*
左边是接口类型，说明我并不关心到底是猫还是狗，只要是动物就行。
 */
public class Demo01Animal {
    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.eat();
        Animal animal = Animal.getAnimal();
        animal.eat();
    }
}
