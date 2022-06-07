import Model.Dog;
import Model.person;

import java.time.LocalDate;

//Hello World Lesson: 0
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World, nice to meet you");

        //creating instance variable (holding objects that are created from Class)
        person tom = new person("Tom", "Smith", LocalDate.of(1984,6,15));
        person janet = new person("Janet", "Jackson", LocalDate.of(1985, 12, 3));

        //method
        tom.setSpouse(janet);

        //ensure getter and setter are created in person for Dog
        Dog fido = new Dog("Fido", LocalDate.of(2018, 1, 1));
        fido.bark();
        tom.setPet(fido);

        //print out variable
        System.out.println(tom);

    }
}

//Object Oriented Programming Lesson: 1
