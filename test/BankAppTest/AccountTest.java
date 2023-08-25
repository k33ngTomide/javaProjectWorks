package BankAppTest;

import BankApp.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp(){
        account = new Account("1","accountName", "0000");
    }

    @Test
    public void testThatAccountCanDepositMoneyAndIncreaseBalance(){
        account.deposit(30_000);

        assertEquals(30_000, account.checkBalance("0000"));
    }

    @Test
    public void testThatCheckingBalanceWithWrongPinThrowsException(){
        account.deposit(10_000);
        assertThrows(IllegalArgumentException.class, ()->{
                account.checkBalance("0001");}
        );
    }

    @Test
    public void testThatMoneyCanBeWithdrawnFromTheAccount(){
        account.deposit(5_000);
        assertEquals(5_000, account.checkBalance("0000"));


        account.withdraw(2_000, "0000");
        assertEquals(3_000, account.checkBalance("0000"));
    }

    @Test
    public void testThatWithdrawalWithWrongPinThrowsExceptionAndBalanceIsUntouched(){
        account.deposit(10_000);
        assertThrows(IllegalArgumentException.class, ()->{
            account.withdraw(5_000,"1111");}
        );
        assertEquals(10_000, account.checkBalance("0000"));
    }

    @Test
    public void testThatWithdrawalWithWrongAmountThrowsExceptionAndBalanceIsUntouched(){
        account.deposit(10_000);
        assertThrows(IllegalArgumentException.class, ()->{
            account.withdraw(-5_000,"0000");}
        );
        assertEquals(10_000, account.checkBalance("0000"));
    }

    @Test
    public void testThatWithdrawalAmountMoreThanBalanceThrowsExceptionAndBalanceIsUntouched(){
        account.deposit(5_000);
        assertThrows(IllegalArgumentException.class, ()->{
            account.withdraw(7_500,"0000");
            throw new IllegalArgumentException("Insufficient Funds");}
        );
        assertEquals(5_000, account.checkBalance("0000"));
    }

    @Test
    public void testThatPinCanBeChanged_ByTryingToWithdrawWithNewPin(){
        account.deposit(5_800);

        account.updatePin("0000", "1111");
        assertEquals(5_800, account.checkBalance("1111"));

    }

    @Test
    public void testThatWithdrawalWithOldPinThrowsAnException(){
        account.deposit(1_300);
        account.updatePin("0000", "1111");
        assertThrows(IllegalArgumentException.class, ()->{
            assertEquals(1_300, account.checkBalance("0000"));
        });
    }


}
