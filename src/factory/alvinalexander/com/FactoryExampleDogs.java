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
public class FactoryExampleDogs {
    public static void main(String[] args) {
        
        //create small dog
        Dog dog = DogFactory.getDog("small");
        dog.speak();
        
        // create big dog
        dog = DogFactory.getDog("big");
        dog.speak();
        
        // create Mocha
        Dog mocha = DogFactory.getDog("cute");
        mocha.speak();
        
    }
}
