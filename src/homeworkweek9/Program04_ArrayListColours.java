package homeworkweek9;

import java.util.ArrayList;

/**Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.
 */
public class Program04_ArrayListColours {
    public static void main(String[] args) {
        //Declaring ArrayList
        ArrayList<String> colours=new ArrayList<>();

        //adding elements to Arraylist
        colours.add("Red");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Blue");
        colours.add("Purple");
        colours.add("Pink");
        colours.add("Orange");

        //for--- each loop to print ArrayList elements
        System.out.println("Arraylist Elements are: ");
        for(String i:colours){
            System.out.println(i);
        }
    }
}
