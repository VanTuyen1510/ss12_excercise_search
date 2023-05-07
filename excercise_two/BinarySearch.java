package ss12_excercise_search.excercise_two;

import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử của mảng :");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Phần tử sau khi được sắp xếp ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t");;
        }

        System.out.println("Phần tử bạn cần tìm là :");
        int value = sc.nextInt();
        System.out.println( "Phần tử cần tìm có chỉ số là : " + binarySearch(array,0,array.length-1,value));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int high = array.length-1;
        while (high > left){
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                left = middle + 1; //???
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}