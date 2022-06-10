package vnu.test;

public class ClassB implements InterfaceI {
    public int numberB;

    {
        numberB  = 10;
    }

    public static int staticVariable;
    public static int staticVariable2;
    static {
        staticVariable = 20;
    }

    static {
        staticVariable2 = 30;
    }

    public ClassB() {}

    @Override
    public void doSomething() {
        System.out.println("Calling doSomething method of ClassB");
    }
}
