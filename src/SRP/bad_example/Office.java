package SRP.bad_example;

import SRP.good_example.CalcRule;
import SRP.good_example.FifteenOrTwentyPercent;
import SRP.good_example.TeenOrTwentyPercent;

public enum Office {
    DEV(new TeenOrTwentyPercent()),
    DBA(new FifteenOrTwentyPercent()),
    TESTER(new FifteenOrTwentyPercent());

    private final CalcRule calcRule;

    Office(CalcRule CalcRule) {
        this.calcRule = CalcRule;
    }

    public CalcRule getCalcRule() {
        return calcRule;
    }
}
