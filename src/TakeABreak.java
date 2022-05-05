import java.util.*;

public class TakeABreak {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to take a break?");
            String input = s.nextLine();

            if (input.equals("yes")) {
                break;
            }
        }
        s.close();
    }
 
}
