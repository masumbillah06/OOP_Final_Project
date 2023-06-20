package Lab_Final_Project;
import java.util.Scanner;
public class PlayerInfo implements  InputInformation{
    Scanner in = new Scanner(System.in);
    static int i = 1;
    String name, playPosition, playingStyle, strongFoot;
    int age, durationContract, shirtNo;
    double salary, marketValue, height, weight;
    @Override
    public void takeInfo() {
        try {
            System.out.print("\nEnter Address for player no : "+i);
            System.out.print("\nEnter Name: ");
            name = in.nextLine();
            System.out.print("Enter Age: ");
            age = in.nextInt();
            System.out.print("Enter Shirt No: ");
            shirtNo = in.nextInt();
            System.out.print("Enter the Market Value (in millions): ");
            marketValue = in.nextDouble();
            System.out.print("Enter Height (cm): ");
            height = in.nextDouble();
            System.out.print("Enter Weight (kg): ");
            weight = in.nextDouble();
            System.out.print("Enter Contract Duration (months): ");
            durationContract = in.nextInt();
            System.out.print("Enter Salary (in millions): ");
            salary = in.nextDouble();
            in.nextLine();
            System.out.print("Enter the playing position: ");
            playPosition = in.nextLine();
            System.out.print("Enter the playing Style: ");
            playingStyle = in.nextLine();
            System.out.print("Enter the Strong Foot: ");
            strongFoot = in.nextLine();
        }
        catch (Exception e){
            System.out.println("Error!! Wrong Input.");
            System.out.println("Exception Type: "+e);
        }
        i++;
    }
}

