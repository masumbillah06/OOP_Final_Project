package Lab_Final_Project;

import java.util.Scanner;

public class ClubAddress implements InputInformation{
    public String clubLocation, clubCity, clubCounty;
    Scanner in = new Scanner(System.in);
    @Override
    public void takeInfo() {
        try {
            System.out.println("\nEnter Information of Club Address: ");
            System.out.print("Enter Club Location: ");
            clubLocation = in.nextLine();
            System.out.print("Enter Club City: ");
            clubCity = in.nextLine();
            System.out.print("Enter Club Country: ");
            clubCounty = in.nextLine();
        }
        catch (Exception e){
            System.out.println("Error!! Wrong Input.");
            System.out.println("Exception Type: "+e);
        }
    }
}

