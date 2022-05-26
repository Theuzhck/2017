
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theuz
 */
public class MainImpressora {
    public static void main(String[] args) {
        try{
            Impressora imp = new Impressora("Impressora", 124, "Impressora qlq", "AS123", "Multifuncional", 10, true);
            System.out.println(imp.toString());
            imp.aumentaEstoque(20);
            System.out.println(imp.toString());
            imp.diminueEstoque(15);
            System.out.println(imp.toString());
            imp.diminueEstoque(15);
            System.out.println(imp.toString());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
