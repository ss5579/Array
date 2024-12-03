package Array;

public class Main3 {
    public static void main(String[] args) {
        int[] array3 = {6, 117, 44, 5, 32, 81, 9};
        System.out.println("Чётные элементы массива");
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 2 == 0) {
                System.out.println(array3[i]);
            }
        }
    }
}
