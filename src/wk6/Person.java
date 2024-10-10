package wk6;

/**
 * This is my Person class for your programming needs
 * @author Ben Blanc
 * @since 2024-10-10
 * @version 1.0
 * @implNote This is how you implement the class
 * @implSpec Theses are the requirements of the class
 */

public class Person {

    /** This is the full name of the Person */
    private String name;


    /**
     * This returns the full name of the Person
     * @return full name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter for the name property
     * @param name Full name of the Person
     */
    public void setName(String name) {
        this.name = name;
    }
}
