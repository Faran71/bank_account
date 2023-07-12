import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestBankAccount {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Faran","Sarwar","07/04/1876",12333229);
    }

    @Test
    public void canReturnFirstName(){
        String actual = bankAccount.getFirstName();
        String expected = "Faran";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canReturnLastName(){
        String actual = bankAccount.getLastName();
        String expected = "Sarwar";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canReturnDateOfBirth(){
        String actual = bankAccount.getDateOfBirth();
        String expected = "07/04/1876";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canReturnAccountNumber(){
        int actual = bankAccount.getAccountNumber();
        int expected = 12333229;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canReturnBalance(){
        int actual = bankAccount.getBalance();
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canChangeFirstName(){
        bankAccount.setFirstName("Bob");
        String actual = bankAccount.getFirstName();
        String expected = "Bob";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canChangeLastName(){
        bankAccount.setLastName("Long");
        String actual = bankAccount.getLastName();
        String expected = "Long";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canChangeDateOfBirth(){
        bankAccount.setDateOfBirth("01/01/0001");
        String actual = bankAccount.getDateOfBirth();
        String expected = "01/01/0001";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canChangeAccountNumber(){
        bankAccount.setAccountNumber(87654321);
        int actual = bankAccount.getAccountNumber();
        int expected = 87654321;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canDepositMoney(){
        bankAccount.deposit(50);
        int actual = bankAccount.getBalance();
        int expected = 50;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canWithdrawalMoney(){
        bankAccount.withdrawal(50);
        int actual = bankAccount.getBalance();
        int expected = -50;
        assertThat(actual).isEqualTo(expected);
    }
}
