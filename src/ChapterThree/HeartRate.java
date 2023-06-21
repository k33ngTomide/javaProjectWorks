package ChapterThree;

import java.time.LocalDate;
import java.time.Month;

public class HeartRate {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    public HeartRate(String firstName, String lastName, int day, String month, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        dateOfBirth = LocalDate.of(year, Month.valueOf(month.toUpperCase()), day);
    }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastname) { this.lastName = lastname; }
    public String getLastName() { return lastName; }

    public void setDateOfBirth(int day, String month, int year){
        dateOfBirth = LocalDate.of(year, Month.valueOf(month.toUpperCase()), day);
    }
    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public int calculateAge(){
        int age;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
        return age;
    }


    public int maximumHeartRate() {
        int heartRate;
        heartRate = 220 - calculateAge();
        return heartRate;
    }

    public String targetHeartRate() {
        double targetHeart1, targetHeart2;
        targetHeart1 = 0.5 * maximumHeartRate();
        targetHeart2 = 0.8 * maximumHeartRate();
        String target;
        target = targetHeart1 + " - " + targetHeart2;
        return target;
    }


}
