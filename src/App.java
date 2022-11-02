import java.util.List;

import dao.EmployeeDAO;
import dto.Employee;
import service.EmployeeService;
import service.EmployeeServiceimpl;

public class App {
    public static void main(String[] args) throws Exception {

        EmployeeService employeeService = new EmployeeServiceimpl();

        Employee employee1 = 
            new Employee
            (1,
            "Kubilay",
            "WMAD Instructor",
            0,
            50000);

        Employee employee2 = 
            new Employee
            (2,
            "Francois",
            "WMAD Instructor",
            0,
            60000);

        Employee employee3 = 
            new Employee
            (3,
            "Mari",
            "WMAD Sensei",
            0,
            90000);

        // employeeService.addEmployee(employee1);
        // employeeService.addEmployee(employee2);
        employeeService.updateEmployee(employee3);

        List<Employee> employees = employeeService.findAllEmployees();

        for (Employee employee : employees) {
            System.out.println(
                "Employee ID: " + employee.getId() + 
                "| Employee Name " + employee.getName() +
                "| Employee Department " + employee.getDepartment() +
                "| Employee Salary " + employee.getSalary()
            );
        }
    }
}