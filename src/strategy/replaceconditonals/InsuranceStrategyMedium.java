package strategy.replaceconditonals;

public class InsuranceStrategyMedium extends InsuranceStrategy {
    @Override
    int getConstant() {
        return 35600;
    }

    @Override
    double getWeight() {
        return 0.2;
    }

    @Override
    int getAdjustment() {
        return 10000;
    }
}
