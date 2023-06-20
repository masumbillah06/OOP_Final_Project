package Lab_Final_Project;
import java.util.Scanner;
public class PlayerRecords implements InputInformation{
    static int i = 1;
    Scanner in = new Scanner(System.in);
    int goals,assists,goalContribution, matches;
    double goalRatio, assistsRatio, contributionRatio;
    @Override
    public void takeInfo() {
        try{
            System.out.print("\nEnter the Game Record for player no : "+i);
            System.out.print("\nEnter number of Matches: ");
            matches = in.nextInt();
            System.out.print("Enter Goals: ");
            goals = in.nextInt();
            System.out.print("Enter Assists: ");
            assists = in.nextInt();
            in.nextLine();
            this.goalContribution = goals + assists;
            this.goalRatio = (double)goals/(double)matches;
            this.assistsRatio = (double)assists/(double)matches;
            this.contributionRatio = (double)goalContribution/(double)matches;
        }
        catch (Exception e){
            System.out.println("Error!! Wrong Input.");
            System.out.println("Exception Type: "+e);
        }
        i++;
    }
}

