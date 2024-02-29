 class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
    public void printName(){
        System.out.println("name :"+name);
    }
    public void printAge(){
        System.out.println("age :"+age);
    }
    public void printPhoneNumber(){
        System.out.println("phone number :"+phoneNumber);
    }
    public void printAddress(){
        System.out.println("address :"+address);
    }


}

 class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public void printSalary() {
        super.printSalary();
        System.out.println("Specialization: " + specialization);
    }
}

 class Manager extends Member {
    private String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public void printSalary() {
        super.printSalary();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("person1", 20, "1234567890", "123 Main road", 50000, "Software Engineer");
        Manager manager = new Manager("person2", 22, "0987654321", "456 ring road", 70000, "Marketing");
     
        employee.printName();
        employee.printAge();
        employee.printPhoneNumber();
        employee.printAddress();
        employee.printSalary();

        System.out.println();

        manager.printName();
        manager.printAge();
        manager.printPhoneNumber();
        manager.printAddress();
        manager.printSalary();
    }
}
