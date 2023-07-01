/*3) К калькулятору из предыдущего ДЗ добавить логирование. */

import java.util.*;
import java.util.logging.Logger;

public class task3 {
    static Logger logging;
   /**
 * @param args
 */
public static void main(String[] args) {
        logging = Logger.getLogger(task3.class.getName());
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите первое число ");
        double d1 = scanner.nextDouble();
        System.out.print("введите /,*,+,- или sqrt для возведения в степень второго числа 2");
        String  s = scanner.next();
        System.out.print("введите второе число ");
        double d2 = scanner.nextDouble();

        if(s.equals("+")){
            System.out.println(summ(d1, d2));
            logging.info(s + "эквивалентно знаку плюс");
        }else if(s.equals("-")){
            System.out.println(vich(d1, d2));
            logging.info(s + "эквивалентно знаку минус");
        }else if(s.equals("*")){
            System.out.println(umn(d1, d2));
            logging.info(s + "эквивалентно знаку умножения");
        }else if(s.equals("/")){
            System.out.println(del(d1, d2));
            logging.info(s + "эквивалентно знаку деления");
        }else if(s.equals("sqrt")){
            System.out.println(step(d1, d2));
            logging.info(s + "эквивалентно операции возведения в степень");
        }else System.out.println("ошибка");
        
    }
    private static double summ(double x, double x1) {
        double res = x + x1;
        return res;
    }
    private static double del(double x, double x1) {
        double res = x / x1;
        return res;
    }
    private static double umn(double x, double x1) {
        double res = x * x1;
        return res;
    }
    private static double vich(double x, double x1) {
        double res = x - x1;
        return res;
    }
    private static double step(double x, double x1) {
        double res = Math.pow(x, x1);
        return res;
    }
}
