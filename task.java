/*Задание

Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(12);
        list.add(1);
        list.add(250);
        list.add(3);
        list.add(9);

        print(remove(list)); //нахождение четных чисел
        System.out.println(max(list)); //нахождение максимума
        System.out.println(min(list)); //нахождение минимума
        System.out.println(midle(list)); //нахождение среднего значения

    }
    public static List<Integer> remove(List<Integer> list){
            List<Integer> list2 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)%2==0){
                    list2.add(list.get(i));
                }
            }
    return list2;
        }

    public static int min(List<Integer> list) {
        int x = Collections.min(list);
        return x;
    }  
     public static int max(List<Integer> list) {
        int x = Collections.max(list);
        return x;
    }  
    public static double midle(List<Integer> list){
        int s = 0;
        double res = 0;
        for (int i = 0; i < list.size(); i++) {
            s += list.get(i);
        }
        res = s/2;
        return res;
    }
    public static void print(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}