import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


public class serverTest {

    Server server;
    Guest guest;

    @BeforeEach
    public void setUp(){
        ArrayList<String> possibleDrinks = new ArrayList<>();
        possibleDrinks.add("White Russian");
        server = new Server(possibleDrinks);
        guest = new Guest("Lebowski", 45, 100.0, 100, false, '£', "White Russian");
    }

    @Test
    public void canServeGuest(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isTrue();
    }

    @Test
    public void cannotServeGuestIfUnder18(){
        guest.setAge(17);
        boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }

    @Test
    public void cannotServeGuestIfDoesntHaveEnoughMoney(){
        guest.setMoney(0.0);
        boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }

    @Test
    public void cannotServeGuestIfTooDrunk(){
        guest.setSobriety(30);
        boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }

    @Test
    public void cannotServeGuestIfBanned(){
        guest.setIsBanned(true);
        boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }

    @Test
    public void cannotServeGuestIfNotLocalCurrency(){
        guest.setCurrency('$');
        boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }

    @Test
    public void cannotServeGuestIfCannotMakeDrink(){
        guest.setFavouriteDrink("Espresso Martini");
        boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }

}

        // TODO: test that guest can only get served if over 18

        // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

        // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

        // TODO: test that guest can only get served if guest is not banned from the pub

        // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

        // EXTENSIONS

        // TODO: test that guest can only get served if server can make favourite drink
        //  (give server a list of drinks (strings) it can make)