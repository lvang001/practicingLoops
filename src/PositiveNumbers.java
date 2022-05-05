import java.util.*;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.println("Enter a number: ");

            int number = input.nextInt();

            if (number == 0) {
                System.out.println("Process finished wit exit code 0");
                break;
            }
            if (number < 0) {
                System.out.println("Number must be positive");
            }
        }
        input.close();
    }
}