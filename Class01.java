public class Class01 {
    class CRectangle {
        int width;
        int height;

        // (a) 有引數的建構元
        public CRectangle(int w, int h) {
            width = w;
            height = h;
        }

        // (b) 沒有引數的建構元，不使用this()
        public CRectangle() {
            width = 10;
            height = 8;
        }

        // (c) 沒有引數的建構元，使用this()
    //    public CRectangle() {
    //        this(10, 8); // 使用this()呼叫有引數的建構元
    //    }
    }
}