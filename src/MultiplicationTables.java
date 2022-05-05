import java.util.*;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");

        int num = scanner.nextInt();

        for(int i = 1; i < 11; i++) {
            int total = num * i;
            System.out.println(total);
        }
        scanner.close();
    }
}
