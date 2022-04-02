package homeworkweek9;

import java.util.HashMap;
import java.util.Map;

/**Create a HashMap object called people that will store String keys and Integer values:
 * And use for each loop to iterate the value from Map.
 */
 public class Program09_HashMapPeople {
    public static void main(String[] args) {
        //Declaring Map
        Map<String,Integer> people=new HashMap<>();

        //Adding key-value pair to Map (name-age)
        people.put("John",30);
        people.put("Andrew",33);
        people.put("Ian",43);
        people.put("James",24);
        people.put("Tony",52);

        //for each loop to iterate  key-value pair of Map
        for(String i:people.keySet()){
            System.out.println(i + " : "+people.get(i));
        }


    }
}
