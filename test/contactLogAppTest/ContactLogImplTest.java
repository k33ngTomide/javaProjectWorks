package contactLogAppTest;

import contactLogApp.Contact;
import contactLogApp.ContactLogImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ContactLogImplTest {

    private ContactLogImpl contactLog;

    @BeforeEach void setUp() {
        contactLog = new ContactLogImpl();
    }

    @Test void saveContactIncreasesCountTest() {
        Contact contact = new Contact();
        contactLog.save(contact);

        assertEquals(1, contactLog.count());
    }

    @Test void saveContact_findContactTest() {
        Contact contact = new Contact();
        contactLog.save(contact);

        assertEquals(contact, contactLog.findById(contact.getContactId()));
    }

    @Test void updateContact() {
        Contact contact = new Contact();
        contact.setName("Muiliyu Sodiq");
        contactLog.save(contact);

        Contact newContact = new Contact();
        newContact.setContactId(1);
        newContact.setAddress("Sabo Yaba");
        newContact.setEmail("Nothing@gmail.com");
        newContact.setName("Nothing Ham");
        newContact.setTelephone("081010101");
        contactLog.save(newContact);

        assertEquals(newContact, contactLog.findById(contact.getContactId()));

    }

    @Test void addMoreContacts_increasesCount(){
        Contact contact = new Contact();
        contactLog.save(contact);

        Contact newContact = new Contact();
        contactLog.save(newContact);

        assertEquals(2, contactLog.count());

        Contact anotherContact = new Contact();
        contactLog.save(anotherContact);
        assertEquals(3, contactLog.count());

    }

    @Test void findContactById_returnsNull_ifContactIdDoestNotExist() {
        Contact contact = new Contact();
        contactLog.save(contact);

        assertNull(contactLog.findById(2));
    }

    @Test void deleteContact_decreasesCount() {
        Contact contact = new Contact();
        Contact newContact = new Contact();
        contactLog.save(contact);
        contactLog.save(newContact);
        assertEquals(2, contactLog.count());

        contactLog.delete(contact);
        assertEquals(1, contactLog.count());
    }

    @Test void deleteContact_removesContact_returnsNull() {
        Contact contact = new Contact();
        Contact newContact = new Contact();
        contactLog.save(contact);
        contactLog.save(newContact);
        assertEquals(2, contactLog.count());

        contactLog.delete(contact);
        assertNull(contactLog.findById(contact.getContactId()));
    }



    @Test void findAll() {
        Contact contact = new Contact();
        contactLog.save(contact);

        Contact newContact = new Contact();
        contactLog.save(newContact);

        Contact anotherContact = new Contact();
        contactLog.save(anotherContact);

        Iterable<Contact> contactIterable = List.of(new Contact[]
                {contact, newContact, anotherContact});
        assertEquals(contactIterable, contactLog.findAll());
    }

    @Test void clearReturnsCountToZero() {
        Contact contact = new Contact();
        contactLog.save(contact);

        Contact newContact = new Contact();
        contactLog.save(newContact);

        Contact anotherContact = new Contact();
        contactLog.save(anotherContact);
        assertEquals(3, contactLog.count());

        contactLog.clear();
        assertEquals(0, contactLog.count());

    }

    @Test void clearRemovesAllContacts() {
        Contact contact = new Contact();
        contactLog.save(contact);

        Contact newContact = new Contact();
        contactLog.save(newContact);

        Contact anotherContact = new Contact();
        contactLog.save(anotherContact);
        assertEquals(3, contactLog.count());

        contactLog.clear();
        assertNull(contactLog.findById(contact.getContactId()));
        assertNull(contactLog.findById(newContact.getContactId()));
        assertNull(contactLog.findById(anotherContact.getContactId()));
    }
}