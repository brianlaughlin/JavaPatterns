package factory.derek.banas;

import java.util.Scanner;

/**
 *
 * @author brian
 * This is a bad example to contrast to a Factory pattern
 */
public class EnemyShipTesting {
    
    public static void main(String[] args) {
        
        EnemyShip theEnemy = null;
        
        Scanner userInput = new Scanner(System.in);
        
        String enemyShipOption = "";
        
        System.out.println("What type of ship? (U / R)");
        
        if (userInput.hasNextLine()){
            
            enemyShipOption = userInput.nextLine();
        }
        
        if(enemyShipOption.equals("U")){
            
            theEnemy = new UFOEnemyShip();
        } else {
            
            if(enemyShipOption.equals("R")){
                
                theEnemy = new RocketEnemyShip();
            }
        }
        
        doStuffEnemy(theEnemy);
    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
        
    }
    
}
