package day18;

public class Task2 {
    public static void main(String[] args) {
        int i = 717771237;
        System.out.println(countSeven(i));
    }

    public static int countSeven(int i) {
        if (i == 0)
            return 0;
        if (i % 10 == 7) {
            return countSeven(i / 10) + 1;
        } else {
            return countSeven(i / 10);
        }
    }
}
