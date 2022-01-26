package practice.recursion;

public class simpleTask {

//    Задан массив чисел A. Разработать рекурсивную функцию, которая находит сумму элементов массива:

    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        System.out.println(sum(0, arr));

    }

    static int sum(int i , int[] a) {
        if (i == (a.length - 1)) {
            return a[i];
        }
        return a[i] + sum(i + 1 , a);
    }
}
