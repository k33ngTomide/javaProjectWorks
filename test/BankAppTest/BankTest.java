package BankAppTest;

import BankApp.Account;
import BankApp.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    private Bank bank;
    @BeforeEach
    public void initialSetUp(){
        bank = new Bank("Semicolon Bank");
        bank.register("firstName", "lastName", "0000");

    }

    @Test
    public void testThatBankCanRegisterCustomer(){
        assertEquals(new Account("1", "firstName lastName", "0000").getAccount(),
                bank.findAccount("1").getAccount());

    }

    @Test
    public void testThatDepositMoneyWorks(){
        bank.deposit(15_200, "1");
        assertEquals(15_200, bank.checkBalance("1","0000"));
    }

    @Test
    public void testThatWithdrawalMoneyWorks(){
        bank.deposit(15_200, "1");
        assertEquals(15_200, bank.checkBalance("1","0000"));

        bank.withdrawal(3_000, "1", "0000");
        assertEquals(12_200, bank.checkBalance("1","0000"));

    }

    @Test
    public void testThatTransferMoneyWorks(){
        bank.register("firstName1", "lastName1", "1111");
        bank.deposit(25_500, "1");
        assertEquals(25_500, bank.checkBalance("1","0000"));

        assertEquals(0, bank.checkBalance("2","1111"));


        bank.transfer(10_000, "1", "2", "0000");

        assertEquals(15_500, bank.checkBalance("1","0000"));
        assertEquals(10_000, bank.checkBalance("2","1111"));


    }
}
