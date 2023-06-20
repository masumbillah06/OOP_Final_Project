package Lab_Final_Project;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n---------------------------ENTER THE INFORMATION OF THE CLUB-------------------------");
        ClubInfo clubInfo = new ClubInfo();
        clubInfo.takeInfo(); //taking basic info of club
        ClubAddress clubAddress = new ClubAddress();
        clubAddress.takeInfo(); //taking address of club
        Club club = new Club(clubInfo,clubAddress);
        //storing them into club named object


        System.out.println("\n\n---------------------------ENTER THE INFORMATION OF PLAYERS-------------------------");
        System.out.print("Enter the number of Players : ");
        int playerNumber = in.nextInt();
        in.nextLine();
        ArrayList<Player> playerList = new ArrayList<>();
        //ArrayList to Store The Information of All Players.

        for (int i=1; i<=playerNumber; i++){
            PlayerInfo playerInfo = new PlayerInfo();
            PlayerAddress playerAddress = new PlayerAddress();
            PlayerRecords playerRecords = new PlayerRecords();

            playerInfo.takeInfo(); // taking basic info of player
            playerAddress.takeInfo(); // taking address of player
            playerRecords.takeInfo(); // taking records of player

            Player player = new Player(playerInfo,playerAddress,playerRecords);
            //Storing all the information in the player object
            playerList.add(player);
            //Adding Players in the arraylist via this loop.
        }

        System.out.println("\n\n---------------------------ENTER THE INFORMATION OF SQUAD-------------------------");
        System.out.print("Enter the Squad Manager name: ");
        String squadManager = in.nextLine();
        ArrayList<String> squadPlayers = new ArrayList<>();
        //arraylist to take names for squad players
        for(Player player: playerList){
            String n = player.getPlayerInformation().name;
            squadPlayers.add(n);
        }
        Squad squad = new Squad(squadManager,squadPlayers);


        //-------------------------------------------This is Output Section----------------------------------//
        while (true){
            int x = OutputMenu.outputOption();
            if(x==0) break;
            else if(x==1){
                //Now from here all the information of the Club will be displayed.
                club.showInfo(); //showing total club information.
            }
            else if(x==2){
                System.out.println("\n--------------------------INFORMATION OF THE PLAYERS--------------------------");
                for (Player player: playerList){
                    player.showInfo();
                    // showing information of every player.
                }
            }
            else if(x==3){
                squad.showInfo(); //showing squad information.
            }
        }
    }
}

