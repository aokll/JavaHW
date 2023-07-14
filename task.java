import java.util.*;

/*Задание

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными
 телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть
 отсортирован по убыванию числа телефонов.*/
public class task {
    public static HashMap<Integer,String> telephoneBook = new HashMap<>();

    public static void main(String[] args) {
       telBook.node();
    }
    
    public static class telBook{
        public static void node(){
            Scanner scanner = new Scanner(System.in);
            label1:
            while (true) {
                System.out.println("Введите команду: " +
                        "1 - добавить данные;" +
                        " 2 - удалить данные;" +
                        " 3 - посмотреть телефонную книгу;" +
                        " 4 - выход.");
                int command = scanner.nextInt();


                if (command == 1) {
                    System.out.println("Ведите фамилию");
                    String surname = scanner.next();
                    System.out.println("Ведите номер телефона");
                    int telephoneNumber = scanner.nextInt();
                    add(surname, telephoneNumber);
                } else if (command == 2) {
                    System.out.println("Ведите номер телефона");
                    int telephoneNumber = scanner.nextInt();
                    remove(telephoneNumber);
                } else if (command == 3) {
                    if (telephoneBook.isEmpty()){
                        System.out.println("Книга пуста");
                        continue label1;
                    }
                    print();
                } else if (command == 4) {
                    break;
                }
            }

        }
        public static void add (String str,Integer integer){
            telephoneBook.put(integer,str);
        }
        public static void remove (Integer integer){
            for (HashMap.Entry<Integer,String> k : telephoneBook.entrySet()) {
                if(k.getKey() == integer){
                    telephoneBook.remove(integer);
                }else if (k.getKey() != integer){
                    System.out.println("Такого номера не существует");
                    break;
                }
            }
        }
        public static void print () {
            TreeMap<Integer,String> treeMap = new TreeMap<>();

            for (HashMap.Entry<Integer,String> k : telephoneBook.entrySet()) {
                treeMap.put(k.getKey(), k.getValue());
            }

            for (HashMap.Entry<Integer,String> k : treeMap.entrySet()) {
                System.out.println(k.getValue() + " " + k.getKey());
            }
        }
    }
}

