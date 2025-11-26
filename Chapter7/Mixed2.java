class A {
    int isar = 7;

    void m1() {
        System.out.print("A's m1, ");
    }

    void m2() {
        System.out.print("A's m2, ");
    }

    void m3() {
        System.out.print("A's m3, ");
    }
}

class B extends A {
    @SuppressWarnings("override")
    void m1() {
        System.out.print("B's m1, ");
    }
}

class C extends B {
    @SuppressWarnings("override")
    void m3() {
        System.out.print("C's m3, " + (isar + 6));
    }
}

public class Mixed2 {
    void main() {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        // Candidate code goes here
        // (three lines)
        b.m1();// b's m1
        c.m2();// A's M2
        a.m3();// a's m3
        System.out.println("");
        c.m1();// b's m1
        c.m2();// a's m2
        c.m3();// c's m3, 13
        System.out.println("");
        a.m1();
        b.m2();
        c.m3();
        System.out.println("");
        a2.m1();// B'm1 
        a2.m2();//a's m2
        a2.m3();// c's m3, 13
    }
}