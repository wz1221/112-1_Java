package Class;

class Caaa {
    private int num;

    public Caaa(int n) {
        num = n;
    }

    public int get() {
        return num;
    }

    //(a)加入一個display()函數,它可顯示岀"printed from Caaa class" 字串。
    public void display() {
        System.out.println("printed from Caaa class");
    }
}

class Cbbb extends Caaa {
    public Cbbb(int n) {
        super(n);
    }

    public void show() {
        System.out.println("num=" + get());
    }

    //(b)加入display()函數,用來改寫父類別的display()。子類別的display()可用來顯示出"printed from Cbbb class"字串。
    public void display() {
        System.out.println("printed from Cbbb class");
    }
}

public class Class09 {
    public static void main(String args[]) {
        Caaa bb = new Cbbb(2); 
        bb.display(); 
    }
}
//(c)子類別