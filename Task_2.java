package For_java_HW;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n =  ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print("Введите число:  ");
            array[i] = sc.nextInt();
        }
        System.out.print("Введите множитель:  ");
        int num = sc.nextInt();
        for (int i : array) {
            System.out.println(i * num);
        }
        sc.close();
    }
}
