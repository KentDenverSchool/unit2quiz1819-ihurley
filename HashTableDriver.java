import java.util.HashMap;

/**
 * Name: Izzy Hurley
 * Lab Name: HashTableDriver
 * Lab Purpose: The goal of HashTableDriver is to create a program
 * Date: 10/2/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class HashTableDriver {
    public static void main(String[] args) {
        HashTable dict = new HashTable(6);
        System.out.println("Get from an empty table expected result = null");
        System.out.println(dict.get("lemon"));
        System.out.println("Put one = the first number");
     dict.put("one","the first number");
        System.out.println("Print get(one) expected result  = the first number");
        System.out.println(dict.get("one"));
        System.out.println("Put lemons = sour fruit");
        dict.put("lemons","sour fruit");
        System.out.println("print the size expected result = 2 "+ dict.getSize());
        System.out.println("print the size of the dict expected result = 6 "+ dict.getM());
        System.out.println("put 3 more items for a total of 5 in the dict");
        dict.put("lemon","yellow");
        dict.put("strawberry","red fruit");
        dict.put("computer","cool device");
        System.out.println("print size expected result = 5"+ dict.getSize());
        System.out.println("print the size of the dict should resize and be 12 "+dict.getM());


    }
}
