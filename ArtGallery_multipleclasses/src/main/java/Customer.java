public class Customer {
    private String name;
    private double wallet;

    public Customer(String name, double wallet){this.name = name; this.wallet = 600.00;}

    //getters and setters
    public String getName(){return this.name;}

    public void setName() {this.name = name;}

    public double getWallet(){return this.wallet;}

    public void setWallet(double wallet){this.wallet = wallet;}

    //Methods

    public void pay(Double depositAmount) { //public/private Outcome Method // deposit(double) -> string
        this.wallet += depositAmount;
    }

    public void withdraw(Double withdrawalAmount) {this.wallet -= withdrawalAmount;}




}
