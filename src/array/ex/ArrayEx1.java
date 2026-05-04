package array.ex;

public class ArrayEx1 {
    static void main(String[] args) {
        int[] array = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        double averaage = (double) total / array.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + averaage);

    }
}
