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

}
