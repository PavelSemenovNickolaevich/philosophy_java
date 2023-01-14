package practice.generic;


//Реализуйте алгоритм линейного поиска элемента в массиве.
//        При нахождении элемента необходимо вернуть его позицию в массиве. Если элемент не найден, то вернуть -1.


public class TestComparableWithSearch {

    public static void main(String[] args) {
        Integer[] list = {3, 4, 5, 1, -3, -5, -1};
        System.out.println(linearSearch(list, 2));
        System.out.println(linearSearch(list, 5));

    }

    public static<E> int linearSearch(E[] list, E key) {
      for(int i = 0; i < list.length - 1; i++) {
          if (list[i].equals(key)) {
              return i;
          }
      }
        return -1;
    }
}
