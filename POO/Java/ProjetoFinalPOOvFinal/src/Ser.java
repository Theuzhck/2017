import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel Of Dead
 */
public class Ser implements Serializable{
    private String nick;
    private int life;
    private int atk;
    private int def;
   
    public Ser(String nick, int life, int atk, int def){
        this.nick=nick;
        this.life=life;
        this.atk=atk;
        this.def=def;
    }

    public String getNick(){
        return nick;
    }
    
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
    public boolean isLife(){
        return (life>1);
    }
    
    public int attack(){
        return atk;
    }
    
    public void takeDamage(int takeDamage){
        takeDamage-=def;
        if(takeDamage>0)
          life-=takeDamage;
    }
    
    public void status(){
        System.out.println(nick+" Life:"+life);
    }
    
}
