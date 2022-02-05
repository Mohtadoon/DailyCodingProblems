package dcp.StreamsPractice.CompactString;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.IntStream;

public class StringOperation {

    static String x = "Nice to meet you";



    public static void main(String[] args) {

        //Create an IntStream  IntStream intStream = x.chars();


        /*(forEach)
        * No return type
        * */
        StringBuilder stringBuilder = new StringBuilder();
        x.chars().forEach(i -> {
            if(i == 'N') return;
            stringBuilder.append((char)i);
        });
        System.out.println("stringBuilder   : " + stringBuilder);

        /*get (distinct) characters from it
        returns byte stream int value of distinct chars (need to type cast to array)
        */
        int[] chars = x.chars().distinct().toArray();
        char[] charArray = new char[chars.length];
        System.out.println(Arrays.toString(chars));  //[78, 105, 99, 101, 32, 116, 111, 109, 121, 117]
                                                     // these ASCII values can be used to compare chars

        // Iterations over chars
        IntStream.range(0, chars.length).forEach(i -> {
            System.out.print(returnInt());
            charArray[i] = (char) chars[i];

        });


        //System.out.println(Arrays.toString(charArray));
        System.out.println(String.valueOf(charArray));


        //(filter) iterates over the string and filters with
        // returns a stream consisting of the elements of this stream that match the given predicate. This is an intermediate operation.
        //filter chars in the string which match some specific char

        //Here we are going to filter char 'e' and 'c' from the String and store it in the int array as ASCII values

        //to check conditionally
        int s[] = x.chars().filter(k -> (k != 'e' && k != 'c')).filter(k -> k == 'N').toArray();  // removing chars e and c fron string "nice to meet you"
        StringBuilder newX = new StringBuilder();
        for(int l : s){
            newX = newX.append((char) l);
        }
        System.out.println( "newX  :  " + newX);


        //allMatch() same like filter but checks for cases listed int he abstract method and return boolean

        //count returns long
        x.chars().filter(k -> (k != 'e' && k != 'c')).forEach(v -> v = v + 1);
        System.out.println(x);

        StringBuilder sb = new StringBuilder("Omiddle-Outz");
        Character.toLowerCase('c');

                sb.chars()
                .filter(i -> ((i >= 'a' && i<= 'z')
                        || (i >= 'A' && i<= 'Z')))
                .forEach(o -> {
                    System.out.println(String.valueOf((char)o));
                    //o = convertedChar(o, k);
                });



        Map<Character, Integer> map = new HashMap<>();
        map.put('c',1);
        for(int i : map.values()){   //map.values() return type Collection<T> to get values and map.keySet() to get all keys
            if(i == 1){
                System.out.println("in map");
            }
        }

        Collection<Integer> valu = map.values();
        Set<Character> set = map.keySet();

        System.out.println(set);

        System.out.println(valu);
        //print a map
        System.out.println(map);
        Object[] b = map.keySet().toArray();
        Object m = b[0];
        System.out.println(Arrays.toString(map.keySet().toArray()));





        char i = 67;
        String l = Character.isUpperCase(i) ? "can read with int values" : "cannot read";

        int z = Character.toLowerCase(i);
        System.out.println("tolowercase with int " + z);
        List<Integer> x = new ArrayList<>();


        int po = 5;
        int op = 9;
        if(po != op) {
            System.out.println("op and po");
        }

        StringBuilder sbui = new StringBuilder("sda");
        String v = "sfa";
        String h = v.substring(0,3);
        System.out.println(v.substring(0,3));
        //v.substring()


    }




    static int returnInt(){
        return 1;
    }





}
