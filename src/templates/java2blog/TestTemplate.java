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
public class TestTemplate {
    public static void main(String[] args) {
        
        CSVDataParser csv = new CSVDataParser();
        csv.parseDataAndGenerateOutput();
        System.out.println("***********************************\n");
        DatabaseDataParser data = new DatabaseDataParser();
        data.parseDataAndGenerateOutput();
        
        
    }
}
