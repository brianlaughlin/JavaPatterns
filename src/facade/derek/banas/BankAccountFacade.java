// The Facade Design Pattern decouples or separates the client 
// from all of the sub components
// The Facades aim is to simplify interfaces so you don't have 
// to worry about what is going on under the hood
package facade.derek.banas;

public class BankAccountFacade {

    private final int accountNumber;
    private int securityCode;

    private final AccountNumberCheck accountNumberCheck;
    private final SecurityCodeCheck securityCodeCheck;
    private final FundsCheck fundsCheck;

    private final WelcomeToBank welcomeToBank;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        welcomeToBank = new WelcomeToBank();
        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();

    }

    public void withdrawCash(double cashToGet) {

        if (isAccountGood()
                && isCodeGood()
                && fundsCheck.haveEnoughMoney(cashToGet)) {

            transactionCompletedMessage();
        } else {
            transactionFailedMessage();
        }

    }

    public void depositCash(double cashToDeposit) {
        if (isAccountGood()
                && isCodeGood()) {
            fundsCheck.makeDeposit(cashToDeposit);

            transactionCompletedMessage();
        } else {
            transactionFailedMessage();
        }
    }

    private void transactionFailedMessage() {
        System.out.println("Transaction failed\n");
    }

    private void transactionCompletedMessage() {
        System.out.println("Transaction completed\n");
    }

    private boolean isCodeGood() {
        return securityCodeCheck.isCodeCorrect(getSecurityCode());
    }

    private boolean isAccountGood() {
        return accountNumberCheck.accountActive(getAccountNumber());
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int newSecurityCode) {
        securityCode = newSecurityCode;
    }

}
