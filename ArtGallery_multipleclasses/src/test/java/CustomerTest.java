import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("Bill", 600);
    }

    @Test
    public void canWithdrawMoneyFromWallet() {
        //Arrange
        //Act
        customer.pay(0.00);
        customer.withdraw(100.00);
        //Assert
        assertThat(customer.getWallet()).isEqualTo(500.000);
    }

}
