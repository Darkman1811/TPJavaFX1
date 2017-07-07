/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author super
 */
public class Personne {
    private StringProperty firstName= new SimpleStringProperty(this, "firstName", "");

    //Return the StringProperty Object
    public StringProperty firstNameProperty(){
        return firstName;
    }
    
    //Return the firestname value (String)
    public String getFirstName() {
        return firstName.get();
    }

    //Sets the first name value from string to StringProperty object
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
    
    
}
