package test;

import SRP.bad_example.Employee;
import SRP.bad_example.Office;
import SRP.good_example.SalaryCalculation;

public class TestSalaryCalc {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(3000);
        employee.setOffice(Office.DBA);

        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double value = salaryCalculation.calculation(employee);
        System.out.println(value);
    }
}
