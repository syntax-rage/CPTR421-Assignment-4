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
public class RyuPlayer extends Player {
    
    RyuPlayer(){
        attackMethod = new NoWeapon(); 
        
      
       weaponMain= new Melee();
    }

    @Override
    public void display() {
        System.out.println("\n Ryu is your Player");
    }
}