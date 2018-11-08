import java.util.ArrayList;
import java.util.Collection;

/**
 * Name: Izzy Hurley
 * Lab Name: HashTable
 * Lab Purpose: The goal of HashTable is to create a program
 * Date: 10/2/18
 * Collaborators: None
 * ON MY HONOR: IH
 */
import java.util.ArrayList;
/* Which is a better hashfunction:
 x % n where n is a large number with several factors
 x % n where n is a large prime number Prove your answer with a simple example.
          where x%n is large prime number better hash fucntion is created because it will re
            result in many fewer collisions

            61%12 = 1               60%12 = 0
            67%12 = 7               62%12 = 2 \_
            71%12 = 11              74%12 = 2 / THESE ARE THE SAME
PRIMES DO NOT RETURN THE SAME

Is char values summed % 599 a good hash function for strings? Why or why not?
- 599 is prime but it will return a predictable function and result in collisions for words containing the same charectars(regardless of order)
or will result in the same value with the same chars doubled

You take the result of each character snd multiply it by 31 and then add it to the total result
 for (Object element : a)
            result = 31 * result + (element == null ? 0 : element.hashCode());

        return result;


 */


public class HashTable {
   private ArrayList [] a;
   private int m;
   private int size;

    public HashTable(int capacity){
      m =  capacity;
      size = 0;
         a = new ArrayList[capacity];
         for (int i= 0; i<m; i++){
             a[i] = new ArrayList();
         }
    }



    public void resize(int newM){
        m = newM;
      ArrayList [] n = new  ArrayList[m];
        for (int i = 0; i< a.length; i++){
           int index = a[i].get(0).hashCode();
           n[index]= a[i];
        }

    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    //each arrayList.get(0) = first key
    // even indecise of the arraylist are keys
    //odd indexes of the arrayList are values
    public void put(String key, String value){
        int index = hashCode(key);
size++;
       a[index].add(key);
       a[index].add(value);

if ((size/m)*100>80){resize(m*2);}
    }


    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        int index = hashCode(key);
        String r = "";
       for (int i = 0; i< a[index].size(); i+=2){
           if (a[index].equals(key)){return (String)a[index].get(i+1);} // return subsequent key value
           else { r = "Not a Valid Key";}
           }
        return r;
    }

    public int getM(){return m;}
    public int getSize(){return size;}

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key){
       return key.hashCode()%m;
    }


}
