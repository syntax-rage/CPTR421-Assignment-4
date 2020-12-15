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
public class NoWeapon implements AttackMethod {

    @Override
    public void shoot() {
        System.out.println(" Does not have a weapon"); 
    }
        
}