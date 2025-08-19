package String;

public class StingBuffer {
    public static void main(String[] args) {
//        String s = "hello";
//        s.concat("world");
//        System.out.println(s);

        //using String Buffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

    }
}
