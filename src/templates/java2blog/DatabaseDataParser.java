/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates.java2blog;

/**
 *
 * @author brian
 */
public class DatabaseDataParser extends DataParser {

    @Override
    void readData() {
        System.out.println("Reading data from database");
    }

    @Override
    protected void processData() {
        System.out.println("Looping through datasets");

    }

}
