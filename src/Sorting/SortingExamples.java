package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String Id;
    private String Name;
    private int Age;
    private String Salary;

    public Employee(String id, String name, int age, String salary) {
        Id = id;
        Name = name;
        Age = age;
        Salary = salary;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }
}

public class SortingExamples {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("mango");


        System.out.print("-------------------------------------------------------------");
        fruits.stream().sorted().forEach(k->System.out.print(k+" "));



        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());

        fruits.stream().sorted((m,n)->n.compareTo(m)).forEach(k->System.out.print(k+" "));
        fruits.stream().sorted((m,n)->m.compareTo(n)).forEach(k->System.out.print(k+" "));

        System.out.println("Comparator -----");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        Comparator<String> cmp = (m,n) -> {
            int a = 0;
            if(m.compareTo(n)==1)
                a = -1;
            else
                a = 1;
            return a;
        };

        Collections.sort(fruits, cmp);

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }



        System.out.println("\n -------- ! Employee ! --------- ");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1", "Saad", 26, "500000"));
        employees.add(new Employee("2", "Fahad", 28, "800000"));
        employees.add(new Employee("3", "Umar", 29, "600000"));
        employees.add(new Employee("4", "Waji", 24, "400000"));
        employees.add(new Employee("4", "Jaza", 20, "300000"));
        employees.add(new Employee("4", "Zoya", 50, "500000"));
        employees.add(new Employee("4", "Bilal", 30, "900000"));

        System.out.println("----------- Printing names in assecding order of employees with age greater than 26");
        employees.stream().filter(k->k.getAge()>26).map(k->k.getName()).sorted().forEach(System.out::print);







        employees.stream().filter(n->n.getAge()>26).sorted((p,q)->p.getSalary().compareTo(q.getSalary()))
                .forEach(k->System.out.print(k.getName() + " "));

        System.out.println("");

        employees
                .stream()
                .sorted((e1,e2) -> e2.getSalary().compareTo(e1.getSalary()))
                .forEach(k->System.out.print(k.getName() + " "));


        Comparator<Employee> comparator = (m,n) -> {
            if (m.getAge()>n.getAge())
                return 1;
            return -1;
        };
        employees.stream().sorted(comparator).forEach(k->System.out.print(k.getName() + " "));


        System.out.println("Comparator!");
        employees
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(k->System.out.print(k.getName() + " "));




    }
}
