import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Geektrust {
    public static void main(String[] args) {
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                // Split the line into an array of strings using space as a delimiter
                String[] request = line.split(" ");
                MetroCorp.getMetroCorp().processRequest(request);
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
            System.out.println("Exceptionnnnnnnnnn !!!");
        }


    }

    public void readFile(String[] args){



        Trips day1 = new Trips();

        day1.addUser("MC01", 600);
        day1.addUser("MC02", 500);
        day1.addUser("MC03", 50);
        day1.addUser("MC04", 50);
        day1.addUser("MC05", 200);

        day1.addTrip("MC01", PasangerType.ADULT, Station.CENTRAL);
        day1.addTrip("MC02", PasangerType.SENIOR_CITIZEN, Station.CENTRAL);
        day1.addTrip("MC01", PasangerType.ADULT, Station.AIRPORT);
        day1.addTrip("MC03", PasangerType.KID, Station.AIRPORT);
        day1.addTrip("MC04", PasangerType.ADULT, Station.AIRPORT);
        day1.addTrip("MC05", PasangerType.KID, Station.AIRPORT);

        System.out.println(Station.CENTRAL);
        System.out.println(Station.AIRPORT);
    }
}