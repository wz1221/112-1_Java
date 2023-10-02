package Ex;

class CTest {
    void test(int number) {
        if (number == 0) {
            System.out.println("此數為0");
        } else if (number % 2 == 0) {
            System.out.println("此數為偶數");
        } else {
            System.out.println("此數為奇數");
        }
    }

    public static void main(String[] args) {
        CTest ctest = new CTest();

        // 測試3、8和0是否為奇數、偶數或0
        ctest.test(3);
        ctest.test(8);
        ctest.test(0);
    }
}