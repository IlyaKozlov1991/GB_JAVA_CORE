package auxiliary;

import app.User;

public class Decorator {

    public Decorator() {
    }

    /**
     * Decorates outputs pattern with specified format
     * @param user takes User as input
     */
    public static void decorate(User user) {
        System.out.println("Hello, " + user.name + String.format(". Your age is %d",user.age));
    }
}
