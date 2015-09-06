/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.alvinalexander.com;

/**
 *
 * @author Brian
 */
public class Rottweiler implements Dog {

    @Override
    public void speak() {
        System.out.println("The Rottweiler says (in a very deep voice) \"WOOF!\"");
    }

}
