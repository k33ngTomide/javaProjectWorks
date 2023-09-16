package contactLogApp;

import javax.swing.*;

public class ContactController {

    private static ContactLogImpl contactLog = new ContactLogImpl();
    public static void main(String[] args) {
        welcomeContact();
    }

    private static void welcomeContact() {

        String userInput = inputCollector("""
                Welcome
                Enter:
                1. Add Contact
                2. Update Contact
                3. Delete Contact
                4. Find Contact
                5. Exit
                """);

        switch (userInput) {
            case "1" -> addContact();
            case "2" -> updateContact();
            case "3" -> deleteContact();
            case "4" -> findContact();
            case "5" -> exitApp();
            default -> {
                displayInfo("Invalid Input, try again.");
                welcomeContact();
            }
        }
    }

    private static void exitApp() {
        displayInfo("Thank you for using this app");
        System.exit(1);
    }

    private static void findContact() {
        int contactId = Integer.parseInt(inputCollector("Enter Contact ID"));
        Contact foundContact = contactLog.findById(contactId);
        displayInfo(foundContact.toString());
        welcomeContact();
    }

    private static void deleteContact() {
        int contactId = Integer.parseInt(inputCollector("Enter Contact ID"));
        Contact foundContact = contactLog.findById(contactId);
        contactLog.delete(foundContact);
        displayInfo("Contact Deleted Successfully");
        welcomeContact();
    }

    private static void updateContact() {
        int contactId = Integer.parseInt(inputCollector("Enter Contact ID"));
        String name = inputCollector("Enter new name");
        String address = inputCollector("Enter new Address");
        String email = inputCollector("Enter new email");
        String telephone = inputCollector("Enter new phone number");

        Contact updatedContact = new Contact();
        updatedContact.setContactId(contactId);
        updatedContact.setName(name); updatedContact.setAddress(address);
        updatedContact.setEmail(email); updatedContact.setTelephone(telephone);

        Contact newUpdatedContact = contactLog.save(updatedContact);
        displayInfo("Contact Updated Successfully" + "\n" + newUpdatedContact.toString());
        welcomeContact();
    }

    private static void addContact() {
        String name = inputCollector("Enter name");
        String address = inputCollector("Enter Address");
        String email = inputCollector("Enter E-mail");
        String telephone = inputCollector("Enter phone number");

        Contact contact = new Contact();
        contact.setName(name); contact.setAddress(address);
        contact.setEmail(email); contact.setTelephone(telephone);
        Contact savedDiary = contactLog.save(contact);
        displayInfo("Contact Saved Successfully" + "\n" + savedDiary.toString());
        welcomeContact();

    }

    private static String inputCollector(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }

    private static void displayInfo(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
