package com.skypro.courseWork1;

public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(10);

        Employee employee1 = new Employee("Ivan", "Ivanov", "Ivanovich", 2, 75673.67);
        Employee employee2 = new Employee("Ira", "Ivanova", "Olegovna", 1, 134573.67);
        Employee employee3 = new Employee("Alex", "Petrov", "Antonovich", 2, 75673.67);
        Employee employee4 = new Employee("Petr", "Sidorov", "Nikolaevich", 3, 45634.67);
        Employee employee5 = new Employee("Michail", "Novikov", "Petrovich", 4, 125367.56);
        Employee employee6 = new Employee("Maria", "Mass", "Viktorovna", 5, 38675.45);
        Employee employee7 = new Employee("Marina", "Komkova", "Alekseevna", 4, 148967.76);
        Employee employee8 = new Employee("Julia", "Averina", "Nikolaevna", 1, 98977.45);
        Employee employee9 = new Employee("Asya", "Bax", "Vladimirovna", 3, 76765.98);

        System.out.println("4.a. Добавить нового сотрудника: ");
        employeeBook.addEmployee(employee1);
        employeeBook.addEmployee(employee2);
        employeeBook.addEmployee(employee3);
        employeeBook.addEmployee(employee4);
        employeeBook.addEmployee(employee5);
        employeeBook.addEmployee(employee6);
        employeeBook.addEmployee(employee7);
        employeeBook.addEmployee(employee8);
        employeeBook.addEmployee(employee9);

//easy
        System.out.println("1. Получить список всех сотрудников:");
        employeeBook.allInfoAboutEmployee();

        System.out.println("2. Посчитать сумму затрат на зарплату:");
        employeeBook.salaryAllEmployeeInMonth();

        System.out.println("3. Найти сотрудника с минимальной зарплатой:");
        System.out.println("Min salary: " + employeeBook.searchEmployeeMinSalary());

        System.out.println("4. Найти сотрудника с максимальной зарплатой:");
        System.out.println("Max salary: " + employeeBook.searchEmployeeMaxSalary());

        System.out.println("5. Подсчитать среднее значение зарплат:");
        employeeBook.averageSalary();

        System.out.println("Список ФИО всех сотрудников: ");
        employeeBook.listOfFullNames();
//medium
        System.out.println("Проиндексировать зарплату на %:");
        employeeBook.indexOfSalaryAllEmployee(10);
        System.out.println("Salary after index:");
        employeeBook.allInfoAboutEmployee();
        System.out.println("6 методов получающих в качестве параметра номер отдела и выводящих:");
        System.out.println("a. Employee with min salary in department: ");
        System.out.println(employeeBook.departmentMinSalaryEmployee(2));
        System.out.println("b. Employee with max salary in department: ");
        System.out.println(employeeBook.departmentMaxSalaryEmployee(1));
        System.out.println("c. Sum department salary:");
        employeeBook.departmentSalary(2);
        System.out.println("d. Department average salary:");
        employeeBook.departmentAverageSalary(3);
        System.out.println("e. Index the salary all department employers: ");
        employeeBook.departmentIndexOfSalary(20, 4);
        System.out.println("Department max/min salary after index: ");
        System.out.println(employeeBook.departmentMaxSalaryEmployee(4));
        System.out.println(employeeBook.departmentMinSalaryEmployee(4));
        System.out.println("f. Print all employee department: ");
        employeeBook.departmentAllEmployee(1);
        System.out.println("3.a Получить в качестве параметра число и найти всех сотрудников с зарплатой меньше числа: (вывести id, Ф. И. О. и зарплатой в консоль)");
        employeeBook.searchAllEmployeeSalaryLess(90_000);
        System.out.println("3.a Получить в качестве параметра число и найти всех сотрудников с зарплатой больше(или равно) числа: (вывести id, Ф. И. О. и зарплатой в консоль)");
        employeeBook.searchAllEmployeeSalaryHigh(100_000);
//hard
        System.out.println("4.b. Удалить сотрудника по id:");
        employeeBook.deleteEmployee(3);
        employeeBook.deleteEmployee(5);
        employeeBook.deleteEmployee(7);
        employeeBook.allInfoAboutEmployee();
        System.out.println("4.b. Удалить сотрудника по ФИО:");
        Employee employee10 = new Employee("Kira", "Fax", "Vitalievna", 2, 66765.98);
        employeeBook.addEmployee(employee10);
        employeeBook.allInfoAboutEmployee();
        employeeBook.deleteEmployee("Sidorov", "Petr", "Nikolaevich");
        System.out.println("6. Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).");
        employeeBook.departmentListOfFullNames();
        System.out.println("5. Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись - сделал через scanner ввод новых данных с клавиатуры):");
        employeeBook.changeEmployee("Fax", "Kira", "Vitalievna");


    }
}
