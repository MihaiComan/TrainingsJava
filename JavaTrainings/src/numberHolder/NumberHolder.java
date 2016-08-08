package numberHolder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mihai
 */
public class NumberHolder {
    
    public int anInt;

    public float aFloat;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NumberHolder n = new NumberHolder();
        
        n.aFloat = (float) 123;
        n.anInt = 123;
        
        System.out.println("The integer value of n is :" + n.anInt);
        System.out.println("The float value of n is :" + n.aFloat);
  
        }
    
}
