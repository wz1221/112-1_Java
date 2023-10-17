class CCount {
    private static int cnt = 0; // 使用類別變數來追蹤物件建立的個數

    public CCount() {
        cnt++; // 在建構子中每次建立物件時，增加cnt的值
    }

    public static void setZero() {
        cnt = 0; // 設定cnt為0
    }

    public static void setValue(int n) {
        cnt = n; // 設定cnt的值為n
    }

    public static int count() {
        return cnt; // 回傳目前物件建立的個數
    }
}

public class Class05 {
    public static void main(String[] args) {
        new CCount();
        new CCount();

        System.out.println("Number of objects created: " + CCount.count());

        CCount.setZero(); // 歸零cnt的值
        System.out.println("Number of objects after setZero(): " + CCount.count());

        CCount.setValue(5); // 設定cnt的值為5
        System.out.println("Number of objects after setValue(5): " + CCount.count());
    }
}

//(d) cnt變數應該使用「類別變數」。因為cnt的值是與整個類別相關聯的，而不是與特定的物件實例相關聯。

//(e) count()函數應該宣告為「類別函數」。因為它需要訪問類別變數cnt，而不需要特定的物件實例。