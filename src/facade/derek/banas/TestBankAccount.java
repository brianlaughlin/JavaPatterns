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
public class TestBankAccount {
    
    public static void main(String[] args) {
        
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        
        accessingBank.withdrawCash(500);
        
        accessingBank.depositCash(2500);
        
        accessingBank.withdrawCash(100000);
        
        
        BankAccountFacade acessingBank2 = new BankAccountFacade(12345678, 4321);
        acessingBank2.withdrawCash(1000);
        
        
    }
}
