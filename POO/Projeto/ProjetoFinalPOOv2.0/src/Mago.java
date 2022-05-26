/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maril
 */
public class Mago extends Avatar {
    
    public Mago(String nick, String classe, int life, int atk, int def, int lucky, int mp) {
        super(nick, classe, life, atk, def, lucky, mp);
    }
    
    @Override
    public int usarhabilidade(){
        int damage=0;
         System.out.println("Disparo de Mana!");
         damage=300;
         super.setMp(-30);
        return damage;
    }
    
}
