// This is the penguin subclass of the Animal class
// The penguin subclass inherits properties and methods
// from the Animal superclass
public final class Penguin extends Animal {

    /**
    * Constructor for the Penguin class.
    *
    * @param age The age of the penguin.
    */
    public Penguin(final int age) {

        // Call the constructor of the Animal superclass
        super(age, "penguin", true, false, "squawk");
    }

    /**
    * This method simulates the penguin eating.
    */
    @Override
    public void eat() {
        System.out.print("The penguin eats fish for breakfast");
        System.out.println(" to prepare for the competition.");
    }

    /**
    * This method simulates the penguin making a sound.
    */
    @Override
    public void sound() {
        System.out.println("The penguin squawks!");
    }
}
