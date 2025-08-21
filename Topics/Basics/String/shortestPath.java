package String;

import java.security.PublicKey;

public class shortestPath {

    public static float sortestPath(String str){
        int x = 0;
        int y = 0;

        for (int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            if (dir == 'S'){
                y--;
            }
            else if (dir == 'W'){
                x++;
            }
            else if (dir == 'N'){
                y++;
            }
            else if (dir == 'E'){
                x--;
            }

        }
        float xsquare = x*x;
        float ysquare = y*y;

        return (float)Math.sqrt(xsquare + ysquare);

    }

    public static void main(String[] args) {
        String str = "NSEWW";
        System.out.println(sortestPath(str));
    }
}
