
import java.util.ArrayList;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theuz
 */
public class ColecaoSala implements Serializable{
     private ArrayList<Room> lista;

    public ColecaoSala() {
        lista = new ArrayList<Room>();
    }
    
    public void inserir(Room sala){
        lista.add(sala);
    }
    public void remover(int i){
        lista.remove(i);
    }
    public Room pesquisar(int i){
        return lista.get(i);
    }
}
