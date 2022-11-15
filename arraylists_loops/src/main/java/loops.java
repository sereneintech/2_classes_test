import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class Loops {
    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("silver");
        colours.add("green");
        colours.add("rubarb");

        System.out.println("----Using enhanced for loop----");

        for (String colour : colours) { //x labelling each element in the array//
            //colour is string, colours is array//
            System.out.println(colour.toUpperCase());
        }

        List<String> filteredColours = new ArrayList<>();

        for (String colour : colours) { //loop through; singular colour as name for each item in array list colours
            if (colour.charAt(0) == 'r') { //for each item looped through, if first character is r
                filteredColours.add(colour); //add colour to this filtered array list
            }
        }

        System.out.println("filteredColours: " + filteredColours); //object//

        System.out.println("---Using Classic For Loop---");

        for (int i = 0; i < colours.size(); i++) {
            //naming each item in the string = colour//
            String colour = colours.get(i);
            System.out.println(colour);
        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i += 2) { // i = i + 2 increment by 1 and 2
            numbers.add(i);
        }

        System.out.println("numbers:" + numbers);

        //BREAK

        for (int i = 0; i < 10; i++){
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
