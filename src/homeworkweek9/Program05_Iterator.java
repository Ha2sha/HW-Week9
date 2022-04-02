package homeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

/**Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Program05_Iterator {
    public static void main(String[] args) {
        //Declaring ArrayList
        ArrayList<String> fruits=new ArrayList<>();

        //Adding elements to ArrayList
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Strawberry");
        fruits.add("Blackberry");

        System.out.println("ArrayList Elements are:");

        //using Iterator for printing ArrayList elements
        Iterator itr=fruits.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
