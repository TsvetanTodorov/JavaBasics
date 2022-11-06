package ForLoop.Exercise;

public class NumbersEndingInSeven {
    public static void main(String[] args) {

        for (int i = 7; i <= 997; i++) {
            if (isEndingInSeven(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isEndingInSeven(int num) {
        return num % 10 == 7;
    }
}
