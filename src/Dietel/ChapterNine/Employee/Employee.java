package Dietel.ChapterNine.Employee;

public class Employee {

    private String firstName;
    private String lastName;
    private final String socialSecurityNumber;


    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee\n" +
                "First Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n' +
                "Social Security Number='" + socialSecurityNumber ;
    }
}
