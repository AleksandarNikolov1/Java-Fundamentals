package L06_Objects_and_Classes.More_Exercise.P01_CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    private Department() {

    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployeeInDepartment(Employee employee) {
        employees.add(employee);
    }

    public String getName() {
        return name;
    }


    private double getAverageSalaryPerDepartment(Department department) {
        List<Employee> employees = department.getEmployees();
        return employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
    }

    public static Department getTheDepartmentWithHighestAverageSalary(List<Department> departments) {

        Department department = new Department();

        double maxSalary = Integer.MIN_VALUE;

        for (Department dep : departments) {
            double avgSalary = dep.getAverageSalaryPerDepartment(dep);

            if (avgSalary > maxSalary) {
                maxSalary = avgSalary;
                department = dep;
            }
        }

        return department;
    }
}
