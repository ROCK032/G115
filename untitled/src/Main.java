import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum =0;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            array.add(in.nextInt());
        }

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)>0) {
                sum++;
            }
        }

        System.out.println(sum);

    }
}