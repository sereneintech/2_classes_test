//in static Java everything is in a class, even Runner//

public class Runner {

    public static void main(String[] args) {
        Person colin = new Person("Colin", "Bathgate", 21);
        Person anna = new Person("Anna", "Glasgow", 51);

        System.out.println(colin.getName());
        System.out.println(anna.getName());
        System.out.println(anna.getTown());
        System.out.println(colin.getAge());

        anna.greet("afternoon");
        colin.greet("evening");

        System.out.println(anna.generateBio());
        System.out.println(colin.generateBio());
    }

}

