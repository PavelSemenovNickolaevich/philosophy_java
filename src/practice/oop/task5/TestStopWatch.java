package practice.oop.task5;

//Создайте класс с именем StopWatch для представления секундомера. Класс StopWatch должен содержать:
//
//        Скрытые поля данных startTime и endTime с getter-методами.
//        Безаргументный конструктор, который инициализирует startTime с текущим временем.
//        Метод с именем start(), который сбрасывает startTime до текущего времени.
//        Метод с именем stop(), который присваивает endTime текущее время.
//        Метод с именем getElapsedTime(), который возвращает прошедшее время на секундомере в миллисекундах.
//        Нарисуйте UML-диаграмму класса StopWatch, а затем реализуйте этот класс. Напишите клиент этого класса – программу, которая вычисляет время выполнения сортировки 100 000 чисел методом выбора.


public class TestStopWatch {

    public static void main(String[] args) {

        int size = 100000;

        double[] list = new double[size];

        for (int i = 0; i < list.length; i++) {
            list[i] = Math.random() * list.length;
        }

        StopWatch stopWatch = new StopWatch();
        selectionSort(list);
        stopWatch.stop();

        System.out.println("Время сортировки равно " +
                stopWatch.getElapsedTime() + " мс");
    }

    /**
     * Сортирует числа методом выбора
     */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Найти наименьший элемент в list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Переставить list[i] и list[currentMinIndex] при необходимости
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}

