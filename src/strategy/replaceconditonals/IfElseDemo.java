package strategy.replaceconditonals;

// I'm going to iterrate these changes and check them into Git
// The reference to this is from here:
// https://www.jetbrains.com/help/idea/replace-conditional-logic-with-strategy-pattern.html
public class IfElseDemo {
    private InsuranceStrategy strategy;


    public double calculateInsurance(double income) {
        if (income <= 10000) {
            strategy = new InsuranceStrategyLow();
            return strategy.calculate(income);
        } else if (income <= 30000) {
            strategy = new InsuranceStrategyMedium();
            return strategy.calculate(income);
        } else if (income <= 60000) {
            strategy = new InsuranceStrategyHigh();
            return strategy.calculate(income);
        } else {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.calculate(income);
        }
    }


}
