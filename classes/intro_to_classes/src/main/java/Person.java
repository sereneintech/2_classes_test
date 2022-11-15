public class Person {

    //everything that defines the shape of my cookie cutter//

    private String name;
    private String town;
    private int age;

    //constructor
    public Person(String inputName, String inputTown, int inputAge) {
        this.name = inputName;
        this.town = inputTown;
        this.age = inputAge;
    }

    public void greet(String timeOfDay) {
        System.out.println("Good " + timeOfDay + "!");
    }

    public String generateBio() {
        return "My name is " + this.name + " And I live in " + this.town + ".";
    }

    // GETTERS AND SETTERS

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String newTown) {
        this.town = newTown;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

}