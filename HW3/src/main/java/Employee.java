import java.util.*;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }

    public static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e2.salary, e1.salary);
        }
    }

    public static class DepartmentComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.department.compareTo(e2.department);
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25, 50000.0, "Marketing"));
        employees.add(new Employee("Jane", 30, 60000.0, "Sales"));
        employees.add(new Employee("Bob", 35, 70000.0, "IT"));
        employees.add(new Employee("Alice", 40, 80000.0, "HR"));

        System.out.println("unsorted: ");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ", " + employee.getAge() + ", " + employee.getSalary() + ", " + employee.getDepartment());
        }

        Collections.sort(employees);

        System.out.println("\nby age:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ", " + employee.getAge() + ", " + employee.getSalary() + ", " + employee.getDepartment());
        }

        Collections.sort(employees, new SalaryComparator());

        System.out.println("\nby salary:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ", " + employee.getAge() + ", " + employee.getSalary() + ", " + employee.getDepartment());
        }

        Collections.sort(employees, new DepartmentComparator());

        System.out.println("\nby department:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ", " + employee.getAge() + ", " + employee.getSalary() + ", " + employee.getDepartment());
        }
    }
}
