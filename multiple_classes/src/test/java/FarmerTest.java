import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FarmerTest {

    private Farmer farmer;

    @BeforeEach
    public void setUp(){
        farmer = new Farmer("Colin");
    }

    @Test
    public void canCollectEggs(){
        //Arrange
        Chicken ginger = new Chicken("Ginger", 3);
        Chicken ainger = new Chicken("Ainger", 1);
        Chicken binger = new Chicken("Binger", 2);
        Chicken cinger = new Chicken("Cinger", 0);
        Farm farm = new Farm("Farm from chicken run");
        farm.addChicken(ginger);
        farm.addChicken(ainger);
        farm.addChicken(binger);
        farm.addChicken(cinger);
        //Act
        farmer.collectEggs(farm);
        //Assert
        int collectedEggs = farmer.getCollectedEggs();
        assertThat(collectedEggs).isEqualTo(6);
    }

    @Test
    public void canAssignEggsForSale(){
        //Arrange

        //Act
        //Assert
    }
}


//now we got 3 classes interacting with each other!