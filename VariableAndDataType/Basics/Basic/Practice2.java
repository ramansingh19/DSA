package Basic;

public class Practice2 {
    public static void main(String[] args) {
        byte b = 4;
        char ch = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double res = (f*b) + (i % ch) - (d * s);
        System.out.println(res);
    }
}
