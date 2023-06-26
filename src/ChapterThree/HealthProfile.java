package ChapterThree;

import java.sql.Date;

public class HealthProfile {

    private String firstname;
    private String lastname;
    private String gender;
    private double height;
    private double weight;
    private Date dateOfBirth;
    public HealthProfile(String firstname, String lastname, String gender, double height, double weight, Date dateOfBirth){
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
