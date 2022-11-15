import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static javax.swing.Spring.minus;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Serene", "Chan",
                LocalDate.of(2000, 9, 29), 1);
    }
//set balance as 0

    @Test
    public void testDeposit() {
        String expected = "Successfully deposited. Your new balance is: 100.00";
        String actual = BankAccount.deposit(100.00);
        assertThat(bankAccount.deposit(100);)

        expected = "Successfully deposited. Your new balance is: 99.00";
        actual = bankAccount.deposit(199.00);
        System.out.println(actual);
        assertThat(bankAccount.deposit(199.00);)
    }

    @Test
    public void testWithdrawl(){
        String expected = "Successfully withdrawn. Your new balance is: 99.00";
        String actual = BankAccount.withdrawal(1.00);
        assertThat(bankAccount.withdrawal(99.00);)

        String expected = "Successfully withdrawn. Your new balance is: 98.00";
        String actual = bankAccount.withdrawal(2.00);
        assertThat(bankAccount.withdrawal(98.00);)
    }

    @Test
    //public void testInterest(){
       // String expected = "Interest added: " + //balance * 1.05
    }

}
