import java.time.LocalDate;

import static java.lang.Math.multiplyExact;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Integer accountNumber;
    private Double balance;
    private String accounttype;
    private Double overdraft;

    public BankAccount(
            String firstName,
            String lastName,
            LocalDate dateOfBirth,
            Integer accountNumber,
            String accounttype,
            Double overdraft){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0.00; //starting is 0!!!
        this.accounttype = accounttype;
        this.overdraft = overdraft;

    }

    public void deposit(Double depositAmount) { //public/private Outcome Method // deposit(double) -> string
        this.balance += depositAmount;
    }

    public void withdraw(Double withdrawalAmount) {
        if ((this.balance - withdrawalAmount) >= overdraft){
            this.balance -= withdrawalAmount;
        }
    }

    public Double calculateInterest(Double interestPercentage) {
        Double interestToPay = this.balance * interestPercentage;
        return interestToPay;
    }

    public void payInterest(Double savingsAccInterest, Double currentAccInterest) {
        if (accounttype.equals("savings")) {
            this.balance += calculateInterest(savingsAccInterest);
        } else if (accounttype.equals("current")) {
            this.balance += calculateInterest((currentAccInterest));
        }
    }
    //GETTERS AND SETTERS

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public LocalDate getdateofBirth() {return dateOfBirth;}

    public void setdateofBirth(LocalDate dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public Integer getAccountNumber() {return accountNumber;}

    public void setAccountNumber(Integer accountNumber){this.accountNumber = accountNumber;}

    public Double getBalance() {return balance;}

    public void setBalance(Double balance) {this.balance = balance;}

        public String accounttype() {return accounttype;}

        public void setAccountType(String accounttype){this.accounttype = accounttype;}

        public Double overdraft() {return overdraft;}

        public void setoverdraft (Double overdraft) {this.overdraft = overdraft;}


}
