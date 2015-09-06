/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.javarevisited.com;

/**
 *
 * @author Brian
 */
public class observerTest {

    public static void main(String[] args) {
        // will maintain all loan information

        Newspaper printMedia = new Newspaper();
        Internet onlineMedia = new Internet();

        Loan personalLoan = new Loan("Personal Loan", 4.5f, "Opportunity Funding");
        personalLoan.registerObserver(onlineMedia);
        personalLoan.registerObserver(printMedia);
        personalLoan.notifyObservers();
        
        printSeperator();

        personalLoan.setInterest(5.5f);
        personalLoan.notifyObservers();
        
        printSeperator();
        
        personalLoan.setInterest(12f);
        personalLoan.notifyObservers();
        


    }

    private static void printSeperator() {
        System.out.println("\n-------------------------------------------------------");
    }

}
