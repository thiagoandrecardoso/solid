package SRP.good_example;

import SRP.bad_example.Employee;

public class TenOrTwentyPercent implements CalcRule {
    @Override
    public double calc(Employee e) {
        if (e.getSalary() > 3000.0) {
            return e.getSalary() * 0.1;
        } else {
            return e.getSalary() * 0.2;
        }
    }
}
