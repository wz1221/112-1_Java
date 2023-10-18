package Class;

class Caaa {
    public int num1;
    public int num2;
}

// 子類別 Cbbb 繼承自父類別 Caaa
class Cbbb extends Caaa {
    // set_num 函數用於設定從父類別繼承的 num1 和 num2 成員
    public void set_num(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    // show 函數用於顯示 num1 和 num2 的值
    public void show() {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

public class Class01 {
    public static void main(String args[]) {
        Cbbb bb = new Cbbb();
        bb.set_num(5, 10); // 使用 set_num 函數設定 num1 和 num2 的值
        bb.show(); // 使用 show 函數顯示結果
    }
}