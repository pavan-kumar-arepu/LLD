package Inheritance;

public class C extends B {

    C() {
        System.out.println("Constructor of C");
    }

    C (String name) {
        System.out.println("Constructor of C " + name);
    }

    C (String name, String sex) {
        System.out.println("Constructor of C:\nName " + name + "Sex: " + sex);
    }
}
