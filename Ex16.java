package Ex;

class CSphere {
    private int x; // 圓心的X座標
    private int y; // 圓心的Y座標
    private int z; // 圓心的Z座標
    private int radius; // 圓球的半徑

    // (a) 加入setLocation()函數，用來設定圓心的位置
    void setLocation(int newX, int newY, int newZ) {
        x = newX;
        y = newY;
        z = newZ;
    }

    // (b) 加入setRadius()函數，用來設定半徑
    void setRadius(int newRadius) {
        radius = newRadius;
    }

    // (c) 加入surfaceArea()函數，傳回圓球的表面積
    double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // (d) 加入volume()函數，傳回圓球的體積
    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // (e) 加入showcenter()函數，顯示圓心座標
    void showcenter() {
        System.out.println("圓心座標：(" + x + ", " + y + ", " + z + ")");
    }
}

public class Ex16 {
    public static void main(String[] args) {
        CSphere sphere = new CSphere();

        // (a) 設定圓心位置為(3, 4, 5)
        sphere.setLocation(3, 4, 5);

        // (b) 設定半徑為1
        sphere.setRadius(1);

        // 顯示圓心座標
        sphere.showcenter();

        // 計算並顯示表面積和體積
        System.out.println("表面積：" + sphere.surfaceArea());
        System.out.println("體積：" + sphere.volume());
    }
}