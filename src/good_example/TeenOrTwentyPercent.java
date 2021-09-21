package good_example;

import bad_example.Employee;

public class TeenOrTwentyPercent implements CalcRule {
    @Override
    public double calc(Employee e) {
        if (e.getSalary() > 3000.0) {
            return e.getSalary() * 0.1;
        } else {
            return e.getSalary() * 0.15;
        }
    }
}
