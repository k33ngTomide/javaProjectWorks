package contactLogApp;

public interface ContactLog {

    Contact save(Contact contact);

    Contact findById(int contactId);

    void delete(Contact contact);

    Iterable<Contact> findAll();

    void clear();

    long count();

}
