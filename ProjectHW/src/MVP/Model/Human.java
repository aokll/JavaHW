package MVP.Model;

import java.time.LocalDate;
import java.util.Date;

public class Human implements ImplHuman{
    String surname;
    String name;
    String middleName;
    LocalDate birthdate;
    long phoneNumber;
    Gender gender;

    public Human(String surname, String name, String middleName, LocalDate birthdate, long phoneNumber, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public Gender getGender() {
        return gender;
    }
}
