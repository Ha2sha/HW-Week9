package homeworkweek9;

import java.util.Scanner;

/**
 * Write the programme that tell you which line pass through particular stations. Just use Zone 1 stations name.
 * A to G stations
 */
public class Program10_UndergroundStation {
    public static void main(String[] args) {
        //Zone1 Stations
        String station[] = {"Aldgate", "Aldgate East", "Angel", "Baker Street", "Bank", "Barbican", "Bayswater", "Blackfriars", "Bond Street",
                "Borough", "Cannon Street", "Chancery Lane", "Charing Cross", "Covent Garden", "Earl's Court", "Edgware Road", "Embankment",
                "Euston", "Euston Square", "Farringdon", "Gloucester Road", "Goodge Street", "Great Portland Street", "Green Park"};

        //Multidimensional Array for Tube line & Stations
        String line[][] = new String[11][13];

        line[0][0] = "Bakerloo Line";
        line[0][1] = "Baker Street";
        line[0][2] = "Charing Cross";
        line[0][3] = "Edgware Road";
        line[0][4] = "Elephant & Castle";
        line[0][5] = "Embankment";

        line[1][0] = "Circle Line";
        line[1][1] = "Aldgate";
        line[1][2] = "Baker Street";
        line[1][3] = "Barbican";
        line[1][4] = "Bayswater";
        line[1][5] = "Blackfriars";
        line[1][6] = "Cannon Street";
        line[1][7] = "Edgware Road";
        line[1][8] = "Embankment";
        line[1][9] = "Euston Square";
        line[1][10] = "Farringdon";
        line[1][11] = "Gloucester Road";
        line[1][12] = "Great Portland Street";

        line[2][0] = "Distict Line";
        line[2][1] = "Bayswater";
        line[2][2] = "Blackfriars";
        line[2][3] = "Cannon Street";
        line[2][4] = "Earl's Court";
        line[2][5] = "Edgware Road";
        line[2][6] = "Embankment";
        line[2][7] = "Gloucester Road";

        line[3][0] = "Hammersmith & City Line";
        line[3][1] = "Baker Street";
        line[3][2] = "Aldgate East";
        line[3][3] = "Barbican";
        line[3][4] = "Edgware Road";
        line[3][5] = "Euston Square";
        line[3][6] = "Farringdon";
        line[3][7] = "Great Portland Street";

        line[4][0] = "Central Line";
        line[4][1] = "Bank";
        line[4][2] = "Bond Street";
        line[4][3] = "Chancery Lane";

        line[5][0] = "Northen Line";
        line[5][1] = "Angel";
        line[5][2] = "Bank";
        line[5][3] = "Borough";
        line[5][4] = "Charing Cross";
        line[5][5] = "Elephant& Castle";
        line[5][6] = "Embankment";
        line[5][7] = "Euston";
        line[5][8] = "Goodge Street";

        line[6][0] = "Piccadilly Line";
        line[6][1] = "Covent Garden";
        line[6][2] = "Earl's Court";
        line[6][3] = "Gloucester Road";
        line[6][4] = "Green Park";

        line[7][0] = "Victoria";
        line[7][1] = "Euston";
        line[7][2] = "Green Park";

        line[8][0] = "Waterloo & City";
        line[8][1] = "Bank";

        line[9][0] = "Jubilee";
        line[9][1] = "Baker Steet";
        line[9][2] = "Bond Steet";
        line[9][3] = "Green Park";

        line[10][0] = "Metropolitan";
        line[10][1] = "Aldgate";
        line[10][2] = "Baker Street";
        line[10][3] = "Barbican";
        line[10][4] = "Euston Square";
        line[10][5] = "Farringdon";
        line[10][6] = "Great Portland Street";

        //Declaration of Scanner for reading input from console
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Tube Station Name between A to G in Zone1: ");
        String s = scr.nextLine();
        String c = "";
        //for loop for checking station in zone 1 or not
        for (int i = 0; i < station.length; i++) {
            if (s.equalsIgnoreCase(station[i])) {
                c = station[i];
            }
        }

        //reading multidimensional array & checking lines passing through station as per user input
        if (s.equalsIgnoreCase(c)) {
            System.out.println(s + " station is in Zone 1");
            System.out.println("Lines Passing through station " + s + " are: ");
            System.out.println("_______________________________________________");

            for (int i = 0; i < line.length; i++) {
                for (int j = 0; j <= line.length; j++) {
                    if (s.equalsIgnoreCase(line[i][j])) {
                        System.out.println(line[i][0]);
                    }
                }
            }
        } else {
            System.out.println(s + " Station is not in Zone 1");
        }
    }
}
