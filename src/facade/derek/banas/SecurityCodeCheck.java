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
public class SecurityCodeCheck {

    private final int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int secCodeToCheck){
        return secCodeToCheck == getSecurityCode();
    }
}
