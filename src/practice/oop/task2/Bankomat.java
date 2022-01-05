package practice.oop.task2;

public class Bankomat {

    private int countOf20;
    private int countOf50;
    private int countOf100;
    static int totalSum;

    public Bankomat(int countOf20, int countOf50, int countOf100) {
        this.countOf20 = countOf20;
        this.countOf50 = countOf50;
        this.countOf100 = countOf100;
    }

    public void addMoney20() {
        countOf20++;
        totalSum += countOf20 * 20 + countOf50 * 50 + countOf100 * 100;
        System.out.printf("%s, %s, %s", countOf20, countOf50, countOf100);
        System.out.println("\n" +totalSum);
    }

    public void addMoney50() {
        countOf50++;
        totalSum += countOf20 * 20 + countOf50 * 50 + countOf100 * 100;
        System.out.printf("%s, %s, %s", countOf20, countOf50, countOf100);
        System.out.println("\n" +totalSum);
    }

    public void addMoney100() {
        countOf100++;
        totalSum += countOf20 * 20 + countOf50 * 50 + countOf100 * 100;
        System.out.printf("%s, %s, %s", countOf20, countOf50, countOf100);
        System.out.println("\n" +totalSum);
    }

    public void getMoney(int sum){

        int a,b,c;

        if (sum % 100 == 0) {
            System.out.printf("\nКоличество купюр %s. Номинал купюр: 100", sum / 100);
        } else {
            a = sum / 100;
            System.out.printf("\nКоличество купюр %s. Номинал купюр: 100", a);
            if ((sum - a * 100) % 50 == 0) {
                int difOne = sum - a * 100;
                System.out.printf("\nКоличество купюр %s. Номинал купюр: 50", difOne / 50);
            } else {
                b = (sum - a * 100) / 50;
                System.out.printf("\nКоличество купюр %s. Номинал купюр: 50", b);
                if (((sum % 100) - b * 50) % 20 == 0) {
                    System.out.printf("\nКоличество купюр %s. Номинал купюр: 20", ((sum % 100) - b * 50) / 20);
                } else {
                    c = ((sum % 100) - b * 50) / 20;
                    System.out.printf("\nКоличество купюр %s. Номинал купюр: 20", c);
                    int part = (sum - a * 100 - b * 50 - c * 20);
                    System.out.println();
                    System.out.println("Неразменных " + part);
                }
            }
        }
//
//        }
//        int diff = totalSum - sum;
//        System.out.println("\nОсталось в банкомате : " + diff);
//
//        return true;
//        int[] Q = {100, 50, 20};
//        int n, q, x; //q - вспомогательная переменная в цикле
//        x=0; //количество купюр,  ему по умолчанию присваивается 0
//        for(int i = 0; i < Q.length; ++i) //цикл перебирает все элементы массива, от большего к меньшему
//        {
//            q = Q[i];
//            x += sum / q; //считаем, сколько раз входит купюра в сумму
//            sum %= q;  //сумме присваивается остаток от деления на данную купюр
//        }
//        if(sum > 0) x = -1; //проверяем наличие остатка, который банкомат не сможет выдать
//        System.out.format("%d", x);

    }

    public int getCountOf20() {
        return countOf20;
    }

    public void setCountOf20(int countOf20) {
        this.countOf20 = countOf20;
    }

    public int getCountOf50() {
        return countOf50;
    }

    public void setCountOf50(int countOf50) {
        this.countOf50 = countOf50;
    }

    public int getCountOf100() {
        return countOf100;
    }

    public void setCountOf100(int countOf100) {
        this.countOf100 = countOf100;
    }
}
