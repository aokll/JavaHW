package MVP.View.Console;

import MVP.Model.Gender;
import MVP.Presenter.Present;
import MVP.View.MenuClass;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Console {
    private final Present present;
    private final Scanner scanner;
    private final MenuClass menuClass;
    boolean flag = true;

    public Console() {
        this.present = new Present();
        this.scanner = new Scanner(System.in);
        menuClass = new MenuClass(this);
    }

    //@Override
    public void start() throws Exception {
        System.out.println("Привет");

        while (flag){
            System.out.println(menuClass.menu());
            operation();
        }
    }
    public void finish(){
        scanner.close();
        flag = false;
    }

    public Gender gender(){
        String gender = scanner.next();
        if (gender.equals("м")){
            return Gender.m;
        } else if (gender.equals("ж"))
            return Gender.f;
        return null;
    }

    public void addHuman() throws Exception {
        System.out.println("укажите фамилию");
        String surname = scanner.next();
        System.out.println("укаите имя");
        String name = scanner.next();
        System.out.println("укажите отчество");
        String middlename = scanner.next();
        System.out.println("укажите дату рождения");
        System.out.println("год");
        int yearOfBirth = scanner.nextInt();
        System.out.println("месяц");
        int birthMonth = scanner.nextInt();
        System.out.println("день");
        int dayOfBirth = scanner.nextInt();
        LocalDate localDate = LocalDate.of(yearOfBirth,birthMonth,dayOfBirth);
        System.out.println("укажите номер телефона");
        long phoneNumber = scanner.nextLong();
        System.out.println("укажите пол");
        Gender gender = gender();
        present.addNewHuman(surname,name,middlename,localDate,phoneNumber,gender);
    }
    public void operation() throws Exception {

        menuClass.execute(tryingOutACommand());

    }
    public Integer tryingOutACommand(){
        int commandTestValue = 0;
        label:
        while (true) {
            String checkValueForOtherCharacters = null;
            checkValueForOtherCharacters = scanner.next();
            Pattern c = Pattern.compile(".*[A-Za-zА-Яа-я<>,./|}{()!&?~Ёё`].*");
            boolean b = checkValueForOtherCharacters.matches(c.pattern());
            if (b) {
                System.out.println("Должны быть только числа, попробуйте еще раз");
                continue label;
            }
            commandTestValue = Integer.parseInt(checkValueForOtherCharacters);
            if (commandTestValue <= 0 || commandTestValue > menuClass.getListOfCommands().size()){
                System.out.println("Таких вариантов нет, попробуйте еще раз");
                continue label;
            }
            break;
        }
        return commandTestValue;
    }
}
