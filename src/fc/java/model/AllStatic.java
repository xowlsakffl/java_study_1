package fc.java.model;

public class AllStatic {
    private AllStatic(){} // 인스턴스 객체로 접근 못하게

    public static int hap(int a, int b){
        int v = a+b;
        return v;
    }

    public static int max(int a, int b){
        int v = a>b?a:b;
        return v;
    }

    public static int min(int a, int b){
        int v = a<b?a:b;
        return v;
    }
}
