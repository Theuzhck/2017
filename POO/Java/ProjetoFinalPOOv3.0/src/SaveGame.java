
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theuz
 */
public class SaveGame {

    public SaveGame() {
    }
    
     public void escritor(Avatar player, ColecaoRoom salas, ColecaoMonstro monstros){
        try {
                    FileOutputStream outFileStream = new FileOutputStream("save.data");
                    ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);
                    outObjectStream.writeObject(player);
                    outObjectStream.writeObject(salas);
                    outObjectStream.writeObject(monstros);
                    outObjectStream.flush();
                    outObjectStream.close();
                } catch (Exception ex) {
                    ex.toString();
                }
    }
    
    public void leitor(){
        try {
                   FileInputStream inFileStream = new FileInputStream("save.data");
                    ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);
                    Avatar jogador = (Avatar) inObjectStream.readObject();
                    ColecaoRoom salas = (ColecaoRoom) inObjectStream.readObject();
                    ColecaoMonstro monstros = (ColecaoMonstro) inObjectStream.readObject();
                    
                    System.out.println(jogador);
                    System.out.println(salas);
                    System.out.println(monstros);
                    
                    TelaRoom tela = new TelaRoom(jogador, salas, monstros);
                    tela.setVisible(true);
                    

                    
                            
                } catch (ClassNotFoundException ex) {
                    System.out.println("A classe buscada não foi encontrada ");
                } catch (FileNotFoundException ex){
                    System.out.println("O arquivo não foi encontrado");
                }catch (IOException ex){
                    System.out.println(ex.toString());
                }catch (NullPointerException e){
                    System.out.println(e.toString());
                }catch (Exception e){
                    System.out.println(e.getCause());
                }
    }
}
