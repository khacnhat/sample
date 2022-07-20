package vnu.test;

public class ClassD {
    public void methodG() {
        ClassC classC = new ClassC();
        classC.methodE();
        System.out.println("Changed");
    }

    public void methodH() {
        System.out.println("Added");
    }
}
