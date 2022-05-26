
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel Of Dead
 */
public class Item {
    private int tipo;
    private Avatar player;
    private boolean utilizada;

    public Item(int tipo) {
        this.setTipo(tipo);
        this.setUtilizada(false);
    }



    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


    public boolean getUtilizada() {
        return utilizada;
    }

    public void setUtilizada(boolean utilizada) {
        this.utilizada = utilizada;
    }
    
    public void usarPocao(Avatar player){
        switch(this.getTipo()){
            case 0:
                if (this.getUtilizada()==false && player.getLife()!= player.getLimitlife()){
                    player.setLife(player.getLimitlife());       
                    System.out.println("Parabêns vc utilizou uma porcao de vida");
                    player.getInventario().remover(0);
                }
            break;
            case 1:
                if (this.getUtilizada()==false && player.getMp()!= player.getLimitmp()){
                    player.setMp(player.getLimitmp());       
                    System.out.println("Parabêns vc utilizou uma porcao de mana");
                    player.getInventario().remover(1);
                }
                break;
        }
        this.setUtilizada(true);
    }
    public void guardarinventario(Avatar player, Room sala){
            player.getInventario().inserir(this);
            System.out.println("Você encontrou uma porção e ela está no seu inventário");
            sala.setExisteporcao(false);
    }
    
    public void imprime(){
        if(tipo==1){
            System.out.println("Porção da vida");
        }
        else if(tipo==2){
            System.out.println("Porção de Mana");
        }
        else{
            System.out.println("Sem poções!");
        }
            
    }

   
    
}
