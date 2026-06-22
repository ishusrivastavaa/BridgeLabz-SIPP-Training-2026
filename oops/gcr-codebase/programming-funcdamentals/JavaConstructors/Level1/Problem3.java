class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Problem3 {
    public static void main(String[] args) {

        Person p1 = new Person("Ishu", 20);

        Person p2 = new Person(p1);

        p2.display();
    }
}