// This is the pig subclass of the Animal class
// The pig subclass inherits properties and methods from the Animal superclass
public final class Pig extends Animal {

    /**
    * Constructor for the Pig class.
    *
    * @param age The age of the pig.
    */
    public Pig(final int age) {

        // Call the constructor of the Animal superclass
        super(age, "pig", false, false, "oink");
    }

    /**
     * This method simulates the pig eating.
     */
    @Override
    public void eat() {
        System.out.print("The pig eats insects and plants for");
        System.out.println(" breakfast to prepare for the competition.");
    }

    /**
     * This method simulates the pig making a sound.
     */
    @Override
    public void sound() {
        System.out.println("The pig oinks!");
    }
}
