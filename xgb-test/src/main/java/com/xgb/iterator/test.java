package com.xgb.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class test {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("张三",2));
        list.add(new Person("李四",5));
        list.add(new Person("王五",9));
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person next = iterator.next();
            next.setAge(6);
            System.out.println(next);
        }
//        while (iterator.hasNext()){
//            newTitle title = (newTitle) iterator.next();
//        }
//        Collections.fill(list,"东方不败");
        Iterator<Person> iterator1 = list.iterator();
        System.out.println("修改后");
        while (iterator1.hasNext()){
            Person next = iterator1.next();
            System.out.println(next);
        }
    }


    static class Person{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person() {
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
