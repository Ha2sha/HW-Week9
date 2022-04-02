package homeworkweek9;

import java.util.ArrayList;

/*Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Program07_IsEmptyArrayList {
    public static void main(String[] args) {
        //Declaring ArrayList
        ArrayList<String> tubeName=new ArrayList<>();
        tubeName.add("Jubilee");
        tubeName.add("Metropolitan");
        tubeName.add("Circle");
        tubeName.add("Northen");
        tubeName.add("Hammersmith & City");
        tubeName.add("Bakerloo");
        tubeName.add("Picadilly");
        tubeName.add("Victoria");
        tubeName.add("Waterloo");
        tubeName.add("District");
        tubeName.add("Central");

        //Checking ArrayList is empty or not
        System.out.println(tubeName.isEmpty());//false

    }
}
