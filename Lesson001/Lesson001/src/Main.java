/**
 * @author Ilya Kozlov
 * @version 1.0
 */

import app.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class Main class of Application
 */
public class Main {

    /**
     * main() method launches Application
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        User user = new User();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name: ");
            user.name = reader.readLine();
            System.out.println("Enter age: ");
            user.age = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
            System.exit(255);
        }
        User.print(user);
    }
}