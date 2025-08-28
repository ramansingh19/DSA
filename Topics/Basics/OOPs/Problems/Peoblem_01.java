package OOPs.Problems;

public class Peoblem_01 {
    public static void main(String[] args) {
            Test t = new Test();
            t.ChangeB();
        System.out.println(Test.a + Test.b);
    }
}

class Test{
    static int a = 10;
    static int b;
    static void ChangeB(){
        b = a * 3;
    }
}

