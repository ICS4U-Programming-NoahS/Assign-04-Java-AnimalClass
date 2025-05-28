/**
* The animal program has an animal superclass and animal subclasses.
* It creates instances of each animal subclass and calls their methods.
* The program will:
* Create instances of Lion, Elephant, Pig, and Penguin.
* Call the info, sleep, sound, and eat methods for each animal.
* Display the competition results based on a random number.
* Call the sleep method for each animal again.
* Display a conclusion message.
*
* @version 1.0
* @since 2025-05-25
*/

// This is the lion subclass of the Animal class
// The lion subclass inherits properties and methods from the Animal superclass
// Sources:
// https://www.w3schools.com/java/java_polymorphism.asp
// https://www.w3schools.com/java/java_inheritance.asp
public class Lion extends Animal {

    /**
    * Constructor for the Lion class.
    *
    * @param age The age of the lion.
    */
    public Lion(final int age) {
        // Call the constructor of the Animal superclass
        super(age, "lion", true, false, "roar");
    }
}
