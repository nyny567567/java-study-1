package scanner.ex;

public class ChangeVarEx {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = b; //20
        b = a;
        a = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
