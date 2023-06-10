package com.gmy.a4.b24;

/**
 * @author gmy
 * @date 2023/6/10 15:16
 */
public class AnoClass {

    public void printTest(Test test) {
        test.print();
    }

    public static void main(String[] args) {
        AnoClass anoClass = new AnoClass();
        anoClass.printTest(new Test() {
            @Override
            public void print() {
                print2();
            }

            public void print2() {
                System.out.println("内部类实现了接口Test");
            }
        });
    }
}

interface Test {
    void print();
}
