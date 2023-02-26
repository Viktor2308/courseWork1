package com.skypro.courseWork1;

import java.util.Scanner;

public class EmployeeBook {


    private final Employee[] employeeBook;


    public EmployeeBook(int countEmployee) {
        employeeBook = new Employee[countEmployee];
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = employee;
                break;
            }
        }
    }


    public void deleteEmployee(int id) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (getEmployeeBook()[i] != null && getEmployeeBook()[i].getId() == id) {
                System.out.println("Employee id № " + getEmployeeBook()[i].getId() + " fired.");
                employeeBook[i] = null;
            }
        }
    }

    public void deleteEmployee(String lastName, String firstName, String middleName) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (getEmployeeBook()[i] != null && getEmployeeBook()[i].getLastName().equals(lastName) &&
                    getEmployeeBook()[i].getName().equals(firstName) &&
                    getEmployeeBook()[i].getMiddleName().equals(middleName)) {
                System.out.println("Employee id № " + getEmployeeBook()[i].getId() + " " + getEmployeeBook()[i].getLastName() + " fired.");
                employeeBook[i] = null;
            }
        }
    }

    public Employee[] getEmployeeBook() {
        return employeeBook;
    }

    private double maxSalary() {
        double maxSalary = 0;
        for (Employee value : getEmployeeBook()) {
            if (value != null && maxSalary < value.getSalary()) {
                maxSalary = value.getSalary();
            }
        }
        return maxSalary;
    }

    public void salaryAllEmployeeInMonth() {
        double salaryAllEmployee = 0;
        for (Employee value : getEmployeeBook()) {
            if (value != null) {
                salaryAllEmployee += value.getSalary();
            }
        }
        System.out.println("Salary all employee in month: " + Math.round(salaryAllEmployee * 100) / 100.0);
    }

    public void allInfoAboutEmployee() {
        System.out.println("All staff");
        for (Employee employee : employeeBook) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public Employee searchEmployeeMinSalary() {
        double minSalary = getEmployeeBook()[0].getSalary() + 1;
        Employee employee = null;
        for (Employee value : getEmployeeBook()) {
            if (value != null && minSalary > value.getSalary()) {
                minSalary = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public Employee searchEmployeeMaxSalary() {
        double maxSalary = getEmployeeBook()[0].getSalary() + 1;
        Employee employee = null;
        for (Employee value : getEmployeeBook()) {
            if (value != null && maxSalary < value.getSalary()) {
                maxSalary = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public void averageSalary() {
        int countEmployee = 0;
        double allSalaryMonth = 0;
        for (Employee employee : getEmployeeBook()) {
            if (employee != null) {
                allSalaryMonth += employee.getSalary();
                countEmployee++;
            }
        }
        System.out.println("Average salary in company: " + Math.round((allSalaryMonth / countEmployee) * 100) / 100.0);
    }

    public void listOfFullNames() {
        for (Employee employee : getEmployeeBook()) {
            if (employee != null) {
                System.out.println(employee.getLastName() + " " + employee.getName() + " " + employee.getMiddleName());
            }
        }
    }

    public void indexOfSalaryAllEmployee(int index) {
        for (Employee employee : getEmployeeBook()) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * index / 100);
            }
        }
    }

    private Employee[] departmentInfo(int department) {
        Employee[] employeesDepartment = new Employee[getEmployeeBook().length];
        for (int i = 0; i < getEmployeeBook().length; i++) {
            if (getEmployeeBook()[i] != null && getEmployeeBook()[i].getDepartment() == department) {
                employeesDepartment[i] = getEmployeeBook()[i];
            }
        }
        return employeesDepartment;
    }

    public Employee departmentMaxSalaryEmployee(int department) {
        double maxSalary = 0;
        Employee employee = null;
        for (Employee value : departmentInfo(department)) {
            if (value != null && maxSalary < value.getSalary()) {
                maxSalary = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public Employee departmentMinSalaryEmployee(int department) {
        double minSalary = maxSalary();
        Employee employee = null;
        for (Employee value : departmentInfo(department)) {
            if (value != null && minSalary > value.getSalary()) {
                minSalary = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public void departmentSalary(int department) {
        double departmentSalary = 0;
        for (Employee value : departmentInfo(department)) {
            if (value != null) {
                departmentSalary += value.getSalary();
            }
        }
        System.out.println("Department #" + department + " salary: " + Math.round(departmentSalary * 100) / 100.0);
    }

    public void departmentAverageSalary(int department) {
        double allDepartmentSalary = 0;
        int count = 0;
        for (Employee value : departmentInfo(department)) {
            if (value != null) {
                allDepartmentSalary += value.getSalary();
                count++;
            }
        }
        System.out.println("Department #" + department + " average salary: " + Math.round((allDepartmentSalary / count) * 100) / 100.0);
    }

    public void departmentIndexOfSalary(int index, int department) {
        for (Employee employee : departmentInfo(department)) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * index / 100);
            }
        }
    }

    public void departmentAllEmployee(int department) {
        for (Employee employee : departmentInfo(department)) {
            if (employee != null) {
                System.out.println("id № " + employee.getId() +
                        ", Name: " + employee.getLastName() + " " + employee.getName() + " " + employee.getMiddleName() +
                        ", salary: " + Math.round(employee.getSalary() * 100) / 100.0);
            }
        }
    }

    public void searchAllEmployeeSalaryHigh(double salary) {
        for (Employee value : getEmployeeBook()) {
            if (value != null && salary <= value.getSalary()) {
                System.out.println("id № " + value.getId() +
                        ", Name: " + value.getLastName() + " " + value.getName() + " " + value.getMiddleName() +
                        ", salary: " + Math.round(value.getSalary() * 100) / 100.0);
            }
        }

    }

    public void searchAllEmployeeSalaryLess(double salary) {
        for (Employee value : getEmployeeBook()) {
            if (value != null && salary > value.getSalary()) {
                System.out.println("id № " + value.getId() +
                        ", Name: " + value.getLastName() + " " + value.getName() + " " + value.getMiddleName() +
                        ", salary: " + Math.round(value.getSalary() * 100) / 100.0);
            }
        }

    }

    public void changeEmployee(String lastName, String firstName, String middleName) {
        Scanner inn = new Scanner(System.in);
        for (int i = 0; i < employeeBook.length; i++) {
            if (getEmployeeBook()[i] != null && getEmployeeBook()[i].getLastName().equals(lastName) &&
                    getEmployeeBook()[i].getName().equals(firstName) &&
                    getEmployeeBook()[i].getMiddleName().equals(middleName)) {
                System.out.println("Employee id № " + getEmployeeBook()[i].getId() + " " +
                        getEmployeeBook()[i].getLastName() + " enter on keyboard new salary: ");
                employeeBook[i].setSalary(inn.nextDouble());
                System.out.println("Employee id № " + getEmployeeBook()[i].getId() + " " +
                        getEmployeeBook()[i].getLastName() + " enter on keyboard new department(1-5): ");
                employeeBook[i].setDepartment(inn.nextInt());
                System.out.println("Employee id № " + getEmployeeBook()[i].getId() + " " +
                        getEmployeeBook()[i].getLastName() + " " +
                        " new department: " + getEmployeeBook()[i].getDepartment() +
                        " new salary: " + getEmployeeBook()[i].getSalary());
            }
        }
    }

    public void departmentListOfFullNames() {
        for (int department = 1; department < 6; department++) {
            for (Employee employee : departmentInfo(department)) {
                if (employee != null) {
                    System.out.println("department № " + employee.getDepartment() +
                            ", Name: " + employee.getLastName() + " " + employee.getName() + " " + employee.getMiddleName());
                }
            }
        }
    }

}
