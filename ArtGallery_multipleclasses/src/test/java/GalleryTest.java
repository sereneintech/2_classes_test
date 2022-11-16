import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    private Gallery gallery;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("BNTA Gallery");
    }

    @Test
    public void canAddArtwork(){
        //Arrange
        //Act
        int stockCount = gallery.getStock().size();
        //Assert
        assertThat(stockCount).isEqualTo(0);
    }

    @Test
    public void canRemoveArtwork(){
        //Arrange
        Artist monet = new Artist("Monet");
        Artist picasso = new Artist("Picasso");
        Artist davinci = new Artist("Da Vinci");
        Artwork lake = new Artwork("Lake", monet, 1, 100);
        Artwork moon = new Artwork("Moon", picasso, 2, 200);
        Artwork monalisa = new Artwork("Mona Lisa", davinci, 3, 300);
        //Act
        gallery.addStock(lake);
        gallery.addStock(moon);
        gallery.removeStock(lake);
        int stockCount = gallery.getStock().size();
        //Assert
        assertThat(stockCount).isEqualTo(1);
    }

    @Test
    public void addMoneyToTill(){
        //Arrange
        Artist monet = new Artist("Monet");
        Artist picasso = new Artist("Picasso");
        Artist davinci = new Artist("Da Vinci");
        Artwork lake = new Artwork("Lake", monet, 1, 100.00);
        Artwork moon = new Artwork("Moon", picasso, 2, 200.00);
        Artwork monalisa = new Artwork("Mona Lisa", davinci, 3, 300.00);
        Customer customer = new Customer ("Bill", 600);
        //Act
        gallery.addStock(lake);
        gallery.addStock(moon);
        gallery.addStock(monalisa);
        customer.pay(600.00);
        double tillMoney = gallery.getTill(); //checking gallery//
        //Assert
        assertThat(tillMoney).isEqualTo(600.00);
    }
}
