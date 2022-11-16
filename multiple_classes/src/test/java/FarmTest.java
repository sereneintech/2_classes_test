import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FarmTest {

    //declare Farm variable
    private Farm farm;

    @BeforeEach
    public void setUp(){
        farm = new Farm("BNTA Farm");
    }

    @Test
    public void canCountChickens(){ //new farm, no chicken in it
        //Arrange
        //Act
        int chickenCount = farm.getChickenCount();
        //Assert
        assertThat(chickenCount).isEqualTo(0);
    }

    @Test
    public void canAddChicken(){
        //Arrange
        Chicken ginger = new Chicken("Ginger", 3);
        //Act
        farm.addChicken(ginger);
        //Assert
        int chickenCount = farm.getChickenCount();
        assertThat(chickenCount).isEqualTo(1);
    }

}
