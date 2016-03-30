/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

/**
 *
 * @author aniruddha
 */
public class InnerClasses {

    int carNum;
    static int carName;

    public InnerClasses() {
        
        carNum = 50;
    }
    
    
    
    void simpleCheck(){
        
        carName = 50;
        
    }
    
    static void staticCheck(){
        
    }
   
    public static void main(String[] args) {
        
       carName = 10;
    }
}
