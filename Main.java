import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner scanner;
    static CoffeeMachines inventory = new CoffeeMachines(new Machine[]{
        new Machine("Espresso Machine", 45, 35, 1),
    });

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        boolean isInputting = true;
        while (isInputting) {
            System.out.print("Test methods: 1 = Heatup 2 = Brew");
            int userDebugInput = Integer.valueOf(scanner.nextLine());
            System.out.println("You chose: " + userDebugInput);
            if (userDebugInput == 1){
                Machine.startHeatUp();
            }
        }
    }
}
