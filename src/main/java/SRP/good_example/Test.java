package SRP.good_example;
import SRP.bad_example.Employee;
import SRP.bad_example.Office;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setOffice(Office.DEV);
        employee.setSalary(3000);

        SalaryCalculation salaryCalculation = new SalaryCalculation();

        final double calculation = salaryCalculation.calculation(employee);

        System.out.println(calculation);
    }
}
