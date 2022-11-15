import java.util.ArrayList;

public class ArrayListPlayground {

    public static void main(String[] args) {

        ArrayList<String> trainers = new ArrayList<>();

        trainers.add("Zsolt");
        trainers.add("Anna");
        trainers.add("Colin");

        trainers.set(0, null); // object = data + behaviour//

        //trainers.remove("Zsolt");

        System.out.println(trainers.size());

    }
}
