package Streams.flatMap.TheTotalNumberOfEmployees;

import java.util.*;
import java.util.stream.Collectors;

class EmployeesCounter {

    /**
     * Calculates the number of employees with salary >= threshold (only for 111- departments)
     *
     * @param departments are list of departments
     * @param threshold is lower edge of salary
     *
     * @return the number of employees
     */
    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(dep -> dep.getCode().startsWith("111-"))
                .flatMap(dep -> dep.getEmployees().stream())
                .filter(emp -> emp.getSalary() >= threshold).count(); // write your code here
    }
}

class Employee {
    private final String name;
    private final Long salary;

    public Employee(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Department {
    private final String name;
    private final String code;
    private final List<Employee> employees;

    public Department(String name, String code, List<Employee> employees) {
        this.name = name;
        this.code = code;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", employees=" + employees +
                '}';
    }
}

/*
    To test

    List<Department> departments = List.of(
            new Department("dep-1", "111-1", List.of(
                    new Employee1("William", 15000L),
                    new Employee1("Sophia", 22000L),
                    new Employee1("John", 20000L)
            )),
            new Department("dep-2", "222-1", List.of(
                    new Employee1("Victor", 25000L)
            ))
    );
System.out.println("Number calculated:" + EmployeesCounter.calcNumberOfEmployees(departments, 17000L));*/
