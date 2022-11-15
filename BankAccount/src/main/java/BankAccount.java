import java.time.LocalDate;

import static java.lang.Double.sum;
import static java.lang.Math.multiplyExact;
import static javax.swing.Spring.minus;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private Double balance;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, String accountNumber, Double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void deposit(Double depositAmount) {
        return "Successfully deposited. Your new balance is: " + sum(balance + depositAmount);
    }

    public void withdrawal(Double withdrawalAmount) {
        return "Successfully withdrawn. Your new balance is: " + minus(balance - withdrawalAmount);
    }

    public void interest(Double interestPercentage) {
        return "Interest added: " + multiplyExact(balance * 1.05);
    }

    //GETTERS AND SETTERS

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getdateofBirth() {
        return dateOfBirth;
    }

    public void setdateofBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


}
