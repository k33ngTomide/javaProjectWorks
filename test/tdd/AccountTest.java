package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AccountTest {
    @Test
    public void canDepositIntoAccountTest(){
        Account tomideAccount = new Account("3547");
        int currentBalance = tomideAccount.getBalance("3547");
        assertEquals(0, currentBalance);

        tomideAccount.deposit(5000);

        int newBalance = tomideAccount.getBalance("3547");
        assertEquals(5000, newBalance);
    }
    @Test
    public void canDepositTwiceTest(){
        Account tomideAccount = new Account("3454");
        tomideAccount.deposit(3000);
        int currentBalance = tomideAccount.getBalance("3454");
        assertEquals(3000, currentBalance);

        tomideAccount.deposit(2000);

        int newBalance = tomideAccount.getBalance("3454");
        assertEquals(5000, newBalance);
    }
    @Test
    public void cannotDepositNegativeAmountTest(){
        Account tomideAccount = new Account("3742");
        tomideAccount.deposit(1000);
        int currentBalance = tomideAccount.getBalance("3742");
        assertEquals(1000, currentBalance);

        tomideAccount.deposit(-2000);

        int newBalance = tomideAccount.getBalance("3742");
        assertEquals(1000, newBalance);

    }
    @Test
    public void canWithdrawFromAccountTest(){
        Account tomideAccount = new Account("7392");
        tomideAccount.deposit(5000);
        int currentBalance = tomideAccount.getBalance("7392");
        assertEquals(5000, currentBalance);

        tomideAccount.withdraw(3000, "7392");

        int newBalance = tomideAccount.getBalance("7392");
        assertEquals(2000, newBalance);

    }
    @Test
    public void canWithdrawTwiceTest(){
        Account tomideAccount = new Account("6471");
        tomideAccount.deposit(3000);
        int currentBalance = tomideAccount.getBalance("6471");
        assertEquals(3000, currentBalance);

        tomideAccount.withdraw(1000, "6471");

        int newBalance = tomideAccount.getBalance("6471");
        assertEquals(2000, newBalance);

    }
    @Test
    public void cannotWithdrawMoreThanBalanceTest(){
        Account tomideAccount = new Account("6228");
        tomideAccount.deposit(1000);
        int currentBalance = tomideAccount.getBalance("6228");
        assertEquals(1000, currentBalance);

        tomideAccount.withdraw(2000, "6228");

        int newBalance = tomideAccount.getBalance("6228");
        assertEquals(1000, newBalance);
    }
    @Test
    public void cannotWithdrawNegativeAmount(){
        Account tomideAccount = new Account("5919");
        tomideAccount.deposit(3000);
        int currentBalance = tomideAccount.getBalance("3333");
        assertEquals(0, currentBalance);

        tomideAccount.withdraw(-900, "5919");
        int newBalance = tomideAccount.getBalance("5919");
        assertEquals(3000, newBalance);
    }
    @Test
    public void canPinBeMoreThanFourDigitTest(){
        Account tomideAccount = new Account("63453");
        tomideAccount.deposit(2000);
        int currentBalance = tomideAccount.getBalance("63453");
        assertEquals(0, currentBalance);
    }
    @Test
    public void canPinHaveLettersTest(){
        Account tomideAccount = new Account("6er5");
        tomideAccount.deposit(5000);
        int currentBalance = tomideAccount.getBalance("6er5");
        assertEquals(0, currentBalance);
    }
    @Test
    public void cannotWithdrawWithdrawWithoutPin(){
        Account tomideAccount = new Account("5919");
        tomideAccount.deposit(3000);
        int currentBalance = tomideAccount.getBalance("5919");
        assertEquals(3000, currentBalance);

        tomideAccount.withdraw(2500, "    ");
        int newBalance = tomideAccount.getBalance("5919");
        assertEquals(3000, newBalance);
    }

}
