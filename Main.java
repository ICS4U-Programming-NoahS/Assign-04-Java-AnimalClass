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

// This is the main class
public final class Main {

     /**
     * Private constructor to satisfy style checker.
     */
    private Main() {
        // Utility class
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {

        // Create an array of Animal objects with different species and ages
        Animal[] animals = {

            // Create instances of different animal species
            new Lion(5),
            new Elephant(10),
            new Penguin(3),
            new Pig(2)
        };

        // Display welcome message
        System.out.println("Welcome to the Animal Kingdom!");
        System.out.println(
                "Competition day is today, so the animals are getting ready:"
            );
        System.out.println();

        // Go through each animal in the array and call their methods
        for (Animal animal : animals) {
            animal.info();
            animal.sleep();
            animal.sound();
            animal.eat();
            System.out.println();
        }

        // Call the competition method
        Animal.competition();

        // Go through each animal in the array and call their sleep method
        for (Animal animal : animals) {
            animal.sleep();
        }

        // Display conclusion message
        System.out.println();
        System.out.println(
                "All animals are asleep after a long day of competition."
            );
        }
    }
