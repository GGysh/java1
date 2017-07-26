 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import car.Car;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Education Unlmited
 */
public class Cartest {
    
        double e = .0000000001;
        String make1 = "THE KING";
    String model = "Camry";
    int year1 = 1999;
    String nickName1 = "noun ";
    String color1 = "blue and black";
    int yearsOwned1 = 4;
    double miles1 = 50000;
    Car c = new Car(make1, model1, year1, nickName1, color1, yearsOwned1, miles1);
        
        @Test 
        public void makeGetterTest(){
           assertEquals(c.getMake(),"THE KING" , e);
    }
        
        @Test 
        public void makeSetterTest(){
            c.setMake("PG ONE");  
            assertEquals(c.getMake(),"PG ONE");
        
        @Test 
        public void modelSetterTest(){
            c.setmodel("Camry");
            assertEquals(c.getmodel(),"Camry");
    }
        
    }
    }
    
}
