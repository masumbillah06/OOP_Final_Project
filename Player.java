package Lab_Final_Project;
public class Player implements  DisplayInformation{
    PlayerInfo playerInformation;
    PlayerAddress playerAddress;
    PlayerRecords playerRecords;
    static int n = 1;
    public Player(PlayerInfo playerInfo, PlayerAddress playerAddress, PlayerRecords playerRecords) {
        this.playerInformation = playerInfo;
        this.playerAddress = playerAddress;
        this.playerRecords = playerRecords;
    }
    public PlayerAddress getPlayerAddress() {
        return playerAddress;
    }
    public PlayerInfo getPlayerInformation() {
        return playerInformation;
    }
    public PlayerRecords getPlayerRecords() {
        return playerRecords;
    }
    @Override
    public void showInfo() {
        System.out.println("\nHere is information for Player No: "+n);
        System.out.println("Player Name: "+getPlayerInformation().name);
        System.out.println("Player Age: "+getPlayerInformation().age);
        System.out.println("Player Market Value: "+getPlayerInformation().marketValue);
        System.out.println("Player Height: "+getPlayerInformation().height);
        System.out.println("Player Weight: "+getPlayerInformation().weight);
        System.out.println("Player Contract Duration: "+getPlayerInformation().durationContract);
        System.out.println("Player Playing position: "+getPlayerInformation().playPosition);
        System.out.println("Player Playing Style: "+getPlayerInformation().playingStyle);
        System.out.println("Player Strong Foot: "+getPlayerInformation().strongFoot);
        System.out.println("Player Shirt NO: "+getPlayerInformation().shirtNo);

        System.out.println("\nHere is the Address of the Player: "+n);
        System.out.println("Player House Location: "+ getPlayerAddress().getHouseLocation());
        System.out.println("Player Residential Area: "+ getPlayerAddress().getResidentialArea());
        System.out.println("Player City Name: "+ getPlayerAddress().city);
        System.out.println("Player Country Name: "+ getPlayerAddress().country);
        System.out.println("Player Nationality: "+ getPlayerAddress().nationality);

        System.out.println("\nHere is the Record of the Player: "+n);
        System.out.println("Total Match Played: "+getPlayerRecords().matches);
        System.out.println("Total Goals Scored: "+getPlayerRecords().goals);
        System.out.println("Total Assists Provided: "+getPlayerRecords().assists);
        System.out.println("Total Goal Contribution: "+getPlayerRecords().goalContribution);
        System.out.printf("Player Goal Ratio: %.2f \n",getPlayerRecords().goalRatio);
        System.out.printf("Player Assists Ratio: %.2f \n",getPlayerRecords().assistsRatio);
        System.out.printf("Player Goal Contribution Ratio: %.2f \n",getPlayerRecords().contributionRatio);
        n++;
    }
}

