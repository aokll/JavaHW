/*Задание 2 Если необходимо, исправьте данный код.
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
*/
public class HW2 {


    int[] intArray = {1,2,3,4,5,6,7,8,9,8};//создал массив и заполнил его
    //int d = 0; на ноль делить нельзя
    int d = 10;
        public void method2() {
            try{
            double catchedRes1 = (double) intArray[8] / d;//привел к типу double
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e)
            {
        System.out.println("Catching exception: " + e);
            }
        }
}
