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
public class Car {
   
    int carNum;
    static int carName;

    public Car() {
        
        InnerClasses.staticCheck();
        
        InnerClasses obj = new InnerClasses();
        obj.simpleCheck();
    }
    
}
class My{
    
    
}
