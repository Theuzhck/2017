
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maril
 */
public class Inventario {
    private ArrayList<Item> inventario; 
    
    public Inventario(){
        inventario = new ArrayList();
    }
    public int tamanho(){
        return inventario.size();
    }
    public void inserir(Item item){
        inventario.add(item);
    }
    public void remover(int tipo){
        for(int i=0; i<inventario.size(); i++){
            if(inventario.get(i).getTipo()==tipo){
                inventario.remove(i);
                break;
            }
        }
    }
    public Item pesquisar(int i){
        return inventario.get(i);
    }
    public int listarporcaovida(){
        int quant=0;
        for(int i=0;i<inventario.size(); i++){
            System.out.print(i+ " ");
            if (inventario.get(i).getTipo()==0){
                quant++;
            }
        }
        return quant;
    }
    public int listarporcaomana(){
        int quant=0;
        for(int i=0;i<inventario.size(); i++){
            System.out.print(i+ " ");
            if (inventario.get(i).getTipo()==1){
                quant++;
            }
        }
        return quant;
    }
}
