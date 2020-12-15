/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern1111;

/**
 *
 * @author Jason
 */
public class ChunLiPlayer extends Player {
    
    ChunLiPlayer(){
         
        attackMethod = new NoWeapon(); 
        
       weaponMain = new Melee();
    }

    @Override
    public void display() {
        System.out.println("\n Chun Li is your player");
    }
}
