package vnu.test;

public class ClassA {

    enum INTERNAL_ENUMERATION {
        ONE, TWO, THREE
    }

    @MyAnnotation(value = 1, name = "Hello")
    public void methodA() {
        ClassB b = new ClassB();
        System.out.println(b.numberB);
    }

    public void methodB() {
        ClassB b = new ClassB();
        System.out.println(b.numberB);
        b.doSomething();
        System.out.println("Modifiled methodB");
    }

    public void methodC() {
        class InnerClass {
            InnerClass() {
            }
        }

        ClassB b = new ClassB();
        b.doSomething();

        Object obj = new InterfaceI() {
            @Override
            public void doSomething() {
                System.out.println("Do things anonymously!");
            }
        };
    }
}
