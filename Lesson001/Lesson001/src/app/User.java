package app;

import auxiliary.Decorator;

/**
 * Class User specifies user
 * Receives String name and int age as input
 */
public class User {

    public String name;
    public int age;

    /**
     * Standard Constructor
     */
    public User() {
    }

    /**
     * Constructor with input parameters
     * @param name input String name
     * @param age input age
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @see Decorator#decorate(User user)
     * @param user takes User as input
     * Prints information about User
     */
    public static void print(User user) {
        Decorator.decorate(user);
        System.out.println("Have a nice day!");
    }
}
