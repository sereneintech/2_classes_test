import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> stock;
    public Gallery(String name) {
        this.name = name;
        this.till = 0.00;
        this.stock = new ArrayList<>();
    }


// getters and setters

    public String getName(){return this.name;}

    public void setName() {this.name = name;}

    public double getTill(){return this.till;}

    public void setTill(double till){this.till = till;}

    public ArrayList<Artwork> getStock(){return this.stock;}

    public void setStock(ArrayList<Artwork> artworks){this.stock = artworks;}

//Methods

    public double addMoneyToTill(Artwork artwork) {
        //keep track of current till amount
        //check for price of Artwork bought
        // increaseTillAmount
        return this.till += artwork.getPrice(); // + or - for NUMBERS
        //
    }

    public void addStock(Artwork artwork){
        this.stock.add(artwork);
    }

    public void removeStock(Artwork artwork){
        this.stock.remove(artwork); //remove or add for ARRAY
    }


}

