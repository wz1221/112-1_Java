package Class;

class CShape 
{
    public double area()
    {
        return 0.0;
    }
}

class CCircle extends CShape // 圓形類別CCircle ,繼承自CShape類別
{
    private double radius; 

    public CCircle(double r)
    {
        radius = r;
    }

    // 改寫父類別的area()函數,用來傳回圓形物件的面積
    public double area()
    {
        return Math.PI * radius * radius;
    }
}

class CSquare extends CShape // 正方形類別csquare ,繼承自CShape類別
{
    private double side;

    public CSquare(double s)
    {
        side = s;
    }

    // 改寫父類別的 area()函數,用來傳回正方形物件的面積
    public double area()
    {
        return side * side;
    }
}

class CTriangle extends CShape // 三角形類別CTriangle ,繼承自CShape類別
{
    private double base; // 三角形的底
    private double height; // 三角形的高

    public CTriangle(double b, double h)
    {
        base = b;
        height = h;
    }

    // 改寫父類別的 area()函數,用來傳回三角形物件的面積。
    public double area()
    {
        return 0.5 * base * height;
    }
}

public class Class11
{
    public static void main(String[] args)
    {
        // 建立圓形
        CCircle circle1 = new CCircle(5.0);
        CCircle circle2 = new CCircle(3.0);

        // 建立正方形
        CSquare square1 = new CSquare(4.0);
        CSquare square2 = new CSquare(2.0);

        // 建立三角形
        CTriangle triangle1 = new CTriangle(6.0, 4.0);
        CTriangle triangle2 = new CTriangle(5.0, 3.0);

        // 使用 largest()函數找出最大面積
        double maxArea = largest(circle1, circle2, square1, square2, triangle1, triangle2);

        // 輸出最大面積
        System.out.println("最大面積:" + maxArea);
    }

    // 找出(d)中的所有物件裡,面積的最大值
    public static double largest(CShape... shapes)
    {
        double maxArea = 0.0;
        for (CShape shape : shapes)
        {
            double area = shape.area();
            if (area > maxArea)
            {
                maxArea = area;
            }
        }
        return maxArea;
    }
}