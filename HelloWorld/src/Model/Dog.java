package Model;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

//inheritance OOP using 'extends'
public class Dog extends Pet{

    public Dog() {
    }

    public Dog(String name, LocalDate dob) {
        super(name, dob);
    }

    //method
    public void bark() {
        System.out.println("Ruff Ruff!");
    }


}
