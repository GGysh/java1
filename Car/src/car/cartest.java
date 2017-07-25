/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Education Unlmited
 */
public class cartest {
 public static void main(String[] args) {
    String make1 = "Toyota";
    String model1 = "Camry";
    int year1 = 1999;
    String nickName1 = "noun ";
    String color1 = "blue and black";
    int yearsOwned1 = 4;
    double miles1 = 50000;
    Car car1 = new Car(make1, model1, year1, nickName1, color1, yearsOwned1, miles1);

    System.out.println(

    "Car 1: " + car1.getMake() + " " + car1.getModel() + " and from " + car1.getYear() + "the name is " + car1.getNickName() + "it's" +car1.getColor()+"." + 
               "i owned it for " + car1.getYearsOwned() + "years," + "i drive it for " + car1.getMiles() + "miles");
       
    car1.turnOn ();

    car1.turnOff ();

    car1.turnOff ();
    
    
    String make2 = "THE KING";
    String model2 = "PG ONE";
    int year2 = 2017;
    String nickName2 = "NO ONE ";
    String color2 = "black";
    int yearsOwned2 = 0;
    double miles2 = 10;
    Car car2 = new Car(make2, model2, year2, nickName2, color2, yearsOwned2, miles2);
    
    
    System.out.println(

    "Car 2: " + car2.getMake() + " " + car2.getModel() + " and from " + car2.getYear() + "the name is " + car2.getNickName() + "it's" +car2.getColor()+"." + 
               "i owned it for " + car2.getYearsOwned() + "years," + "i drive it for " + car2.getMiles() + "miles");
       
    car2.turnOn ();

    car2.turnOff ();

    car2.turnOff ();
    
}
}