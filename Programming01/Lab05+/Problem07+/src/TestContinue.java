import java.util.*;

public class TestContinue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while (num < 20){
            num++;

            if( num == 10 || num == 11)
                continue;
            sum += num;
        }
        System.out.println("The number is " + num);
        System.out.println("The sum is " + sum);
    }
}
