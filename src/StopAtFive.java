import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int number = input.nextInt();

            if (number == 5) {
                break;
            }
        }
        input.close();
    }
}
