
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа
// (типа float), и возвращает введенное значение. Ввод текста вместо числа не
// должно приводить к падению приложения, вместо этого, необходимо повторно
// запросить у пользователя ввод данных.
public class HW1 {
    Scanner scanner = new Scanner(System.in);
    public float InputOfNumber() throws IOException {
        float val = 0;
        String str = null;
        System.out.println("Введите дробное число");
        while (true) {
            str = scanner.next();
            Pattern p = Pattern.compile(".*[A-Za-z].*");
            if (!str.matches(p.pattern())){
                    val = Float.parseFloat(str);
                    if (val > -3.4*(Math.pow(10,38)) && val <= 3.4*(Math.pow(10,38))){
                        scanner.close();
                        return val;
                }else  System.out.println("Введите дробное число снова");
            }else  System.out.println("Введите дробное число снова");
        }

    }
}
