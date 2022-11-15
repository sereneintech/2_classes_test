import java.util.*;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add((scottishIslands.indexOf("Jura")) + 1, "Islay");

//        4. Print out the index position of "Skye"
        int indexSkye = scottishIslands.indexOf("Skye");
        System.out.println("Index of Skye: " + indexSkye);

//        5. Remove "Tresco" from the list by name

        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index

        scottishIslands.remove((scottishIslands.indexOf("Arran")));

//        7. Print the number of islands in your arraylist

        System.out.println("Number of islands: " + scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        System.out.println(scottishIslands);

//        9. Print out all the islands using a for loop

        for (String island : scottishIslands) {
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
//        2. Print the difference between the largest and smallest value

        System.out.println((Collections.max(numbers) - Collections.min(numbers)));

//        3. Print True if the list contains a 1 next to a 1 somewhere.

        for (int i = 0; i < numbers.size()-1; i++) {

            if ((numbers.get(i) == 1) && (numbers.get(i + 1) == 1))

                System.out.println("1 next to 1: True");
        }
//        4. Print the sum of the numbers,

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i); // sum = sum + numbers.get(i)
        }
        System.out.println("The sum of numbers is: "+ sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 9.

        int sumNew = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 13){
                break;
            }

            sumNew += numbers.get(i);

        }
        System.out.println("The new sum of numbers is: "+ sumNew);



    }
}
