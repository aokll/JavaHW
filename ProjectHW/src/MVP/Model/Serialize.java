package MVP.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialize implements ImplSerialize {

    private List<Human> dataBase;

    public Serialize() {
        this.dataBase = new ArrayList<>();
    }

    public List<Human> getDataBase() {
        return dataBase;
    }

    @Override
    public void createFile(Human human) throws IOException {
        String way = String.format("D:\\test-file\\%s.txt",human.surname);
        File file = new File(way);
        file.createNewFile();
    }

    @Override
    public void write(Human human) throws Exception {
        String way = String.format("D:\\test-file\\%s.txt",human.surname);
        String h = String.format("<%s><%s><%s><%s><%d><%s>\n",human.getSurname(),human.getName(),human.getMiddleName(),human.getBirthdate(),human.phoneNumber,human.getGender());
        File myFile = new File(way);
        try (FileOutputStream outputStream = new FileOutputStream(myFile, true))
        {
            byte[] buffer = h.getBytes();
            outputStream.write(buffer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
