package String;

public class StingBuffer {
    public static void main(String[] args) {
        String s = "hello";
        s.concat("world");
        System.out.println(s);

        //using String Buffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, ",");
        System.out.println(sb);

        sb.replace(0,5, "Hi");
        System.out.println(sb);

        sb.delete(3,9);
        System.out.println(sb);

        sb.append("Chikku");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
