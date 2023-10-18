package Class;

// 定義基本的 CTriangle 類別，代表三角形
class CTriangle {
    protected int base;
    protected int height;

    // 顯示 base 和 height 的成員函數
    protected void show() {
        System.out.println("base=" + base + ", height=" + height);
    }
}

// 建立類別 CData 繼承自 CTriangle
class CData extends CTriangle {
    // CData 的建構元，接收 base 和 height 參數
    public CData(int b, int h) {
        base = b;
        height = h;
    }

    // 計算並顯示三角形的面積
    public void area() {
        // 先呼叫 show 函數顯示 base 和 height
        show();
        // 計算三角形面積並輸出
        double triangleArea = 0.5 * base * height;
        System.out.println("area=" + triangleArea);
    }
}

public class Class06 {
    public static void main(String[] args) {
        // 創建 CData 的物件，傳入 base=3 和 height=8 的參數
        CData obj = new CData(3, 8);
        // 呼叫 area 函數以顯示三角形資訊和面積
        obj.area();
    }
}
