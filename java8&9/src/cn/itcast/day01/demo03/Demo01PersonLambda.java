package cn.itcast.day01.demo03;

import java.util.Arrays;

public class Demo01PersonLambda {

    public static void main(String[] args) {
        Person[] array = {
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 16),
                new Person("马尔扎哈", 35),
        };
        //看看数组本来的样子
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, (Person p1, Person p2) -> {
            return p1.getAge() - p2.getAge();
        });
        //看看数组排序之后的样子
        System.out.println(Arrays.toString(array));

    }
}
