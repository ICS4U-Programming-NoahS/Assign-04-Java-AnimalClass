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

// This is the penguin subclass of the Animal class
// The penguin subclass inherits properties and methods
// from the Animal superclass
public class Penguin extends Animal {

    /**
    * Constructor for the Penguin class.
    *
    * @param age The age of the penguin.
    */
    public Penguin(final int age) {

        // Call the constructor of the Animal superclass
        super(age, "penguin", true, false, "squawk");
    }
}
