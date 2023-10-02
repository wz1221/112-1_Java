package Ex;

class CBox {
    int length;
    int width;
    int height;

    // (b) 定義volume()函數，傳回box物件的體積
    int volume() {
        return length * width * height;
    }

    // (c) 定義surfaceArea()函數，傳回box物件的表面積
    int surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    // (d) 定義showData()函數，顯示box物件length、width、height三個資料成員的值
    void showData() {
        System.out.println("長度：" + length);
        System.out.println("寬度：" + width);
        System.out.println("高度：" + height);
    }

    // (e) 定義showAll()函數，顯示box物件length、width、height三個資料成員的值，
    // 以及其表面積與體積
    void showAll() {
        showData();
        System.out.println("表面積：" + surfaceArea());
        System.out.println("體積：" + volume());
    }
}

public class Ex05 {
    public static void main(String[] args) {
        // (a) 使用CBox類別建立box物件，並將其length、width、height三個資料成員的值設為1
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;

        // (e) 顯示box物件的資料以及表面積和體積
        System.out.println("箱子的資料和計算結果：");
        box.showAll();
    }
}