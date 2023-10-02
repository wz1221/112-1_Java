package Ex;

class Cbbb {
    double x;
    double y;
}

public class Ex02 {
    public static void main(String[] args) {
        // (a) 建立Cbbb類別型態的物件obj1、obj2與avg
        Cbbb obj1 = new Cbbb();
        Cbbb obj2 = new Cbbb();
        Cbbb avg = new Cbbb();

        // (b) 設定obj1的x和y的值
        obj1.x = 5.2;
        obj1.y = 3.9;

        // (c) 設定obj2的x和y的值
        obj2.x = 6.5;
        obj2.y = 4.6;

        // (d) 計算並設定avg的x值
        avg.x = (obj1.x + obj2.x) / 2.0;

        // (e) 計算並設定avg的y值
        avg.y = (obj1.y + obj2.y) / 2.0;

        // (f) 印出obj1、obj2和avg的值
        System.out.println("obj1的值：x = " + obj1.x + ", y = " + obj1.y);
        System.out.println("obj2的值：x = " + obj2.x + ", y = " + obj2.y);
        System.out.println("avg的值：x = " + avg.x + ", y = " + avg.y);
    }
}