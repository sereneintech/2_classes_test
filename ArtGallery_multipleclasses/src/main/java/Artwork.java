public class Artwork {

    private String title;
    private Artist artist;
    private int nft;
    private double price;


    public Artwork(String title, Artist artist, int nft){
        this.title = title;
        this.artist = artist;
        this.nft = nft;
        this.price = price;
    }

    public String getTitle(){return this.title;}

    public void setTitle(String title){this.title = title;}

    public Artist getArtist(){return this.artist;}

    public void setArtist(Artist artist){this.artist = artist;}

    public int getNft(){return this.nft;}

    public void setNft(int nft){this.nft = nft;}

    public double getPrice(){return this.price;}

    public void setPrice(double price){this.price = price;}




    public void removeNftFromGallery(Artwork artwork){
        this.nft
    }

}
