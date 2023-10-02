package Ex;

class CWin {    
    int width;
    int height;
    String name;

    void setW(int w) // 設定寬度的函數
    {
        width = w;
    }

    void setH(int h) // 設定高度的函數
    {
        height = h;
    }

    void setName(String s) // 設定視窗名稱的函數
    {
        name = s;
    }

    public void show()
    {
        System.out.println("Name=" + name);
        System.out.println("W=" + width + ", H=" + height);  
    }

    // (b) 新增的setWindows(int w, int h)函數，同時設定寬度和高度
    void setWindows(int w, int h)
    {
        width = w;
        height = h;
    }

    // (c) 多載的setWindows()函數，同時設定寬度、高度和名稱
    void setWindows(int w, int h, String s)
    {
        width = w;
        height = h;
        name = s;
    }
}

public class Ex12
{
    public static void main(String arg[])
    {
        CWin cw = new CWin();
        cw.setName("My Windows");
        cw.setW(5);
        cw.setH(3);
        cw.show();
        
        // 使用新增的setWindows()函數
        cw.setWindows(8, 6);
        cw.show();

        // 使用多載的setWindows()函數
        cw.setWindows(10, 4, "New Window");
        cw.show();
    }
}