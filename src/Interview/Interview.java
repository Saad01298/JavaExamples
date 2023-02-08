package Interview;

class Employee {
    public void method () {
        System.out.println("Employee");
    }
    public static void method1 () {
        System.out.println("Employee 1");
    }
}

class A extends Employee {
    public void method (int a) {
        System.out.println(a);
    } // Overloading

    public static void method1() {
        System.out.println("Class A"); // hide
    }
}

class B extends Employee {
    public void method () {
        System.out.println("Class B"); // Over Ride
    }
}

public class Interview {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.method(); // Employee

        Employee.method1(); // Employee1
        A.method1(); // Class A

        A a = new A();
        a.method(); // Employee
        a.method(6); // 6

        B b1 = new B();
        Employee employee = new B();

        System.out.println("\nChecking --");
        b1.method(); // Class B
        employee.method(); //Class B

        B.method1(); // Employee 1
    }
}

/*
// Error
class first extends second {}
class second extends first {}
*/
