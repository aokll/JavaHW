//3) Реализовать простой калькулятор
import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите первое число ");
        double d1 = scanner.nextDouble();
        System.out.print("введите /,*,+,- или sqrt для возведения в степень второго числа 2");
        String  s = scanner.next();
        System.out.print("введите второе число ");
        double d2 = scanner.nextDouble();

        if(s.equals("+")){
            System.out.println(summ(d1, d2));
        }else if(s.equals("-")){
            System.out.println(vich(d1, d2));
        }else if(s.equals("*")){
            System.out.println(umn(d1, d2));
        }else if(s.equals("/")){
            System.out.println(del(d1, d2));
        }else if(s.equals("sqrt")){
            System.out.println(step(d1, d2));
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
