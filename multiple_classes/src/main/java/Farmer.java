import java.util.ArrayList;

public class Farmer {

    private String name;
    private int collectedEggs;

    public Farmer(String name) {
        this.name = name;
        this.collectedEggs = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCollectedEggs() {
        return this.collectedEggs;
    }

    public void setCollectedEggs(int collectedEggs) {
        this.collectedEggs = collectedEggs;
    }

}

    //Methods

    public void collectEggs(Farm farm) {
        //keep track of found eggs
        int totalEggs = 0;
        //look at farm's collection of chickens
        //collect eggs from EVERY chicken - enhanced for loop
        ArrayList<Chicken> chickens = farm.getChickens();
        for (Chicken chicken : chickens) {
            //update running total
            //set chicken's egg count to 0
            if (chicken.getEggs() > 0) {
                totalEggs += chicken.getEggs();
                chicken.setEggs(0);
            }
        }
        //update collectedEggs property;
        this.collectedEggs = totalEggs;
    }

    public void assignEggsForSale(Farm farm) {
        //take farmer's collected eggs
        // MODELLING REAL LIFE:
        // Farmer is the one collecting eggs and deciding how many to sell
        //Farmer's decision so it belongs to Farmer class
        //change in Farm doesnt affect this
        farm.setEggsForSale(this.collectedEggs - 2);
        //how many for sale
        this.collectedEggs = 2;
    }
}


