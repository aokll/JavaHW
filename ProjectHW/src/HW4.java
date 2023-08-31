import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/*Разработайте программу, которая выбросит
Exception, когда пользователь вводит пустую строку. Пользователю
должно показаться сообщение, что пустые строки вводить нельзя.*/
public class HW4 {

    public void met() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("введите текст");
        while (true){
            String str = reader.readLine();
            if(str.equals("")){
                throw new Exception();
            }
            }
        }
    }
}
