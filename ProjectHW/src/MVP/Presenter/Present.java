package MVP.Presenter;

import MVP.Model.Gender;
import MVP.Model.Service;

import java.time.LocalDate;

public class Present {
    private Service service;

    public Present() {
        this.service = new Service();
    }

    public void addNewHuman(String surname, String name, String middlename, LocalDate birthdate, long phoneNumber, Gender gender) throws Exception {
        service.addNewHuman(surname,name,middlename,birthdate,phoneNumber,gender);
    }
}
