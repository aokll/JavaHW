package MVP.Model;

import java.time.LocalDate;

public interface ImplService {
    void addNewHuman(String surname, String name, String middlename, LocalDate birthdate, long phoneNumber, Gender gender) throws Exception;

}
