package Model;

import java.time.LocalDate;
import java.time.Period;

public class person {
    private String firstName;
    private String LastName;
    private LocalDate dob;
    //generate new class for Address
    private Address address;
    private person spouse;
    private Pet pet;

//generate constructor

    public person getSpouse() {
        return spouse;
    }

    public void setSpouse(person spouse) {
        this.spouse = spouse;
    }

    public person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        LastName = lastName;
        this.dob = dob;
    }

//generate getter and setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    //generate a toString() to create an Override that allows for printing to give expected results
    @Override
    public String toString() {
        return "person{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", spouse=" + spouse +
                ", pet=" + pet +
                '}';
    }
}
