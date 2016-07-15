/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.derek.banas;

/**
 *
 * @author brian
 */
public class FundsCheck {
    private double cashInAccount = 10000.00;
    
    public double getCashInAccount(){
        return cashInAccount;
    }
    
    public void decreaseCashInAccount(double cashWithdrawn){
        cashInAccount -= cashWithdrawn;
    }
    
    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }
    
    public boolean haveEnoughMoney(double cashToWithdrawl){
        
        if(cashToWithdrawl > getCashInAccount()){
            System.out.println("Error!!! You don't have enough money");
            updateBalance();
            
            return false;
        } else {
            decreaseCashInAccount(cashToWithdrawl);
            System.out.println("Transaction complete.\n");
            updateBalance();
            
            return true;
        }
    }

    public void updateBalance() {
        System.out.println("Your balance in your account is " + getCashInAccount());
    }
    
    public void makeDeposit(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        
        updateBalance();
    }
    
}
