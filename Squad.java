package Lab_Final_Project;

import java.util.ArrayList;
public class Squad implements DisplayInformation{
    String managerName;
    String captain;
    ArrayList<String> squadPlayers ;
    public Squad(String managerName, ArrayList<String>squadPlayers){
        this.managerName = managerName;
        this.squadPlayers = squadPlayers;
        this.captain = squadPlayers.get(0);
    }
    @Override
    public void showInfo() {
        System.out.println("\n--------------------------INFORMATION OF THE SQUAD-------------------------");
        System.out.println("Squad Manager Name is: "+managerName);
        System.out.println("Squad Captain Name is: "+captain);
        System.out.println();
        System.out.println("Squad Players are: ");
        for (String name : squadPlayers){
            System.out.println(name);
        }
    }
}

