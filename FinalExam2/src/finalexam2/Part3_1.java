/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam2;

/**
 *
 * @author emann
 */
public class Part3_1 {
    
    public int calculateNet(int hours, int rate, int tax){
        
        int gross = hours * rate;
        
        int net = gross - tax;
        
        return net;
        
    }
    
}
