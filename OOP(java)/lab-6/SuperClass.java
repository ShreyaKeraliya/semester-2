public class SuperClass {
    public SuperClass() {
        System.out.println("SuperClass constructor called.");
    }
}

class SubClass extends SuperClass {
    public SubClass() {
        super(); 
        System.out.println("SubClass constructor called.");
    }

    public static void main(String[] args) {
        SubClass sub = new SubClass();
        
    }
}