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
public class KenPlayer extends Player {
    
    KenPlayer(){
        
        attackMethod = new AttackWithWeapon();
        
        weaponMain = new Wepons();
    }
    
    @Override
    public void display() {
        System.out.println("Ken is your player");
    }
}
