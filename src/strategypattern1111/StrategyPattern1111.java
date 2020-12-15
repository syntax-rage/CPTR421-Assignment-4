/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern1111;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class StrategyPattern1111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        System.out.println("Welcome to Capcom Shooter 1999");
        
        System.out.println("Please choose a Character");
        System.out.println("1 Ken");
        System.out.println("2 Ryu");
        System.out.println("3 Guile");
        System.out.println("4 Chun Li");
        System.out.print("----->  ");
        
        int choice = read.nextInt();
    
        switch(choice) {  
          
            case 1:
                Player kenPlayer = new KenPlayer(); 
                kenPlayer.display(); 
                kenPlayer.performAttack();
                kenPlayer.performWepons(); 
                kenPlayer.move();  
                break;
                
          case 2:
                 Player ryuPlayer = new RyuPlayer(); 
                 ryuPlayer.display();  
                 ryuPlayer.peformAttack(); 
                 ryuPlayer.peformWepons();  
                 ryuPlayer.move(); 
                 break;
          
          case 3:
                Player guilePlayer = new GuilePlayer(); 
                guilePlayer.display(); 
                guilePlayer.peformAttack();  
                guilePlayer.peformWepons(); 
                guilePlayer.move(); 
                break;
        
          case 4:
               Player chunliPlayer = new ChunLiPlayer(); 
               chunliPlayer.display(); 
               chunliPlayer.peformAttack(); 
               chunliPlayer.peformWepons(); 
               chunliPlayer.move();
               break;
              
          default: 
              System.out.println("Invalid option\n Please try again (1-4)");
        } 

    }
}
