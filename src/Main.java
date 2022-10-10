import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] numArr = new double[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] =  Math.floor(Math.random() * 10);
            System.out.print(numArr[i] + " ");
        }
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can xoa");
        double xDel = scanner.nextDouble();
        for (int i = 0; i < numArr.length; i++) {
            if (xDel == numArr[i]) {
                for (int j = i; j < numArr.length -1; j++) {
                    numArr[j] = numArr[j + 1];
                }
            }
            System.out.print(numArr[i] + " ");
        }



    }
}