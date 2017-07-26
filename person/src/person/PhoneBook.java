/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Education Unlmited
 */
public class PhoneBook {
   

    Person[] list;
    int bookLength;

    public PhoneBook() {
        list = new Person[100];
        bookLength = 0;
    }

    public void addPerson(Person z) {
        list[bookLength] = z;
        bookLength++;
    }
    public void printEntries(){
        for (int i = 0 ; i < bookLength; i++){
            System.out.println(list[i].getName()+ " "+list[i].getLastName()+ ", " +list[i].getPhoneNumber());
        }
        
    }
}
