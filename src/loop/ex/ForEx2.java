package loop.ex;

public class ForEx2 {
    static void main(String[] args) {
        for(int num = 2, count = 1; count <= 10; num += 2, count++){
            System.out.println(num);
        }

        //이게 더 낫다
        int num = 2;
        for(int count = 1; count <= 10; count++){
            System.out.println(num);
            num += 2;
        }
    }
}
