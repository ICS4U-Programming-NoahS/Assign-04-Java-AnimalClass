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

// This is the elephant subclass of the Animal class
// The elephant subclass inherits properties
// and methods from the Animal superclass
public class Elephant extends Animal {

    /**
    * Constructor for the Elephant class.
    *
    * @param age The age of the elephant.
    */
    public Elephant(final int age) {

        // Call the constructor of the Animal superclass
        super(age, "elephant", false, true, "trumpet");
    }
}
