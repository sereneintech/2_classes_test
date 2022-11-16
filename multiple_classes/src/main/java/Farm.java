import java.util.ArrayList;

public class Farm {

    private String name;
    private int eggsForSale;
    private ArrayList<Chicken> chickens;

    //setter of Farm properties//
    public Farm(String name){
        this.name = name;
        this.eggsForSale = 0;
        this.chickens = new ArrayList<>();
    }

    //more properties mean more getters and setters but it needs to be done

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getEggsForSale(){
        return this.eggsForSale;
    }

    public void setEggsForSale(int eggsForSale){
        this.eggsForSale = eggsForSale;
    }

    public ArrayList<Chicken> getChickens(){ //dont need input for output
        return this.chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) { //dont need output, only input
                             //chickens is the variable in the ArrayList called Chicken
        this.chickens = chickens;
    }

    // Methods
    public int getChickenCount(){
        return this.chickens.size();
    }

    public void addChicken(Chicken chicken){
        this.chickens.add(chicken);
    }

}
