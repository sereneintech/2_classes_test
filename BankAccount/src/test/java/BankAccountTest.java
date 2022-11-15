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
        String expected = "Successfully deposited. Your new balance is: 1000000000.00";
        String actual = BankAccount.deposit(1000000000.00);
        assertThat(bankAccount.deposit(1000000000));

        expected =  "Successfully deposited. Your new balance is: 1999999999.00";
        actual = bankAccount.deposit(999999999.00);
        System.out.println(actual);
        assertThat(bankAccount.deposit(1999999999.00);)
    }

    @Test
    public void testWithdrawl(){
        String expected = "Successfully withdrawn. Your new balance is: "
    }

    @Test
    public void testInterest(){
        String expected = "Interest added: " + //balance * 1.05
    }

}
