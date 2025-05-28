// This is the elephant subclass of the Animal class
// The elephant subclass inherits properties
// and methods from the Animal superclass
public final class Elephant extends Animal {

    /**
    * Constructor for the Elephant class.
    *
    * @param age The age of the elephant.
    */
    public Elephant(final int age) {

        // Call the constructor of the Animal superclass
        super(age, "elephant", false, true, "trumpet");
    }

    @Override
    public void eat() {
        System.out.print("The elephant eats plants for breakfast");
        System.out.println(" to prepare for the competition.");
    }

    @Override
    public void sound() {
        System.out.println("The elephant trumpets!");
    }
}
