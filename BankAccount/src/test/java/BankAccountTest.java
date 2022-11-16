import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static javax.swing.Spring.minus;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount(
                "Serene",
                "Chan",
                LocalDate.of(2000, 9, 29),
                064,
                "current",
                -50.00);
    }
//set balance as 0

    @Test
    public void canDeposit() {
        bankAccount.deposit(100.0);
        assertThat(bankAccount.getBalance()).isEqualTo(100.0);
    }

    @Test
    public void canWithdraw() {
        bankAccount.deposit(100.0);
        bankAccount.withdraw(1.0);
        assertThat(bankAccount.getBalance()).isEqualTo(99.0);
    }

    @Test
    public void canPayInterest() {
        bankAccount.deposit(100.0);
        bankAccount.payInterest(0.02, 0.01);
        assertThat(bankAccount.getBalance()).isEqualTo(101.0);

    }
//TEST FOR GETTERS AND SETTERS
}
