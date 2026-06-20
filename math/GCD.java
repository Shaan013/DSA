package math;

// import java.lang.reflect.Array;
import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = sc.nextInt();
        // GetVector(num);
        getGCD(4, 6);

    }

    public static int[] GetVector(int numbers) {
        // int[] arr = {};
        ArrayList<Integer> arr = new ArrayList<>();

        int count = 0;
        for (int i = 1; i <= numbers / 2; i++) {
            if ((numbers % i == 0)) {
                int tem = numbers / i;
                System.out.print(" " + "vet: " + i);
                arr.add(i);
            }
        }
        return arr.toArray();
    }

    public static int getGCD(int x, int y) {
        int[] arrX = GetVector(x);
        int[] arrY = GetVector(y);
        int[] res = {};
        int count = 0;
        if (arrX.length == 0 || arrY.length == 0) {
            System.out.print("res");
            return 0;
        }
        for (int i = 0; i < arrX.length; i++) {
            for (int j = 0; j < arrY.length; j++) {
                if (arrX[i] == arrY[j]) {
                    if (arrX[i] > arrY[j]) {
                        break;
                    }
                    System.out.print("res" + arrY[j]);
                    // res[count] = arrY[j];
                }
            }

        }

        for (int i : res) {
            System.out.print("sadf" + i);
        }
        return 0;

    }
}
