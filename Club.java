package Lab_Final_Project;
public class Club implements DisplayInformation{
    ClubAddress clubAddress;
    ClubInfo clubInfo;
    public Club(ClubInfo clubInfo,ClubAddress clubAddress){
        this.clubAddress = clubAddress;
        this.clubInfo = clubInfo;
    }
    public ClubInfo getClubInfo(){
        return clubInfo;
    }
    public ClubAddress getClubAddress() {
        return clubAddress;
    }
    @Override
    public void showInfo() {
        System.out.println("\n--------------------------INFORMATION OF THE CLUB------------------------");
        System.out.println("Club Name: "+getClubInfo().clubName);
        System.out.println("Club President Name: "+getClubInfo().president);
        System.out.println("Club was Situated in: "+getClubInfo().situatedYear);
        System.out.println("Club Net Worth: "+getClubInfo().netWorth);
        System.out.println("Club League Trophies: "+getClubInfo().leagueTrophy);
        System.out.println("Club UCL Trophies: "+getClubInfo().UCLTrophy);
        System.out.println("Club Cup Trophies: "+getClubInfo().cupTrophy);
        System.out.println("Club Other Trophies: "+getClubInfo().otherTrophy);

        System.out.println("\nHere is the Address of the Club:");
        System.out.println("Club Location: "+getClubAddress().clubLocation);
        System.out.println("Club City: "+getClubAddress().clubCity);
        System.out.println("Club Name: "+getClubAddress().clubCounty);
    }
}

