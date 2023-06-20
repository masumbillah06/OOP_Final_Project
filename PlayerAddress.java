package Lab_Final_Project;
import java.util.Scanner;
public class PlayerAddress implements InputInformation{
    Scanner in = new Scanner(System.in);
    static int i = 1;
    private String HouseLocation, ResidentialArea;
    public String city, country, nationality;

    public void setHouseLocation(String houseLocation) {
        this.HouseLocation = houseLocation;
    }
    public void setResidentialArea(String residentialArea) {
        this.ResidentialArea = residentialArea;
    }
    public String getHouseLocation() {
        return HouseLocation;
    }
    public String getResidentialArea() {
        return ResidentialArea;
    }
    @Override
    public void takeInfo() {
        try {
            System.out.print("\nEnter Address for player no : "+i);
            System.out.print("\nEnter the House Location: ");
            HouseLocation = in.nextLine();
            setHouseLocation(HouseLocation);
            System.out.print("Enter the Residential Area: ");
            ResidentialArea = in.nextLine();
            setResidentialArea(ResidentialArea);
            System.out.print("Enter the City: ");
            city = in.nextLine();
            System.out.print("Enter the Country: ");
            country = in.nextLine();
            System.out.print("Enter the Nationality: ");
            nationality = in.nextLine();
        }
        catch (Exception e){
            System.out.println("Error!! Wrong Input.");
            System.out.println("Exception Type: "+e);
        }
        i++;
    }
}


