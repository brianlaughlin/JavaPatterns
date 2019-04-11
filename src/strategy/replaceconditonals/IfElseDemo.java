package strategy.replaceconditonals;

// I'm going to iterrate these changes and check them into Git
// The reference to this is from here:
// https://www.jetbrains.com/help/idea/replace-conditional-logic-with-strategy-pattern.html
public class IfElseDemo {
    private final InsuranceStrategyVeryHigh insuranceStrategyVeryHigh = new InsuranceStrategyVeryHigh();

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income * 0.365;
        } else if (income <= 30000) {
            return (income - 10000) * 0.2 + 35600;
        } else if (income <= insuranceStrategyVeryHigh.getAdjustment()) {
            return (income - 30000) * 0.1 + 76500;
        } else {
            return insuranceStrategyVeryHigh.calculateInsuranceVeryHigh(income);
        }

    }


}
