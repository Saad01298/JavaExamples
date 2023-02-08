package ComparableAndComparator;
import java.util.*;
import java.util.stream.Collectors;

class EmployeeNew implements Comparable<EmployeeNew>{
    private int id;
    private String name;

    public EmployeeNew(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(EmployeeNew o) {
        return this.getId() - o.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student {
    private int rollNo;
    private int age;
    private String name;
    private String random;

    public Student(int rollNo, int age, String name, String random) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.random = random;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }
}

public class ComparableAndComparator {
    public static void main(String[] args) {
        EmployeeNew [] empArr = new EmployeeNew[4];
        empArr[0] = new EmployeeNew(1, "John");
        empArr[1] = new EmployeeNew(9, "Amit");
        empArr[2] = new EmployeeNew(5, "Paul");
        empArr[3] = new EmployeeNew(10, "Ravi");

        // below code will give error, if Comparable Interface is not implemented by Employee class
        Arrays.sort(empArr);
        for (EmployeeNew e : empArr) {
            System.out.print(e.getId() + " : " + e.getName() + ", ");
        }

        System.out.println("Is it error?");
        Student [] student = new Student[5];
        student[0] = new Student(3, 26,"Saad", "sa");
        student[1] = new Student(16, 27, "Fahad", "fa");
        student[2] = new Student(30, 22, "Waji", "wa");
        student[3] = new Student(4, 28, "Jaza", "ja");
        student[4] = new Student(19, 27, "Umar", "ua");

        //Arrays.sort(student); // Uncomment and see result. It will give error because comparable not implemented
        for (Student s : student) {
            System.out.print(s.getRollNo() + " ");
        }

        System.out.println("\n ---- Comparator ----");
        Comparator<Student> studentAgeComparator = (s1, s2) -> {
            if (s1.getAge() > s2.getAge()) {
                return 1;
            }
            else if (s1.getAge() < s2.getAge()) {
                return -1;
            }
            else
                return 0;
        };

        /*Comparator<Student> studentComparator1 = (s1, s2) -> s1.getName().compareTo(s2.getName());
        Comparator<Student> studentComparator2 = (s1, s2) -> s1.getRandom().compareTo(s2.getRandom());*/


        Arrays.sort(student, studentAgeComparator);
        for (Student s : student) {
            System.out.print(s.getRollNo() + " ");
        }

        Comparator<Student> studentRollNoComparator = (s1,s2) -> {
            if (s1.getRollNo()>s2.getRollNo())
                return 1;
            else
                return -1;
        };
        Arrays.sort(student, studentRollNoComparator);
        for (Student s : student) {
            System.out.print(s.getName() + " ");
        }

        Comparator<EmployeeNew> employeeNewComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
        Arrays.sort(empArr, employeeNewComparator);
        for (EmployeeNew e : empArr) {
            System.out.println(e.getId() + " : " + e.getName());
        }



        System.out.println("Comparable Lambda");
        Comparable<Integer> comparable = k -> k.compareTo(2);
        System.out.println(comparable.compareTo(5));
        System.out.println(comparable.compareTo(1));
        System.out.println(comparable.compareTo(2));

//        Comparable<EmployeeNew> comparable1 = (k) -> {
//            if (k.getId()>)      // in this line what would you give after > sign ?? A constant value like 2 or 3; or a variable value like we were able to give in case of comparator
//        };
//        System.out.println(comparable1.compareTo(5));

        Comparable<Student> studentComparable = s -> {
            if (s.getAge()>1) {
                return 1;
            }
            else
                return -1;
        };

        System.out.println("Lets check ------------");
        EmployeeNew employeeNew = new EmployeeNew(10, "Ami");
        int a = employeeNew.compareTo(new EmployeeNew(19, "umi"));
        System.out.println(a);
        a = employeeNew.getName().compareTo("asd");
        System.out.println(a);


        System.out.println("================================================================");
        ArrayList<Student> arrayList = new ArrayList<Student>(List.of(new Student(3, 26,"Saad", "sa"), new Student(5, 20,"Fahad", "fa")));
        arrayList.add(new Student(10, 10, "Umar", "Um"));

        arrayList.stream().map(k->k.getName()).forEach(System.out::println);

        Comparator<Student> c = (s1, s2) -> {
            if (s1.getAge() > s2.getAge()) {
                return 1;
            }
            else if (s1.getAge() < s2.getAge()) {
                return -1;
            }
            else
                return 0;
        };
        //Arrays.sort(arrayList, c); // Uncomment and think of reason of result

        Collections.sort(arrayList, c);
        arrayList.stream().map(k->k.getName()).forEach(System.out::println);

    }


    // custom class which we wanted to sort through Arrays.sort(). That class need to implement
    // Comparable and the override compareTo() method
    // Now Arrays.sort() will use overrided compareTo() method for default sorting.
    // While if we want to sort in some other way, for example: through employee name,
    // then along with array name, we can pass comparator variable to Arrays.sort() as well.
    // And in case of using comparator, the class EmployeeNew don't have to implement
    // Comparable Interface

    // compareTo of Comparable takes 1 argument while compare of Comparator takes 2 argument.
    // Make student class implement comparator and see implementing method
}
