class Circle {
    private static double pi = 3.14;
    private double radius;

    public Circle(double r) { // Circle建構子
        radius = r;
    }

    public void show() {
        System.out.printf("area=%.2f\n", pi * radius * radius);
    }
}

public class Class16 {
    public static void main(String[] args) {
        Circle[] cir = new Circle[6]; // 宣告一個Circle陣列，長度為6

        for (int i = 0; i < cir.length; i++) {
            cir[i] = new Circle(i); // 使用for迴圈建立Circle物件，並傳入i作為半徑
        }

        for (int i = 0; i < cir.length; i++) {
            System.out.print("Object " + i + ": ");
            cir[i].show(); // 利用迴圈列印每個物件的資料
        }
    }
}
