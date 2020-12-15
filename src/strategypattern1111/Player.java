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
public abstract class Player {
    
     AttackMethod attackMethod;  
        
        
         WeaponMain weaponMain;
        
        public abstract void display();  
        
        public void performAttack(){   
            attackMethod.attack(); 
        }
        
        
        public void WeaponSelect(){ 
            weaponMain.weapon();
        }
        
        public void move(){     
            System.out.println("Movement: 1x"); 
        }
}
    
  
