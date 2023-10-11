import java.util.Scanner;

public class GetMaxArray2 {
    public static void main(String[] args) {
        int[][] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang: ");
        int size1 = scanner.nextInt();
        System.out.println("Nhap kich thuoc mang con: ");
        int size2 = scanner.nextInt();
        arr = new int[size1][size2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap gia tri phan tu thu " + (j + 1) + " trong mang con thu " + (i + 1));
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = getMaxArray2(arr);
        System.out.println("Phan tu lon nhat co gia tri: " + max);
    }
    public static int getMaxArray2(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
