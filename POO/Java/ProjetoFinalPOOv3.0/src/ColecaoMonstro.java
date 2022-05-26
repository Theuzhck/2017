
import java.io.Serializable;
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
public class ColecaoMonstro implements Serializable{
    private ArrayList<Monstro> lista;

    public ColecaoMonstro() {
        lista = new ArrayList<Monstro>();
    }
    
    public void inserir(Monstro monstro){
        lista.add(monstro);
    }
    public void remover(int i){
        lista.remove(i);
    }
    public Monstro pesquisar(int i){
        return lista.get(i);
    }
    
    
}
