//package practice.oop.task7;
//
////В программе TotalArea используется массив объектов. Она суммирует площади кругов, содержащихся в массиве.
////        В ней создается массив circleArray, состоящий из пяти объектов типа Circle, затем инициализируются
////        радиусы со случайными значениями и отображается общая площадь всех кругов, содержащихся в массиве.
//
//
//public class TotalArea {
//    /** Метод main */
//    public static void main(String[] args) {
//        // Объявить массив circleArray
//        Circle[] circleArray;
//
//        // Создать объект circleArray
//        circleArray = createCircleArray();
//
//        // Отобразить circleArray и общую площадь всех кругов
//        printCircleArray(circleArray);
//    }
//
//    /** Создает массив объектов типа Circle */
//    public static Circle[] createCircleArray() {
//        Circle[] circleArray = new Circle[5];
//
//        for (int i = 0; i < circleArray.length; i++) {
//            circleArray[i] = new Circle(Math.random() * 100);
//        }
//
//        // Вернуть массив типа Circle
//        return circleArray;
//    }
//
//    /** Отображает массив кругов и их общую площадь */
//    public static void printCircleArray(Circle[] circleArray) {
//        System.out.println("Радиус\t\t\tПлощадь");
//        for (int i = 0; i < circleArray.length; i++) {
//            System.out.println(circleArray[i].getRadius() + "\t"
//                    + circleArray[i].getArea());
//        }
//
//        System.out.println("-----------------------------------------");
//
//        // Вычислить и отобразить результат
//        System.out.print("Общая площадь равна \t" + sum(circleArray));
//    }
//
//    /** Складывает площади кругов */
//    public static double sum(Circle[] circleArray) {
//        // Инициализировать сумму
//        double sum = 0;
//
//        // Прибавить площади к сумме
//        for (int i = 0; i < circleArray.length; i++)
//            sum += circleArray[i].getArea();
//
//        return sum;
//    }
//}