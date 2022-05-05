import java.util.*;

public class CoutToEleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number less than 11");

            int number = input.nextInt();

            if (number <= 11) {
                for(; number < 12; number++) {
                    System.out.println(number);
                }
                break;
            }
        }
    }
}
