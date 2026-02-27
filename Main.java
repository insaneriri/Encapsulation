// Main.java

public class Main {
    public static void main(String[] args) {
        Person iPerson = new Person();
        iPerson.setName("Yuuta");
        iPerson.setAge(19);

        System.out.println("Name: " + iPerson.getName());
        System.out.println("Age: " + iPerson.getAge());
    }
}

// Person.java

public class Person {
    private String name;
    private int age;

    //Getters Method
    public String getName() {
        return name;
    }

    //Setters Method
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

// Person.java (With Constructor)

public class Person {
    private String name;
    private int age;

    //Getters Method
    public String getName() {
        return name;
    }

    //Setters Method
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}
