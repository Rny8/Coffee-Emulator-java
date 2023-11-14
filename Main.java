import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        boolean isInputting = true;
        while (isInputting) {
            System.out.print("Test methods: 1 = Heatup 2 = Brew: ");
            int userDebugInput = Integer.valueOf(scanner.nextLine());
            System.out.println("You chose: " + userDebugInput);
            if (userDebugInput == 1){
                Machine.startHeatUp();
            }
            if (userDebugInput == 2) {
                Machine.StartBrew(12);
            }
        }
    }
}
