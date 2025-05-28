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

        // Define constants for animal ages
        // Random age between 1 and 20
        int lionAge = (int) (Math.random() * 20 + 1);
        int elephantAge = (int) (Math.random() * 20 + 1);
        int penguinAge = (int) (Math.random() * 20 + 1);
        int pigAge = (int) (Math.random() * 20 + 1);

        // Create an array of Animal objects with different species and ages
        Animal[] animals = {

            // Create instances of different animal species
            new Lion(lionAge),
            new Elephant(elephantAge),
            new Penguin(penguinAge),
            new Pig(pigAge)
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
            animal.pause();
            animal.sleep();
            animal.pause();
            animal.sound();
            animal.pause();
            animal.eat();
            animal.pause();
            System.out.println();
        }

        // Call the competition method
        Animal.competition();

        // Go through each animal in the array and call their sleep method
        for (Animal animal : animals) {
            animal.pause();
            animal.sleep();
        }

        // Display conclusion message
        System.out.println();
        System.out.println(
                "All animals are asleep after a long day of competition."
            );
        }
    }
