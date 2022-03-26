package com.company.object.innerclass;

public class Outer {
    private int id = 6521884;
    public void out(){
        System.out.println("This is the method of the outer class");
    }
    class Inner{
        public  void in(){
            System.out.println("This is the method of the inner class");
        }
        // 获得外部类的私有属性
        public void getID(){
            System.out.println(id);
        }
    }

    public void method(){
        class Localinner{
            public void localIn(){

            }
        }
    }
}

// 一个java类中可以有多个class类，但是只能有一个public class

class A{
    public void run(){
        System.out.println("This method is running.");
    }

}
