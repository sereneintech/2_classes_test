import java.util.ArrayList;

public class Server {

    private ArrayList<String> possibleDrinks;

    public Server(ArrayList<String> possibleDrinks){
        this.possibleDrinks = possibleDrinks;
    }
    public boolean canServeGuest(Guest guest){
        if(guest.getAge() < 18){
            return false;
        }
        if(guest.getMoney() < 5.0){
            return false;
        }
//        Sobriety under 50 considered too drunk to be served
        if(guest.getSobriety() < 50){
            return false;
        }
        if(guest.getIsBanned() == true){
            return false;
        }
        if(guest.getCurrency() != '£'){
            return false;
        }
        if(!possibleDrinks.contains(guest.getFavouriteDrink())){
            return false;
        }
        return true;
    }
}




    /* Method - canServeGuest
    Guest must be over 18
    Guest must have enough money (each drink should cost £5.00, if they have more, they can be served)
    Guest must be sober enough (using an integer scale, 100-50 they are sober enough, under 50 refused!)
    Guest must not be banned from the pub
    Guest must have money in the local currency (Hint: Use a char for the currency symbol)
            canServeGuest   */


    /* Extra
    Guests should only be served if their preferred drink can be served
    by our server (Hint: Use an ArrayList of Strings for drink names
    on the server, and add a favouriteDrink for the guest)
     */
