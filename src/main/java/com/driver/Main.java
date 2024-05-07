package com.driver;

class A {
    String meth() {
        return "Invoking method from class A";
    }

}
class B extends A{
    @Override
    String meth(){
        return "Invoking method from class A";
    }

}

public class Main {

    public static void main(String[] args) {
        B objb = new B();
        System.out.println(objB.meth());
    }
     System.out.println(objB.meth());


    }
}