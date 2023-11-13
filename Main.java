import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner scanner;
    static CoffeeMachines inventory = new CoffeeMachines(new Machine[]{
        new Machine("Rusty Espresso Machine", 45, 35, 0, 1),
        new Machine("Old Espresso Machine", 35, 25, 50, 2),
    });
}
