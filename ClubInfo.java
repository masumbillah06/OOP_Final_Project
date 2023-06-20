package Lab_Final_Project;
import java.util.Scanner;
public class ClubInfo implements InputInformation{
    String  clubName, president; double netWorth;
    int situatedYear, leagueTrophy, UCLTrophy, cupTrophy, otherTrophy;

    @Override
    public void takeInfo() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Club Name: ");
            clubName = in.nextLine();
            System.out.print("Enter Club President Name: ");
            president = in.nextLine();
            System.out.print("Enter Club Situation Year: ");
            situatedYear = in.nextInt();
            System.out.print("Enter Club Net Worth (in billions): ");
            netWorth = in.nextDouble();
            System.out.print("Enter the number of Club League Trophy: ");
            leagueTrophy = in.nextInt();
            System.out.print("Enter the number of Club UCL Trophy: ");
            UCLTrophy = in.nextInt();
            System.out.print("Enter the number of Club Cup Trophy: ");
            cupTrophy = in.nextInt();
            System.out.print("Enter the number of Club Other Trophy: ");
            otherTrophy = in.nextInt();
            in.nextLine();
        }
        catch (Exception e){
            System.out.println("Error!! Wrong Input.");
            System.out.println("Exception Type: "+e);
        }
    }
}


