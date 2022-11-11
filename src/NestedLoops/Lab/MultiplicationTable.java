package NestedLoops.Lab;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int h = 1; h <= 10; h++) {
                int result = i * h;
                System.out.printf("%d * %d = %d%n", i, h, result);
            }
        }
    }
}
