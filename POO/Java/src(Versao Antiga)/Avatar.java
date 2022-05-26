/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel Of Dead
 */
public class Avatar extends Ser{
    private int lucky;
    private String classe;
    private int limitlife;
    private int limitmp;
    private int mp;
    private Inventario inventario;
    
    public Avatar(String nick,String classe, int life,int atk, int def, int lucky, int mp) {
        super(nick, life, atk, def);
        this.lucky=lucky;
        this.classe=classe;
        this.limitlife=life;
        this.limitmp=mp;
        this.mp=mp;
        this.inventario = new Inventario();
    } 

    public int getLucky() {
        return lucky;
    }

    public void setLucky(int lucky) {
        this.lucky = lucky;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getLimitlife() {
        return limitlife;
    }

    public void setLimitlife(int limitlife) {
        this.limitlife = limitlife;
    }

    public int getLimitmp() {
        return limitmp;
    }

    public void setLimitmp(int limitmp) {
        this.limitmp = limitmp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    
    
    
    
    @Override
    public int attack(){
        int atkBase,damage;
        float bonus;
        RandomNum randomGenerator = new RandomNum();
        atkBase=super.getAtk();
        bonus = (float)(randomGenerator.throwMax(100)+lucky); // Numero randomico entre 1 e 100 + sorte 
        bonus=(bonus/100);  // Numero randomico se transforma em 0.58/ 0.98 / 1.10
        bonus++; // Numero randomico se transforma em 1.58/1.98/2.10
        damage=(int)(atkBase*bonus);
        return damage;
    }   
    
}
