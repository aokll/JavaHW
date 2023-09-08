package MVP.Model;

import java.time.LocalDate;
import java.util.List;

public class Service implements ImplService{
    Serialize serialize;
    Filter filter;

    public Service() {

        this.serialize = new Serialize();
        this.filter = new Filter();
    }
    @Override
    public void addNewHuman(String surname, String name, String middlename, LocalDate birthdate, long phoneNumber, Gender gender) throws Exception {
        serialize.getDataBase().add(new Human(surname,name,middlename,birthdate,phoneNumber,gender));

        if (filter.findFiles("D:\\test-file",".txt",surname)){
            for (Human h : serialize.getDataBase()) {
                serialize.write(h);
            }
        }else {
            for (Human h : serialize.getDataBase()) {
                serialize.write(h);
            }
        }
        serialize.getDataBase().clear();
    }

}
