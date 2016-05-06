/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.derek.banas;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class FactoryPatternTesting {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of Ship? (U / R / B)");

        if (userInput.hasNextLine()) {

            String typeOfShip = userInput.nextLine();

            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if (theEnemy != null) {
            doStuffEnemy(theEnemy);

        } else {
            System.out.println("Enemy a U, R, or B next time");
        }

    }

    private static void doStuffEnemy(EnemyShip theEnemy) {

        theEnemy.displayEnemyShip();
        theEnemy.followHeroShip();
        theEnemy.enemyShipShoots();

    }

}
