package Exercises.Account;

public class AccountClientTest {

    public static void main(String[] args) {
        AccountClient[] accountClients = new AccountClient[2];

        accountClients[0] = new AccountClient(1120, "Anuoluwapo", "01272383721");
        accountClients[0].addAccount(new Account(11201, 20000, 10.5));
        accountClients[0].addAccount(new Account(11202, 15000, 11.5));

        accountClients[1] = new AccountClient(1130, "Abolade", "091029233722");
        accountClients[1].addAccount(new Account(11301, 12000, 9.5));
        accountClients[1].addAccount(new Account(11302, 1000, 8.5));
        accountClients[1].addAccount(new Account(11303, 10000, 15.5));


        System.out.println(accountClients[0].toString());
        System.out.println(accountClients[1].toString());
    }
}
