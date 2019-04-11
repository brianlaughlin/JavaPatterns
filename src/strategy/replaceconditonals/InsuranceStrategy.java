package strategy.replaceconditonals;

public abstract class InsuranceStrategy {
    double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    abstract int getConstant();

    abstract double getWeight();

    abstract int getAdjustment();
}
