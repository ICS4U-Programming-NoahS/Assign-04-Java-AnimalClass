/**
 * This is the animal super class.
 */
public class Animal {

    // Define properties of the animals
    /**
     * Animal age.
     */
    private int age;

    /**
     * Animal species.
     */
    private String species;

    /**
     * Animal diet type.
     */
    private boolean carnivore;

    /**
     * Animal diet type.
     */
    private boolean herbivore;

    /**
     * Animal sound.
     */
    private String sound;

     /**
     * This is the animal constructor.
     *
     * @param animalAge The age of the animal.
     * @param animalSpecies The species of the animal.
     * @param animalCarnivore Whether the animal is a carnivore.
     * @param animalHerbivore Whether the animal is a herbivore.
     * @param animalSound The sound the animal makes.
     */
     public Animal(final int animalAge, final String animalSpecies,
                final boolean animalCarnivore, final boolean animalHerbivore,
             final String animalSound) {

         // Initialize properties of the animal
         this.age = animalAge;
         this.species = animalSpecies;
         this.carnivore = animalCarnivore;
         this.herbivore = animalHerbivore;
         this.sound = animalSound;
     }

     /**
     * Pause method.
     */
    public void pause() {

        try {
            // Wait for 3 seconds (3000 milliseconds)
            // Source:
            //https://medium.com/@adam.rizk9/demystifying-javas-sleep-and-...
            //...wait-methods-a-comprehensive-guide-bcdfeb7b0e22
            Thread.sleep(3000);
        } catch (InterruptedException exception) {

            // Source:
            //https://stackoverflow.com/questions/4906799/why-invoke-thread-...
            //...currentthread-interrupt-in-a-catch-interruptexception-block
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Eat method.
     */
    public void eat() {

        // Default eat method
        System.out.println("The " + species + " is eating.");
    }

    /**
     * Sleep method.
     */
    public void sleep() {

        // Display that the animal is sleeping
        System.out.println("The " + species + " is sleeping.");
    }

    /**
     * Info method.
     */
    public void info() {
        // Display the species and age of the animal
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);

        // Figure out if the animal is a carnivore, herbivore, or omnivore
        // Then display the correct diet info
        if (carnivore) {
            System.out.println("The " + species + " is a carnivore.");
        } else if (herbivore) {
            System.out.println("The " + species + " is an herbivore.");
        } else {
            System.out.println("The " + species + " is an omnivore.");
        }
    }

    /**
     * Sound method.
     */
    public void sound() {

        // Display the sound the animal makes
        System.out.println("The " + species + " " + sound + "s!");
    }

    /**
     * Competition method.
     */
    public static void competition() {

        // generate a random integer between 0 and 4
        // to determine the competition type
        int randomNumber = (int) (Math.random() * 4);

        // Use a switch statement to determine the competition type
        // based on the random number
        // Then display the result of the competition
        switch (randomNumber) {
            case 1:
                System.out.println("It is a running race, the lion wins!");
                break;
            case 2:
                System.out.println("Swimming competition, the penguin wins!");
                break;
            case 3:
                System.out.println("Lifting competition, the elephant wins!");
                break;
            case 4:
                System.out.println("Eating competition, the pig wins!");
                break;
            default:
                System.out.println("There was a storm, no competition today.");
        }

        // new line for better readability
        System.out.println();
    }
}
