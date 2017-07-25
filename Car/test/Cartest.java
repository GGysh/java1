 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Education Unlmited
 */
public class Cartest {
    
    public Cartest() {
        double e = .0000000001;
        Car c = new Car("THE KING", "PG ONE", 2017);
        
        @Test 
        public void makeGetterTest(){
           assertEquals(c.getmake(),"THE KING" , e);
    }
        
        @Test 
        public void makeGetterTest(){
            c.setMake("PG ONE");  
        assertEquals(c.getmake(),"PG ONE";
        
        @Test 
        public void makeGetterTest(){
    }
        
    }
    }
    
}
