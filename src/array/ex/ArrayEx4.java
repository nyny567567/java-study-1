package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("총 합계: " + sum);
        System.out.println("총 평균: " + average);
    }
}
