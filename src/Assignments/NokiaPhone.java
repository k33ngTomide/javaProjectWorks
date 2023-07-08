package Assignments;

import java.util.Scanner;

public class NokiaPhone {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        System.out.println("""
                        ___Main Menu___
                            1. Phone book
                            2. Messages
                            3. Chat
                            4. Call register
                            5. Tones
                            6. Settings
                            7. Call divert
                            8. Games
                            9. Calculator
                            10. Remainders
                            11. Clock
                            12. Profiles
                            13. SIM services
                            0. Off""");
        System.out.print("Enter:");
        int user_entry = scan.nextInt();
        switch (user_entry){
            case 0 -> off();
            case 1 -> phoneBook();
            case 2 -> messages();
            case 3 -> chat();
            case 4 -> callRegister();
            case 5 -> tones();
            case 6 -> settings();
            case 7 -> callDivert();
            case 8 -> games();
            case 9 -> calculator();
            case 10 -> remainder();
            case 11 -> clock();
            case 12 -> profiles();
            case 13 -> simServices();
            default -> invalid();

        }
    }

    private static void clock() {
        System.out.println("""
                ___Clock___
                    1. Alarm clock
                    2. Clock Settings
                    3. Date settings
                    4. Stop Watch
                    5. Countdown timer
                    6. Auto update of date and time
                    0. Back""");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 0 -> mainMenu();
            case 1 -> {
                System.out.println("___Alarm clock___");
                backClock();
            }
            case 2 -> {
                System.out.println("___Clock settings___");
                backClock();
            }
            case 3 -> {
                System.out.println("___Date settings___");
                backClock();
            }
            case 4 -> {
                System.out.println("___Stop Watch___");
                backClock();
            }
            case 5 -> {
                System.out.println("___Countdown timer___");
                backClock();
            }
            case 6 -> {
                System.out.println("___Auto update of date and time__");
                backClock();
            }
            default -> invalid();
        }
    }

    private static void backClock() {
        System.out.println("0. Back \n1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) clock();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void simServices() {
        System.out.println("___SIM services___");
        backToMain();
    }

    private static void profiles() {
        System.out.println("___Profiles___");
        backToMain();
    }

    private static void remainder() {
        System.out.println("___Remainder___");
        backToMain();
    }

    private static void calculator() {
        System.out.println("___Calculator___");
        backToMain();
    }

    private static void games() {
        System.out.println("___Games__");
        backToMain();
    }

    private static void callDivert() {
        System.out.println("___Call Divert___");
        backToMain();
    }

    private static void backToMain() {
        System.out.println("0. Back ");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) mainMenu();
        else invalid();
    }

    private static void settings() {
        System.out.println("""
                ___Settings___
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings
                    0. Back""");
        System.out.println("Enter: ");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 0 -> mainMenu();
            case 1 -> callSettings();
            case 2 -> phoneSettings();
            case 3 -> securitySettings();
            case 4 -> {
                System.out.println("""
                        ___Restore factory settings___
                            1. Main menu
                            0. Back""");
                System.out.print("Enter: ");
                int user_entry_1 = scan.nextInt();
                if (user_entry_1 == 0) settings();
                else if (user_entry_1 == 1) mainMenu();
                else invalid();
            }
            default -> invalid();
        }
    }

    private static void securitySettings() {
        System.out.println("""
                ___Security Settings___
                    1. PIN code request
                    2. Call barring service
                    3. Fixed dialing
                    4. Closed user group
                    5. Phone security
                    6. Change access codes
                    0. Back""");
        System.out.print("Enter:  ");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 0 -> settings();
            case 1 -> {
                System.out.println("___PIN code request___");
                backSecuritySetting();
            }
            case 2 -> {
                System.out.println("___Call barring service___");
                backSecuritySetting();
            }
            case 3 -> {
                System.out.println("___Fixed dialing___");
                backSecuritySetting();
            }
            case 4 -> {
                System.out.println("___Closed user group___");
                backSecuritySetting();
            }
            case 5 -> {
                System.out.println("___Phone security___");
                backSecuritySetting();
            }
            case 6 -> {
                System.out.println("___Change access codes___");
                backSecuritySetting();
            }
            default -> invalid();
        }
    }

    private static void backSecuritySetting() {
        System.out.println("\t0. Back \n\t1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) securitySettings();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void phoneSettings() {
        System.out.println("""
                ___Phone Settings___
                    1. Language
                    2. Cell info display
                    3. Welcome note
                    4. Network selection
                    5. Lights
                    6. Confirm SIM service actions
                    0. Back""");
        System.out.print("Enter:  ");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 0 -> settings();
            case 1 -> {
                System.out.println("___Language___");
                backPhoneSettings();
            }
            case 2 -> {
                System.out.println("___Cell info display___");
                backPhoneSettings();
            }
            case 3 -> {
                System.out.println("___Welcome note___");
                backPhoneSettings();
            }
            case 4 -> {
                System.out.println("___Network selection___");
                backPhoneSettings();
            }
            case 5 -> {
                System.out.println("___Light___");
                backPhoneSettings();
            }
            case 6 -> {
                System.out.println("___Confirm SIM service actions___");
                backPhoneSettings();
            }
            default -> invalid();
        }
    }

    private static void backPhoneSettings() {
        System.out.println("\t0. Back \n\t1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) phoneSettings();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void callSettings() {
        System.out.println("""
                ___Call Settings___
                   1. Automatic redial
                   2. Speed dialing
                   3. Call waiting
                   4. Own number sending
                   5. Phone line in use
                   6. Automatic answer
                   0. Back""");
        System.out.print("Enter:  ");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 0 -> settings();
            case 1 -> {
                System.out.println("___Automatic redial___");
                backCallSettings();
            }
            case 2 -> {
                System.out.println("___Speed dialing___");
                backCallSettings();
            }
            case 3 -> {
                System.out.println("___Call waiting___");
                backCallSettings();
            }
            case 4 -> {
                System.out.println("___Own number sending___");
                backCallSettings();
            }
            case 5 -> {
                System.out.println("___Phone line in use___");
                backCallSettings();
            }
            case 6 -> {
                System.out.println("___Automatic answer___");
                backCallSettings();
            }
            default -> invalid();
        }
    }

    private static void backCallSettings() {
        System.out.println("\t0. Back \n\t1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) callSettings();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void tones() {
        System.out.println("""
                ___Tones___
                    1. Ringing Tone
                    2. Ringing volume
                    3. Incoming call alert
                    4. Composer
                    5. Message alert tone
                    6. Keypad tones
                    7. Warning and game tones
                    8. Vibrating alert
                    9. Screen saver
                    0. Back""");
        System.out.print("Enter:  ");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 0 -> mainMenu();
            case 1 -> {
                System.out.println("___Ringing Tone___");
                backTones();
            }
            case 2 -> {
                System.out.println("___Ringing volume___");
                backTones();
            }
            case 3 -> {
                System.out.println("___Incoming call alert___");
                backTones();
            }
            case 4 -> {
                System.out.println("___Composer___");
                backTones();
            }
            case 5 -> {
                System.out.println("___Message alert tone___");
                backTones();
            }
            case 6 -> {
                System.out.println("___Keypad tones___");
                backTones();
            }
            case 7 -> {
                System.out.println("___Warning and game tones___");
                backTones();
            }
            case 8 -> {
                System.out.println("___Vibrating alert___");
                backTones();
            }
            case 9 -> {
                System.out.println("___Screen saver___");
                backTones();
            }
        }
    }

    private static void backTones() {
        System.out.println("\t0. Back \n\t1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) tones();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void callRegister() {
        System.out.println("""
                ___Call register___
                    1. Missed calls
                    2. Received calls
                    3. Dialled numbers
                    4. Erase recent call lists
                    5. Show call duration
                    6. Show call costs
                    7. Call cost settings
                    8. Prepaid credit
                    0. Back""");
        System.out.print("Enter:  ");
        int user_entry = scan.nextInt();
        switch (user_entry){
            case 0 -> mainMenu();
            case 1 -> {
                System.out.println("___Missed Calls___");
                backCallRegister();
            }
            case 2 -> {
                System.out.println("___Received calls___");
                backCallRegister();
            }
            case 3 -> {
                System.out.println("___Dialled numbers___");
                backCallRegister();
            }
            case 4 -> {
                System.out.println("___Erase recent call lists___");
                backCallRegister();
            }
            case 5 -> showCallDuration();
            case 6 -> showCallCost();
            case 7 -> callCostSettings();
            case 8 -> {
                System.out.println("___Prepaid credit___");
                backCallRegister();
            }
            default -> invalid();
        }
    }

    private static void callCostSettings() {
        System.out.println("""
                ___Call cost Settings___
                    1. Call cost limit
                    2. Show cost in
                    0. Back""");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 0 -> callRegister();
            case 1 -> {
                System.out.println("___Call cost limit___");
                backCallCostSettings();
            }
            case 2 -> {
                System.out.println("___Show cost in___");
                backCallCostSettings();
            }
            default -> invalid();
        }
    }

    private static void backCallCostSettings() {
        System.out.println("0. Back \n1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) callCostSettings();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void showCallCost() {
        System.out.println("""
                ___Show Call Cost___
                    1. Last call cost
                    2. All call's cost
                    3. clear counters
                    0. Back""");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 0 -> callRegister();
            case 1 -> {
                System.out.println("___Last call cost___");
                backShowCallCost();
            }
            case 2 -> {
                System.out.println("___All calls' cost___");
                backShowCallCost();
            }
            case 3 -> {
                System.out.println("___Clear call's cost___");
                backShowCallCost();
            }
            default -> invalid();
        }
    }

    private static void backShowCallCost() {
        System.out.println("\t0. Back \n\t1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) showCallCost();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void showCallDuration() {
        System.out.println("""
                ___Show call duration___
                    1. Last call duration
                    2. All calls' duration
                    3. Received call's duration
                    4. Dialled calls' duration
                    5. Clear times
                    0. Back""");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 0 -> callRegister();
            case 1 -> {
                System.out.println("___Last call Duration___");
                backShowCallDuration();
            }
            case 2 ->{
                System.out.println("___All calls' Duration___");
                backShowCallDuration();
            }
            case 3 -> {
                System.out.println("___Received call's Duration___");
                backShowCallDuration();
            }
            case 4 -> {
                System.out.println("___Dialled call's Duration___");
                backShowCallDuration();
            }
            case 5 -> {
                System.out.println("___Clear times___");
                backShowCallDuration();
            }
            default -> invalid();
        }

    }

    private static void backShowCallDuration() {
        System.out.println("\t0. Back \n\t1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) showCallDuration();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void backCallRegister() {
        System.out.println("\t0. Back \n\t1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) callRegister();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void messages() {
        System.out.println("""
                ___Messages___
                    1. Write Messages
                    2. Inbox
                    3. Outbox
                    4. Picture Messages
                    5. Templates
                    6. Smileys
                    7. Message Settings
                    8. Info service
                    9. Voice mailbox number
                    10. Services command editor
                    0. Back""");
        System.out.print("Enter: ");
        int user_entry_ = scan.nextInt();
        switch (user_entry_){
            case 1 -> {
                System.out.println("___Write Messages___");
                backMessages();
            }
            case 2 -> {
                System.out.println("___Inbox__");
                backMessages();
            }
            case 3 -> {
                System.out.println("___Outbox___");
                backMessages();
            }
            case 4 -> {
                System.out.println("___Picture Messages___");
                backMessages();
            }
            case 5 -> {
                System.out.println("___Templates___");
                backMessages();
            }
            case 6 -> {
                System.out.println("___Smileys___");
                backMessages();
            }
            case 7 -> messageSettings();
            case 8 -> {
                System.out.println("___Info service___");
                backMessages();
            }
            case 9 -> {
                System.out.println("___Voice mailbox number___");
                backMessages();
            }
            case 10 -> {
                System.out.println("___Services command editor___");
                backMessages();
            }
            case 0 -> messages();

            default -> invalid();

        }
    }

    private static void messageSettings() {
        System.out.println("""
                ___Messages Settings
                    1. Set 1
                    2. Common
                    0. Back""");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 1 -> set1();
            case 2 -> common();
            case 0 -> messages();
            default -> invalid();
        }
    }

    private static void common() {
        System.out.println("""
                ___Common___
                    1. Delivery reports
                    2. Reply via same centre
                    3. Character support
                    0. Back""");
        System.out.print("Enter:");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 1 -> {
                System.out.println("___Delivery Reports___");
                backCommon();
            }
            case 2 -> {
                System.out.println("___Reply via same centre___");
                backCommon();
            }
            case 3 -> {
                System.out.println("___Character support___");
                backCommon();
            }
            case 0 -> messageSettings();
            default -> invalid();
        }
    }

    private static void backCommon() {
        System.out.println("\t0. Back \n\t1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) common();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void set1() {
        System.out.println("""
                ___Set 1___
                    1. Message center number
                    2. Message sent as
                    3. Message validity
                    0. Back""");
        System.out.print("Enter:");
        int user_entry = scan.nextInt();
        switch (user_entry) {
            case 1 -> {
                System.out.println("___Message Center number___");
                backSet();
            }
            case 2 -> {
                System.out.println("___Message sent as__");
                backSet();
            }
            case 3 -> {
                System.out.println("___Message validity__");
                backSet();
            }
            case 0 -> messageSettings();
            default -> invalid();
        }
    }

    private static void backSet() {
        System.out.println("\t0. Back \n\t1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) set1();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void backMessages() {
        System.out.println("\t0. Back \n\t1. Main Main");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 0) messages();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void phoneBook() {
        System.out.println("""
                ___Phone Book___
                    1. Services
                    2. Service Nos.
                    3. Add name
                    4. Erase
                    5. Edit
                    6. Assign tone
                    7. Send b"card
                    8. Options
                    9. Speed dials
                    10. Voice tags
                    0. Back""");
        System.out.print("Enter: ");
        int user_entry_phone = scan.nextInt();
        switch (user_entry_phone){
            case 1 -> {
                System.out.println("___Services___");
                backPhoneBook();
            }
            case 2 -> {
                System.out.println("___Services Nos___");
                backPhoneBook();
            }
            case 3 -> {
                System.out.println("___Add name___");
                backPhoneBook();
            }
            case 4 -> {
                System.out.println("___Erase__");
                backPhoneBook();
            }
            case 5 -> {
                System.out.println("___Edit___");
                backPhoneBook();
            }
            case 6 -> {
                System.out.println("___Assign Tone___");
                backPhoneBook();
            }
            case 7 -> {
                System.out.println("___Send B' card___");
                backPhoneBook();
            }
            case 8 -> options();
            case 9 -> {
                System.out.println("___Speed Dials__");
                backPhoneBook();
            }
            case 10 -> {
                System.out.println("___Voice Tags__");
                backPhoneBook();
            }
            case 0 -> mainMenu();
            default -> invalid();

        }
    }

    private static void options() {
        System.out.println("""
                ___Options___
                    1. Type of view
                    2. Memory status
                    0. Back""");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();
        if (user_entry == 1){
            System.out.println("___Type of View___");
            backOptions();
        } else if (user_entry == 2) {
            System.out.println("___Memory status___");
            backOptions();}
        else if (user_entry == 0) phoneBook();
        else invalid();
    }

    private static void backOptions() {
        System.out.println("\t0. Back\n\t1. Main Menu");
        int user_entry = scan.nextInt();
        if (user_entry == 0) options();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void backPhoneBook() {
        System.out.println("""
                    0. Back
                    1. Main menu""");
        int user_entry = scan.nextInt();
        if (user_entry == 0) phoneBook();
        else if (user_entry == 1) mainMenu();
        else invalid();
    }

    private static void chat() {
        System.out.println("___Chat___\n\t0. Back");
        System.out.print("Enter: ");
        int user_entry = scan.nextInt();

        if (user_entry == 0) mainMenu();
        else invalid();
    }

    private static void invalid() {
        System.out.println("Invalid entry, Try again!");
    }

    private static void off() {
        System.exit(1);
    }
}
