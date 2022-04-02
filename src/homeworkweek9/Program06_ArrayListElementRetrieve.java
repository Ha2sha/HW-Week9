package homeworkweek9;

import java.util.ArrayList;//Write a Java program to retrieve an element (at a specified index) from a given array list

public class Program06_ArrayListElementRetrieve {
    public static void main(String[] args) {
        //Declaring Arraylist
        ArrayList<String> city = new ArrayList<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Chennai");
        city.add("Surat");
        city.add("Navsari");
        city.add("Vadtal");
        //printing ArrayList elements
        System.out.println("Arraylist: "+city);

        //Retrieving ArrayList Elements
        System.out.println("Element at Index 1 is:"+ city.get(1));// prints element at index-1 (Mumbai)
        System.out.println("Element at Index 3 is:"+ city.get(3));// prints element at index-3 (Surat)
        System.out.println("Element at Index 5 is:"+ city.get(5));// prints element at index-5 (Vadtal)

    }
}
