 interface A {
    public static final int A = 11;
    public void methodA();
}

 interface A1 extends A {
    public static final int A1 = 22;
    public void methodA1();
}

 interface A2 extends A {
    public static final int A2 = 33;
    public void methodA2();
}

 interface A12 extends A1, A2 {
    public static final int A12 = 44;
}

 class B implements A12 {
    public void methodA() {
        System.out.println("Constant A: " +A);
    }

    public void methodA1() {
        System.out.println("Constant A1: " +A1);
    }

    public void methodA2() {
        System.out.println("Constant A2: " +A2);
    }
    public void methodA12(){
        System.out.println("constant A12:"+A12);

    }
}

public class Constant {
    public static void main(String[] args) {
        B obj = new B();
        obj.methodA();
        obj.methodA1();
        obj.methodA2();
        obj.methodA12();
    }
}