package Class;

class Caaa {
    public int num1;
    public int num2;

    // 加入一個沒有引數的建構元,設定num1和num2初值為1
    public Caaa() {
        num1 = 1;
        num2 = 1;
    }

    // 加入一個有引數的建構元,設定num1值為a和num2值為b
    public Caaa(int a, int b) {
        num1 = a;
        num2 = b;
    }
}

class Cbbb extends Caaa {
    // 加入建構元Cbbb(int a, int b),用來呼叫父類別的建構元Caaa(int a, int b)
    public Cbbb(int a, int b) {
        super(a, b);
    }
}

public class Class03 {
    public static void main(String args[]) {
        // 測試(a)
        Caaa a1 = new Caaa();
        System.out.println("a1.num1 = " + a1.num1);
        System.out.println("a1.num2 = " + a1.num2);

        // 測試(b)
        Caaa a2 = new Caaa(3, 4);
        System.out.println("a2.num1 = " + a2.num1);
        System.out.println("a2.num2 = " + a2.num2);

        // 測試(c)
        Cbbb bb = new Cbbb(5, 10);
        System.out.println("bb.num1 = " + bb.num1);
        System.out.println("bb.num2 = " + bb.num2);
    }
}
