package ru.geekbrains.java1.Lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int telephone;
    private int salary;
    private int age;


    public Employee (String fullName, String position, String email, int telephone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }


    public void printInfo () {  // Не пойму как вызвать этот метод? Вроде дал разрешение через get
        System.out.printf("Employee: fullName - %s, position - %s, email - %s, telephone - %d, salary - %d, age - %d\n", getFullName(), getPosition(), getEmail(), getTelephone(), getSalary(), getAge());
            }

    public int getAge() {
        return this.age;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getPosition() {
        return this.position;
    }

    public String getEmail() {
        return this.email;
    }

    public int getTelephone() {
        return this.telephone;
    }

    public int getSalary() {
        return this.salary;
    }
}
