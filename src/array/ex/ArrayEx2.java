package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        System.out.print("5개의 정수를 입력하세요: ");
        for(int i = 0; i < array.length; i++){
        array[i] = input.nextInt();
        }

        System.out.println("출력");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
            if(j != array.length - 1) {
                System.out.print(",");
            }
        }
    }
}
