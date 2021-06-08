/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author ASUS
 */
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Child input = new Child();
        input.name = "mountain lady";
        input.defencepower = 100; 
        input.display();
        
        
        
        Child2 hero = new Child2();
        hero.name = "lion";
        hero.defencepower = 200; 
        hero.display();
    }
    
}
