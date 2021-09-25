package SRP.good_example;

import SRP.bad_example.Employee;

public class SalaryCalculation {
    public double calculation(Employee employee) {
        return employee.getOffice().getCalcRule().calc(employee);
    }
}
