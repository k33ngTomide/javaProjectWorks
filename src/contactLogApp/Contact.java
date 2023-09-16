package contactLogApp;

import java.util.Objects;

public class Contact {

    int contactId;

    private String name;

    private String Address;

    private String Telephone;

    private String email;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return contactId == contact.contactId &&
                Objects.equals(name, contact.name) &&
                Objects.equals(Address, contact.Address) &&
                Objects.equals(Telephone, contact.Telephone) &&
                Objects.equals(email, contact.email);
    }

    @Override
    public String toString() {
        String stars = "^".repeat(30);
        return String.format("""
                %s
                Contact Id: %d
                Contact Name: %s
                Address: %s
                Telephone: %s
                E-mail: %s
                %s""", stars, getContactId(), getName(), getAddress(),
                getTelephone(), getEmail(), stars);
    }
}
