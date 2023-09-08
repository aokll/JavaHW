package MVP.Model;

import java.time.LocalDate;
import java.util.Date;

public interface ImplHuman {
    String getSurname();

    String getName();

    String getMiddleName();

    LocalDate getBirthdate();

    long getPhoneNumber();

    Gender getGender();
}
