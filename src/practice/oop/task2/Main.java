package practice.oop.task2;


//Создать класс, описывающий банкомат.
//
//        Банкомат задается тремя свойствами:
//        - количеством купюр номиналом 20, 50 и 100.
//
//        Сделать методы для добавления денег в банкомат.
//
//        Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
//
//        При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
//
//        Создать конструктор с тремя параметрами - количеством купюр каждого номинала.


public class Main {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(4, 10, 10);
        bankomat.addMoney20();
        bankomat.addMoney20();
        bankomat.addMoney50();
        bankomat.addMoney100();
        bankomat.getMoney(1034);



    }


}
