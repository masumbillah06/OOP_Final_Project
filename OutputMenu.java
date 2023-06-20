package Lab_Final_Project;
import java.util.Scanner;
public class OutputMenu {
    public static int outputOption(){
        Scanner in = new Scanner(System.in);
            int n;
            System.out.println("\n\n----------------------SEE INFORMATION--------------------");
            System.out.println("1. See Club Information.");
            System.out.println("2. See Player Information.");
            System.out.println("3. See Squad Information.");
            System.out.println("0. Press 0 to Exit.\n");
            System.out.print("Choose Option: ");
            n = in.nextInt();
            return n;
    }
}

