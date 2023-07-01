/*2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации
 запишите в лог-файл. */
public class task2 {
    private long[] a;   //ссылка на массив
    private int elems;  //количество элементов в массиве
    public static void main(String[] args) {
        Integer[] array = new Integer[5]; //Создаем массив array на 5 элементов

        array[0] = 163;       //заполняем массив
        array[1] = 300;
        array[2] = 184;
        array[3] = 191;
        array[4] = 174;

    }

    public void bubbleSorter(){                      //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = elems - 1; out >= 1; out--){  //Внешний цикл
            for (int in = 0; in < out; in++){        //Внутренний цикл
                if(a[in] > a[in + 1])                //Если порядок элементов нарушен
                    toSwap(in, in + 1);              //вызвать метод, меняющий местами
            }
    }
}
private void toSwap(int first, int second){ //метод меняет местами пару чисел массива
        long dummy = a[first];              //во временную переменную помещаем первый элемент
        a[first] = a[second];               //на место первого ставим второй элемент
        a[second] = dummy;                  //вместо второго элемента пишем первый из временной памяти
    }

}
