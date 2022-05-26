
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
public class RandomNum {
    public int throwMax(int max){
        int num=throwMinMax(50, max);
        return num;
    }
    
    public int throwMinMax(int min, int max){
        Random randomGenerator = new Random();
        int num = min+randomGenerator.nextInt(max-min); 
        return num;
    }
}
