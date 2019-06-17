package cn.itcast.day01.demo03;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01PersonSort {

    public static void main(String[] args) {
        Person[] array = {
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 16),
                new Person("马尔扎哈", 35),
        };
        //看看数组本来的样子
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        //看看数组排序之后的样子
        System.out.println(Arrays.toString(array));

    }
}
