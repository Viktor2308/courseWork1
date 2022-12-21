package com.skypro.courseWork1;

public class Employee {
    private final String name;
    private final String lastName;
    private final String middleName;
    private int department;
    private double salary;
    private final int id;
    private static int counter = 1;


    public Employee(String name, String lastName, String middleName, int department, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id № " + id +
                ", Name: " + lastName + " " + name + " " + middleName +
                ", department # " + department +
                ", salary: " + Math.round(salary * 100) / 100.0;
    }
}
