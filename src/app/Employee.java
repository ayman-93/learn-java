package app;

import java.io.IOException;

/**
 * Employee
 */
public abstract class Employee {
    protected long id;
    protected String name;
    protected String position;
    protected float salary;

    public Employee(long id, String name, String position, float salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void test() {
        System.out.println("Employee");
    }

    public void WriteFile() throws IOException {
        System.out.println("nooo");
    };

    public void ReadFile() {
        System.out.println("nooo");
    }

}