package bad_example;

import good_example.CalcRule;
import good_example.FifteenOrTwentyPercent;
import good_example.TeenOrTwentyPercent;

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
