import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int N = scan.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0 ; i < N; i++){
            int X = scan.nextInt();
            if (X >= 10 && X <= 20){
                in++;
            }
            else
                out++;
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
    }
}
//4
//        14
//        123
//        10
//        -25