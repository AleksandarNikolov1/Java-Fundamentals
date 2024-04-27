package L06_Objects_and_Classes.More_Exercise.P01_CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Employee> employees = new ArrayList<>();
        List<String> departmentNames = new ArrayList<>();
        List<Department> departments = new ArrayList<>();

        while (n-- > 0) {
            String input = sc.nextLine();
            String[] tokens = input.split("\\s+");

            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String departmentName = tokens[3];

            Employee employee = new Employee(name, salary, position, departmentName);

            if (!departmentNames.contains(departmentName)){
                departmentNames.add(departmentName);
                Department department = new Department(departmentName);
                departments.add(department);
                department.addEmployeeInDepartment(employee);
            }

            else{
                for (Department department : departments) {
                    if (department.getName().equals(departmentName)) {
                        department.addEmployeeInDepartment(employee);
                    }
                }
            }


            if (tokens.length == 5){
                if (tokens[4].contains("@")) {
                    String email = tokens[4];
                    employee.setEmail(email);
                }

                else{
                    int age = Integer.parseInt(tokens[4]);
                    employee.setAge(age);
                }
            }

            else if (tokens.length == 6){
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                employee.setEmail(email);
                employee.setAge(age);
            }

            employees.add(employee);
        }

        Department highestPaidDepartment = Department.getTheDepartmentWithHighestAverageSalary(departments);

        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees().stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(e -> System.out.print(e.toString()));

    }
}
