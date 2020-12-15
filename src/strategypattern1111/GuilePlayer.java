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
public class GuilePlayer extends Player{
        
        GuilePlayer(){
            
           attackMethod = new WeaponMain(); 

           weaponMain = new shoot();
        }

    @Override
    public void display() {
        System.out.println("\n Guile is your player");
    }
}