package contactLogApp;

import java.util.ArrayList;
import java.util.List;

public class ContactLogImpl implements ContactLog{

    private List<Contact> contacts = new ArrayList<>();

    @Override
    public Contact save(Contact contact) {
        boolean contactDoesNotExist = contact.getContactId() == 0;
        if (contactDoesNotExist) saveNew(contact);
        else update(contact);
        return contact;
    }

    private void saveNew(Contact contact) {
        contact.setContactId(generateId());
        contacts.add(contact);
    }

    private int generateId() {
        return contacts.size() + 1;
    }

    private void update(Contact contact) {
        Contact oldContact = findById(contact.getContactId());
        oldContact.setTelephone(contact.getTelephone());
        oldContact.setAddress(contact.getAddress());
        oldContact.setName(contact.getName());
        oldContact.setEmail(contact.getEmail());
    }

    @Override
    public Contact findById(int contactId) {
        for (Contact contact: contacts)
            if(contact.getContactId() == contactId)
                return contact;
        return null;
    }

    @Override
    public void delete(Contact contact) {
        Contact foundContact = findById(contact.getContactId());
        contacts.remove(foundContact);
    }

    @Override
    public Iterable<Contact> findAll() {
        return contacts;
    }

    @Override
    public void clear() {
        contacts.clear();
    }

    @Override
    public long count() {
        return contacts.size();
    }
}
