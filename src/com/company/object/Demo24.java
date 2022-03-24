package com.company.object;

public class Demo24 {
    public static <Person> void main(String[] args) {
        // 实例化类
        // 对象类型 对象名 = 对象值
        Demo24 demo24 = new Demo24();
        demo24.say();

        int a = 1;
        System.out.println(a);
        demo24.change(a);
        // 实参和形参开辟了不同的内存空间，操作其中一个不会影响另一个
        // 值传递，只是把值传递过去，在函数里修改变量的值不会影响到原变量，引用传递是把地址传递过去了，修改变量的值也会影响原变量的值
        System.out.println(a);
    }

    /*
    修饰符 返回值类型 方法名（...） {
        方法体
        return 返回值
    }
     */

    // 方法内的参数是形参，实际调用方法所添加进去的数值是实参
    public int max(int a, int b){
        return a > b ? a : b;
    }

    // 静态方法 static

    // 非静态方法

    public void say(){
        System.out.println("Saying!");
    }

    // 静态方法之间可以相互调用，非静态方法可以调用静态方法，静态方法也可以通过对象调用非静态方法
    // 非静态方法只有在类实例化后才存在，类本身是抽象的，它不存在实体，当创建实体时，也就是对象，那么独属于对象的非静态方法才会成立

public static class Demo25{
    public static void main(String[] args) {
        Person xuanhao = new Person();
        System.out.println(xuanhao.name);
        Demo25.change(xuanhao);
        System.out.println(xuanhao.name);
    }
    public static void change(Person a){
        a.name = "zxh";
    }
}


    public static void change(int a){
        a = 10;
    }
}


class Person{
    // 定义了一个person类，有一个属性：name
    // null
    String name = "Hello";
}
