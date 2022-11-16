import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChickenTest {

    Chicken ginger;

    @BeforeEach
    public void setUp(){
        ginger = new Chicken("Ginger", 3); //setting up, no input needed
    }

    @Test
    public void canGetName(){
        //Arrange - do any setup for our test -GIVEN
        // (DONE bc we created ginger)
        //Act - do the thing we're testing -WHEN (ensure we can get chicken name!)
        String name = ginger.getName();
        //Assert - check that it happened correctly -THEN we wanna ensure
        assertThat(name).isEqualTo("Ginger");
    }

    @Test
    public void canSetName(){
        //Arrange
        //Act canSetName
        ginger.setName("Bubz");
        //Assert
        String updatedName = ginger.getName();
        assertThat(updatedName).isEqualTo("Bubz");
    }

    @Test
    public void canGetEggs(){
        //Arrange
        //Act
        int eggs = ginger.getEggs();
        //Assert
        assertThat(eggs).isEqualTo(3);
    }

    @Test
    public void canSetEggs(){
        //Arrange
        //Act of canSetEggs
        ginger.setEggs(5);
        //Assert
        int updatedEggs = ginger.getEggs();
        assertThat(updatedEggs).isEqualTo(5);
    }




}
