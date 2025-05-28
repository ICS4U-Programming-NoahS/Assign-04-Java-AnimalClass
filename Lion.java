// This is the lion subclass of the Animal class
// The lion subclass inherits properties and methods from the Animal superclass
// Sources:
// https://www.geeksforgeeks.org/polymorphism-in-java/
// https://www.w3schools.com/java/java_inheritance.asp
public final class Lion extends Animal {

    /**
    * Constructor for the Lion class.
    *
    * @param age The age of the lion.
    */
    public Lion(final int age) {
        // Call the constructor of the Animal superclass
        super(age, "lion", true, false, "roar");
    }

    /**
    * This method simulates the lion eating.
    */
    @Override
    public void eat() {
        System.out.print("The lion eats a steak for breakfast");
        System.out.println(" to prepare for the competition!");
    }

    /**
    * This method simulates the lion making a sound.
    */
    @Override
    public void sound() {
        System.out.println("The lion roars!");
    }
}
